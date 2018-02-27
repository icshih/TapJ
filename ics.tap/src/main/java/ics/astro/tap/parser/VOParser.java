package ics.astro.tap.parser;

import ics.astro.tap.TapException;
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
    public static List<String> parseTableSet(InputStream is) throws TapException {
        try {
            JAXBContext context = JAXBContext.newInstance(TableSet.class);
            Unmarshaller um = context.createUnmarshaller();
            TableSet ts = (TableSet) ((JAXBElement<?>) um.unmarshal(is)).getValue();
            return ts.getSchema().stream()
                    .flatMap(s -> s.getTable().stream())
                    .map(t -> t.getName())
                    .filter(n -> !n.contains("tap_schema"))
                    .collect(Collectors.toList());
        } catch (JAXBException e) {
            throw new TapException(e.getMessage());
        }
    }

    /**
     * Gets the asynchronous jobs object of the TAP service
     * @param is from Jobs element, tap/async, in the UWS schema
     * @return
     */
    public static Jobs parseJobs(InputStream is) throws TapException {
        try {
            JAXBContext context = JAXBContext.newInstance(Jobs.class);
            Unmarshaller um = context.createUnmarshaller();
            return (Jobs) um.unmarshal(is);
        } catch (JAXBException e) {
            throw new TapException(e.getMessage());
        }
    }

    /**
     * Gets the asynchronous job summary
     * @param is from Job element, tap/async/${jobId}, in the UWS schema
     * @return
     */
    public static JobSummary parseJobSummary(InputStream is) throws TapException {
        try {
            JAXBContext context = JAXBContext.newInstance(JobSummary.class);
            Unmarshaller um = context.createUnmarshaller();
            return (JobSummary) ((JAXBElement<?>) um.unmarshal(is)).getValue();
        } catch (JAXBException e) {
            throw new TapException(e.getMessage());
        }
    }

    /**
     * Gets the asynchronous job identifier
     * @param is from tap/async/${jobId}
     * @return
     */
    public static String parseJobId(InputStream is) throws TapException {
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

    public static String parseJobPhase(JobSummary js) {
        return js.getPhase().value();
    }

    /**
     * Gets asynchronous job error cause
     * @param is from tap/async/${jobId}/error defined in UWS specification
     * @return
     */
    public static String parseError(InputStream is) throws TapException {
        try {
            JAXBContext context = JAXBContext.newInstance(VOTABLE.class);
            Unmarshaller um = context.createUnmarshaller();
            VOTABLE vt = (VOTABLE) um.unmarshal(is);
            return vt.getRESOURCE().stream()
                    .flatMap(r -> r.getINFO().stream())
                    .filter(i -> i.getName().equals("QUERY_STATUS"))
                    .findAny().get().getValue().trim();
        } catch (JAXBException e) {
            throw new TapException(e.getMessage());
        }
    }

    /**
     * Gets asynchronous job error cause
     * @param js the JobSummary of the asynchronous job
     * @return
     */
    public static String parseError(JobSummary js) {
        return js.getErrorSummary().getMessage();
    }
}
