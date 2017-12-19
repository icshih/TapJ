package ics.astro.tap.parser;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class VOParserTest {

    @Test
    void parseError() {
        try {
            InputStream is = new FileInputStream(new File("src/main/resources/xml/VOTABLE.xml"));
            System.out.println(VOParser.parseError(is));
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}