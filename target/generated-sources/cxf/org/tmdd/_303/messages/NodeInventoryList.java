
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Node&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for NodeInventoryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeInventoryList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="network-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="network-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="node-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="node-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="node-description" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="node-route-designator" type="{http://www.tmdd.org/303/messages}Link-route-designator" minOccurs="0"/&gt;
 *         &lt;element name="node-direction" type="{http://www.tmdd.org/303/messages}Link-direction" minOccurs="0"/&gt;
 *         &lt;element name="linear-reference" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference" minOccurs="0"/&gt;
 *         &lt;element name="linear-reference-version" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference-version" minOccurs="0"/&gt;
 *         &lt;element name="node-type" type="{http://www.tmdd.org/303/messages}Node-type" minOccurs="0"/&gt;
 *         &lt;element name="node-location" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation"/&gt;
 *         &lt;element name="node-links-number" type="{http://www.tmdd.org/303/messages}Node-links-number" minOccurs="0"/&gt;
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
@XmlType(name = "NodeInventoryList", propOrder = {
    "networkId",
    "networkName",
    "nodeId",
    "nodeName",
    "nodeDescription",
    "nodeRouteDesignator",
    "nodeDirection",
    "linearReference",
    "linearReferenceVersion",
    "nodeType",
    "nodeLocation",
    "nodeLinksNumber",
    "lastUpdateTime",
    "any"
})
public class NodeInventoryList
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "network-id", required = true)
    protected String networkId;
    @XmlElement(name = "network-name")
    protected String networkName;
    @XmlElement(name = "node-id", required = true)
    protected String nodeId;
    @XmlElement(name = "node-name")
    protected String nodeName;
    @XmlElement(name = "node-description")
    protected String nodeDescription;
    @XmlElement(name = "node-route-designator")
    protected String nodeRouteDesignator;
    @XmlElement(name = "node-direction")
    @XmlSchemaType(name = "anySimpleType")
    protected String nodeDirection;
    @XmlElement(name = "linear-reference")
    protected String linearReference;
    @XmlElement(name = "linear-reference-version")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linearReferenceVersion;
    @XmlElement(name = "node-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String nodeType;
    @XmlElement(name = "node-location", required = true)
    protected GeoLocation nodeLocation;
    @XmlElement(name = "node-links-number")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer nodeLinksNumber;
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
     * Gets the value of the nodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeDescription() {
        return nodeDescription;
    }

    /**
     * Sets the value of the nodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeDescription(String value) {
        this.nodeDescription = value;
    }

    /**
     * Gets the value of the nodeRouteDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeRouteDesignator() {
        return nodeRouteDesignator;
    }

    /**
     * Sets the value of the nodeRouteDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeRouteDesignator(String value) {
        this.nodeRouteDesignator = value;
    }

    /**
     * Gets the value of the nodeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeDirection() {
        return nodeDirection;
    }

    /**
     * Sets the value of the nodeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeDirection(String value) {
        this.nodeDirection = value;
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
     * Gets the value of the nodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * Sets the value of the nodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeType(String value) {
        this.nodeType = value;
    }

    /**
     * Gets the value of the nodeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getNodeLocation() {
        return nodeLocation;
    }

    /**
     * Sets the value of the nodeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setNodeLocation(GeoLocation value) {
        this.nodeLocation = value;
    }

    /**
     * Gets the value of the nodeLinksNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNodeLinksNumber() {
        return nodeLinksNumber;
    }

    /**
     * Sets the value of the nodeLinksNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNodeLinksNumber(Integer value) {
        this.nodeLinksNumber = value;
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
