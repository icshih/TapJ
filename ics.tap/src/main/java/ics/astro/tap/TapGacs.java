package ics.astro.tap;

import ics.astro.tap.internal.Tap;
import ics.astro.tap.parser.VOParser;
import ics.astro.tap.security.DumbX509TrustManager;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class TapGacs implements Tap {

    private final String TAP_URL = TapService.GACS.getTAPURL();

    @Override
    public InputStream getAvailableTables() throws IOException {
        String url = String.format("%s%s", TAP_URL, table);
        return put(url);
    }

    @Override
    public InputStream runSynchronousQuery(String query, String format) throws IOException {
        String url = String.format("%s%s?%s", TAP_URL, sync, String.format("REQUEST=doQuery&LANG=ADQL&FORMAT=%s&QUERY=%s", format, URLEncoder.encode((query), ENC)));
        return put(url);
    }


    public String runAsynchronousJob(String query) throws Exception {
        return runAsynchronousJob(query, "votable");
    }

    @Override
    public String runAsynchronousJob(String query, String format) throws IOException, TapException {
        String jobId = null;
        String url = String.format("%s%s?%s", TAP_URL, async, String.format(
                "PHASE=run&REQUEST=doQuery&LANG=ADQL&FORMAT=%s&QUERY=%s", format, URLEncoder.encode((query), ENC)));
        HttpURLConnection conn = getHttpURLConnection(url);
        conn.setRequestMethod("POST");
        conn.connect();
        int code = getResponseCode(conn);
        if (code == HttpURLConnection.HTTP_OK) {
            InputStream is = conn.getInputStream();
            jobId = VOParser.parseJobId(is);
            is.close();
        } else if (code == HttpURLConnection.HTTP_SEE_OTHER) {
            jobId = getJobId(conn);
        } else {
            logger.error("Unexpected reponse code: {}\n{}", code, conn.getResponseMessage());
        }
        return jobId;
    }

    @Override
    public InputStream getJobList() throws IOException {
        String url = String.format("%s%s", TAP_URL, async);
        return put(url);
    }

    @Override
    public InputStream getJobSummary(String jobId) throws IOException {
        String url = String.format("%s%s/%s", TAP_URL, async, jobId);
        return put(url);
    }

    @Override
    public String getJobPhase(String jobId) throws IOException, TapException {
        String url = String.format("%s%s/%s", TAP_URL, async, jobId);
        InputStream is = put(url);
        String phase = VOParser.parseJobPhase(VOParser.parseJobSummary(is));
        is.close();
        return phase;
    }

    @Override
    public String getJobError(String jobId) throws IOException, TapException {
        String url = String.format("%s%s/%s", TAP_URL, async, jobId);
        InputStream is = put(url);
        String error = VOParser.parseError(VOParser.parseJobSummary(is));
        is.close();
        return error;
    }

    @Override
    public void deleteJob(String jobId) throws IOException {
        String url = String.format("%s%s/%s", TAP_URL, async, jobId);
        HttpURLConnection conn = getHttpURLConnection(url);
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        DataOutputStream printOut = new DataOutputStream(conn.getOutputStream());
        printOut.writeBytes("ACTION=DELETE");
        printOut.flush();
        printOut.close();
        conn.connect();
        int code = getResponseCode(conn);
        if (code != HttpURLConnection.HTTP_OK)
            logger.error("Cannot delete job {}", jobId);
        conn.disconnect();
    }

    @Override
    public InputStream getJobResult(String jobId) throws IOException {
        String url = String.format("%s%s", TAP_URL, String.format(async_result, jobId));
        return put(url);
    }

    /**
     * SSL Socket factory implementation (TAP+)
     *
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @author Jesus Salgado
     */
    SSLSocketFactory getSocketFactory() throws NoSuchAlgorithmException, KeyManagementException {
        SSLSocketFactory socketFactory = null;
        SSLContext context = SSLContext.getInstance("SSLv3");
        context.init(null, new X509TrustManager[]{new DumbX509TrustManager()}, null);
        socketFactory = context.getSocketFactory();
        return socketFactory;
    }

    /**
     * Uploads personal table (TAP+)
     *
     * @param tableName The name to be used by the upload table
     * @param raName    The name of R.A. column in the uploaded votable
     * @param decName   The name of Dec. column in the uploaded votable
     * @param tableFile The votable file to be uploaded
     * @return the HTTP response code, otherwise null
     * @throws IOException
     */
    public Integer uploadTable(String tableName, String raName, String decName, File tableFile) throws IOException {
        Integer responseCode = null;
        String url = TAP_URL + "/Upload";
        HttpURLConnection conn = getHttpURLConnection(url);
        if (conn instanceof HttpsURLConnection) {
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("User-Agent", "CodeJava Agent");
            conn.setRequestProperty("Content-Type", "multipart/form-data" + " ;boundary=" + BOUNDARY);
            DataOutputStream printOut = new DataOutputStream(conn.getOutputStream());
            addFormField(printOut, "TABLE_NAME", tableName);
            addFormField(printOut, "RACOL", raName);
            addFormField(printOut, "DECCOL", decName);
            addFileField(conn, printOut, "FILE", tableFile);
            printOut.close();
            conn.connect();
            responseCode = getResponseCode(conn);
            conn.disconnect();
        } else
            logger.warn("Uploading personal table is only supported by secure HTTP.");
        return responseCode;
    }

    /**
     * Uploads personal table (TAP+)
     *
     * @param tableName The name to be used by the upload table
     * @param tableFile The votable file to be uploaded
     * @return the HTTP response code, otherwise null
     * @throws Exception
     */
    public Integer uploadTable(String tableName, File tableFile) throws IOException {
        return uploadTable(tableName, "ra", "dec", tableFile);
    }

    void addFormField(DataOutputStream printOut, String name, String value) throws IOException {
        StringBuilder content = new StringBuilder();
        content.append("--" + BOUNDARY).append(LINE_FEED);
        content.append("Content-Disposition: form-data; name=\"" + name + "\"").append(LINE_FEED);
        content.append("Content-Type: text/plain; charset=" + ENC).append(LINE_FEED);
        content.append(LINE_FEED);
        content.append(value).append(LINE_FEED);
        printOut.writeBytes(content.toString());
        printOut.flush();
    }

    void addFileField(HttpURLConnection connection, DataOutputStream printOut, String fieldName, File uploadFile)
            throws IOException {
        StringBuilder content = new StringBuilder();
        content.append("--" + BOUNDARY).append(LINE_FEED);
        content.append(
                "Content-Disposition: form-data; name=\"" + fieldName + "\"; filename=\"" + uploadFile.getName() + "\"")
                .append(LINE_FEED);
        content.append("Content-Type: " + URLConnection.guessContentTypeFromName(uploadFile.getName()))
                .append(LINE_FEED);
        content.append("Content-Transfer-Encoding: binary").append(LINE_FEED);
        content.append(LINE_FEED);
        printOut.writeBytes(content.toString());
        printOut.flush();

        FileInputStream inputStream = new FileInputStream(uploadFile);
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        OutputStream outputstream = connection.getOutputStream();
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputstream.write(buffer, 0, bytesRead);
        }
        outputstream.flush();
        inputStream.close();

        StringBuilder ending = new StringBuilder();
        ending.append(LINE_FEED);
        ending.append("--" + BOUNDARY + "--").append(LINE_FEED);
        printOut.writeBytes(ending.toString());
        printOut.flush();
    }


}
