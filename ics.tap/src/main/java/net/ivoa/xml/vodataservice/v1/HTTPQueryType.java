//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.vodataservice.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HTTPQueryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HTTPQueryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="GET"/>
 *     &lt;enumeration value="POST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HTTPQueryType")
@XmlEnum
public enum HTTPQueryType {

    GET,
    POST;

    public String value() {
        return name();
    }

    public static HTTPQueryType fromValue(String v) {
        return valueOf(v);
    }

}
