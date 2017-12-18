package ics.astro.tap.parser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VOMatcher {

    public static String matchJobId(InputStream is) {
        Pattern pattern = Pattern.compile("CDATA\\[(\\w*)\\]");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
         Optional optional = br.lines().map(l -> {
            Matcher matcher = pattern.matcher(l);
            if (matcher.find())
                return matcher.group(1);
            else
                return null;
        }).filter(l -> l != null).findAny();
        return optional.get().toString();
    }
}
