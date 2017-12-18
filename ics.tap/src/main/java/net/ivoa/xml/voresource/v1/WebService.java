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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The accessURL element gives the Web Service's endpoint URL.
 *          
 * 
 * <p>Java class for WebService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/VOResource/v1.0}Interface">
 *       &lt;sequence>
 *         &lt;element name="wsdlURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebService", propOrder = {
    "wsdlURL"
})
public class WebService
    extends Interface
{

    @XmlSchemaType(name = "anyURI")
    protected List<String> wsdlURL;

    /**
     * Gets the value of the wsdlURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsdlURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsdlURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWsdlURL() {
        if (wsdlURL == null) {
            wsdlURL = new ArrayList<String>();
        }
        return this.wsdlURL;
    }

}