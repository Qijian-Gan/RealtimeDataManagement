
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import lrms_adopted_02_00_00.GeoLocation;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for LandmarkLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandmarkLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="landmark-type" type="{http://www.tmdd.org/303/messages}Event-location-landmark-type"/&gt;
 *         &lt;element name="landmark-name" type="{http://www.tmdd.org/303/messages}Event-landmark-name"/&gt;
 *         &lt;element name="landmark-point-name" type="{http://www.tmdd.org/303/messages}Event-landmark-name" minOccurs="0"/&gt;
 *         &lt;element name="location-rank" type="{http://www.tmdd.org/303/messages}Event-location-rank" minOccurs="0"/&gt;
 *         &lt;element name="geo-location" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="upward-area-reference" type="{http://www.tmdd.org/303/messages}AreaLocation" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandmarkLocation", propOrder = {
    "landmarkType",
    "landmarkName",
    "landmarkPointName",
    "locationRank",
    "geoLocation",
    "upwardAreaReference",
    "any"
})
public class LandmarkLocation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "landmark-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String landmarkType;
    @XmlElement(name = "landmark-name", required = true)
    protected String landmarkName;
    @XmlElement(name = "landmark-point-name")
    protected String landmarkPointName;
    @XmlElement(name = "location-rank")
    @XmlSchemaType(name = "unsignedByte")
    protected Short locationRank;
    @XmlElement(name = "geo-location")
    protected GeoLocation geoLocation;
    @XmlElement(name = "upward-area-reference")
    protected AreaLocation upwardAreaReference;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the landmarkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandmarkType() {
        return landmarkType;
    }

    /**
     * Sets the value of the landmarkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandmarkType(String value) {
        this.landmarkType = value;
    }

    /**
     * Gets the value of the landmarkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandmarkName() {
        return landmarkName;
    }

    /**
     * Sets the value of the landmarkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandmarkName(String value) {
        this.landmarkName = value;
    }

    /**
     * Gets the value of the landmarkPointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandmarkPointName() {
        return landmarkPointName;
    }

    /**
     * Sets the value of the landmarkPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandmarkPointName(String value) {
        this.landmarkPointName = value;
    }

    /**
     * Gets the value of the locationRank property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLocationRank() {
        return locationRank;
    }

    /**
     * Sets the value of the locationRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLocationRank(Short value) {
        this.locationRank = value;
    }

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setGeoLocation(GeoLocation value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the upwardAreaReference property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLocation }
     *     
     */
    public AreaLocation getUpwardAreaReference() {
        return upwardAreaReference;
    }

    /**
     * Sets the value of the upwardAreaReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLocation }
     *     
     */
    public void setUpwardAreaReference(AreaLocation value) {
        this.upwardAreaReference = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
