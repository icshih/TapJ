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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a sphere.  A special kind of area is a circle or sphere (in two or three dimensions), defined by a center position and a radius; the radius requires a unit
 * 
 * <p>Java class for sphereType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sphereType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}spatialIntervalType">
 *       &lt;sequence>
 *         &lt;element name="Radius" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double1Type"/>
 *         &lt;element name="Center" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double3Type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="radius_unit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}posUnitType" default="deg" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sphereType", propOrder = {
    "radius",
    "center"
})
public class SphereType
    extends SpatialIntervalType
{

    @XmlElement(name = "Radius", required = true, nillable = true)
    protected Double1Type radius;
    @XmlElement(name = "Center", required = true, nillable = true)
    protected Double3Type center;
    @XmlAttribute(name = "radius_unit")
    protected String radiusUnit;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Double1Type }
     *     
     */
    public Double1Type getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double1Type }
     *     
     */
    public void setRadius(Double1Type value) {
        this.radius = value;
    }

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link Double3Type }
     *     
     */
    public Double3Type getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double3Type }
     *     
     */
    public void setCenter(Double3Type value) {
        this.center = value;
    }

    /**
     * Gets the value of the radiusUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadiusUnit() {
        if (radiusUnit == null) {
            return "deg";
        } else {
            return radiusUnit;
        }
    }

    /**
     * Sets the value of the radiusUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadiusUnit(String value) {
        this.radiusUnit = value;
    }

}