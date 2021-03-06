//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.voresource.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *          a validation stamp combining a validation level and the ID of 
 *          the validator.
 *        
 * 
 * <p>Java class for Validation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Validation">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ivoa.net/xml/VOResource/v1.0>ValidationLevel">
 *       &lt;attribute name="validatedBy" use="required" type="{http://www.ivoa.net/xml/VOResource/v1.0}IdentifierURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Validation", propOrder = {
    "value"
})
public class Validation {

    @XmlValue
    protected BigInteger value;
    @XmlAttribute(name = "validatedBy", required = true)
    protected String validatedBy;

    /**
     * 
     *          See the RM (v1.1, section 4) for more guidance on the use of
     *          these values.  
     *        
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the validatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatedBy() {
        return validatedBy;
    }

    /**
     * Sets the value of the validatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatedBy(String value) {
        this.validatedBy = value;
    }

}
