//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.stc.stc_v1_30;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Single Error, Resolution, Size, PixSize elements indicate definite values; pairs indicate ranges
 * 
 * <p>Java class for timeCoordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeCoordinateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}coordinateType">
 *       &lt;sequence>
 *         &lt;element name="TimeInstant" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}astronTimeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}Error" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}Resolution" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}Size" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}PixSize" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="coord_system_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="unit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}timeUnitType" default="s" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeCoordinateType", propOrder = {
    "timeInstant",
    "error",
    "resolution",
    "size",
    "pixSize"
})
public class TimeCoordinateType
    extends CoordinateType
{

    @XmlElement(name = "TimeInstant")
    protected AstronTimeType timeInstant;
    @XmlElement(name = "Error", nillable = true)
    protected List<Double1Type> error;
    @XmlElement(name = "Resolution", nillable = true)
    protected List<Double1Type> resolution;
    @XmlElement(name = "Size", nillable = true)
    protected List<Double1Type> size;
    @XmlElement(name = "PixSize", nillable = true)
    protected List<Double1Type> pixSize;
    @XmlAttribute(name = "coord_system_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object coordSystemId;
    @XmlAttribute(name = "unit")
    protected String unit;

    /**
     * Gets the value of the timeInstant property.
     * 
     * @return
     *     possible object is
     *     {@link AstronTimeType }
     *     
     */
    public AstronTimeType getTimeInstant() {
        return timeInstant;
    }

    /**
     * Sets the value of the timeInstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link AstronTimeType }
     *     
     */
    public void setTimeInstant(AstronTimeType value) {
        this.timeInstant = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double1Type }
     * 
     * 
     */
    public List<Double1Type> getError() {
        if (error == null) {
            error = new ArrayList<Double1Type>();
        }
        return this.error;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double1Type }
     * 
     * 
     */
    public List<Double1Type> getResolution() {
        if (resolution == null) {
            resolution = new ArrayList<Double1Type>();
        }
        return this.resolution;
    }

    /**
     * Gets the value of the size property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the size property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double1Type }
     * 
     * 
     */
    public List<Double1Type> getSize() {
        if (size == null) {
            size = new ArrayList<Double1Type>();
        }
        return this.size;
    }

    /**
     * Gets the value of the pixSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pixSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPixSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double1Type }
     * 
     * 
     */
    public List<Double1Type> getPixSize() {
        if (pixSize == null) {
            pixSize = new ArrayList<Double1Type>();
        }
        return this.pixSize;
    }

    /**
     * Gets the value of the coordSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCoordSystemId() {
        return coordSystemId;
    }

    /**
     * Sets the value of the coordSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCoordSystemId(Object value) {
        this.coordSystemId = value;
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
            return "s";
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
