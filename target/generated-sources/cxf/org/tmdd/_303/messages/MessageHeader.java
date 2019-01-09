
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
 * <p>Java class for MessageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organization-sending" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="organizations-receiving" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="organizations-receiving-item" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organizations-responding" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="organizations-responding-item" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="message-type-version" type="{http://www.tmdd.org/303/messages}Event-message-type-version"/&gt;
 *         &lt;element name="message-number" type="{http://www.tmdd.org/303/messages}Event-message-number"/&gt;
 *         &lt;element name="message-time-stamp" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="message-expiry-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
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
@XmlType(name = "MessageHeader", propOrder = {
    "organizationSending",
    "organizationsReceiving",
    "organizationsResponding",
    "messageTypeVersion",
    "messageNumber",
    "messageTimeStamp",
    "messageExpiryTime",
    "any"
})
public class MessageHeader
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "organization-sending", required = true)
    protected OrganizationInformation organizationSending;
    @XmlElement(name = "organizations-receiving")
    protected MessageHeader.OrganizationsReceiving organizationsReceiving;
    @XmlElement(name = "organizations-responding")
    protected MessageHeader.OrganizationsResponding organizationsResponding;
    @XmlElement(name = "message-type-version")
    @XmlSchemaType(name = "unsignedByte")
    protected short messageTypeVersion;
    @XmlElement(name = "message-number")
    @XmlSchemaType(name = "unsignedInt")
    protected long messageNumber;
    @XmlElement(name = "message-time-stamp", required = true)
    protected DateTimeZone messageTimeStamp;
    @XmlElement(name = "message-expiry-time")
    protected DateTimeZone messageExpiryTime;
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
     * Gets the value of the organizationsReceiving property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader.OrganizationsReceiving }
     *     
     */
    public MessageHeader.OrganizationsReceiving getOrganizationsReceiving() {
        return organizationsReceiving;
    }

    /**
     * Sets the value of the organizationsReceiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader.OrganizationsReceiving }
     *     
     */
    public void setOrganizationsReceiving(MessageHeader.OrganizationsReceiving value) {
        this.organizationsReceiving = value;
    }

    /**
     * Gets the value of the organizationsResponding property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader.OrganizationsResponding }
     *     
     */
    public MessageHeader.OrganizationsResponding getOrganizationsResponding() {
        return organizationsResponding;
    }

    /**
     * Sets the value of the organizationsResponding property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader.OrganizationsResponding }
     *     
     */
    public void setOrganizationsResponding(MessageHeader.OrganizationsResponding value) {
        this.organizationsResponding = value;
    }

    /**
     * Gets the value of the messageTypeVersion property.
     * 
     */
    public short getMessageTypeVersion() {
        return messageTypeVersion;
    }

    /**
     * Sets the value of the messageTypeVersion property.
     * 
     */
    public void setMessageTypeVersion(short value) {
        this.messageTypeVersion = value;
    }

    /**
     * Gets the value of the messageNumber property.
     * 
     */
    public long getMessageNumber() {
        return messageNumber;
    }

    /**
     * Sets the value of the messageNumber property.
     * 
     */
    public void setMessageNumber(long value) {
        this.messageNumber = value;
    }

    /**
     * Gets the value of the messageTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getMessageTimeStamp() {
        return messageTimeStamp;
    }

    /**
     * Sets the value of the messageTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setMessageTimeStamp(DateTimeZone value) {
        this.messageTimeStamp = value;
    }

    /**
     * Gets the value of the messageExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getMessageExpiryTime() {
        return messageExpiryTime;
    }

    /**
     * Sets the value of the messageExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setMessageExpiryTime(DateTimeZone value) {
        this.messageExpiryTime = value;
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
     *       &lt;sequence maxOccurs="100"&gt;
     *         &lt;element name="organizations-receiving-item" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
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
        "organizationsReceivingItem"
    })
    public static class OrganizationsReceiving
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "organizations-receiving-item", required = true)
        protected List<OrganizationInformation> organizationsReceivingItem;

        /**
         * Gets the value of the organizationsReceivingItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organizationsReceivingItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganizationsReceivingItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationInformation }
         * 
         * 
         */
        public List<OrganizationInformation> getOrganizationsReceivingItem() {
            if (organizationsReceivingItem == null) {
                organizationsReceivingItem = new ArrayList<OrganizationInformation>();
            }
            return this.organizationsReceivingItem;
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
     *       &lt;sequence maxOccurs="100"&gt;
     *         &lt;element name="organizations-responding-item" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
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
        "organizationsRespondingItem"
    })
    public static class OrganizationsResponding
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "organizations-responding-item", required = true)
        protected List<OrganizationInformation> organizationsRespondingItem;

        /**
         * Gets the value of the organizationsRespondingItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organizationsRespondingItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganizationsRespondingItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationInformation }
         * 
         * 
         */
        public List<OrganizationInformation> getOrganizationsRespondingItem() {
            if (organizationsRespondingItem == null) {
                organizationsRespondingItem = new ArrayList<OrganizationInformation>();
            }
            return this.organizationsRespondingItem;
        }

    }

}
