//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.voresource.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import net.ivoa.xml.vodataservice.v1.DataCollection;
import net.ivoa.xml.vodataservice.v1.StandardSTC;


/**
 * 
 *            Any entity or component of a VO application that is
 *            describable and identifiable by a IVOA Identifier. 
 *          
 * 
 * <p>Java class for Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validationLevel" type="{http://www.ivoa.net/xml/VOResource/v1.0}Validation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="shortName" type="{http://www.ivoa.net/xml/VOResource/v1.0}ShortName" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.ivoa.net/xml/VOResource/v1.0}IdentifierURI"/>
 *         &lt;element name="curation" type="{http://www.ivoa.net/xml/VOResource/v1.0}Curation"/>
 *         &lt;element name="content" type="{http://www.ivoa.net/xml/VOResource/v1.0}Content"/>
 *       &lt;/sequence>
 *       &lt;attribute name="created" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="updated" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="active"/>
 *             &lt;enumeration value="inactive"/>
 *             &lt;enumeration value="deleted"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {
    "validationLevel",
    "title",
    "shortName",
    "identifier",
    "curation",
    "content"
})
@XmlSeeAlso({
    StandardSTC.class,
    DataCollection.class,
    Organisation.class,
    Service.class
})
public class Resource {

    protected List<Validation> validationLevel;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String title;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shortName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String identifier;
    @XmlElement(required = true)
    protected Curation curation;
    @XmlElement(required = true)
    protected Content content;
    @XmlAttribute(name = "created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "updated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    @XmlAttribute(name = "status", required = true)
    protected String status;

    /**
     * Gets the value of the validationLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Validation }
     * 
     * 
     */
    public List<Validation> getValidationLevel() {
        if (validationLevel == null) {
            validationLevel = new ArrayList<Validation>();
        }
        return this.validationLevel;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the curation property.
     * 
     * @return
     *     possible object is
     *     {@link Curation }
     *     
     */
    public Curation getCuration() {
        return curation;
    }

    /**
     * Sets the value of the curation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Curation }
     *     
     */
    public void setCuration(Curation value) {
        this.curation = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    public Content getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    public void setContent(Content value) {
        this.content = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
