//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.stc.stc_v1_30;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Single CError2, CResolution2, CSize2, CPixSize2 elements indicate definite values; pairs indicate ranges
 * 
 * <p>Java class for vector2CoordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vector2CoordinateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}coordinateType">
 *       &lt;sequence>
 *         &lt;element name="Name1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}CValue2" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}CError2" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}CResolution2" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}CSize2" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}CPixSize2" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vector2CoordinateType", propOrder = {
    "name1",
    "name2",
    "cValue2",
    "cError2",
    "cResolution2",
    "cSize2",
    "cPixSize2"
})
@XmlSeeAlso({
    GenVector2CoordinateType.class,
    PosVector2CoordinateType.class
})
public class Vector2CoordinateType
    extends CoordinateType
{

    @XmlElement(name = "Name1")
    protected String name1;
    @XmlElement(name = "Name2")
    protected String name2;
    @XmlElementRef(name = "CValue2", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<?> cValue2;
    @XmlElementRef(name = "CError2", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> cError2;
    @XmlElementRef(name = "CResolution2", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> cResolution2;
    @XmlElementRef(name = "CSize2", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> cSize2;
    @XmlElementRef(name = "CPixSize2", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> cPixSize2;

    /**
     * Gets the value of the name1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Sets the value of the name1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the cValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Curve2Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link Double2Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getCValue2() {
        return cValue2;
    }

    /**
     * Sets the value of the cValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Curve2Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link Double2Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setCValue2(JAXBElement<?> value) {
        this.cValue2 = value;
    }

    /**
     * Gets the value of the cError2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cError2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCError2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Size2Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Double4Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getCError2() {
        if (cError2 == null) {
            cError2 = new ArrayList<JAXBElement<?>>();
        }
        return this.cError2;
    }

    /**
     * Gets the value of the cResolution2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cResolution2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCResolution2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Double4Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Size2Type }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getCResolution2() {
        if (cResolution2 == null) {
            cResolution2 = new ArrayList<JAXBElement<?>>();
        }
        return this.cResolution2;
    }

    /**
     * Gets the value of the cSize2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cSize2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSize2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Size2Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Double4Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Double1Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getCSize2() {
        if (cSize2 == null) {
            cSize2 = new ArrayList<JAXBElement<?>>();
        }
        return this.cSize2;
    }

    /**
     * Gets the value of the cPixSize2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cPixSize2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCPixSize2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Size2Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Double4Type }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getCPixSize2() {
        if (cPixSize2 == null) {
            cPixSize2 = new ArrayList<JAXBElement<?>>();
        }
        return this.cPixSize2;
    }

}
