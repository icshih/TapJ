package ics.astro.tap.test;

import ics.astro.tap.TapVIzieR;
import ics.astro.tap.internal.AsyncQueryPhases;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class TapVIzieRTest {

    TapVIzieR vizier = new TapVIzieR();

    @Test
    void getAvailableTables() {
        try {
            InputStream is = vizier.getAvailableTables();
            Assertions.assertNotNull(is);
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
            InputStream is = vizier.runAsynchronousJob("SELECT ucac4, bmag, e_bmag, vmag, e_vmag, gmag, e_gmag, rmag, e_rmag, imag, e_imag FROM \"I/322A/out\" WHERE UCAC4 IN ('179-062146', '200-119759')", "votable");
            Assertions.assertNotNull(is);
            String jobId = vizier.getJobId(is);
            Assertions.assertNotNull(jobId);
            Assertions.assertEquals(AsyncQueryPhases.COMPLETED.name(), vizier.updateJobPhase(jobId, 1000));
            is.close();
            Assertions.assertNotNull(vizier.getJobResult(jobId));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void runAsynchronousJob2() {
        try {
            InputStream is = vizier.runAsynchronousJob("SELECT ucac4, bmag, e_bmag, vmag, e_vmag, gmag, e_gmag, rmag, e_rmag, imag, e_imag FROM \"I/322A/out\" WHERE UCAC4 IN ('179-062146', '200-119759')", "votable");
            Assertions.assertNotNull(is);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            br.lines().forEach(System.out::println);
            br.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getJobId() {
        String template = "tap/async/(\\d*)/results/result";
        Pattern pattern = Pattern.compile(template);
        String line = "\t\t<result id=\"result\" xlink:type=\"simple\" xlink:href=\"http://tapvizier.u-strasbg.fr:80/TAPVizieR/tap/async/1511357603911/results/result\" />";
        Matcher m = pattern.matcher(line);
        String jobId;
        if (m.find()) {
            jobId = m.group(1);
            Assertions.assertEquals("1511357603911", jobId);
        } else {
            Assertions.fail("No jobId found.");
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
            InputStream is = vizier.runAsynchronousJob("SELECT * FROM \"I/322A/out\" WHERE UCAC IN ('179-062146', '200-119759')", "votable");
            Assertions.assertNotNull(is);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            br.lines().forEach(System.out::println);
            br.close();
//            String jobId = vizier.getJobId(is);
//            assertNull(jobId);
            is.close();
//            vizier.updateJobPhase(jobId, 1000);
//            vizier.getJobError(jobId);
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