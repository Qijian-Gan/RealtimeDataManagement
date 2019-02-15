
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DataLinkState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataLinkState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="delay" type="{http://www.tmdd.org/303/messages}Link-delay"/&gt;
 *         &lt;element name="peak-delay" type="{http://www.tmdd.org/303/messages}Link-delay"/&gt;
 *         &lt;element name="alternate-route-delay" type="{http://www.tmdd.org/303/messages}Link-alternate-route-delay"/&gt;
 *         &lt;element name="alternate-route-peak-delay" type="{http://www.tmdd.org/303/messages}Link-alternate-route-delay"/&gt;
 *         &lt;element name="headway" type="{http://www.tmdd.org/303/messages}Link-headway"/&gt;
 *         &lt;element name="travel-time" type="{http://www.tmdd.org/303/messages}Link-travel-time"/&gt;
 *         &lt;element name="capacity-existing" type="{http://www.tmdd.org/303/messages}Link-capacity-existing"/&gt;
 *         &lt;element name="travel-time-increase" type="{http://www.tmdd.org/303/messages}Link-travel-time-increase"/&gt;
 *         &lt;element name="speed-average" type="{http://www.tmdd.org/303/messages}Link-speed-average"/&gt;
 *         &lt;element name="speed-vehicle-estimated" type="{http://www.tmdd.org/303/messages}Event-speed-vehicle-estimated"/&gt;
 *         &lt;element name="description-time" type="{http://www.tmdd.org/303/messages}Event-description-time"/&gt;
 *         &lt;element name="density" type="{http://www.tmdd.org/303/messages}Link-density"/&gt;
 *         &lt;element name="occupancy" type="{http://www.tmdd.org/303/messages}Link-occupancy"/&gt;
 *         &lt;element name="volume" type="{http://www.tmdd.org/303/messages}Link-volume"/&gt;
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
@XmlType(name = "DataLinkState", propOrder = {
    "delay",
    "peakDelay",
    "alternateRouteDelay",
    "alternateRoutePeakDelay",
    "headway",
    "travelTime",
    "capacityExisting",
    "travelTimeIncrease",
    "speedAverage",
    "speedVehicleEstimated",
    "descriptionTime",
    "density",
    "occupancy",
    "volume",
    "any"
})
public class DataLinkState
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlSchemaType(name = "unsignedInt")
    protected Long delay;
    @XmlElement(name = "peak-delay")
    @XmlSchemaType(name = "unsignedInt")
    protected Long peakDelay;
    @XmlElement(name = "alternate-route-delay")
    protected Integer alternateRouteDelay;
    @XmlElement(name = "alternate-route-peak-delay")
    protected Integer alternateRoutePeakDelay;
    protected Integer headway;
    @XmlElement(name = "travel-time")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer travelTime;
    @XmlElement(name = "capacity-existing")
    @XmlSchemaType(name = "unsignedByte")
    protected Short capacityExisting;
    @XmlElement(name = "travel-time-increase")
    @XmlSchemaType(name = "unsignedByte")
    protected Short travelTimeIncrease;
    @XmlElement(name = "speed-average")
    @XmlSchemaType(name = "unsignedByte")
    protected Short speedAverage;
    @XmlElement(name = "speed-vehicle-estimated")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer speedVehicleEstimated;
    @XmlElement(name = "description-time")
    protected Integer descriptionTime;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer density;
    @XmlSchemaType(name = "unsignedByte")
    protected Short occupancy;
    @XmlSchemaType(name = "unsignedInt")
    protected Long volume;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDelay(Long value) {
        this.delay = value;
    }

    /**
     * Gets the value of the peakDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeakDelay() {
        return peakDelay;
    }

    /**
     * Sets the value of the peakDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeakDelay(Long value) {
        this.peakDelay = value;
    }

    /**
     * Gets the value of the alternateRouteDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlternateRouteDelay() {
        return alternateRouteDelay;
    }

    /**
     * Sets the value of the alternateRouteDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlternateRouteDelay(Integer value) {
        this.alternateRouteDelay = value;
    }

    /**
     * Gets the value of the alternateRoutePeakDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlternateRoutePeakDelay() {
        return alternateRoutePeakDelay;
    }

    /**
     * Sets the value of the alternateRoutePeakDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlternateRoutePeakDelay(Integer value) {
        this.alternateRoutePeakDelay = value;
    }

    /**
     * Gets the value of the headway property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeadway() {
        return headway;
    }

    /**
     * Sets the value of the headway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeadway(Integer value) {
        this.headway = value;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTravelTime(Integer value) {
        this.travelTime = value;
    }

    /**
     * Gets the value of the capacityExisting property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCapacityExisting() {
        return capacityExisting;
    }

    /**
     * Sets the value of the capacityExisting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCapacityExisting(Short value) {
        this.capacityExisting = value;
    }

    /**
     * Gets the value of the travelTimeIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTravelTimeIncrease() {
        return travelTimeIncrease;
    }

    /**
     * Sets the value of the travelTimeIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTravelTimeIncrease(Short value) {
        this.travelTimeIncrease = value;
    }

    /**
     * Gets the value of the speedAverage property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSpeedAverage() {
        return speedAverage;
    }

    /**
     * Sets the value of the speedAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSpeedAverage(Short value) {
        this.speedAverage = value;
    }

    /**
     * Gets the value of the speedVehicleEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpeedVehicleEstimated() {
        return speedVehicleEstimated;
    }

    /**
     * Sets the value of the speedVehicleEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeedVehicleEstimated(Integer value) {
        this.speedVehicleEstimated = value;
    }

    /**
     * Gets the value of the descriptionTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDescriptionTime() {
        return descriptionTime;
    }

    /**
     * Sets the value of the descriptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDescriptionTime(Integer value) {
        this.descriptionTime = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDensity(Integer value) {
        this.density = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOccupancy(Short value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVolume(Long value) {
        this.volume = value;
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
