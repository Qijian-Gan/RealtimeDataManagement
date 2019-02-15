
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;HAR&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for HARMessageInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HARMessageInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="message-number" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="current-message" type="{http://www.tmdd.org/303/messages}Har-message"/&gt;
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
@XmlType(name = "HARMessageInventory", propOrder = {
    "restrictions",
    "organizationInformation",
    "deviceId",
    "messageNumber",
    "currentMessage",
    "lastUpdateTime",
    "any"
})
public class HARMessageInventory
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "device-id", required = true)
    protected String deviceId;
    @XmlElement(name = "message-number", required = true)
    protected String messageNumber;
    @XmlElement(name = "current-message", required = true)
    protected String currentMessage;
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
     * Gets the value of the messageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageNumber() {
        return messageNumber;
    }

    /**
     * Sets the value of the messageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageNumber(String value) {
        this.messageNumber = value;
    }

    /**
     * Gets the value of the currentMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentMessage() {
        return currentMessage;
    }

    /**
     * Sets the value of the currentMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentMessage(String value) {
        this.currentMessage = value;
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
