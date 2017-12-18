//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.vodataservice.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Waveband.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Waveband">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Radio"/>
 *     &lt;enumeration value="Millimeter"/>
 *     &lt;enumeration value="Infrared"/>
 *     &lt;enumeration value="Optical"/>
 *     &lt;enumeration value="UV"/>
 *     &lt;enumeration value="EUV"/>
 *     &lt;enumeration value="X-ray"/>
 *     &lt;enumeration value="Gamma-ray"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Waveband")
@XmlEnum
public enum Waveband {


    /**
     * 
     *                  wavelength >= 10 mm; frequency <= 30 GHz.
     *                
     * 
     */
    @XmlEnumValue("Radio")
    RADIO("Radio"),

    /**
     * 
     *                  0.1 mm <= wavelength <= 10 mm; 
     *                  3000 GHz >= frequency >= 30 GHz.
     *                
     * 
     */
    @XmlEnumValue("Millimeter")
    MILLIMETER("Millimeter"),

    /**
     * 
     *                  1 micron <= wavelength <= 100 micons 
     *                
     * 
     */
    @XmlEnumValue("Infrared")
    INFRARED("Infrared"),

    /**
     * 
     *                  0.3 microns <= wavelength <= 1 micon; 
     *                  300 nm <= wavelength <= 1000 nm; 
     *                  3000 Angstroms <= wavelength <= 10000 Angstroms
     *                
     * 
     */
    @XmlEnumValue("Optical")
    OPTICAL("Optical"),

    /**
     * 
     *                  0.1 microns <= wavelength <= 0.3 micon; 
     *                  1000 nm <= wavelength <= 3000 nm; 
     *                  1000 Angstroms <= wavelength <= 30000 Angstroms
     *                
     * 
     */
    UV("UV"),

    /**
     * 
     *                  100 Angstroms <= wavelength <= 1000 Angstroms; 
     *                  12 eV <= energy <= 120 eV
     *                
     * 
     */
    EUV("EUV"),

    /**
     * 
     *                  0.1 Angstroms <= wavelength <= 100 Angstroms; 
     *                  0.12 keV <= energy <= 120 keV
     *                
     * 
     */
    @XmlEnumValue("X-ray")
    X_RAY("X-ray"),

    /**
     * 
     *                  energy >= 120 keV
     *                
     * 
     */
    @XmlEnumValue("Gamma-ray")
    GAMMA_RAY("Gamma-ray");
    private final String value;

    Waveband(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Waveband fromValue(String v) {
        for (Waveband c: Waveband.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}