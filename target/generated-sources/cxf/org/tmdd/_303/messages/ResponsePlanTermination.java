
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsePlan&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ResponsePlanTermination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanTermination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response-plan-request-header" type="{http://www.tmdd.org/303/messages}ResponsePlanRequestHeader"/&gt;
 *         &lt;element name="event-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="response-plan-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="request-status" type="{http://www.tmdd.org/303/messages}Response-plan-request-status"/&gt;
 *         &lt;element name="status-last-revised" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
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
@XmlType(name = "ResponsePlanTermination", propOrder = {
    "responsePlanRequestHeader",
    "eventId",
    "responsePlanId",
    "requestStatus",
    "statusLastRevised",
    "any"
})
public class ResponsePlanTermination
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "response-plan-request-header", required = true)
    protected ResponsePlanRequestHeader responsePlanRequestHeader;
    @XmlElement(name = "event-id", required = true)
    protected String eventId;
    @XmlElement(name = "response-plan-id", required = true)
    protected String responsePlanId;
    @XmlElement(name = "request-status", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String requestStatus;
    @XmlElement(name = "status-last-revised")
    protected DateTimeZone statusLastRevised;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the responsePlanRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanRequestHeader }
     *     
     */
    public ResponsePlanRequestHeader getResponsePlanRequestHeader() {
        return responsePlanRequestHeader;
    }

    /**
     * Sets the value of the responsePlanRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanRequestHeader }
     *     
     */
    public void setResponsePlanRequestHeader(ResponsePlanRequestHeader value) {
        this.responsePlanRequestHeader = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the responsePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsePlanId() {
        return responsePlanId;
    }

    /**
     * Sets the value of the responsePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsePlanId(String value) {
        this.responsePlanId = value;
    }

    /**
     * Gets the value of the requestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestStatus(String value) {
        this.requestStatus = value;
    }

    /**
     * Gets the value of the statusLastRevised property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getStatusLastRevised() {
        return statusLastRevised;
    }

    /**
     * Sets the value of the statusLastRevised property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setStatusLastRevised(DateTimeZone value) {
        this.statusLastRevised = value;
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
