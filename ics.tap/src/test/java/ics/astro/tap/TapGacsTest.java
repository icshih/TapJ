package ics.astro.tap;

import ics.astro.tap.parser.VOParser;
import ics.astro.tap.utils.Utils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class TapGacsTest {

    TapGacs gacs = new TapGacs();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAvailableTables() {
        try {
            InputStream is = gacs.getAvailableTables();
            Assertions.assertNotNull(is);
            List<String> tables = VOParser.parseTableSet(is);
            Assertions.assertNotNull(tables.isEmpty());
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void runSynchronousQuery() {
        try {
            InputStream is = gacs.runSynchronousQuery("SELECT TOP 5 * FROM gaiadr1.gaia_source", "votable");
            Assertions.assertNotNull(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void runAsynchronousJob() {
        try {
            String jobId = gacs.runAsynchronousJob("SELECT TOP 5 * FROM gaiadr1.gaia_source", "votable");
            Assertions.assertNotNull(jobId);
            jobId = gacs.runAsynchronousJob("SELECT TOP 5 * FROM gaiadr1.gaia_source");
            Assertions.assertNotNull(jobId);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getJobList() {
        try {
            InputStream is = gacs.getJobList();
            Assertions.assertNotNull(is);
            Assertions.assertNotNull(VOParser.parseJobs(is));
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void getJobSummary() {
        try {
            InputStream is = gacs.getJobList();
            String id = VOParser.parseJobs(is).getJobref().stream().findFirst().get().getId();
            is.close();
            InputStream js = gacs.getJobSummary(id);
            Assertions.assertNotNull(js);
            VOParser.parseJobId(js);
            Utils.display(js);
            js.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    void updateJobPhase() {
        try {
            String jobId = gacs.runAsynchronousJob("SELECT TOP 1 * FROM gaiadr1.gaia_source WHERE phot_g_mean_mag > 17.5 AND phot_g_mean_mag < 17.7");
            String phase = gacs.updateJobPhase(jobId, 1);
            Assertions.assertEquals("COMPLETED", phase);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getJobPhase() {
        try {
            String jobId = gacs.runAsynchronousJob("SELECT TOP 1 * FROM gaiadr1.gaia_source");
            String phase = gacs.getJobPhase(jobId);
            Assertions.assertNotNull(phase);
            Assertions.assertEquals("COMPLETED", phase);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getJobError() {
        try {
            String jobId = gacs.runAsynchronousJob("SELECT TOP 1 * FROM public.gaia_source");
            String phase = gacs.getJobPhase(jobId);
            Assertions.assertEquals("ERROR", phase);
            String error = gacs.getJobError(jobId);
            Assertions.assertNotNull(error);
            gacs.deleteJob(jobId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getJobResult() {
        try {
            String jobId = gacs.runAsynchronousJob("SELECT TOP 1 * FROM gaiadr1.gaia_source", "csv");
            String phase = gacs.updateJobPhase(jobId, 1000);
            Assertions.assertEquals("COMPLETED", phase);
            InputStream is = gacs.getJobResult(jobId);
            Utils.display(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}