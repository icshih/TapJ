//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.vodataservice.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *            This definition that the foreign key is being described 
 *            within the context of the table containing the key.  
 *          
 * 
 * <p>Java class for ForeignKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetTable" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="fkColumn" type="{http://www.ivoa.net/xml/VODataService/v1.1}FKColumn" maxOccurs="unbounded"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="utype" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignKey", propOrder = {
    "targetTable",
    "fkColumn",
    "description",
    "utype"
})
public class ForeignKey {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String targetTable;
    @XmlElement(required = true)
    protected List<FKColumn> fkColumn;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String description;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String utype;

    /**
     * Gets the value of the targetTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetTable() {
        return targetTable;
    }

    /**
     * Sets the value of the targetTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetTable(String value) {
        this.targetTable = value;
    }

    /**
     * Gets the value of the fkColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fkColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFkColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FKColumn }
     * 
     * 
     */
    public List<FKColumn> getFkColumn() {
        if (fkColumn == null) {
            fkColumn = new ArrayList<FKColumn>();
        }
        return this.fkColumn;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the utype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtype() {
        return utype;
    }

    /**
     * Sets the value of the utype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtype(String value) {
        this.utype = value;
    }

}