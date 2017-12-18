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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A custom space reference frame type defined through pole and X-axis directions
 * 
 * <p>Java class for sphericalRefFrameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sphericalRefFrameType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}coordRefFrameType">
 *       &lt;sequence>
 *         &lt;element name="Frame" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pole_Zaxis" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}astroCoordsType"/>
 *         &lt;element name="Xaxis" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}astroCoordsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sphericalRefFrameType", propOrder = {
    "frame",
    "poleZaxis",
    "xaxis"
})
public class SphericalRefFrameType
    extends CoordRefFrameType
{

    @XmlElement(name = "Frame", required = true)
    protected String frame;
    @XmlElement(name = "Pole_Zaxis", required = true, nillable = true)
    protected AstroCoordsType poleZaxis;
    @XmlElement(name = "Xaxis", required = true, nillable = true)
    protected AstroCoordsType xaxis;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
     * Gets the value of the poleZaxis property.
     * 
     * @return
     *     possible object is
     *     {@link AstroCoordsType }
     *     
     */
    public AstroCoordsType getPoleZaxis() {
        return poleZaxis;
    }

    /**
     * Sets the value of the poleZaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AstroCoordsType }
     *     
     */
    public void setPoleZaxis(AstroCoordsType value) {
        this.poleZaxis = value;
    }

    /**
     * Gets the value of the xaxis property.
     * 
     * @return
     *     possible object is
     *     {@link AstroCoordsType }
     *     
     */
    public AstroCoordsType getXaxis() {
        return xaxis;
    }

    /**
     * Sets the value of the xaxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AstroCoordsType }
     *     
     */
    public void setXaxis(AstroCoordsType value) {
        this.xaxis = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}