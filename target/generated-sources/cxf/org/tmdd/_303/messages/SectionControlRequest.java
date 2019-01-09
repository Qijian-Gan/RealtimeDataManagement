
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Section&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SectionControlRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionControlRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authentication" type="{http://www.tmdd.org/303/messages}Authentication"/&gt;
 *         &lt;element name="organization-requesting" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="section-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="request-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="section-request-command" type="{http://www.tmdd.org/303/messages}Section-request-command"/&gt;
 *         &lt;element name="section-command-parameters" type="{http://www.tmdd.org/303/messages}SectionControlDetails"/&gt;
 *         &lt;element name="event-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="response-plan-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="command-request-priority" type="{http://www.tmdd.org/303/messages}Device-command-request-priority" minOccurs="0"/&gt;
 *         &lt;element name="command-begin-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="command-end-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="command-request-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
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
@XmlType(name = "SectionControlRequest", propOrder = {
    "authentication",
    "organizationRequesting",
    "sectionId",
    "requestId",
    "sectionRequestCommand",
    "sectionCommandParameters",
    "eventId",
    "responsePlanId",
    "commandRequestPriority",
    "commandBeginTime",
    "commandEndTime",
    "commandRequestTime",
    "any"
})
public class SectionControlRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected Authentication authentication;
    @XmlElement(name = "organization-requesting", required = true)
    protected OrganizationInformation organizationRequesting;
    @XmlElement(name = "section-id", required = true)
    protected String sectionId;
    @XmlElement(name = "request-id", required = true)
    protected String requestId;
    @XmlElement(name = "section-request-command", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String sectionRequestCommand;
    @XmlElement(name = "section-command-parameters", required = true)
    protected SectionControlDetails sectionCommandParameters;
    @XmlElement(name = "event-id")
    protected String eventId;
    @XmlElement(name = "response-plan-id")
    protected String responsePlanId;
    @XmlElement(name = "command-request-priority")
    @XmlSchemaType(name = "unsignedByte")
    protected Short commandRequestPriority;
    @XmlElement(name = "command-begin-time")
    protected DateTimeZone commandBeginTime;
    @XmlElement(name = "command-end-time")
    protected DateTimeZone commandEndTime;
    @XmlElement(name = "command-request-time")
    protected DateTimeZone commandRequestTime;
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
     * Gets the value of the sectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionId(String value) {
        this.sectionId = value;
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
     * Gets the value of the sectionRequestCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionRequestCommand() {
        return sectionRequestCommand;
    }

    /**
     * Sets the value of the sectionRequestCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionRequestCommand(String value) {
        this.sectionRequestCommand = value;
    }

    /**
     * Gets the value of the sectionCommandParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SectionControlDetails }
     *     
     */
    public SectionControlDetails getSectionCommandParameters() {
        return sectionCommandParameters;
    }

    /**
     * Sets the value of the sectionCommandParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionControlDetails }
     *     
     */
    public void setSectionCommandParameters(SectionControlDetails value) {
        this.sectionCommandParameters = value;
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
     * Gets the value of the commandRequestPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCommandRequestPriority() {
        return commandRequestPriority;
    }

    /**
     * Sets the value of the commandRequestPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCommandRequestPriority(Short value) {
        this.commandRequestPriority = value;
    }

    /**
     * Gets the value of the commandBeginTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getCommandBeginTime() {
        return commandBeginTime;
    }

    /**
     * Sets the value of the commandBeginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setCommandBeginTime(DateTimeZone value) {
        this.commandBeginTime = value;
    }

    /**
     * Gets the value of the commandEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getCommandEndTime() {
        return commandEndTime;
    }

    /**
     * Sets the value of the commandEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setCommandEndTime(DateTimeZone value) {
        this.commandEndTime = value;
    }

    /**
     * Gets the value of the commandRequestTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getCommandRequestTime() {
        return commandRequestTime;
    }

    /**
     * Sets the value of the commandRequestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setCommandRequestTime(DateTimeZone value) {
        this.commandRequestTime = value;
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
