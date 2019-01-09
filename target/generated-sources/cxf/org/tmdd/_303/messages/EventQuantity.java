
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EventQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="extent" type="{http://www.tmdd.org/303/messages}DataExtent"/&gt;
 *         &lt;element name="link-state" type="{http://www.tmdd.org/303/messages}DataLinkState"/&gt;
 *         &lt;element name="incident-details" type="{http://www.tmdd.org/303/messages}DataIncidentDetails"/&gt;
 *         &lt;element name="road-weather" type="{http://www.tmdd.org/303/messages}DataRoadWeather"/&gt;
 *         &lt;element name="parking-data" type="{http://www.tmdd.org/303/messages}DataParking"/&gt;
 *         &lt;element name="surface-conditions" type="{http://www.tmdd.org/303/messages}DataSurfaceConditions"/&gt;
 *         &lt;element name="link-restrictions" type="{http://www.tmdd.org/303/messages}DataLinkRestrictions"/&gt;
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
@XmlType(name = "EventQuantity", propOrder = {
    "extent",
    "linkState",
    "incidentDetails",
    "roadWeather",
    "parkingData",
    "surfaceConditions",
    "linkRestrictions",
    "any"
})
public class EventQuantity
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected DataExtent extent;
    @XmlElement(name = "link-state")
    protected DataLinkState linkState;
    @XmlElement(name = "incident-details")
    protected DataIncidentDetails incidentDetails;
    @XmlElement(name = "road-weather")
    protected DataRoadWeather roadWeather;
    @XmlElement(name = "parking-data")
    protected DataParking parkingData;
    @XmlElement(name = "surface-conditions")
    protected DataSurfaceConditions surfaceConditions;
    @XmlElement(name = "link-restrictions")
    protected DataLinkRestrictions linkRestrictions;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtent }
     *     
     */
    public DataExtent getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtent }
     *     
     */
    public void setExtent(DataExtent value) {
        this.extent = value;
    }

    /**
     * Gets the value of the linkState property.
     * 
     * @return
     *     possible object is
     *     {@link DataLinkState }
     *     
     */
    public DataLinkState getLinkState() {
        return linkState;
    }

    /**
     * Sets the value of the linkState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataLinkState }
     *     
     */
    public void setLinkState(DataLinkState value) {
        this.linkState = value;
    }

    /**
     * Gets the value of the incidentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DataIncidentDetails }
     *     
     */
    public DataIncidentDetails getIncidentDetails() {
        return incidentDetails;
    }

    /**
     * Sets the value of the incidentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataIncidentDetails }
     *     
     */
    public void setIncidentDetails(DataIncidentDetails value) {
        this.incidentDetails = value;
    }

    /**
     * Gets the value of the roadWeather property.
     * 
     * @return
     *     possible object is
     *     {@link DataRoadWeather }
     *     
     */
    public DataRoadWeather getRoadWeather() {
        return roadWeather;
    }

    /**
     * Sets the value of the roadWeather property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRoadWeather }
     *     
     */
    public void setRoadWeather(DataRoadWeather value) {
        this.roadWeather = value;
    }

    /**
     * Gets the value of the parkingData property.
     * 
     * @return
     *     possible object is
     *     {@link DataParking }
     *     
     */
    public DataParking getParkingData() {
        return parkingData;
    }

    /**
     * Sets the value of the parkingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataParking }
     *     
     */
    public void setParkingData(DataParking value) {
        this.parkingData = value;
    }

    /**
     * Gets the value of the surfaceConditions property.
     * 
     * @return
     *     possible object is
     *     {@link DataSurfaceConditions }
     *     
     */
    public DataSurfaceConditions getSurfaceConditions() {
        return surfaceConditions;
    }

    /**
     * Sets the value of the surfaceConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSurfaceConditions }
     *     
     */
    public void setSurfaceConditions(DataSurfaceConditions value) {
        this.surfaceConditions = value;
    }

    /**
     * Gets the value of the linkRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link DataLinkRestrictions }
     *     
     */
    public DataLinkRestrictions getLinkRestrictions() {
        return linkRestrictions;
    }

    /**
     * Sets the value of the linkRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataLinkRestrictions }
     *     
     */
    public void setLinkRestrictions(DataLinkRestrictions value) {
        this.linkRestrictions = value;
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
