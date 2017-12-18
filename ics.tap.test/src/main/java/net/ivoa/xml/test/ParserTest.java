package net.ivoa.xml.test;

import ics.astro.tap.parser.VOMatcher;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testRough() throws IOException {
        String test = "<uws:jobId><![CDATA[1513602216549O]]></uws:jobId>";
        Pattern pattern = Pattern.compile("CDATA\\[(\\w*)\\]");
        Matcher matcher = pattern.matcher(test);
        if (matcher.find())
            System.out.println(matcher.group(1));
        else
            System.out.println("no match");
    }

    @Test
    public void testMatchInputStream() throws IOException {
        Path test = Paths.get("src/main/resources/job.xml");
        Assertions.assertTrue(Files.exists(test));
        InputStream is = new FileInputStream(test.toFile());
        String jobId = VOMatcher.matchJobId(is);
        Assertions.assertEquals("1513602216549O", jobId);
        is.close();
    }


}
