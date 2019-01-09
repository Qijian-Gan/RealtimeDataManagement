
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RampMeter&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RampMeterPriorityQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RampMeterPriorityQueue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-priority-queue-header" type="{http://www.tmdd.org/303/messages}DevicePriorityQueueHeader"/&gt;
 *         &lt;element name="metered-lane-identifier" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="meter-request-command" type="{http://www.tmdd.org/303/messages}Meter-operational-mode"/&gt;
 *         &lt;element name="meter-queue-parameters" type="{http://www.tmdd.org/303/messages}RampControlDetails" minOccurs="0"/&gt;
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
@XmlType(name = "RampMeterPriorityQueue", propOrder = {
    "devicePriorityQueueHeader",
    "meteredLaneIdentifier",
    "meterRequestCommand",
    "meterQueueParameters",
    "any"
})
public class RampMeterPriorityQueue
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-priority-queue-header", required = true)
    protected DevicePriorityQueueHeader devicePriorityQueueHeader;
    @XmlElement(name = "metered-lane-identifier")
    protected String meteredLaneIdentifier;
    @XmlElement(name = "meter-request-command", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String meterRequestCommand;
    @XmlElement(name = "meter-queue-parameters")
    protected RampControlDetails meterQueueParameters;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the devicePriorityQueueHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePriorityQueueHeader }
     *     
     */
    public DevicePriorityQueueHeader getDevicePriorityQueueHeader() {
        return devicePriorityQueueHeader;
    }

    /**
     * Sets the value of the devicePriorityQueueHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePriorityQueueHeader }
     *     
     */
    public void setDevicePriorityQueueHeader(DevicePriorityQueueHeader value) {
        this.devicePriorityQueueHeader = value;
    }

    /**
     * Gets the value of the meteredLaneIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteredLaneIdentifier() {
        return meteredLaneIdentifier;
    }

    /**
     * Sets the value of the meteredLaneIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteredLaneIdentifier(String value) {
        this.meteredLaneIdentifier = value;
    }

    /**
     * Gets the value of the meterRequestCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterRequestCommand() {
        return meterRequestCommand;
    }

    /**
     * Sets the value of the meterRequestCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterRequestCommand(String value) {
        this.meterRequestCommand = value;
    }

    /**
     * Gets the value of the meterQueueParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RampControlDetails }
     *     
     */
    public RampControlDetails getMeterQueueParameters() {
        return meterQueueParameters;
    }

    /**
     * Sets the value of the meterQueueParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RampControlDetails }
     *     
     */
    public void setMeterQueueParameters(RampControlDetails value) {
        this.meterQueueParameters = value;
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
