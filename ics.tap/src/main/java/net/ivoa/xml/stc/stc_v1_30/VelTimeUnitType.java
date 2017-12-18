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
 * <p>Java class for velTimeUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="velTimeUnitType">
 *   &lt;restriction base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}unitType">
 *     &lt;enumeration value="s"/>
 *     &lt;enumeration value="h"/>
 *     &lt;enumeration value="d"/>
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="yr"/>
 *     &lt;enumeration value="cy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "velTimeUnitType")
@XmlEnum
public enum VelTimeUnitType {

    @XmlEnumValue("s")
    S("s"),
    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("d")
    D("d"),
    @XmlEnumValue("a")
    A("a"),
    @XmlEnumValue("yr")
    YR("yr"),
    @XmlEnumValue("cy")
    CY("cy");
    private final String value;

    VelTimeUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VelTimeUnitType fromValue(String v) {
        for (VelTimeUnitType c: VelTimeUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}