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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Redshift coordinate type
 * 
 * <p>Java class for redshiftCoordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="redshiftCoordinateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}basicCoordinateType">
 *       &lt;attribute name="coord_system_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="unit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}posUnitType" />
 *       &lt;attribute name="vel_time_unit" type="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}velTimeUnitType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redshiftCoordinateType")
public class RedshiftCoordinateType
    extends BasicCoordinateType
{

    @XmlAttribute(name = "coord_system_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object coordSystemId;
    @XmlAttribute(name = "unit")
    protected String unit;
    @XmlAttribute(name = "vel_time_unit")
    protected VelTimeUnitType velTimeUnit;

    /**
     * Gets the value of the coordSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCoordSystemId() {
        return coordSystemId;
    }

    /**
     * Sets the value of the coordSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCoordSystemId(Object value) {
        this.coordSystemId = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the velTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link VelTimeUnitType }
     *     
     */
    public VelTimeUnitType getVelTimeUnit() {
        return velTimeUnit;
    }

    /**
     * Sets the value of the velTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelTimeUnitType }
     *     
     */
    public void setVelTimeUnit(VelTimeUnitType value) {
        this.velTimeUnit = value;
    }

}
