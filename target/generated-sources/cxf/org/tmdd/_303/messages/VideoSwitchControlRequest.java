
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;VideoSwitch&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for VideoSwitchControlRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSwitchControlRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-control-request-header" type="{http://www.tmdd.org/303/messages}DeviceControlRequestHeader"/&gt;
 *         &lt;element name="input-channel-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="output-channel-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="channel-titling-text" type="{http://www.tmdd.org/303/messages}Cctv-titling-text" minOccurs="0"/&gt;
 *         &lt;element name="set-output-channel-lock" type="{http://www.tmdd.org/303/messages}Binary-flag" minOccurs="0"/&gt;
 *         &lt;element name="frames-per-second" type="{http://www.tmdd.org/303/messages}VS-frames-per-second" minOccurs="0"/&gt;
 *         &lt;element name="frame-height-pixels" type="{http://www.tmdd.org/303/messages}VS-pixel-count" minOccurs="0"/&gt;
 *         &lt;element name="frame-width-pixels" type="{http://www.tmdd.org/303/messages}VS-pixel-count" minOccurs="0"/&gt;
 *         &lt;element name="video-format" type="{http://www.tmdd.org/303/messages}Cctv-image-supported" minOccurs="0"/&gt;
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
@XmlType(name = "VideoSwitchControlRequest", propOrder = {
    "deviceControlRequestHeader",
    "inputChannelId",
    "outputChannelId",
    "channelTitlingText",
    "setOutputChannelLock",
    "framesPerSecond",
    "frameHeightPixels",
    "frameWidthPixels",
    "videoFormat",
    "any"
})
public class VideoSwitchControlRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-control-request-header", required = true)
    protected DeviceControlRequestHeader deviceControlRequestHeader;
    @XmlElement(name = "input-channel-id", required = true)
    protected String inputChannelId;
    @XmlElement(name = "output-channel-id", required = true)
    protected String outputChannelId;
    @XmlElement(name = "channel-titling-text")
    protected String channelTitlingText;
    @XmlElement(name = "set-output-channel-lock")
    @XmlSchemaType(name = "anySimpleType")
    protected String setOutputChannelLock;
    @XmlElement(name = "frames-per-second")
    @XmlSchemaType(name = "unsignedByte")
    protected Short framesPerSecond;
    @XmlElement(name = "frame-height-pixels")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer frameHeightPixels;
    @XmlElement(name = "frame-width-pixels")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer frameWidthPixels;
    @XmlElement(name = "video-format")
    @XmlSchemaType(name = "anySimpleType")
    protected String videoFormat;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceControlRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceControlRequestHeader }
     *     
     */
    public DeviceControlRequestHeader getDeviceControlRequestHeader() {
        return deviceControlRequestHeader;
    }

    /**
     * Sets the value of the deviceControlRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceControlRequestHeader }
     *     
     */
    public void setDeviceControlRequestHeader(DeviceControlRequestHeader value) {
        this.deviceControlRequestHeader = value;
    }

    /**
     * Gets the value of the inputChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputChannelId() {
        return inputChannelId;
    }

    /**
     * Sets the value of the inputChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputChannelId(String value) {
        this.inputChannelId = value;
    }

    /**
     * Gets the value of the outputChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputChannelId() {
        return outputChannelId;
    }

    /**
     * Sets the value of the outputChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputChannelId(String value) {
        this.outputChannelId = value;
    }

    /**
     * Gets the value of the channelTitlingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelTitlingText() {
        return channelTitlingText;
    }

    /**
     * Sets the value of the channelTitlingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelTitlingText(String value) {
        this.channelTitlingText = value;
    }

    /**
     * Gets the value of the setOutputChannelLock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetOutputChannelLock() {
        return setOutputChannelLock;
    }

    /**
     * Sets the value of the setOutputChannelLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetOutputChannelLock(String value) {
        this.setOutputChannelLock = value;
    }

    /**
     * Gets the value of the framesPerSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFramesPerSecond() {
        return framesPerSecond;
    }

    /**
     * Sets the value of the framesPerSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFramesPerSecond(Short value) {
        this.framesPerSecond = value;
    }

    /**
     * Gets the value of the frameHeightPixels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrameHeightPixels() {
        return frameHeightPixels;
    }

    /**
     * Sets the value of the frameHeightPixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrameHeightPixels(Integer value) {
        this.frameHeightPixels = value;
    }

    /**
     * Gets the value of the frameWidthPixels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrameWidthPixels() {
        return frameWidthPixels;
    }

    /**
     * Sets the value of the frameWidthPixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrameWidthPixels(Integer value) {
        this.frameWidthPixels = value;
    }

    /**
     * Gets the value of the videoFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoFormat() {
        return videoFormat;
    }

    /**
     * Sets the value of the videoFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoFormat(String value) {
        this.videoFormat = value;
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
