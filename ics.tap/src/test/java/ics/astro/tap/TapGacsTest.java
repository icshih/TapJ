package ics.astro.tap;

import ics.astro.tap.parser.VOParser;
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
            InputStream is = gacs.runAsynchronousJob("SELECT TOP 5 * FROM gaiadr1.gaia_source", "votable");
            Assertions.assertNotNull(is);
            is.close();
            String jobId = gacs.runAsynchronousJob("SELECT TOP 5 * FROM gaiadr1.gaia_source");
            Assertions.assertNotNull(jobId);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getJobList() {
    }

    @Test
    void getJobSummary() {
    }

    @Test
    void getJobId() {
    }

    @Test
    void updateJobPhase() {
    }

    @Test
    void getJobPhase() {
    }

    @Test
    void getJobError() {
    }

    @Test
    void deleteJob() {
    }

    @Test
    void getJobResult() {
    }

}