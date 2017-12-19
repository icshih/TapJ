package ics.astro.tap;

import ics.astro.tap.internal.Tap;
import ics.astro.tap.parser.VOParser;
import ics.astro.tap.utils.Utils;
import net.ivoa.xml.uws.v1.ExecutionPhase;
import net.ivoa.xml.uws.v1.JobSummary;

import java.io.DataOutputStream;
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
            jobId = getJobId(conn);
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
    public String updateJobPhase(String jobId, long millis) throws InterruptedException, IOException {
        boolean toContinue = true;
        String phase = getJobPhase(jobId);
        while (toContinue) {
            logger.debug("current phase: {}", phase);
            if (phase.equals(ExecutionPhase.COMPLETED.value()) ||
                    phase.equals(ExecutionPhase.ABORTED.value()) ||
                    phase.equals(ExecutionPhase.ERROR.value()))
                toContinue = false;
            else {
                Thread.sleep(millis);
                phase = getJobPhase(jobId);
            }
        }
        return phase;

    }

    @Override
    public String getJobPhase(String jobId) throws IOException {
        String url = String.format("%s%s/%s", TAP_URL, async, jobId);
        InputStream is = put(url);
        JobSummary summary = VOParser.parseJobSummary(is);
        String phase = summary.getPhase().value();
        is.close();
        return phase;
    }

    /**
     * Gets asynchronous job's current phase
     * @param is from Job element in the UWS schema, see {@link VOParser#parseJobSummary(InputStream)}
     * @return
     */
    public String getJobPhase(InputStream is) {
        JobSummary summary = VOParser.parseJobSummary(is);
        return summary.getPhase().value();

    }

    @Override
    public String getJobError(String jobId) throws IOException {
//        String url_ = String.format("%s%s", TAP_URL, String.format(async_error, jobId));
//        InputStream is_ = put(url_);
//        VOParser.parseError(is_);
//        is_.close();
        String url = String.format("%s%s/%s", TAP_URL, async, jobId);
        InputStream is = put(url);
        JobSummary summary = VOParser.parseJobSummary(is);
        String error = summary.getErrorSummary().getMessage();
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
        return null;
    }
}
