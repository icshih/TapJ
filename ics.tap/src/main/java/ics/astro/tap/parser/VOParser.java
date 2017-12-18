package ics.astro.tap.parser;

import net.ivoa.xml.uws.v1.JobSummary;
import net.ivoa.xml.vodataservice.v1.TableSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class VOParser {

    private static final Logger logger = LoggerFactory.getLogger(VOParser.class);

    public static List<String> parseTableSet(InputStream is) {
        List<String> tableList = null;
        try {
            JAXBContext context = JAXBContext.newInstance(TableSet.class);
            Unmarshaller um = context.createUnmarshaller();
            TableSet ts = (TableSet) ((JAXBElement<?>) um.unmarshal(is)).getValue();
            tableList = ts.getSchema().stream()
                    .flatMap(s -> s.getTable().stream())
                    .map(t -> t.getName())
                    .filter(n -> !n.contains("tap_schema"))
                    .collect(Collectors.toList());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return tableList;
    }

    public static String parseJobId(InputStream is) {
        String jobId = null;
        try {
            JAXBContext context = JAXBContext.newInstance(JobSummary.class);
            Unmarshaller um = context.createUnmarshaller();
            JobSummary js = (JobSummary) ((JAXBElement<?>) um.unmarshal(is)).getValue();
            jobId = js.getJobId();
            logger.debug("Get jobId: {}", jobId);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return jobId;
    }
}
