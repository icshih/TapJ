//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.stc.stc_v1_30;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Scalar coordinate interval type with units and frame_id
 * 
 * <p>Java class for uCoordScalarIntervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uCoordScalarIntervalType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}coordIntervalType">
 *       &lt;sequence>
 *         &lt;element name="LoLimit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double1Type" minOccurs="0"/>
 *         &lt;element name="HiLimit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}double1Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="unit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}unitType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uCoordScalarIntervalType", propOrder = {
    "loLimit",
    "hiLimit"
})
public class UCoordScalarIntervalType
    extends CoordIntervalType
{

    @XmlElementRef(name = "LoLimit", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double1Type> loLimit;
    @XmlElementRef(name = "HiLimit", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double1Type> hiLimit;
    @XmlAttribute(name = "unit")
    protected String unit;

    /**
     * Gets the value of the loLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     *     
     */
    public JAXBElement<Double1Type> getLoLimit() {
        return loLimit;
    }

    /**
     * Sets the value of the loLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     *     
     */
    public void setLoLimit(JAXBElement<Double1Type> value) {
        this.loLimit = value;
    }

    /**
     * Gets the value of the hiLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     *     
     */
    public JAXBElement<Double1Type> getHiLimit() {
        return hiLimit;
    }

    /**
     * Sets the value of the hiLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     *     
     */
    public void setHiLimit(JAXBElement<Double1Type> value) {
        this.hiLimit = value;
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
        return unit;
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
