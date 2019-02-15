
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for EventLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="area-location" type="{http://www.tmdd.org/303/messages}AreaLocation"/&gt;
 *         &lt;element name="location-on-link" type="{http://www.tmdd.org/303/messages}LinkLocation"/&gt;
 *         &lt;element name="landmark" type="{http://www.tmdd.org/303/messages}LandmarkLocation"/&gt;
 *         &lt;element name="geo-location" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation"/&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventLocation", propOrder = {
    "areaLocation",
    "locationOnLink",
    "landmark",
    "geoLocation",
    "any"
})
public class EventLocation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "area-location")
    protected AreaLocation areaLocation;
    @XmlElement(name = "location-on-link")
    protected LinkLocation locationOnLink;
    protected LandmarkLocation landmark;
    @XmlElement(name = "geo-location")
    protected GeoLocation geoLocation;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the areaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLocation }
     *     
     */
    public AreaLocation getAreaLocation() {
        return areaLocation;
    }

    /**
     * Sets the value of the areaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLocation }
     *     
     */
    public void setAreaLocation(AreaLocation value) {
        this.areaLocation = value;
    }

    /**
     * Gets the value of the locationOnLink property.
     * 
     * @return
     *     possible object is
     *     {@link LinkLocation }
     *     
     */
    public LinkLocation getLocationOnLink() {
        return locationOnLink;
    }

    /**
     * Sets the value of the locationOnLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkLocation }
     *     
     */
    public void setLocationOnLink(LinkLocation value) {
        this.locationOnLink = value;
    }

    /**
     * Gets the value of the landmark property.
     * 
     * @return
     *     possible object is
     *     {@link LandmarkLocation }
     *     
     */
    public LandmarkLocation getLandmark() {
        return landmark;
    }

    /**
     * Sets the value of the landmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandmarkLocation }
     *     
     */
    public void setLandmark(LandmarkLocation value) {
        this.landmark = value;
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
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
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
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
