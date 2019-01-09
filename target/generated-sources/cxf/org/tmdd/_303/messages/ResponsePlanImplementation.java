
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsePlan&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ResponsePlanImplementation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanImplementation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plan-implementation-status" type="{http://www.tmdd.org/303/messages}Response-plan-informational-text"/&gt;
 *         &lt;element name="implementation-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="implementation-termination-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="event-termination-status" type="{http://www.tmdd.org/303/messages}Response-plan-informational-text"/&gt;
 *         &lt;element name="response-plan-termination-status" type="{http://www.tmdd.org/303/messages}Response-plan-informational-text"/&gt;
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
@XmlType(name = "ResponsePlanImplementation", propOrder = {
    "planImplementationStatus",
    "implementationTime",
    "implementationTerminationTime",
    "eventTerminationStatus",
    "responsePlanTerminationStatus",
    "any"
})
public class ResponsePlanImplementation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "plan-implementation-status", required = true)
    protected String planImplementationStatus;
    @XmlElement(name = "implementation-time")
    protected DateTimeZone implementationTime;
    @XmlElement(name = "implementation-termination-time")
    protected DateTimeZone implementationTerminationTime;
    @XmlElement(name = "event-termination-status", required = true)
    protected String eventTerminationStatus;
    @XmlElement(name = "response-plan-termination-status", required = true)
    protected String responsePlanTerminationStatus;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the planImplementationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanImplementationStatus() {
        return planImplementationStatus;
    }

    /**
     * Sets the value of the planImplementationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanImplementationStatus(String value) {
        this.planImplementationStatus = value;
    }

    /**
     * Gets the value of the implementationTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getImplementationTime() {
        return implementationTime;
    }

    /**
     * Sets the value of the implementationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setImplementationTime(DateTimeZone value) {
        this.implementationTime = value;
    }

    /**
     * Gets the value of the implementationTerminationTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getImplementationTerminationTime() {
        return implementationTerminationTime;
    }

    /**
     * Sets the value of the implementationTerminationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setImplementationTerminationTime(DateTimeZone value) {
        this.implementationTerminationTime = value;
    }

    /**
     * Gets the value of the eventTerminationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTerminationStatus() {
        return eventTerminationStatus;
    }

    /**
     * Sets the value of the eventTerminationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTerminationStatus(String value) {
        this.eventTerminationStatus = value;
    }

    /**
     * Gets the value of the responsePlanTerminationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsePlanTerminationStatus() {
        return responsePlanTerminationStatus;
    }

    /**
     * Sets the value of the responsePlanTerminationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsePlanTerminationStatus(String value) {
        this.responsePlanTerminationStatus = value;
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
