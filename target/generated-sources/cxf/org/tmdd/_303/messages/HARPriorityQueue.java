
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;HAR&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for HARPriorityQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HARPriorityQueue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-priority-queue-header" type="{http://www.tmdd.org/303/messages}DevicePriorityQueueHeader"/&gt;
 *         &lt;element name="har-request-command" type="{http://www.tmdd.org/303/messages}Har-request-command"/&gt;
 *         &lt;element name="har-queue-parameters" type="{http://www.tmdd.org/303/messages}HARControlDetails"/&gt;
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
@XmlType(name = "HARPriorityQueue", propOrder = {
    "devicePriorityQueueHeader",
    "harRequestCommand",
    "harQueueParameters",
    "any"
})
public class HARPriorityQueue
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-priority-queue-header", required = true)
    protected DevicePriorityQueueHeader devicePriorityQueueHeader;
    @XmlElement(name = "har-request-command", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String harRequestCommand;
    @XmlElement(name = "har-queue-parameters", required = true)
    protected HARControlDetails harQueueParameters;
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
     * Gets the value of the harRequestCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarRequestCommand() {
        return harRequestCommand;
    }

    /**
     * Sets the value of the harRequestCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarRequestCommand(String value) {
        this.harRequestCommand = value;
    }

    /**
     * Gets the value of the harQueueParameters property.
     * 
     * @return
     *     possible object is
     *     {@link HARControlDetails }
     *     
     */
    public HARControlDetails getHarQueueParameters() {
        return harQueueParameters;
    }

    /**
     * Sets the value of the harQueueParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link HARControlDetails }
     *     
     */
    public void setHarQueueParameters(HARControlDetails value) {
        this.harQueueParameters = value;
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
