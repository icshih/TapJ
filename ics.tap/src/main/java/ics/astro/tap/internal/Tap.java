package ics.astro.tap.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Table Access Protocol interface
 */
public interface Tap {

    String table = "tables";
    String sync = "sync";
    String async = "async";
    String async_phase = async + "/%d/phase";
    String async_result = async + "/%d/results/result";
    String async_error = async + "/%d/error";
    String ENC = "UTF-8";
    static final Logger logger = LoggerFactory.getLogger(Tap.class);

    /**
     * Gets the HTTP Connection
     *
     * @param httpUrl the TAP service url
     * @return HttpURLConnection object or null
     * @throws IOException
     */
    default HttpURLConnection getHttpURLConnection(String httpUrl) throws IOException {
        URL url = new URL(httpUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setUseCaches(false);
        return conn;
    }

    /**
     * HTTP PUT method
     *
     * <p>This particular method expects HTTP 200. If you are expecting something else to handle by yourself, DO NOT use this method.</p>
     * @param url
     * @return
     * @throws IOException
     */
    default InputStream put(String url) throws IOException {
        logger.debug(url);
        HttpURLConnection conn = getHttpURLConnection(url);
        conn.connect();
        int code = conn.getResponseCode();
        if (code == HttpsURLConnection.HTTP_OK)
            return conn.getInputStream();
        else {
            logger.error("Reponse code: {}\n{}", code, conn.getResponseMessage());
            return null;
        }
    }

    /**
     * Gets the HTTP response code
     *
     * @param conn the TAP service connection
     * @return reponse code
     * @throws IOException
     */
    default int getResponseCode(HttpURLConnection conn) throws IOException {
        return conn.getResponseCode();
    }

    /**
     * Gets the input stream of the connection
     *
     * @param conn the Tap service connection
     * @return the input stream of the service
     * @throws IOException
     */
    default InputStream getInputStream(HttpURLConnection conn) throws IOException {
        return conn.getInputStream();
    }

    /**
     * Gets the available tables on the TAP service
     *
     * @return the input stream of the tables list in xml format
     * @throws IOException
     */
    InputStream getAvailableTables() throws IOException;

    /**
     * Sends a synchronous query
     *
     * @param query
     * @param format
     * @return inputStream of the query result
     * @throws IOException
     */
    InputStream runSynchronousQuery(String query, String format) throws IOException;

    /**
     * Sends an asynchronous query
     * <p>
     * <p>An asynchronous query creates an associated job id which is used to trace the status of the query and the results.
     * Depending on the response the async query, you need to retrieve the job identifier from the returning input stream object.</p>
     *
     * @param query
     * @param format
     * @return inputStream of the response message
     * @throws IOException
     */
    InputStream runAsynchronousJob(String query, String format) throws IOException;

    /**
     * Gets asynchronous job list
     *
     * @return
     */
    InputStream getJobList();

    /**
     * Gets the asynchronous job summary
     *
     * @param jobId
     * @return
     */
    InputStream getJobSummary(String jobId);

    /**
     * Gets the job identifier of an asynchronous query
     *
     * @param conn the asynchronous query connection
     * @return
     * @throws Exception
     */
    String getJobId(HttpURLConnection conn) throws Exception;

    /**
     * Checks the current async job phase
     *
     * @param jobId
     * @param millis
     * @return
     * @throws InterruptedException
     * @throws IOException
     */
    String updateJobPhase(String jobId, long millis) throws InterruptedException, IOException;

    /**
     * Gets the async job phase
     *
     * @param jobId
     * @return
     * @throws IOException
     */
    String getJobPhase(String jobId) throws IOException;

    /**
     * Gets the error message of the async job
     *
     * @param jobId
     * @return
     * @throws IOException
     */
    String getJobError(String jobId) throws IOException;

    /**
     * Deletes the async job from the TAP service
     *
     * @param jobId
     * @return
     */
    Integer deleteJob(String jobId);

    /**
     * Gets the results of the async job
     *
     * @param jobId
     * @return
     * @throws IOException
     */
    InputStream getJobResult(String jobId) throws IOException;
}
