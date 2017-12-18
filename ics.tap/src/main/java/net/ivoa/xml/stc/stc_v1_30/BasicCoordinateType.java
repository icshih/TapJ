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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Single Error, Resolution, Size, PixSize elements indicate definite values; pairs indicate ranges
 * 
 * <p>Java class for basicCoordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basicCoordinateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}coordinateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}Value" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}Error" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}Resolution" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}Size" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}PixSize" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basicCoordinateType", propOrder = {
    "value",
    "error",
    "resolution",
    "size",
    "pixSize"
})
@XmlSeeAlso({
    PosVector1CoordinateType.class,
    RedshiftCoordinateType.class,
    SpectralCoordinateType.class,
    ScalarCoordinateType.class
})
public class BasicCoordinateType
    extends CoordinateType
{

    @XmlElement(name = "Value", nillable = true)
    protected Double1Type value;
    @XmlElement(name = "Error", nillable = true)
    protected List<Double1Type> error;
    @XmlElement(name = "Resolution", nillable = true)
    protected List<Double1Type> resolution;
    @XmlElement(name = "Size", nillable = true)
    protected List<Double1Type> size;
    @XmlElement(name = "PixSize", nillable = true)
    protected List<Double1Type> pixSize;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double1Type }
     *     
     */
    public Double1Type getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double1Type }
     *     
     */
    public void setValue(Double1Type value) {
        this.value = value;
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

}
