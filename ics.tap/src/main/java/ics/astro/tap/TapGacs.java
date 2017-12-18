package ics.astro.tap;

import ics.astro.tap.internal.Tap;
import ics.astro.tap.parser.VOMatcher;
import ics.astro.tap.parser.VOParser;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLEncoder;

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
        String jobId = null;
        String url = String.format("%s%s?%s", TAP_URL, async, String.format(
                "PHASE=run&REQUEST=doQuery&LANG=ADQL&FORMAT=%s&QUERY=%s", "votable", URLEncoder.encode((query), ENC)));
        HttpURLConnection conn = getHttpURLConnection(url);
        conn.setRequestMethod("POST");
        conn.connect();
        int code = getResponseCode(conn);
        if (code == HttpURLConnection.HTTP_OK) {
            InputStream is = conn.getInputStream();
            jobId = VOParser.parseJobId(is);
            is.close();
        } else if (code == HttpURLConnection.HTTP_SEE_OTHER) {
            String[] location = conn.getHeaderField("Location").split("/");
            jobId = location[location.length - 1];
        } else {
            logger.error("Unexpected reponse code: {}\n{}", code, conn.getResponseMessage());
        }
        return jobId;
    }

    @Override
    public InputStream runAsynchronousJob(String query, String format) throws IOException {
        String url = String.format("%s%s?%s", TAP_URL, async, String.format(
                "PHASE=run&REQUEST=doQuery&LANG=ADQL&FORMAT=%s&QUERY=%s", format, URLEncoder.encode((query), ENC)));
        HttpURLConnection conn = getHttpURLConnection(url);
        conn.setRequestMethod("POST");
        conn.connect();
        int code = getResponseCode(conn);
        if (code == HttpURLConnection.HTTP_OK || code == HttpURLConnection.HTTP_SEE_OTHER) {
            return conn.getInputStream();
        } else {
            logger.error("Unexpected reponse code: {}\n{}", code, conn.getResponseMessage());
            return null;
        }
    }

    @Override
    public InputStream getJobList() {
        return null;
    }

    @Override
    public InputStream getJobSummary(String jobId) {
        return null;
    }

    @Override
    public String getJobId(HttpURLConnection conn) throws Exception {
        return null;
    }

    @Override
    public String updateJobPhase(String jobId, long millis) throws InterruptedException, IOException {
        return null;
    }

    @Override
    public String getJobPhase(String jobId) throws IOException {
        return null;
    }

    @Override
    public String getJobError(String jobId) throws IOException {
        return null;
    }

    @Override
    public Integer deleteJob(String jobId) {
        return null;
    }

    @Override
    public InputStream getJobResult(String jobId) throws IOException {
        return null;
    }
}
