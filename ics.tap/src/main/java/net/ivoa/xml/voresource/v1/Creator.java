//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.voresource.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The entity (e.g. person or organisation) primarily responsible 
 *             for creating something
 *          
 * 
 * <p>Java class for Creator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Creator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.ivoa.net/xml/VOResource/v1.0}ResourceName"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Creator", propOrder = {
    "name",
    "logo"
})
public class Creator {

    @XmlElement(required = true)
    protected ResourceName name;
    @XmlSchemaType(name = "anyURI")
    protected String logo;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceName }
     *     
     */
    public ResourceName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceName }
     *     
     */
    public void setName(ResourceName value) {
        this.name = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
    }

}
