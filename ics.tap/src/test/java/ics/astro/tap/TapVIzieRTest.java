package ics.astro.tap;

import ics.astro.tap.internal.AsyncQueryPhases;
import ics.astro.tap.parser.VOParser;
import ics.astro.tap.utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TapVIzieRTest {

    TapVIzieR vizier = new TapVIzieR();

    @Test
    void getAvailableTables() {
        try {
            InputStream is = vizier.getAvailableTables();
            Utils.display(is, 20);
//            List<String> tables = VOParser.parseTableSet(is);
//            Assertions.assertNotNull(is);
//            Assertions.assertFalse(tables.isEmpty());
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void runSynchronousQuery() {
        try {
            InputStream is = vizier.runSynchronousQuery("SELECT ucac4, bmag, e_bmag, vmag, e_vmag, gmag, e_gmag, rmag, e_rmag, imag, e_imag FROM \"I/322A/out\" WHERE UCAC4 IN ('179-062146', '200-119759')", "votable");
            Assertions.assertNotNull(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void runAsynchronousJob() {
        try {
            String jobId = vizier.runAsynchronousJob("SELECT ucac4, bmag, e_bmag, vmag, e_vmag, gmag, e_gmag, rmag, e_rmag, imag, e_imag FROM \"I/322A/out\" WHERE UCAC4 IN ('179-062146', '200-119759')", "votable");
            Assertions.assertNotNull(jobId);
            Assertions.assertEquals(AsyncQueryPhases.COMPLETED.name(), vizier.updateJobPhase(jobId, 1000));
            Assertions.assertNotNull(vizier.getJobResult(jobId));
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
    void getJobError() {
        try {
            String jobId = vizier.runAsynchronousJob("SELECT * FROM \"I/322A/out\" WHERE UCAC IN ('179-062146', '200-119759')", "votable");
            String phase = vizier.updateJobPhase(jobId, 1000);
            String error = vizier.getJobError(jobId);
            Assertions.assertNotNull(phase);
            Assertions.assertNotNull(error);
            System.out.println(error);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void deleteJob() {
    }

}