package ics.astro.tap.parser;

import net.ivoa.xml.uws.v1.JobSummary;
import net.ivoa.xml.vodataservice.v1.TableSet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class VOParser {

    public static void parseTableSet(InputStream is) {
        try {
            JAXBContext context = JAXBContext.newInstance(TableSet.class);
            Unmarshaller um = context.createUnmarshaller();
            TableSet ts = (TableSet) ((JAXBElement<?>) um.unmarshal(is)).getValue();
            ts.getSchema().stream().flatMap(s -> s.getTable().stream()).forEach(t -> System.out.println(t.getName()));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static String parseJobId(InputStream is) {
        String jobId = null;
        try {
            JAXBContext context = JAXBContext.newInstance(JobSummary.class);
            Unmarshaller um = context.createUnmarshaller();
            JobSummary js = (JobSummary) ((JAXBElement<?>) um.unmarshal(is)).getValue();
            jobId = js.getJobId();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return jobId;
    }
}
