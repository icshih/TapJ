//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.stc.stc_v1_30;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for posAngleReferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="posAngleReferenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="North"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "posAngleReferenceType")
@XmlEnum
public enum PosAngleReferenceType {

    @XmlEnumValue("North")
    NORTH("North"),
    X("X"),
    Y("Y");
    private final String value;

    PosAngleReferenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PosAngleReferenceType fromValue(String v) {
        for (PosAngleReferenceType c: PosAngleReferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}