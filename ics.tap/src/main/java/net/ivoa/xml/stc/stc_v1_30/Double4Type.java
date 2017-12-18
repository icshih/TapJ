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
 * A vector of 4 doubles (2x2 matrix)
 * 
 * <p>Java class for double4Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="double4Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}stcBaseType">
 *       &lt;sequence>
 *         &lt;element name="M11" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="M12" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="M21" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="M22" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="unit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}posUnitType" />
 *       &lt;attribute name="vel_time_unit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}velTimeUnitType" />
 *       &lt;attribute name="gen_unit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}unitType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "double4Type", propOrder = {
    "m11",
    "m12",
    "m21",
    "m22"
})
public class Double4Type
    extends StcBaseType
{

    @XmlElement(name = "M11", required = true, type = Double.class, nillable = true)
    protected Double m11;
    @XmlElement(name = "M12", required = true, type = Double.class, nillable = true)
    protected Double m12;
    @XmlElement(name = "M21", required = true, type = Double.class, nillable = true)
    protected Double m21;
    @XmlElement(name = "M22", required = true, type = Double.class, nillable = true)
    protected Double m22;
    @XmlAttribute(name = "unit")
    protected String unit;
    @XmlAttribute(name = "vel_time_unit")
    protected VelTimeUnitType velTimeUnit;
    @XmlAttribute(name = "gen_unit")
    protected String genUnit;

    /**
     * Gets the value of the m11 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getM11() {
        return m11;
    }

    /**
     * Sets the value of the m11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setM11(Double value) {
        this.m11 = value;
    }

    /**
     * Gets the value of the m12 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getM12() {
        return m12;
    }

    /**
     * Sets the value of the m12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setM12(Double value) {
        this.m12 = value;
    }

    /**
     * Gets the value of the m21 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getM21() {
        return m21;
    }

    /**
     * Sets the value of the m21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setM21(Double value) {
        this.m21 = value;
    }

    /**
     * Gets the value of the m22 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getM22() {
        return m22;
    }

    /**
     * Sets the value of the m22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setM22(Double value) {
        this.m22 = value;
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

    /**
     * Gets the value of the velTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link VelTimeUnitType }
     *     
     */
    public VelTimeUnitType getVelTimeUnit() {
        return velTimeUnit;
    }

    /**
     * Sets the value of the velTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelTimeUnitType }
     *     
     */
    public void setVelTimeUnit(VelTimeUnitType value) {
        this.velTimeUnit = value;
    }

    /**
     * Gets the value of the genUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenUnit() {
        return genUnit;
    }

    /**
     * Sets the value of the genUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenUnit(String value) {
        this.genUnit = value;
    }

}