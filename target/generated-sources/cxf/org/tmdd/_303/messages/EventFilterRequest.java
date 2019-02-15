
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for EventFilterRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventFilterRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authentication" type="{http://www.tmdd.org/303/messages}Authentication" minOccurs="0"/&gt;
 *         &lt;element name="request-header" type="{http://www.tmdd.org/303/messages}RequestHeader"/&gt;
 *         &lt;element name="request-type" type="{http://www.tmdd.org/303/messages}RequestType"/&gt;
 *         &lt;element name="request-filters" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="request-filter" type="{http://www.tmdd.org/303/messages}RequestFilter"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="request-locations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="request-location" type="{http://www.tmdd.org/303/messages}RequestLocation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="request-times" type="{http://www.tmdd.org/303/messages}RequestTimes" minOccurs="0"/&gt;
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
@XmlType(name = "EventFilterRequest", propOrder = {
    "authentication",
    "requestHeader",
    "requestType",
    "requestFilters",
    "requestLocations",
    "requestTimes",
    "any"
})
public class EventFilterRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Authentication authentication;
    @XmlElement(name = "request-header", required = true)
    protected RequestHeader requestHeader;
    @XmlElement(name = "request-type", required = true)
    protected RequestType requestType;
    @XmlElement(name = "request-filters")
    protected EventFilterRequest.RequestFilters requestFilters;
    @XmlElement(name = "request-locations")
    protected EventFilterRequest.RequestLocations requestLocations;
    @XmlElement(name = "request-times")
    protected RequestTimes requestTimes;
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
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestFilters property.
     * 
     * @return
     *     possible object is
     *     {@link EventFilterRequest.RequestFilters }
     *     
     */
    public EventFilterRequest.RequestFilters getRequestFilters() {
        return requestFilters;
    }

    /**
     * Sets the value of the requestFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFilterRequest.RequestFilters }
     *     
     */
    public void setRequestFilters(EventFilterRequest.RequestFilters value) {
        this.requestFilters = value;
    }

    /**
     * Gets the value of the requestLocations property.
     * 
     * @return
     *     possible object is
     *     {@link EventFilterRequest.RequestLocations }
     *     
     */
    public EventFilterRequest.RequestLocations getRequestLocations() {
        return requestLocations;
    }

    /**
     * Sets the value of the requestLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFilterRequest.RequestLocations }
     *     
     */
    public void setRequestLocations(EventFilterRequest.RequestLocations value) {
        this.requestLocations = value;
    }

    /**
     * Gets the value of the requestTimes property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTimes }
     *     
     */
    public RequestTimes getRequestTimes() {
        return requestTimes;
    }

    /**
     * Sets the value of the requestTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTimes }
     *     
     */
    public void setRequestTimes(RequestTimes value) {
        this.requestTimes = value;
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
     *         &lt;element name="request-filter" type="{http://www.tmdd.org/303/messages}RequestFilter"/&gt;
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
        "requestFilter"
    })
    public static class RequestFilters
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "request-filter", required = true)
        protected List<RequestFilter> requestFilter;

        /**
         * Gets the value of the requestFilter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestFilter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequestFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestFilter }
         * 
         * 
         */
        public List<RequestFilter> getRequestFilter() {
            if (requestFilter == null) {
                requestFilter = new ArrayList<RequestFilter>();
            }
            return this.requestFilter;
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
     *       &lt;sequence maxOccurs="64"&gt;
     *         &lt;element name="request-location" type="{http://www.tmdd.org/303/messages}RequestLocation"/&gt;
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
        "requestLocation"
    })
    public static class RequestLocations
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "request-location", required = true)
        protected List<RequestLocation> requestLocation;

        /**
         * Gets the value of the requestLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequestLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestLocation }
         * 
         * 
         */
        public List<RequestLocation> getRequestLocation() {
            if (requestLocation == null) {
                requestLocation = new ArrayList<RequestLocation>();
            }
            return this.requestLocation;
        }

    }

}
