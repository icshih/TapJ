//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 04:08:56 PM CET 
//


package net.ivoa.xml.uws.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExecutionPhase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutionPhase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="QUEUED"/>
 *     &lt;enumeration value="EXECUTING"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="HELD"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="ABORTED"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExecutionPhase")
@XmlEnum
public enum ExecutionPhase {


    /**
     * 
     *                   The first phase a job is entered into - this is where
     *                   a job is being set up but no request to run has
     *                   occurred.
     *                
     * 
     */
    PENDING,

    /**
     * 
     *                   A job has been accepted for execution but is waiting
     *                   in a queue
     *                
     * 
     */
    QUEUED,

    /**
     * A job is running
     * 
     */
    EXECUTING,

    /**
     * 
     *                   A job has completed successfully
     *                
     * 
     */
    COMPLETED,

    /**
     * 
     *                   Some form of error has occurred
     *                
     * 
     */
    ERROR,

    /**
     * 
     *                   The job is in an unknown state.
     *                
     * 
     */
    UNKNOWN,

    /**
     * 
     *                   The job is HELD pending execution and will not
     *                   automatically be executed - can occur after a
     *                   PHASE=RUN request has been made (cf PENDING).
     *                
     * 
     */
    HELD,

    /**
     * 
     *                   The job has been suspended by the system during
     *                   execution
     *                
     * 
     */
    SUSPENDED,

    /**
     * 
     *                   The job has been aborted, either by user request or by
     *                   the server because of lack or overuse of resources.
     *                
     * 
     */
    ABORTED,

    /**
     * 
     *                   The job has been archived by the server at destruction time. An archived job
     *                   may have deleted the results to reclaim resources, but must have job metadata preserved.
     *                   This is an alternative that the server may choose in contrast to completely destroying all record of the job.
     *                
     * 
     */
    ARCHIVED;

    public String value() {
        return name();
    }

    public static ExecutionPhase fromValue(String v) {
        return valueOf(v);
    }

}
