package ics.astro.tap.parser;

import net.ivoa.xml.uws.v1.JobSummary;
import net.ivoa.xml.uws.v1.Jobs;
import net.ivoa.xml.vodataservice.v1.TableSet;
import net.ivoa.xml.votable.v1.VOTABLE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class VOParser {

    private static final Logger logger = LoggerFactory.getLogger(VOParser.class);

    /**
     * Gets the available tables of the TAP service
     * @param is from TableSet element, tap/tables, in the VoDataService schema
     * @return
     */
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
            logger.error("", e);
        }
        return tableList;
    }

    /**
     * Gets the asynchronous jobs object of the TAP service
     * @param is from Jobs element, tap/async, in the UWS schema
     * @return
     */
    public static Jobs parseJobs(InputStream is) {
        Jobs jobs = null;
        try {
            JAXBContext context = JAXBContext.newInstance(Jobs.class);
            Unmarshaller um = context.createUnmarshaller();
            jobs = (Jobs) um.unmarshal(is);
        } catch (JAXBException e) {
            logger.error("", e);
        }
        return jobs;
    }

    /**
     * Gets the asynchronous job summary
     * @param is from Job element, tap/async/${jobId}, in the UWS schema
     * @return
     */
    public static JobSummary parseJobSummary(InputStream is) {
        JobSummary js = null;
        try {
            JAXBContext context = JAXBContext.newInstance(JobSummary.class);
            Unmarshaller um = context.createUnmarshaller();
            js = (JobSummary) ((JAXBElement<?>) um.unmarshal(is)).getValue();
        } catch (JAXBException e) {
            logger.error("", e);
        }
        return js;
    }

    /**
     * Gets the asynchronous job identifier
     * @param is
     * @return
     */
    public static String parseJobId(InputStream is) {
        return parseJobSummary(is).getJobId();
    }

    /**
     * Gets asynchronous job phase
     * @param is from tap/async/${jobId}/phase defined in UWS specification
     * @return
     */
    public static String parseJobPhase(InputStream is) {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        return br.lines().findFirst().get();
    }

    /**
     * Gets asynchronous job error cause
     * @param is from tap/async/${jobId}/error defined in UWS specification
     * @return
     */
    public static String parseError(InputStream is) {
        String error = "";
        try {
            JAXBContext context = JAXBContext.newInstance(VOTABLE.class);
            Unmarshaller um = context.createUnmarshaller();
            VOTABLE vt = (VOTABLE) um.unmarshal(is);
            error = vt.getRESOURCE().stream()
                    .flatMap(r -> r.getINFO().stream())
                    .filter(i -> i.getName().equals("QUERY_STATUS"))
                    .findAny().get().getValue();
        } catch (JAXBException e) {
            logger.error("", e);
        }
        return error.trim();
    }
}
