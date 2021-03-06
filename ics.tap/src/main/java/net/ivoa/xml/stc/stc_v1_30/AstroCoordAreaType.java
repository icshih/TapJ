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
import javax.xml.bind.annotation.XmlType;


/**
 * Astronomical area type
 * 
 * <p>Java class for astroCoordAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="astroCoordAreaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}coordAreaType">
 *       &lt;sequence>
 *         &lt;element name="TimeInterval" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}timeIntervalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}PositionInterval" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}VelocityInterval" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpectralInterval" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}spectralIntervalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RedshiftInterval" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}redshiftIntervalType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "astroCoordAreaType", propOrder = {
    "timeInterval",
    "positionInterval",
    "velocityInterval",
    "spectralInterval",
    "redshiftInterval"
})
public class AstroCoordAreaType
    extends CoordAreaType
{

    @XmlElement(name = "TimeInterval", nillable = true)
    protected List<TimeIntervalType> timeInterval;
    @XmlElementRef(name = "PositionInterval", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends CoordIntervalType> positionInterval;
    @XmlElementRef(name = "VelocityInterval", namespace = "http://www.ivoa.net/xml/STC/stc-v1.30.xsd", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends CoordIntervalType>> velocityInterval;
    @XmlElement(name = "SpectralInterval", nillable = true)
    protected List<SpectralIntervalType> spectralInterval;
    @XmlElement(name = "RedshiftInterval", nillable = true)
    protected List<RedshiftIntervalType> redshiftInterval;

    /**
     * Gets the value of the timeInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeIntervalType }
     * 
     * 
     */
    public List<TimeIntervalType> getTimeInterval() {
        if (timeInterval == null) {
            timeInterval = new ArrayList<TimeIntervalType>();
        }
        return this.timeInterval;
    }

    /**
     * Gets the value of the positionInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AllSkyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphereType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordIntervalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SkyIndexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegionFileType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pos3VecIntervalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pos2VecIntervalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PosScalarIntervalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexHullType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SectorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoxType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllSkyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SkyIndexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexHullType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SectorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoxType }{@code >}
     *     
     */
    public JAXBElement<? extends CoordIntervalType> getPositionInterval() {
        return positionInterval;
    }

    /**
     * Sets the value of the positionInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AllSkyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphereType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordIntervalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SkyIndexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegionFileType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pos3VecIntervalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NegationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Pos2VecIntervalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PosScalarIntervalType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexHullType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SectorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoxType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllSkyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntersectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SkyIndexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexHullType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiffType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SectorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoxType }{@code >}
     *     
     */
    public void setPositionInterval(JAXBElement<? extends CoordIntervalType> value) {
        this.positionInterval = value;
    }

    /**
     * Gets the value of the velocityInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the velocityInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVelocityInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Vel2VecIntervalType }{@code >}
     * {@link JAXBElement }{@code <}{@link VelocitySphereType }{@code >}
     * {@link JAXBElement }{@code <}{@link VelScalarIntervalType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoordIntervalType }{@code >}
     * {@link JAXBElement }{@code <}{@link Vel3VecIntervalType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends CoordIntervalType>> getVelocityInterval() {
        if (velocityInterval == null) {
            velocityInterval = new ArrayList<JAXBElement<? extends CoordIntervalType>>();
        }
        return this.velocityInterval;
    }

    /**
     * Gets the value of the spectralInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spectralInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpectralInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpectralIntervalType }
     * 
     * 
     */
    public List<SpectralIntervalType> getSpectralInterval() {
        if (spectralInterval == null) {
            spectralInterval = new ArrayList<SpectralIntervalType>();
        }
        return this.spectralInterval;
    }

    /**
     * Gets the value of the redshiftInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redshiftInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedshiftInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedshiftIntervalType }
     * 
     * 
     */
    public List<RedshiftIntervalType> getRedshiftInterval() {
        if (redshiftInterval == null) {
            redshiftInterval = new ArrayList<RedshiftIntervalType>();
        }
        return this.redshiftInterval;
    }

}
