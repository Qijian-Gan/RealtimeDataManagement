
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Device&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DevicePriorityQueueRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevicePriorityQueueRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authentication" type="{http://www.tmdd.org/303/messages}Authentication" minOccurs="0"/&gt;
 *         &lt;element name="organization-requesting" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="device-id-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10000"&gt;
 *                   &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
@XmlType(name = "DevicePriorityQueueRequest", propOrder = {
    "authentication",
    "organizationRequesting",
    "deviceIdList",
    "any"
})
public class DevicePriorityQueueRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Authentication authentication;
    @XmlElement(name = "organization-requesting", required = true)
    protected OrganizationInformation organizationRequesting;
    @XmlElement(name = "device-id-list", required = true)
    protected DevicePriorityQueueRequest.DeviceIdList deviceIdList;
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
     * Gets the value of the deviceIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePriorityQueueRequest.DeviceIdList }
     *     
     */
    public DevicePriorityQueueRequest.DeviceIdList getDeviceIdList() {
        return deviceIdList;
    }

    /**
     * Sets the value of the deviceIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePriorityQueueRequest.DeviceIdList }
     *     
     */
    public void setDeviceIdList(DevicePriorityQueueRequest.DeviceIdList value) {
        this.deviceIdList = value;
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
     *       &lt;sequence maxOccurs="10000"&gt;
     *         &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "deviceId"
    })
    public static class DeviceIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "device-id", required = true)
        protected List<String> deviceId;

        /**
         * Gets the value of the deviceId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deviceId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeviceId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDeviceId() {
            if (deviceId == null) {
                deviceId = new ArrayList<String>();
            }
            return this.deviceId;
        }

    }

}
