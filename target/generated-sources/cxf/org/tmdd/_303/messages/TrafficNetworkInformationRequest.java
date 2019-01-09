
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;TransportationNetwork&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TrafficNetworkInformationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficNetworkInformationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authentication" type="{http://www.tmdd.org/303/messages}Authentication" minOccurs="0"/&gt;
 *         &lt;element name="organization-requesting" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="network-information-type" type="{http://www.tmdd.org/303/messages}Transportation-network-information-type"/&gt;
 *         &lt;element name="network-identifiers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="32"&gt;
 *                   &lt;element name="network-identifier" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="roadway-network-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1024"&gt;
 *                   &lt;element name="roadway-network-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "TrafficNetworkInformationRequest", propOrder = {
    "authentication",
    "organizationRequesting",
    "networkInformationType",
    "networkIdentifiers",
    "roadwayNetworkIdList",
    "any"
})
public class TrafficNetworkInformationRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Authentication authentication;
    @XmlElement(name = "organization-requesting", required = true)
    protected OrganizationInformation organizationRequesting;
    @XmlElement(name = "network-information-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String networkInformationType;
    @XmlElement(name = "network-identifiers")
    protected TrafficNetworkInformationRequest.NetworkIdentifiers networkIdentifiers;
    @XmlElement(name = "roadway-network-id-list")
    protected TrafficNetworkInformationRequest.RoadwayNetworkIdList roadwayNetworkIdList;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the organizationRequesting property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationRequesting() {
        return organizationRequesting;
    }

    /**
     * Sets the value of the organizationRequesting property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationRequesting(OrganizationInformation value) {
        this.organizationRequesting = value;
    }

    /**
     * Gets the value of the networkInformationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkInformationType() {
        return networkInformationType;
    }

    /**
     * Sets the value of the networkInformationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkInformationType(String value) {
        this.networkInformationType = value;
    }

    /**
     * Gets the value of the networkIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficNetworkInformationRequest.NetworkIdentifiers }
     *     
     */
    public TrafficNetworkInformationRequest.NetworkIdentifiers getNetworkIdentifiers() {
        return networkIdentifiers;
    }

    /**
     * Sets the value of the networkIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficNetworkInformationRequest.NetworkIdentifiers }
     *     
     */
    public void setNetworkIdentifiers(TrafficNetworkInformationRequest.NetworkIdentifiers value) {
        this.networkIdentifiers = value;
    }

    /**
     * Gets the value of the roadwayNetworkIdList property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficNetworkInformationRequest.RoadwayNetworkIdList }
     *     
     */
    public TrafficNetworkInformationRequest.RoadwayNetworkIdList getRoadwayNetworkIdList() {
        return roadwayNetworkIdList;
    }

    /**
     * Sets the value of the roadwayNetworkIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficNetworkInformationRequest.RoadwayNetworkIdList }
     *     
     */
    public void setRoadwayNetworkIdList(TrafficNetworkInformationRequest.RoadwayNetworkIdList value) {
        this.roadwayNetworkIdList = value;
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
     *       &lt;sequence maxOccurs="32"&gt;
     *         &lt;element name="network-identifier" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
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
        "networkIdentifier"
    })
    public static class NetworkIdentifiers
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "network-identifier", required = true)
        protected List<String> networkIdentifier;

        /**
         * Gets the value of the networkIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the networkIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNetworkIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNetworkIdentifier() {
            if (networkIdentifier == null) {
                networkIdentifier = new ArrayList<String>();
            }
            return this.networkIdentifier;
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
     *       &lt;sequence maxOccurs="1024"&gt;
     *         &lt;element name="roadway-network-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
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
        "roadwayNetworkId"
    })
    public static class RoadwayNetworkIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "roadway-network-id", required = true)
        protected List<String> roadwayNetworkId;

        /**
         * Gets the value of the roadwayNetworkId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roadwayNetworkId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoadwayNetworkId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getRoadwayNetworkId() {
            if (roadwayNetworkId == null) {
                roadwayNetworkId = new ArrayList<String>();
            }
            return this.roadwayNetworkId;
        }

    }

}
