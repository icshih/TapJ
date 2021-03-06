//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.15 at 11:45:54 AM CET 
//


package net.ivoa.xml.stc.stc_v1_30;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for generic astronomical STC metadata, in particular Resource Profile, Search Location, Catalog Entry.
 * 
 * <p>Java class for astroSTCDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="astroSTCDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}stcDescriptionType">
 *       &lt;sequence>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}AstroCoordSystem"/>
 *         &lt;/sequence>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}AstroCoords"/>
 *         &lt;/sequence>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.ivoa.net/xml/STC/stc-v1.30.xsd}AstroCoordArea"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "astroSTCDescriptionType")
public class AstroSTCDescriptionType
    extends StcDescriptionType
{


}
