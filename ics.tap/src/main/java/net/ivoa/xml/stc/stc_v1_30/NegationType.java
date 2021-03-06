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
 * The negation of a region is a region
 * 
 * <p>Java class for negationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="negationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}regionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}Region"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "negationType", propOrder = {
    "region"
})
public class NegationType
    extends RegionType
{

    @XmlElementRef(name = "Region", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class)
    protected JAXBElement<? extends RegionType> region;

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AllSkyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexHullType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SectorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SkyIndexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoxType }{@code >}
     *     
     */
    public JAXBElement<? extends RegionType> getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AllSkyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexHullType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SectorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SkyIndexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoxType }{@code >}
     *     
     */
    public void setRegion(JAXBElement<? extends RegionType> value) {
        this.region = value;
    }

}
