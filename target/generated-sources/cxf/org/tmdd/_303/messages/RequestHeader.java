
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
 * <p>Java class for RequestHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="organization-requesting" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="organizations-requested-item" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="message-type-id" type="{http://www.tmdd.org/303/messages}Event-message-type-identifier"/&gt;
 *         &lt;element name="message-type-version" type="{http://www.tmdd.org/303/messages}Event-message-type-version"/&gt;
 *         &lt;element name="message-number" type="{http://www.tmdd.org/303/messages}Event-message-number" minOccurs="0"/&gt;
 *         &lt;element name="message-time-stamp" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
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
@XmlType(name = "RequestHeader", propOrder = {
    "organizationInformation",
    "organizationRequesting",
    "messageTypeId",
    "messageTypeVersion",
    "messageNumber",
    "messageTimeStamp",
    "any"
})
public class RequestHeader
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "organization-requesting")
    protected RequestHeader.OrganizationRequesting organizationRequesting;
    @XmlElement(name = "message-type-id")
    @XmlSchemaType(name = "unsignedByte")
    protected short messageTypeId;
    @XmlElement(name = "message-type-version")
    @XmlSchemaType(name = "unsignedByte")
    protected short messageTypeVersion;
    @XmlElement(name = "message-number")
    @XmlSchemaType(name = "unsignedInt")
    protected Long messageNumber;
    @XmlElement(name = "message-time-stamp", required = true)
    protected DateTimeZone messageTimeStamp;
    @XmlAnyElement(lax = true)
    protected Object any;

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
     * Gets the value of the organizationRequesting property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader.OrganizationRequesting }
     *     
     */
    public RequestHeader.OrganizationRequesting getOrganizationRequesting() {
        return organizationRequesting;
    }

    /**
     * Sets the value of the organizationRequesting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader.OrganizationRequesting }
     *     
     */
    public void setOrganizationRequesting(RequestHeader.OrganizationRequesting value) {
        this.organizationRequesting = value;
    }

    /**
     * Gets the value of the messageTypeId property.
     * 
     */
    public short getMessageTypeId() {
        return messageTypeId;
    }

    /**
     * Sets the value of the messageTypeId property.
     * 
     */
    public void setMessageTypeId(short value) {
        this.messageTypeId = value;
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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessageNumber() {
        return messageNumber;
    }

    /**
     * Sets the value of the messageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessageNumber(Long value) {
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
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="organizations-requested-item" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
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
        "organizationsRequestedItem"
    })
    public static class OrganizationRequesting
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "organizations-requested-item", required = true)
        protected List<OrganizationInformation> organizationsRequestedItem;

        /**
         * Gets the value of the organizationsRequestedItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organizationsRequestedItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganizationsRequestedItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationInformation }
         * 
         * 
         */
        public List<OrganizationInformation> getOrganizationsRequestedItem() {
            if (organizationsRequestedItem == null) {
                organizationsRequestedItem = new ArrayList<OrganizationInformation>();
            }
            return this.organizationsRequestedItem;
        }

    }

}
