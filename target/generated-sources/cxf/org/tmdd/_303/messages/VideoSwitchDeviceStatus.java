
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;VideoSwitch&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for VideoSwitchDeviceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSwitchDeviceStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader"/&gt;
 *         &lt;element name="switched-channel-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1024"&gt;
 *                   &lt;element name="switched-channel" type="{http://www.tmdd.org/303/messages}VSSwitchedChannelData"/&gt;
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
@XmlType(name = "VideoSwitchDeviceStatus", propOrder = {
    "deviceStatusHeader",
    "switchedChannelList",
    "any"
})
public class VideoSwitchDeviceStatus
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-status-header", required = true)
    protected DeviceStatusHeader deviceStatusHeader;
    @XmlElement(name = "switched-channel-list", required = true)
    protected VideoSwitchDeviceStatus.SwitchedChannelList switchedChannelList;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceStatusHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public DeviceStatusHeader getDeviceStatusHeader() {
        return deviceStatusHeader;
    }

    /**
     * Sets the value of the deviceStatusHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public void setDeviceStatusHeader(DeviceStatusHeader value) {
        this.deviceStatusHeader = value;
    }

    /**
     * Gets the value of the switchedChannelList property.
     * 
     * @return
     *     possible object is
     *     {@link VideoSwitchDeviceStatus.SwitchedChannelList }
     *     
     */
    public VideoSwitchDeviceStatus.SwitchedChannelList getSwitchedChannelList() {
        return switchedChannelList;
    }

    /**
     * Sets the value of the switchedChannelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSwitchDeviceStatus.SwitchedChannelList }
     *     
     */
    public void setSwitchedChannelList(VideoSwitchDeviceStatus.SwitchedChannelList value) {
        this.switchedChannelList = value;
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
     *       &lt;sequence maxOccurs="1024"&gt;
     *         &lt;element name="switched-channel" type="{http://www.tmdd.org/303/messages}VSSwitchedChannelData"/&gt;
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
        "switchedChannel"
    })
    public static class SwitchedChannelList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "switched-channel", required = true)
        protected List<VSSwitchedChannelData> switchedChannel;

        /**
         * Gets the value of the switchedChannel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the switchedChannel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSwitchedChannel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VSSwitchedChannelData }
         * 
         * 
         */
        public List<VSSwitchedChannelData> getSwitchedChannel() {
            if (switchedChannel == null) {
                switchedChannel = new ArrayList<VSSwitchedChannelData>();
            }
            return this.switchedChannel;
        }

    }

}
