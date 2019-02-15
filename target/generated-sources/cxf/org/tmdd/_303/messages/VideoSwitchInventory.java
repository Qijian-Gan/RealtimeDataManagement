
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;VideoSwitch&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for VideoSwitchInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSwitchInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-inventory-header" type="{http://www.tmdd.org/303/messages}DeviceInventoryHeader"/&gt;
 *         &lt;element name="input-channel-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="2048"&gt;
 *                   &lt;element name="input-channel" type="{http://www.tmdd.org/303/messages}VSVideoChannelData"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="output-channel-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="2048"&gt;
 *                   &lt;element name="output-channel" type="{http://www.tmdd.org/303/messages}VSVideoChannelData"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="input-channel-count" type="{http://www.tmdd.org/303/messages}VS-channel-count" minOccurs="0"/&gt;
 *         &lt;element name="output-channel-count" type="{http://www.tmdd.org/303/messages}VS-channel-count" minOccurs="0"/&gt;
 *         &lt;element name="request-supported-type" type="{http://www.tmdd.org/303/messages}VS-request-supported-type" minOccurs="0"/&gt;
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
@XmlType(name = "VideoSwitchInventory", propOrder = {
    "deviceInventoryHeader",
    "inputChannelList",
    "outputChannelList",
    "inputChannelCount",
    "outputChannelCount",
    "requestSupportedType",
    "any"
})
public class VideoSwitchInventory
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-inventory-header", required = true)
    protected DeviceInventoryHeader deviceInventoryHeader;
    @XmlElement(name = "input-channel-list", required = true)
    protected VideoSwitchInventory.InputChannelList inputChannelList;
    @XmlElement(name = "output-channel-list", required = true)
    protected VideoSwitchInventory.OutputChannelList outputChannelList;
    @XmlElement(name = "input-channel-count")
    @XmlSchemaType(name = "unsignedInt")
    protected Long inputChannelCount;
    @XmlElement(name = "output-channel-count")
    @XmlSchemaType(name = "unsignedInt")
    protected Long outputChannelCount;
    @XmlElement(name = "request-supported-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String requestSupportedType;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceInventoryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public DeviceInventoryHeader getDeviceInventoryHeader() {
        return deviceInventoryHeader;
    }

    /**
     * Sets the value of the deviceInventoryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public void setDeviceInventoryHeader(DeviceInventoryHeader value) {
        this.deviceInventoryHeader = value;
    }

    /**
     * Gets the value of the inputChannelList property.
     * 
     * @return
     *     possible object is
     *     {@link VideoSwitchInventory.InputChannelList }
     *     
     */
    public VideoSwitchInventory.InputChannelList getInputChannelList() {
        return inputChannelList;
    }

    /**
     * Sets the value of the inputChannelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSwitchInventory.InputChannelList }
     *     
     */
    public void setInputChannelList(VideoSwitchInventory.InputChannelList value) {
        this.inputChannelList = value;
    }

    /**
     * Gets the value of the outputChannelList property.
     * 
     * @return
     *     possible object is
     *     {@link VideoSwitchInventory.OutputChannelList }
     *     
     */
    public VideoSwitchInventory.OutputChannelList getOutputChannelList() {
        return outputChannelList;
    }

    /**
     * Sets the value of the outputChannelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSwitchInventory.OutputChannelList }
     *     
     */
    public void setOutputChannelList(VideoSwitchInventory.OutputChannelList value) {
        this.outputChannelList = value;
    }

    /**
     * Gets the value of the inputChannelCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInputChannelCount() {
        return inputChannelCount;
    }

    /**
     * Sets the value of the inputChannelCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInputChannelCount(Long value) {
        this.inputChannelCount = value;
    }

    /**
     * Gets the value of the outputChannelCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutputChannelCount() {
        return outputChannelCount;
    }

    /**
     * Sets the value of the outputChannelCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutputChannelCount(Long value) {
        this.outputChannelCount = value;
    }

    /**
     * Gets the value of the requestSupportedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestSupportedType() {
        return requestSupportedType;
    }

    /**
     * Sets the value of the requestSupportedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestSupportedType(String value) {
        this.requestSupportedType = value;
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
     *       &lt;sequence maxOccurs="2048"&gt;
     *         &lt;element name="input-channel" type="{http://www.tmdd.org/303/messages}VSVideoChannelData"/&gt;
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
        "inputChannel"
    })
    public static class InputChannelList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "input-channel", required = true)
        protected List<VSVideoChannelData> inputChannel;

        /**
         * Gets the value of the inputChannel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inputChannel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInputChannel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VSVideoChannelData }
         * 
         * 
         */
        public List<VSVideoChannelData> getInputChannel() {
            if (inputChannel == null) {
                inputChannel = new ArrayList<VSVideoChannelData>();
            }
            return this.inputChannel;
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
     *       &lt;sequence maxOccurs="2048"&gt;
     *         &lt;element name="output-channel" type="{http://www.tmdd.org/303/messages}VSVideoChannelData"/&gt;
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
        "outputChannel"
    })
    public static class OutputChannelList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "output-channel", required = true)
        protected List<VSVideoChannelData> outputChannel;

        /**
         * Gets the value of the outputChannel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outputChannel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOutputChannel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VSVideoChannelData }
         * 
         * 
         */
        public List<VSVideoChannelData> getOutputChannel() {
            if (outputChannel == null) {
                outputChannel = new ArrayList<VSVideoChannelData>();
            }
            return this.outputChannel;
        }

    }

}
