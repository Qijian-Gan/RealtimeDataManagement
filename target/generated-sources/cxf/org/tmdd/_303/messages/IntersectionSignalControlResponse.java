
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IntersectionSignal&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IntersectionSignalControlResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalControlResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-control-response-header" type="{http://www.tmdd.org/303/messages}DeviceControlResponse"/&gt;
 *         &lt;element name="section-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="request-control-mode" type="{http://www.tmdd.org/303/messages}Intersection-planned-signal-timing-mode" minOccurs="0"/&gt;
 *         &lt;element name="timing-pattern-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="offset-adjustment" type="{http://www.ntcip.org/c2f-object-references}PatternOffsetTime" minOccurs="0"/&gt;
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
@XmlType(name = "IntersectionSignalControlResponse", propOrder = {
    "deviceControlResponseHeader",
    "sectionId",
    "requestControlMode",
    "timingPatternId",
    "offsetAdjustment",
    "any"
})
public class IntersectionSignalControlResponse
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-control-response-header", required = true)
    protected DeviceControlResponse deviceControlResponseHeader;
    @XmlElement(name = "section-id")
    protected String sectionId;
    @XmlElement(name = "request-control-mode")
    @XmlSchemaType(name = "anySimpleType")
    protected String requestControlMode;
    @XmlElement(name = "timing-pattern-id")
    protected String timingPatternId;
    @XmlElement(name = "offset-adjustment")
    @XmlSchemaType(name = "unsignedByte")
    protected Short offsetAdjustment;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceControlResponseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceControlResponse }
     *     
     */
    public DeviceControlResponse getDeviceControlResponseHeader() {
        return deviceControlResponseHeader;
    }

    /**
     * Sets the value of the deviceControlResponseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceControlResponse }
     *     
     */
    public void setDeviceControlResponseHeader(DeviceControlResponse value) {
        this.deviceControlResponseHeader = value;
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
     * Gets the value of the requestControlMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestControlMode() {
        return requestControlMode;
    }

    /**
     * Sets the value of the requestControlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestControlMode(String value) {
        this.requestControlMode = value;
    }

    /**
     * Gets the value of the timingPatternId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimingPatternId() {
        return timingPatternId;
    }

    /**
     * Sets the value of the timingPatternId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimingPatternId(String value) {
        this.timingPatternId = value;
    }

    /**
     * Gets the value of the offsetAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOffsetAdjustment() {
        return offsetAdjustment;
    }

    /**
     * Sets the value of the offsetAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOffsetAdjustment(Short value) {
        this.offsetAdjustment = value;
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
