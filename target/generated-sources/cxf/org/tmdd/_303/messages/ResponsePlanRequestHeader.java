
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
 * <p>Java class for ResponsePlanRequestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanRequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organization-sending" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="organization-receiving" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="request-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="request-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="corridor-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
@XmlType(name = "ResponsePlanRequestHeader", propOrder = {
    "organizationSending",
    "organizationReceiving",
    "requestId",
    "requestTime",
    "corridorId",
    "any"
})
public class ResponsePlanRequestHeader
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "organization-sending", required = true)
    protected OrganizationInformation organizationSending;
    @XmlElement(name = "organization-receiving", required = true)
    protected OrganizationInformation organizationReceiving;
    @XmlElement(name = "request-id", required = true)
    protected String requestId;
    @XmlElement(name = "request-time")
    protected DateTimeZone requestTime;
    @XmlElement(name = "corridor-id", required = true)
    protected String corridorId;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the organizationSending property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationSending() {
        return organizationSending;
    }

    /**
     * Sets the value of the organizationSending property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationSending(OrganizationInformation value) {
        this.organizationSending = value;
    }

    /**
     * Gets the value of the organizationReceiving property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationReceiving() {
        return organizationReceiving;
    }

    /**
     * Sets the value of the organizationReceiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationReceiving(OrganizationInformation value) {
        this.organizationReceiving = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setRequestTime(DateTimeZone value) {
        this.requestTime = value;
    }

    /**
     * Gets the value of the corridorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorridorId() {
        return corridorId;
    }

    /**
     * Sets the value of the corridorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorridorId(String value) {
        this.corridorId = value;
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
