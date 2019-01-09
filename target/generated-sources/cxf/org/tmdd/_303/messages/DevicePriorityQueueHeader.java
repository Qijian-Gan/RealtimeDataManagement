
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Device&lt;/objectClass&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;requirement xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;REQ1098&lt;/requirement&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DevicePriorityQueueHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevicePriorityQueueHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="device-type" type="{http://www.tmdd.org/303/messages}Device-type"/&gt;
 *         &lt;element name="current-device-priority" type="{http://www.tmdd.org/303/messages}Device-command-request-priority"/&gt;
 *         &lt;element name="device-priority-queue-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="device-priority-queue-item" type="{http://www.tmdd.org/303/messages}DevicePriorityQueueItem"/&gt;
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
@XmlType(name = "DevicePriorityQueueHeader", propOrder = {
    "restrictions",
    "deviceId",
    "deviceType",
    "currentDevicePriority",
    "devicePriorityQueueList",
    "any"
})
public class DevicePriorityQueueHeader
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "device-id", required = true)
    protected String deviceId;
    @XmlElement(name = "device-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String deviceType;
    @XmlElement(name = "current-device-priority")
    @XmlSchemaType(name = "unsignedByte")
    protected short currentDevicePriority;
    @XmlElement(name = "device-priority-queue-list", required = true)
    protected DevicePriorityQueueHeader.DevicePriorityQueueList devicePriorityQueueList;
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
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the currentDevicePriority property.
     * 
     */
    public short getCurrentDevicePriority() {
        return currentDevicePriority;
    }

    /**
     * Sets the value of the currentDevicePriority property.
     * 
     */
    public void setCurrentDevicePriority(short value) {
        this.currentDevicePriority = value;
    }

    /**
     * Gets the value of the devicePriorityQueueList property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePriorityQueueHeader.DevicePriorityQueueList }
     *     
     */
    public DevicePriorityQueueHeader.DevicePriorityQueueList getDevicePriorityQueueList() {
        return devicePriorityQueueList;
    }

    /**
     * Sets the value of the devicePriorityQueueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePriorityQueueHeader.DevicePriorityQueueList }
     *     
     */
    public void setDevicePriorityQueueList(DevicePriorityQueueHeader.DevicePriorityQueueList value) {
        this.devicePriorityQueueList = value;
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
     *       &lt;sequence maxOccurs="8"&gt;
     *         &lt;element name="device-priority-queue-item" type="{http://www.tmdd.org/303/messages}DevicePriorityQueueItem"/&gt;
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
        "devicePriorityQueueItem"
    })
    public static class DevicePriorityQueueList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "device-priority-queue-item", required = true)
        protected List<DevicePriorityQueueItem> devicePriorityQueueItem;

        /**
         * Gets the value of the devicePriorityQueueItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the devicePriorityQueueItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDevicePriorityQueueItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DevicePriorityQueueItem }
         * 
         * 
         */
        public List<DevicePriorityQueueItem> getDevicePriorityQueueItem() {
            if (devicePriorityQueueItem == null) {
                devicePriorityQueueItem = new ArrayList<DevicePriorityQueueItem>();
            }
            return this.devicePriorityQueueItem;
        }

    }

}
