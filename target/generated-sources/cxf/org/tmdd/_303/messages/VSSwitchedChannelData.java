
package org.tmdd._303.messages;

import java.io.Serializable;
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
 * <p>Java class for VSSwitchedChannelData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VSSwitchedChannelData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="input-channel-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="output-channel-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="channel-titling-text" type="{http://www.tmdd.org/303/messages}Cctv-titling-text" minOccurs="0"/&gt;
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
@XmlType(name = "VSSwitchedChannelData", propOrder = {
    "inputChannelId",
    "outputChannelId",
    "channelTitlingText",
    "any"
})
public class VSSwitchedChannelData
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "input-channel-id", required = true)
    protected String inputChannelId;
    @XmlElement(name = "output-channel-id", required = true)
    protected String outputChannelId;
    @XmlElement(name = "channel-titling-text")
    protected String channelTitlingText;
    @XmlAnyElement(lax = true)
    protected Object any;

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
