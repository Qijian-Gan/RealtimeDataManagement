
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request-focus" type="{http://www.tmdd.org/303/messages}Event-request-focus"/&gt;
 *         &lt;element name="event-ids" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="event-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="response-plan-ids" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="response-plan-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
@XmlType(name = "RequestType", propOrder = {
    "requestFocus",
    "eventIds",
    "responsePlanIds",
    "any"
})
public class RequestType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "request-focus", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String requestFocus;
    @XmlElement(name = "event-ids")
    protected RequestType.EventIds eventIds;
    @XmlElement(name = "response-plan-ids")
    protected RequestType.ResponsePlanIds responsePlanIds;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the requestFocus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestFocus() {
        return requestFocus;
    }

    /**
     * Sets the value of the requestFocus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestFocus(String value) {
        this.requestFocus = value;
    }

    /**
     * Gets the value of the eventIds property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType.EventIds }
     *     
     */
    public RequestType.EventIds getEventIds() {
        return eventIds;
    }

    /**
     * Sets the value of the eventIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType.EventIds }
     *     
     */
    public void setEventIds(RequestType.EventIds value) {
        this.eventIds = value;
    }

    /**
     * Gets the value of the responsePlanIds property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType.ResponsePlanIds }
     *     
     */
    public RequestType.ResponsePlanIds getResponsePlanIds() {
        return responsePlanIds;
    }

    /**
     * Sets the value of the responsePlanIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType.ResponsePlanIds }
     *     
     */
    public void setResponsePlanIds(RequestType.ResponsePlanIds value) {
        this.responsePlanIds = value;
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
     *         &lt;element name="event-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "eventId"
    })
    public static class EventIds
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "event-id", required = true)
        protected List<String> eventId;

        /**
         * Gets the value of the eventId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEventId() {
            if (eventId == null) {
                eventId = new ArrayList<String>();
            }
            return this.eventId;
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
     *         &lt;element name="response-plan-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "responsePlanId"
    })
    public static class ResponsePlanIds
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "response-plan-id", required = true)
        protected List<String> responsePlanId;

        /**
         * Gets the value of the responsePlanId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responsePlanId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponsePlanId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getResponsePlanId() {
            if (responsePlanId == null) {
                responsePlanId = new ArrayList<String>();
            }
            return this.responsePlanId;
        }

    }

}
