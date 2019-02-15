
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Route&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RouteStatusList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteStatusList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="network-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="route-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="route-status" type="{http://www.tmdd.org/303/messages}Link-status"/&gt;
 *         &lt;element name="route-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="detour-route-in-effect-flag" type="{http://www.tmdd.org/303/messages}Binary-flag" minOccurs="0"/&gt;
 *         &lt;element name="surface-condition" type="{http://www.tmdd.org/303/messages}Link-surface-condition" minOccurs="0"/&gt;
 *         &lt;element name="route-capacity" type="{http://www.tmdd.org/303/messages}Link-capacity-existing" minOccurs="0"/&gt;
 *         &lt;element name="level-of-service" type="{http://www.tmdd.org/303/messages}Link-level-of-service" minOccurs="0"/&gt;
 *         &lt;element name="saturation-flag" type="{http://www.tmdd.org/303/messages}Link-oversaturated-flag" minOccurs="0"/&gt;
 *         &lt;element name="route-data-stored-type" type="{http://www.tmdd.org/303/messages}Link-data-stored" minOccurs="0"/&gt;
 *         &lt;element name="route-traffic-data-algorithm" type="{http://www.tmdd.org/303/messages}Link-data-type" minOccurs="0"/&gt;
 *         &lt;element name="delay" type="{http://www.tmdd.org/303/messages}Link-delay" minOccurs="0"/&gt;
 *         &lt;element name="alternate-route-delay" type="{http://www.tmdd.org/303/messages}Link-alternate-route-delay" minOccurs="0"/&gt;
 *         &lt;element name="headway" type="{http://www.tmdd.org/303/messages}Link-headway" minOccurs="0"/&gt;
 *         &lt;element name="travel-time" type="{http://www.tmdd.org/303/messages}Link-travel-time" minOccurs="0"/&gt;
 *         &lt;element name="travel-time-increase" type="{http://www.tmdd.org/303/messages}Link-travel-time-increase" minOccurs="0"/&gt;
 *         &lt;element name="volume" type="{http://www.tmdd.org/303/messages}Link-volume" minOccurs="0"/&gt;
 *         &lt;element name="speed-average" type="{http://www.tmdd.org/303/messages}Link-speed-average" minOccurs="0"/&gt;
 *         &lt;element name="density" type="{http://www.tmdd.org/303/messages}Link-density" minOccurs="0"/&gt;
 *         &lt;element name="occupancy" type="{http://www.tmdd.org/303/messages}Link-occupancy" minOccurs="0"/&gt;
 *         &lt;element name="current-speed-advisory" type="{http://www.tmdd.org/303/messages}Link-speed-limit" minOccurs="0"/&gt;
 *         &lt;element name="speed-limit-units" type="{http://www.tmdd.org/303/messages}Link-speed-limit-units" minOccurs="0"/&gt;
 *         &lt;element name="event-description-time" type="{http://www.tmdd.org/303/messages}Event-description-time" minOccurs="0"/&gt;
 *         &lt;element name="last-update-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
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
@XmlType(name = "RouteStatusList", propOrder = {
    "networkId",
    "routeId",
    "routeStatus",
    "routeName",
    "detourRouteInEffectFlag",
    "surfaceCondition",
    "routeCapacity",
    "levelOfService",
    "saturationFlag",
    "routeDataStoredType",
    "routeTrafficDataAlgorithm",
    "delay",
    "alternateRouteDelay",
    "headway",
    "travelTime",
    "travelTimeIncrease",
    "volume",
    "speedAverage",
    "density",
    "occupancy",
    "currentSpeedAdvisory",
    "speedLimitUnits",
    "eventDescriptionTime",
    "lastUpdateTime",
    "any"
})
public class RouteStatusList
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "network-id", required = true)
    protected String networkId;
    @XmlElement(name = "route-id", required = true)
    protected String routeId;
    @XmlElement(name = "route-status", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String routeStatus;
    @XmlElement(name = "route-name")
    protected String routeName;
    @XmlElement(name = "detour-route-in-effect-flag")
    @XmlSchemaType(name = "anySimpleType")
    protected String detourRouteInEffectFlag;
    @XmlElement(name = "surface-condition")
    @XmlSchemaType(name = "anySimpleType")
    protected String surfaceCondition;
    @XmlElement(name = "route-capacity")
    @XmlSchemaType(name = "unsignedByte")
    protected Short routeCapacity;
    @XmlElement(name = "level-of-service")
    @XmlSchemaType(name = "anySimpleType")
    protected String levelOfService;
    @XmlElement(name = "saturation-flag")
    @XmlSchemaType(name = "anySimpleType")
    protected String saturationFlag;
    @XmlElement(name = "route-data-stored-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String routeDataStoredType;
    @XmlElement(name = "route-traffic-data-algorithm")
    @XmlSchemaType(name = "anySimpleType")
    protected String routeTrafficDataAlgorithm;
    @XmlSchemaType(name = "unsignedInt")
    protected Long delay;
    @XmlElement(name = "alternate-route-delay")
    protected Integer alternateRouteDelay;
    protected Integer headway;
    @XmlElement(name = "travel-time")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer travelTime;
    @XmlElement(name = "travel-time-increase")
    @XmlSchemaType(name = "unsignedByte")
    protected Short travelTimeIncrease;
    @XmlSchemaType(name = "unsignedInt")
    protected Long volume;
    @XmlElement(name = "speed-average")
    @XmlSchemaType(name = "unsignedByte")
    protected Short speedAverage;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer density;
    @XmlSchemaType(name = "unsignedByte")
    protected Short occupancy;
    @XmlElement(name = "current-speed-advisory")
    @XmlSchemaType(name = "unsignedByte")
    protected Short currentSpeedAdvisory;
    @XmlElement(name = "speed-limit-units")
    @XmlSchemaType(name = "anySimpleType")
    protected String speedLimitUnits;
    @XmlElement(name = "event-description-time")
    protected Integer eventDescriptionTime;
    @XmlElement(name = "last-update-time")
    protected DateTimeZone lastUpdateTime;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the routeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * Sets the value of the routeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteId(String value) {
        this.routeId = value;
    }

    /**
     * Gets the value of the routeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteStatus() {
        return routeStatus;
    }

    /**
     * Sets the value of the routeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteStatus(String value) {
        this.routeStatus = value;
    }

    /**
     * Gets the value of the routeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * Sets the value of the routeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteName(String value) {
        this.routeName = value;
    }

    /**
     * Gets the value of the detourRouteInEffectFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetourRouteInEffectFlag() {
        return detourRouteInEffectFlag;
    }

    /**
     * Sets the value of the detourRouteInEffectFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetourRouteInEffectFlag(String value) {
        this.detourRouteInEffectFlag = value;
    }

    /**
     * Gets the value of the surfaceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfaceCondition() {
        return surfaceCondition;
    }

    /**
     * Sets the value of the surfaceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceCondition(String value) {
        this.surfaceCondition = value;
    }

    /**
     * Gets the value of the routeCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRouteCapacity() {
        return routeCapacity;
    }

    /**
     * Sets the value of the routeCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRouteCapacity(Short value) {
        this.routeCapacity = value;
    }

    /**
     * Gets the value of the levelOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfService() {
        return levelOfService;
    }

    /**
     * Sets the value of the levelOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfService(String value) {
        this.levelOfService = value;
    }

    /**
     * Gets the value of the saturationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaturationFlag() {
        return saturationFlag;
    }

    /**
     * Sets the value of the saturationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaturationFlag(String value) {
        this.saturationFlag = value;
    }

    /**
     * Gets the value of the routeDataStoredType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDataStoredType() {
        return routeDataStoredType;
    }

    /**
     * Sets the value of the routeDataStoredType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDataStoredType(String value) {
        this.routeDataStoredType = value;
    }

    /**
     * Gets the value of the routeTrafficDataAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteTrafficDataAlgorithm() {
        return routeTrafficDataAlgorithm;
    }

    /**
     * Sets the value of the routeTrafficDataAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteTrafficDataAlgorithm(String value) {
        this.routeTrafficDataAlgorithm = value;
    }

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
     * Gets the value of the currentSpeedAdvisory property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCurrentSpeedAdvisory() {
        return currentSpeedAdvisory;
    }

    /**
     * Sets the value of the currentSpeedAdvisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCurrentSpeedAdvisory(Short value) {
        this.currentSpeedAdvisory = value;
    }

    /**
     * Gets the value of the speedLimitUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedLimitUnits() {
        return speedLimitUnits;
    }

    /**
     * Sets the value of the speedLimitUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedLimitUnits(String value) {
        this.speedLimitUnits = value;
    }

    /**
     * Gets the value of the eventDescriptionTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventDescriptionTime() {
        return eventDescriptionTime;
    }

    /**
     * Sets the value of the eventDescriptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventDescriptionTime(Integer value) {
        this.eventDescriptionTime = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setLastUpdateTime(DateTimeZone value) {
        this.lastUpdateTime = value;
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
