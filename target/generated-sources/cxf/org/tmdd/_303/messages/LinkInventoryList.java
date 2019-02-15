
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Link&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for LinkInventoryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkInventoryList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="network-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="network-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="link-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="link-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="alternate-link-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="link-route-designator" type="{http://www.tmdd.org/303/messages}Link-route-designator" minOccurs="0"/&gt;
 *         &lt;element name="secondary-link-route-designator" type="{http://www.tmdd.org/303/messages}Link-route-designator" minOccurs="0"/&gt;
 *         &lt;element name="link-type" type="{http://www.tmdd.org/303/messages}Link-type"/&gt;
 *         &lt;element name="link-begin-node-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="link-begin-node-location" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation"/&gt;
 *         &lt;element name="link-end-node-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="link-end-node-location" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation"/&gt;
 *         &lt;element name="linear-reference" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference" minOccurs="0"/&gt;
 *         &lt;element name="linear-reference-version" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference-version" minOccurs="0"/&gt;
 *         &lt;element name="link-length" type="{http://www.tmdd.org/303/messages}Link-length" minOccurs="0"/&gt;
 *         &lt;element name="link-capacity" type="{http://www.tmdd.org/303/messages}Link-capacity" minOccurs="0"/&gt;
 *         &lt;element name="link-speed-limit" type="{http://www.tmdd.org/303/messages}Link-speed-limit" minOccurs="0"/&gt;
 *         &lt;element name="link-speed-limit-truck" type="{http://www.tmdd.org/303/messages}Link-speed-limit" minOccurs="0"/&gt;
 *         &lt;element name="link-speed-limit-units" type="{http://www.tmdd.org/303/messages}Link-speed-limit-units" minOccurs="0"/&gt;
 *         &lt;element name="link-jurisdiction" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="link-owner" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="left-shoulder-width" type="{http://www.tmdd.org/303/messages}Link-shoulder-width" minOccurs="0"/&gt;
 *         &lt;element name="right-shoulder-width" type="{http://www.tmdd.org/303/messages}Link-shoulder-width" minOccurs="0"/&gt;
 *         &lt;element name="lane-separator" type="{http://www.tmdd.org/303/messages}Link-median-type" minOccurs="0"/&gt;
 *         &lt;element name="last-update-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="link-restrictions" type="{http://www.tmdd.org/303/messages}LinkRestrictions" minOccurs="0"/&gt;
 *         &lt;element name="left-turn-bay-length" type="{http://www.tmdd.org/303/messages}Link-length" minOccurs="0"/&gt;
 *         &lt;element name="right-turn-bay-length" type="{http://www.tmdd.org/303/messages}Link-length" minOccurs="0"/&gt;
 *         &lt;element name="link-geom-location" type="{http://www.tmdd.org/303/messages}LinkGeomLocation" minOccurs="0"/&gt;
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
@XmlType(name = "LinkInventoryList", propOrder = {
    "networkId",
    "networkName",
    "linkId",
    "linkName",
    "alternateLinkName",
    "linkRouteDesignator",
    "secondaryLinkRouteDesignator",
    "linkType",
    "linkBeginNodeId",
    "linkBeginNodeLocation",
    "linkEndNodeId",
    "linkEndNodeLocation",
    "linearReference",
    "linearReferenceVersion",
    "linkLength",
    "linkCapacity",
    "linkSpeedLimit",
    "linkSpeedLimitTruck",
    "linkSpeedLimitUnits",
    "linkJurisdiction",
    "linkOwner",
    "leftShoulderWidth",
    "rightShoulderWidth",
    "laneSeparator",
    "lastUpdateTime",
    "linkRestrictions",
    "leftTurnBayLength",
    "rightTurnBayLength",
    "linkGeomLocation",
    "any"
})
public class LinkInventoryList
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "network-id", required = true)
    protected String networkId;
    @XmlElement(name = "network-name")
    protected String networkName;
    @XmlElement(name = "link-id", required = true)
    protected String linkId;
    @XmlElement(name = "link-name")
    protected String linkName;
    @XmlElement(name = "alternate-link-name")
    protected String alternateLinkName;
    @XmlElement(name = "link-route-designator")
    protected String linkRouteDesignator;
    @XmlElement(name = "secondary-link-route-designator")
    protected String secondaryLinkRouteDesignator;
    @XmlElement(name = "link-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String linkType;
    @XmlElement(name = "link-begin-node-id", required = true)
    protected String linkBeginNodeId;
    @XmlElement(name = "link-begin-node-location", required = true)
    protected GeoLocation linkBeginNodeLocation;
    @XmlElement(name = "link-end-node-id", required = true)
    protected String linkEndNodeId;
    @XmlElement(name = "link-end-node-location", required = true)
    protected GeoLocation linkEndNodeLocation;
    @XmlElement(name = "linear-reference")
    protected String linearReference;
    @XmlElement(name = "linear-reference-version")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linearReferenceVersion;
    @XmlElement(name = "link-length")
    @XmlSchemaType(name = "unsignedInt")
    protected Long linkLength;
    @XmlElement(name = "link-capacity")
    @XmlSchemaType(name = "unsignedInt")
    protected Long linkCapacity;
    @XmlElement(name = "link-speed-limit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linkSpeedLimit;
    @XmlElement(name = "link-speed-limit-truck")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linkSpeedLimitTruck;
    @XmlElement(name = "link-speed-limit-units")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkSpeedLimitUnits;
    @XmlElement(name = "link-jurisdiction")
    protected String linkJurisdiction;
    @XmlElement(name = "link-owner")
    protected String linkOwner;
    @XmlElement(name = "left-shoulder-width")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer leftShoulderWidth;
    @XmlElement(name = "right-shoulder-width")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer rightShoulderWidth;
    @XmlElement(name = "lane-separator")
    @XmlSchemaType(name = "anySimpleType")
    protected String laneSeparator;
    @XmlElement(name = "last-update-time")
    protected DateTimeZone lastUpdateTime;
    @XmlElement(name = "link-restrictions")
    protected LinkRestrictions linkRestrictions;
    @XmlElement(name = "left-turn-bay-length")
    @XmlSchemaType(name = "unsignedInt")
    protected Long leftTurnBayLength;
    @XmlElement(name = "right-turn-bay-length")
    @XmlSchemaType(name = "unsignedInt")
    protected Long rightTurnBayLength;
    @XmlElement(name = "link-geom-location")
    protected LinkGeomLocation linkGeomLocation;
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
     * Gets the value of the networkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkName() {
        return networkName;
    }

    /**
     * Sets the value of the networkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkName(String value) {
        this.networkName = value;
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
     * Gets the value of the alternateLinkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateLinkName() {
        return alternateLinkName;
    }

    /**
     * Sets the value of the alternateLinkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateLinkName(String value) {
        this.alternateLinkName = value;
    }

    /**
     * Gets the value of the linkRouteDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkRouteDesignator() {
        return linkRouteDesignator;
    }

    /**
     * Sets the value of the linkRouteDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkRouteDesignator(String value) {
        this.linkRouteDesignator = value;
    }

    /**
     * Gets the value of the secondaryLinkRouteDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryLinkRouteDesignator() {
        return secondaryLinkRouteDesignator;
    }

    /**
     * Sets the value of the secondaryLinkRouteDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryLinkRouteDesignator(String value) {
        this.secondaryLinkRouteDesignator = value;
    }

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkType(String value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the linkBeginNodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkBeginNodeId() {
        return linkBeginNodeId;
    }

    /**
     * Sets the value of the linkBeginNodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkBeginNodeId(String value) {
        this.linkBeginNodeId = value;
    }

    /**
     * Gets the value of the linkBeginNodeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getLinkBeginNodeLocation() {
        return linkBeginNodeLocation;
    }

    /**
     * Sets the value of the linkBeginNodeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setLinkBeginNodeLocation(GeoLocation value) {
        this.linkBeginNodeLocation = value;
    }

    /**
     * Gets the value of the linkEndNodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkEndNodeId() {
        return linkEndNodeId;
    }

    /**
     * Sets the value of the linkEndNodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkEndNodeId(String value) {
        this.linkEndNodeId = value;
    }

    /**
     * Gets the value of the linkEndNodeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getLinkEndNodeLocation() {
        return linkEndNodeLocation;
    }

    /**
     * Sets the value of the linkEndNodeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setLinkEndNodeLocation(GeoLocation value) {
        this.linkEndNodeLocation = value;
    }

    /**
     * Gets the value of the linearReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearReference() {
        return linearReference;
    }

    /**
     * Sets the value of the linearReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearReference(String value) {
        this.linearReference = value;
    }

    /**
     * Gets the value of the linearReferenceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLinearReferenceVersion() {
        return linearReferenceVersion;
    }

    /**
     * Sets the value of the linearReferenceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLinearReferenceVersion(Short value) {
        this.linearReferenceVersion = value;
    }

    /**
     * Gets the value of the linkLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLinkLength() {
        return linkLength;
    }

    /**
     * Sets the value of the linkLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLinkLength(Long value) {
        this.linkLength = value;
    }

    /**
     * Gets the value of the linkCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLinkCapacity() {
        return linkCapacity;
    }

    /**
     * Sets the value of the linkCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLinkCapacity(Long value) {
        this.linkCapacity = value;
    }

    /**
     * Gets the value of the linkSpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLinkSpeedLimit() {
        return linkSpeedLimit;
    }

    /**
     * Sets the value of the linkSpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLinkSpeedLimit(Short value) {
        this.linkSpeedLimit = value;
    }

    /**
     * Gets the value of the linkSpeedLimitTruck property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLinkSpeedLimitTruck() {
        return linkSpeedLimitTruck;
    }

    /**
     * Sets the value of the linkSpeedLimitTruck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLinkSpeedLimitTruck(Short value) {
        this.linkSpeedLimitTruck = value;
    }

    /**
     * Gets the value of the linkSpeedLimitUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkSpeedLimitUnits() {
        return linkSpeedLimitUnits;
    }

    /**
     * Sets the value of the linkSpeedLimitUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkSpeedLimitUnits(String value) {
        this.linkSpeedLimitUnits = value;
    }

    /**
     * Gets the value of the linkJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkJurisdiction() {
        return linkJurisdiction;
    }

    /**
     * Sets the value of the linkJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkJurisdiction(String value) {
        this.linkJurisdiction = value;
    }

    /**
     * Gets the value of the linkOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkOwner() {
        return linkOwner;
    }

    /**
     * Sets the value of the linkOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkOwner(String value) {
        this.linkOwner = value;
    }

    /**
     * Gets the value of the leftShoulderWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeftShoulderWidth() {
        return leftShoulderWidth;
    }

    /**
     * Sets the value of the leftShoulderWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeftShoulderWidth(Integer value) {
        this.leftShoulderWidth = value;
    }

    /**
     * Gets the value of the rightShoulderWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRightShoulderWidth() {
        return rightShoulderWidth;
    }

    /**
     * Sets the value of the rightShoulderWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRightShoulderWidth(Integer value) {
        this.rightShoulderWidth = value;
    }

    /**
     * Gets the value of the laneSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneSeparator() {
        return laneSeparator;
    }

    /**
     * Sets the value of the laneSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneSeparator(String value) {
        this.laneSeparator = value;
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
     * Gets the value of the linkRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link LinkRestrictions }
     *     
     */
    public LinkRestrictions getLinkRestrictions() {
        return linkRestrictions;
    }

    /**
     * Sets the value of the linkRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkRestrictions }
     *     
     */
    public void setLinkRestrictions(LinkRestrictions value) {
        this.linkRestrictions = value;
    }

    /**
     * Gets the value of the leftTurnBayLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLeftTurnBayLength() {
        return leftTurnBayLength;
    }

    /**
     * Sets the value of the leftTurnBayLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLeftTurnBayLength(Long value) {
        this.leftTurnBayLength = value;
    }

    /**
     * Gets the value of the rightTurnBayLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRightTurnBayLength() {
        return rightTurnBayLength;
    }

    /**
     * Sets the value of the rightTurnBayLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRightTurnBayLength(Long value) {
        this.rightTurnBayLength = value;
    }

    /**
     * Gets the value of the linkGeomLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LinkGeomLocation }
     *     
     */
    public LinkGeomLocation getLinkGeomLocation() {
        return linkGeomLocation;
    }

    /**
     * Sets the value of the linkGeomLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkGeomLocation }
     *     
     */
    public void setLinkGeomLocation(LinkGeomLocation value) {
        this.linkGeomLocation = value;
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
