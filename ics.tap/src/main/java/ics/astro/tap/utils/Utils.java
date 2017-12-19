package ics.astro.tap.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {

    public static void display(InputStream is) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        br.lines().forEach(System.out::println);
        br.close();
    }

    public static void display(InputStream is, int limit) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        br.lines().limit(limit).forEach(System.out::println);
        br.close();
    }
}
