//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.stc.stc_v1_30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ellipse shape: center, semi-major, semi-minor axis and position angle; in spherical coordinates defined as the shape cut out of the sphere by a cone with elliptical cross-section
 * 
 * <p>Java class for ellipseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ellipseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}shapeType">
 *       &lt;sequence>
 *         &lt;element name="Center" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double2Type"/>
 *         &lt;element name="SemiMajorAxis" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double1Type"/>
 *         &lt;element name="SemiMinorAxis" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double1Type"/>
 *         &lt;element name="PosAngle" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}posAngleType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ellipseType", propOrder = {
    "center",
    "semiMajorAxis",
    "semiMinorAxis",
    "posAngle"
})
public class EllipseType
    extends ShapeType
{

    @XmlElement(name = "Center", required = true, nillable = true)
    protected Double2Type center;
    @XmlElement(name = "SemiMajorAxis", required = true, nillable = true)
    protected Double1Type semiMajorAxis;
    @XmlElement(name = "SemiMinorAxis", required = true, nillable = true)
    protected Double1Type semiMinorAxis;
    @XmlElement(name = "PosAngle", required = true, nillable = true)
    protected PosAngleType posAngle;

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link Double2Type }
     *     
     */
    public Double2Type getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double2Type }
     *     
     */
    public void setCenter(Double2Type value) {
        this.center = value;
    }

    /**
     * Gets the value of the semiMajorAxis property.
     * 
     * @return
     *     possible object is
     *     {@link Double1Type }
     *     
     */
    public Double1Type getSemiMajorAxis() {
        return semiMajorAxis;
    }

    /**
     * Sets the value of the semiMajorAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double1Type }
     *     
     */
    public void setSemiMajorAxis(Double1Type value) {
        this.semiMajorAxis = value;
    }

    /**
     * Gets the value of the semiMinorAxis property.
     * 
     * @return
     *     possible object is
     *     {@link Double1Type }
     *     
     */
    public Double1Type getSemiMinorAxis() {
        return semiMinorAxis;
    }

    /**
     * Sets the value of the semiMinorAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double1Type }
     *     
     */
    public void setSemiMinorAxis(Double1Type value) {
        this.semiMinorAxis = value;
    }

    /**
     * Gets the value of the posAngle property.
     * 
     * @return
     *     possible object is
     *     {@link PosAngleType }
     *     
     */
    public PosAngleType getPosAngle() {
        return posAngle;
    }

    /**
     * Sets the value of the posAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosAngleType }
     *     
     */
    public void setPosAngle(PosAngleType value) {
        this.posAngle = value;
    }

}
