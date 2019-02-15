
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Link&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for LinkStatusList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkStatusList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="network-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="link-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="link-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="link-status" type="{http://www.tmdd.org/303/messages}Link-status"/&gt;
 *         &lt;element name="link-direction" type="{http://www.tmdd.org/303/messages}Link-direction" minOccurs="0"/&gt;
 *         &lt;element name="lanes-number-open" type="{http://www.tmdd.org/303/messages}Link-lanes-count" minOccurs="0"/&gt;
 *         &lt;element name="priority-type" type="{http://www.tmdd.org/303/messages}Link-priority-type" minOccurs="0"/&gt;
 *         &lt;element name="restriction-axle-count" type="{http://www.tmdd.org/303/messages}Link-restriction-axle-count" minOccurs="0"/&gt;
 *         &lt;element name="restriction-height" type="{http://www.tmdd.org/303/messages}Link-restriction-height" minOccurs="0"/&gt;
 *         &lt;element name="restriction-length" type="{http://www.tmdd.org/303/messages}Link-restriction-length" minOccurs="0"/&gt;
 *         &lt;element name="restriction-weight" type="{http://www.tmdd.org/303/messages}Link-restriction-weight-vehicle" minOccurs="0"/&gt;
 *         &lt;element name="restriction-width" type="{http://www.tmdd.org/303/messages}Link-restriction-width" minOccurs="0"/&gt;
 *         &lt;element name="restriction-weight-axle" type="{http://www.tmdd.org/303/messages}Link-restriction-weight-axle" minOccurs="0"/&gt;
 *         &lt;element name="restriction-units" type="{http://www.tmdd.org/303/messages}Link-restriction-units" minOccurs="0"/&gt;
 *         &lt;element name="surface-condition" type="{http://www.tmdd.org/303/messages}Link-surface-condition" minOccurs="0"/&gt;
 *         &lt;element name="saturation-flag" type="{http://www.tmdd.org/303/messages}Link-oversaturated-flag" minOccurs="0"/&gt;
 *         &lt;element name="oversaturated-threshold" type="{http://www.tmdd.org/303/messages}Link-oversaturated-threshold" minOccurs="0"/&gt;
 *         &lt;element name="level-of-service" type="{http://www.tmdd.org/303/messages}Link-level-of-service" minOccurs="0"/&gt;
 *         &lt;element name="lane-numbers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="lanes" type="{http://www.tmdd.org/303/messages}Link-lane-number"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="link-data-stored" type="{http://www.tmdd.org/303/messages}Link-data-stored" minOccurs="0"/&gt;
 *         &lt;element name="detection-method" type="{http://www.tmdd.org/303/messages}Event-detection-method" minOccurs="0"/&gt;
 *         &lt;element name="link-traffic-data-algorithm" type="{http://www.tmdd.org/303/messages}Link-data-type" minOccurs="0"/&gt;
 *         &lt;element name="stops" type="{http://www.tmdd.org/303/messages}Link-stops" minOccurs="0"/&gt;
 *         &lt;element name="delay" type="{http://www.tmdd.org/303/messages}Link-delay" minOccurs="0"/&gt;
 *         &lt;element name="alternate-route-delay" type="{http://www.tmdd.org/303/messages}Link-alternate-route-delay" minOccurs="0"/&gt;
 *         &lt;element name="headway" type="{http://www.tmdd.org/303/messages}Link-headway" minOccurs="0"/&gt;
 *         &lt;element name="travel-time" type="{http://www.tmdd.org/303/messages}Link-travel-time" minOccurs="0"/&gt;
 *         &lt;element name="capacity-existing" type="{http://www.tmdd.org/303/messages}Link-capacity-existing" minOccurs="0"/&gt;
 *         &lt;element name="travel-time-increase" type="{http://www.tmdd.org/303/messages}Link-travel-time-increase" minOccurs="0"/&gt;
 *         &lt;element name="speed-average" type="{http://www.tmdd.org/303/messages}Link-speed-average" minOccurs="0"/&gt;
 *         &lt;element name="speed-vehicle-estimated" type="{http://www.tmdd.org/303/messages}Event-speed-vehicle-estimated" minOccurs="0"/&gt;
 *         &lt;element name="speed-limit" type="{http://www.tmdd.org/303/messages}Link-speed-limit" minOccurs="0"/&gt;
 *         &lt;element name="advisory-speed-limit" type="{http://www.tmdd.org/303/messages}Link-speed-limit" minOccurs="0"/&gt;
 *         &lt;element name="truck-speed-limit" type="{http://www.tmdd.org/303/messages}Link-speed-limit" minOccurs="0"/&gt;
 *         &lt;element name="speed-limit-units" type="{http://www.tmdd.org/303/messages}Link-speed-limit-units" minOccurs="0"/&gt;
 *         &lt;element name="density" type="{http://www.tmdd.org/303/messages}Link-density" minOccurs="0"/&gt;
 *         &lt;element name="occupancy" type="{http://www.tmdd.org/303/messages}Link-occupancy" minOccurs="0"/&gt;
 *         &lt;element name="volume" type="{http://www.tmdd.org/303/messages}Link-volume" minOccurs="0"/&gt;
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
@XmlType(name = "LinkStatusList", propOrder = {
    "networkId",
    "linkId",
    "linkName",
    "linkStatus",
    "linkDirection",
    "lanesNumberOpen",
    "priorityType",
    "restrictionAxleCount",
    "restrictionHeight",
    "restrictionLength",
    "restrictionWeight",
    "restrictionWidth",
    "restrictionWeightAxle",
    "restrictionUnits",
    "surfaceCondition",
    "saturationFlag",
    "oversaturatedThreshold",
    "levelOfService",
    "laneNumbers",
    "linkDataStored",
    "detectionMethod",
    "linkTrafficDataAlgorithm",
    "stops",
    "delay",
    "alternateRouteDelay",
    "headway",
    "travelTime",
    "capacityExisting",
    "travelTimeIncrease",
    "speedAverage",
    "speedVehicleEstimated",
    "speedLimit",
    "advisorySpeedLimit",
    "truckSpeedLimit",
    "speedLimitUnits",
    "density",
    "occupancy",
    "volume",
    "eventDescriptionTime",
    "lastUpdateTime",
    "any"
})
public class LinkStatusList
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "network-id", required = true)
    protected String networkId;
    @XmlElement(name = "link-id", required = true)
    protected String linkId;
    @XmlElement(name = "link-name")
    protected String linkName;
    @XmlElement(name = "link-status", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String linkStatus;
    @XmlElement(name = "link-direction")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkDirection;
    @XmlElement(name = "lanes-number-open")
    @XmlSchemaType(name = "unsignedByte")
    protected Short lanesNumberOpen;
    @XmlElement(name = "priority-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String priorityType;
    @XmlElement(name = "restriction-axle-count")
    @XmlSchemaType(name = "unsignedByte")
    protected Short restrictionAxleCount;
    @XmlElement(name = "restriction-height")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionHeight;
    @XmlElement(name = "restriction-length")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionLength;
    @XmlElement(name = "restriction-weight")
    @XmlSchemaType(name = "unsignedInt")
    protected Long restrictionWeight;
    @XmlElement(name = "restriction-width")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionWidth;
    @XmlElement(name = "restriction-weight-axle")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionWeightAxle;
    @XmlElement(name = "restriction-units")
    @XmlSchemaType(name = "anySimpleType")
    protected String restrictionUnits;
    @XmlElement(name = "surface-condition")
    @XmlSchemaType(name = "anySimpleType")
    protected String surfaceCondition;
    @XmlElement(name = "saturation-flag")
    @XmlSchemaType(name = "anySimpleType")
    protected String saturationFlag;
    @XmlElement(name = "oversaturated-threshold")
    @XmlSchemaType(name = "unsignedByte")
    protected Short oversaturatedThreshold;
    @XmlElement(name = "level-of-service")
    @XmlSchemaType(name = "anySimpleType")
    protected String levelOfService;
    @XmlElement(name = "lane-numbers")
    protected LinkStatusList.LaneNumbers laneNumbers;
    @XmlElement(name = "link-data-stored")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkDataStored;
    @XmlElement(name = "detection-method")
    @XmlSchemaType(name = "anySimpleType")
    protected String detectionMethod;
    @XmlElement(name = "link-traffic-data-algorithm")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkTrafficDataAlgorithm;
    @XmlSchemaType(name = "unsignedInt")
    protected Long stops;
    @XmlSchemaType(name = "unsignedInt")
    protected Long delay;
    @XmlElement(name = "alternate-route-delay")
    protected Integer alternateRouteDelay;
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
    @XmlElement(name = "speed-limit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short speedLimit;
    @XmlElement(name = "advisory-speed-limit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short advisorySpeedLimit;
    @XmlElement(name = "truck-speed-limit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short truckSpeedLimit;
    @XmlElement(name = "speed-limit-units")
    @XmlSchemaType(name = "anySimpleType")
    protected String speedLimitUnits;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer density;
    @XmlSchemaType(name = "unsignedByte")
    protected Short occupancy;
    @XmlSchemaType(name = "unsignedInt")
    protected Long volume;
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
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkId(String value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the linkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * Sets the value of the linkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkName(String value) {
        this.linkName = value;
    }

    /**
     * Gets the value of the linkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkStatus() {
        return linkStatus;
    }

    /**
     * Sets the value of the linkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkStatus(String value) {
        this.linkStatus = value;
    }

    /**
     * Gets the value of the linkDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkDirection() {
        return linkDirection;
    }

    /**
     * Sets the value of the linkDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkDirection(String value) {
        this.linkDirection = value;
    }

    /**
     * Gets the value of the lanesNumberOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLanesNumberOpen() {
        return lanesNumberOpen;
    }

    /**
     * Sets the value of the lanesNumberOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLanesNumberOpen(Short value) {
        this.lanesNumberOpen = value;
    }

    /**
     * Gets the value of the priorityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityType() {
        return priorityType;
    }

    /**
     * Sets the value of the priorityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityType(String value) {
        this.priorityType = value;
    }

    /**
     * Gets the value of the restrictionAxleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRestrictionAxleCount() {
        return restrictionAxleCount;
    }

    /**
     * Sets the value of the restrictionAxleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRestrictionAxleCount(Short value) {
        this.restrictionAxleCount = value;
    }

    /**
     * Gets the value of the restrictionHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionHeight() {
        return restrictionHeight;
    }

    /**
     * Sets the value of the restrictionHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionHeight(Integer value) {
        this.restrictionHeight = value;
    }

    /**
     * Gets the value of the restrictionLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionLength() {
        return restrictionLength;
    }

    /**
     * Sets the value of the restrictionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionLength(Integer value) {
        this.restrictionLength = value;
    }

    /**
     * Gets the value of the restrictionWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRestrictionWeight() {
        return restrictionWeight;
    }

    /**
     * Sets the value of the restrictionWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRestrictionWeight(Long value) {
        this.restrictionWeight = value;
    }

    /**
     * Gets the value of the restrictionWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionWidth() {
        return restrictionWidth;
    }

    /**
     * Sets the value of the restrictionWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionWidth(Integer value) {
        this.restrictionWidth = value;
    }

    /**
     * Gets the value of the restrictionWeightAxle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionWeightAxle() {
        return restrictionWeightAxle;
    }

    /**
     * Sets the value of the restrictionWeightAxle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionWeightAxle(Integer value) {
        this.restrictionWeightAxle = value;
    }

    /**
     * Gets the value of the restrictionUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionUnits() {
        return restrictionUnits;
    }

    /**
     * Sets the value of the restrictionUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionUnits(String value) {
        this.restrictionUnits = value;
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
     * Gets the value of the oversaturatedThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOversaturatedThreshold() {
        return oversaturatedThreshold;
    }

    /**
     * Sets the value of the oversaturatedThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOversaturatedThreshold(Short value) {
        this.oversaturatedThreshold = value;
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
     * Gets the value of the laneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link LinkStatusList.LaneNumbers }
     *     
     */
    public LinkStatusList.LaneNumbers getLaneNumbers() {
        return laneNumbers;
    }

    /**
     * Sets the value of the laneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkStatusList.LaneNumbers }
     *     
     */
    public void setLaneNumbers(LinkStatusList.LaneNumbers value) {
        this.laneNumbers = value;
    }

    /**
     * Gets the value of the linkDataStored property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkDataStored() {
        return linkDataStored;
    }

    /**
     * Sets the value of the linkDataStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkDataStored(String value) {
        this.linkDataStored = value;
    }

    /**
     * Gets the value of the detectionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectionMethod() {
        return detectionMethod;
    }

    /**
     * Sets the value of the detectionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectionMethod(String value) {
        this.detectionMethod = value;
    }

    /**
     * Gets the value of the linkTrafficDataAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTrafficDataAlgorithm() {
        return linkTrafficDataAlgorithm;
    }

    /**
     * Sets the value of the linkTrafficDataAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTrafficDataAlgorithm(String value) {
        this.linkTrafficDataAlgorithm = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStops(Long value) {
        this.stops = value;
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
     * Gets the value of the speedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSpeedLimit() {
        return speedLimit;
    }

    /**
     * Sets the value of the speedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSpeedLimit(Short value) {
        this.speedLimit = value;
    }

    /**
     * Gets the value of the advisorySpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAdvisorySpeedLimit() {
        return advisorySpeedLimit;
    }

    /**
     * Sets the value of the advisorySpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAdvisorySpeedLimit(Short value) {
        this.advisorySpeedLimit = value;
    }

    /**
     * Gets the value of the truckSpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTruckSpeedLimit() {
        return truckSpeedLimit;
    }

    /**
     * Sets the value of the truckSpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTruckSpeedLimit(Short value) {
        this.truckSpeedLimit = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="64"&gt;
     *         &lt;element name="lanes" type="{http://www.tmdd.org/303/messages}Link-lane-number"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lanes"
    })
    public static class LaneNumbers
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(type = Short.class)
        @XmlSchemaType(name = "unsignedByte")
        protected List<Short> lanes;

        /**
         * Gets the value of the lanes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lanes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Short }
         * 
         * 
         */
        public List<Short> getLanes() {
            if (lanes == null) {
                lanes = new ArrayList<Short>();
            }
            return this.lanes;
        }

    }

}
