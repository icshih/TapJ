package ics.astro.tap.test;

import ics.astro.tap.TapGacs;
import ics.astro.tap.parser.VOParser;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        TapGacs gacs = new TapGacs();
        InputStream is = gacs.getAvailableTables();
        VOParser.parseTableSet(is).stream().forEach(System.out::println);
        is.close();
        String jobId = gacs.runAsynchronousJob("SELECT TOP 5 * FROM gaiadr1.gaia_source");
        System.out.println(jobId);
    }
}
