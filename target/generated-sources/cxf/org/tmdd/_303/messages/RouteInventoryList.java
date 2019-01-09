
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Route&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RouteInventoryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteInventoryList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="network-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="network-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="route-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *         &lt;element name="route-link-id-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="link" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="route-type" type="{http://www.tmdd.org/303/messages}Route-type"/&gt;
 *         &lt;element name="route-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="alternate-route-name-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="route-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="route-length" type="{http://www.tmdd.org/303/messages}Link-length" minOccurs="0"/&gt;
 *         &lt;element name="route-node-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="node-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="route-url" type="{http://www.tmdd.org/303/messages}UrlReference" minOccurs="0"/&gt;
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
@XmlType(name = "RouteInventoryList", propOrder = {
    "networkId",
    "networkName",
    "routeId",
    "routeLinkIdList",
    "routeType",
    "routeName",
    "alternateRouteNameList",
    "routeLength",
    "routeNodeIdList",
    "routeUrl",
    "lastUpdateTime",
    "any"
})
public class RouteInventoryList
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "network-id", required = true)
    protected String networkId;
    @XmlElement(name = "network-name")
    protected String networkName;
    @XmlElement(name = "route-id", required = true)
    protected String routeId;
    @XmlElement(name = "route-link-id-list", required = true)
    protected RouteInventoryList.RouteLinkIdList routeLinkIdList;
    @XmlElement(name = "route-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String routeType;
    @XmlElement(name = "route-name")
    protected String routeName;
    @XmlElement(name = "alternate-route-name-list")
    protected RouteInventoryList.AlternateRouteNameList alternateRouteNameList;
    @XmlElement(name = "route-length")
    @XmlSchemaType(name = "unsignedInt")
    protected Long routeLength;
    @XmlElement(name = "route-node-id-list")
    protected RouteInventoryList.RouteNodeIdList routeNodeIdList;
    @XmlElement(name = "route-url")
    protected UrlReference routeUrl;
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
     * Gets the value of the routeLinkIdList property.
     * 
     * @return
     *     possible object is
     *     {@link RouteInventoryList.RouteLinkIdList }
     *     
     */
    public RouteInventoryList.RouteLinkIdList getRouteLinkIdList() {
        return routeLinkIdList;
    }

    /**
     * Sets the value of the routeLinkIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteInventoryList.RouteLinkIdList }
     *     
     */
    public void setRouteLinkIdList(RouteInventoryList.RouteLinkIdList value) {
        this.routeLinkIdList = value;
    }

    /**
     * Gets the value of the routeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteType() {
        return routeType;
    }

    /**
     * Sets the value of the routeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteType(String value) {
        this.routeType = value;
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
     * Gets the value of the alternateRouteNameList property.
     * 
     * @return
     *     possible object is
     *     {@link RouteInventoryList.AlternateRouteNameList }
     *     
     */
    public RouteInventoryList.AlternateRouteNameList getAlternateRouteNameList() {
        return alternateRouteNameList;
    }

    /**
     * Sets the value of the alternateRouteNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteInventoryList.AlternateRouteNameList }
     *     
     */
    public void setAlternateRouteNameList(RouteInventoryList.AlternateRouteNameList value) {
        this.alternateRouteNameList = value;
    }

    /**
     * Gets the value of the routeLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRouteLength() {
        return routeLength;
    }

    /**
     * Sets the value of the routeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRouteLength(Long value) {
        this.routeLength = value;
    }

    /**
     * Gets the value of the routeNodeIdList property.
     * 
     * @return
     *     possible object is
     *     {@link RouteInventoryList.RouteNodeIdList }
     *     
     */
    public RouteInventoryList.RouteNodeIdList getRouteNodeIdList() {
        return routeNodeIdList;
    }

    /**
     * Sets the value of the routeNodeIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteInventoryList.RouteNodeIdList }
     *     
     */
    public void setRouteNodeIdList(RouteInventoryList.RouteNodeIdList value) {
        this.routeNodeIdList = value;
    }

    /**
     * Gets the value of the routeUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlReference }
     *     
     */
    public UrlReference getRouteUrl() {
        return routeUrl;
    }

    /**
     * Sets the value of the routeUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlReference }
     *     
     */
    public void setRouteUrl(UrlReference value) {
        this.routeUrl = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="route-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name"/&gt;
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
        "routeName"
    })
    public static class AlternateRouteNameList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "route-name", required = true)
        protected List<String> routeName;

        /**
         * Gets the value of the routeName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routeName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRouteName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRouteName() {
            if (routeName == null) {
                routeName = new ArrayList<String>();
            }
            return this.routeName;
        }

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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="link" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
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
        "link"
    })
    public static class RouteLinkIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<String> link;

        /**
         * Gets the value of the link property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the link property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLink() {
            if (link == null) {
                link = new ArrayList<String>();
            }
            return this.link;
        }

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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="node-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
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
        "nodeId"
    })
    public static class RouteNodeIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "node-id", required = true)
        protected List<String> nodeId;

        /**
         * Gets the value of the nodeId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nodeId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNodeId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNodeId() {
            if (nodeId == null) {
                nodeId = new ArrayList<String>();
            }
            return this.nodeId;
        }

    }

}
