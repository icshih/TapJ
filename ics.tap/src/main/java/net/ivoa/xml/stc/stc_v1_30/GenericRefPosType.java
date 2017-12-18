//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.stc.stc_v1_30;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for custom positions: specifies reference origin
 * 
 * <p>Java class for genericRefPosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genericRefPosType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}referencePositionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}GenCoordinate"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericRefPosType", propOrder = {
    "genCoordinate"
})
public class GenericRefPosType
    extends ReferencePositionType
{

    @XmlElementRef(name = "GenCoordinate", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class)
    protected JAXBElement<? extends CoordinateType> genCoordinate;

    /**
     * Gets the value of the genCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenVector2CoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScalarCoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenVector3CoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringCoordinateType }{@code >}
     *     
     */
    public JAXBElement<? extends CoordinateType> getGenCoordinate() {
        return genCoordinate;
    }

    /**
     * Sets the value of the genCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenVector2CoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScalarCoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenVector3CoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringCoordinateType }{@code >}
     *     
     */
    public void setGenCoordinate(JAXBElement<? extends CoordinateType> value) {
        this.genCoordinate = value;
    }

}