//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.stc.stc_v1_30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The Geodetic reference frame; semi-major axis and inverse flattening may be provided to define the reference spheroid; the default is the IAU 1976 reference spheroid
 * 
 * <p>Java class for geodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}icrsType">
 *       &lt;attribute name="radius" type="{http://www.w3.org/2001/XMLSchema}double" default="6378140" />
 *       &lt;attribute name="inv_flattening" type="{http://www.w3.org/2001/XMLSchema}double" default="298.257" />
 *       &lt;attribute name="unit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}posUnitType" default="m" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geodType")
public class GeodType
    extends IcrsType
{

    @XmlAttribute(name = "radius")
    protected Double radius;
    @XmlAttribute(name = "inv_flattening")
    protected Double invFlattening;
    @XmlAttribute(name = "unit")
    protected String unit;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getRadius() {
        if (radius == null) {
            return  6378140.0D;
        } else {
            return radius;
        }
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadius(Double value) {
        this.radius = value;
    }

    /**
     * Gets the value of the invFlattening property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getInvFlattening() {
        if (invFlattening == null) {
            return  298.257D;
        } else {
            return invFlattening;
        }
    }

    /**
     * Sets the value of the invFlattening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInvFlattening(Double value) {
        this.invFlattening = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        if (unit == null) {
            return "m";
        } else {
            return unit;
        }
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
