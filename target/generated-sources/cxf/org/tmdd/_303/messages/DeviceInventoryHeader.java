
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Device&lt;/objectClass&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;requirement xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;REQ1094&lt;/requirement&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DeviceInventoryHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInventoryHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="device-location" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation"/&gt;
 *         &lt;element name="device-name" type="{http://www.tmdd.org/303/messages}Organization-resource-name"/&gt;
 *         &lt;element name="device-description" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="device-control-type" type="{http://www.tmdd.org/303/messages}Device-control-type" minOccurs="0"/&gt;
 *         &lt;element name="controller-description" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="network-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier" minOccurs="0"/&gt;
 *         &lt;element name="node-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier" minOccurs="0"/&gt;
 *         &lt;element name="node-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="link-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier" minOccurs="0"/&gt;
 *         &lt;element name="link-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="link-direction" type="{http://www.tmdd.org/303/messages}Link-direction" minOccurs="0"/&gt;
 *         &lt;element name="linear-reference" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference" minOccurs="0"/&gt;
 *         &lt;element name="linear-reference-version" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference-version" minOccurs="0"/&gt;
 *         &lt;element name="route-designator" type="{http://www.tmdd.org/303/messages}Link-route-designator" minOccurs="0"/&gt;
 *         &lt;element name="device-url" type="{http://www.tmdd.org/303/messages}UrlReference" minOccurs="0"/&gt;
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
@XmlType(name = "DeviceInventoryHeader", propOrder = {
    "restrictions",
    "organizationInformation",
    "deviceId",
    "deviceLocation",
    "deviceName",
    "deviceDescription",
    "deviceControlType",
    "controllerDescription",
    "networkId",
    "nodeId",
    "nodeName",
    "linkId",
    "linkName",
    "linkDirection",
    "linearReference",
    "linearReferenceVersion",
    "routeDesignator",
    "deviceUrl",
    "lastUpdateTime",
    "any"
})
public class DeviceInventoryHeader
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "device-id", required = true)
    protected String deviceId;
    @XmlElement(name = "device-location", required = true)
    protected GeoLocation deviceLocation;
    @XmlElement(name = "device-name", required = true)
    protected String deviceName;
    @XmlElement(name = "device-description")
    protected String deviceDescription;
    @XmlElement(name = "device-control-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String deviceControlType;
    @XmlElement(name = "controller-description")
    protected String controllerDescription;
    @XmlElement(name = "network-id")
    protected String networkId;
    @XmlElement(name = "node-id")
    protected String nodeId;
    @XmlElement(name = "node-name")
    protected String nodeName;
    @XmlElement(name = "link-id")
    protected String linkId;
    @XmlElement(name = "link-name")
    protected String linkName;
    @XmlElement(name = "link-direction")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkDirection;
    @XmlElement(name = "linear-reference")
    protected String linearReference;
    @XmlElement(name = "linear-reference-version")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linearReferenceVersion;
    @XmlElement(name = "route-designator")
    protected String routeDesignator;
    @XmlElement(name = "device-url")
    protected UrlReference deviceUrl;
    @XmlElement(name = "last-update-time")
    protected DateTimeZone lastUpdateTime;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Restrictions }
     *     
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restrictions }
     *     
     */
    public void setRestrictions(Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the organizationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationInformation() {
        return organizationInformation;
    }

    /**
     * Sets the value of the organizationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationInformation(OrganizationInformation value) {
        this.organizationInformation = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the deviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getDeviceLocation() {
        return deviceLocation;
    }

    /**
     * Sets the value of the deviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setDeviceLocation(GeoLocation value) {
        this.deviceLocation = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceDescription() {
        return deviceDescription;
    }

    /**
     * Sets the value of the deviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceDescription(String value) {
        this.deviceDescription = value;
    }

    /**
     * Gets the value of the deviceControlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceControlType() {
        return deviceControlType;
    }

    /**
     * Sets the value of the deviceControlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceControlType(String value) {
        this.deviceControlType = value;
    }

    /**
     * Gets the value of the controllerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerDescription() {
        return controllerDescription;
    }

    /**
     * Sets the value of the controllerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerDescription(String value) {
        this.controllerDescription = value;
    }

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
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeId(String value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
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
     * Gets the value of the routeDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteDesignator() {
        return routeDesignator;
    }

    /**
     * Sets the value of the routeDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteDesignator(String value) {
        this.routeDesignator = value;
    }

    /**
     * Gets the value of the deviceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlReference }
     *     
     */
    public UrlReference getDeviceUrl() {
        return deviceUrl;
    }

    /**
     * Sets the value of the deviceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlReference }
     *     
     */
    public void setDeviceUrl(UrlReference value) {
        this.deviceUrl = value;
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
