
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsePlan&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ResponsePlanLogDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanLogDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="command-status" type="{http://www.tmdd.org/303/messages}Response-plan-command-status"/&gt;
 *         &lt;element name="object-type" type="{http://www.tmdd.org/303/messages}Response-plan-command-object-type"/&gt;
 *         &lt;element name="object-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="command-text" type="{http://www.tmdd.org/303/messages}Response-plan-informational-text"/&gt;
 *         &lt;element name="command-acknowledgement-text" type="{http://www.tmdd.org/303/messages}Response-plan-informational-text"/&gt;
 *         &lt;element name="command-sent-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="acknowledgement-received-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
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
@XmlType(name = "ResponsePlanLogDetails", propOrder = {
    "commandStatus",
    "objectType",
    "objectId",
    "commandText",
    "commandAcknowledgementText",
    "commandSentTime",
    "acknowledgementReceivedTime",
    "any"
})
public class ResponsePlanLogDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "command-status", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String commandStatus;
    @XmlElement(name = "object-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String objectType;
    @XmlElement(name = "object-id", required = true)
    protected String objectId;
    @XmlElement(name = "command-text", required = true)
    protected String commandText;
    @XmlElement(name = "command-acknowledgement-text", required = true)
    protected String commandAcknowledgementText;
    @XmlElement(name = "command-sent-time")
    protected DateTimeZone commandSentTime;
    @XmlElement(name = "acknowledgement-received-time")
    protected DateTimeZone acknowledgementReceivedTime;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the commandStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandStatus() {
        return commandStatus;
    }

    /**
     * Sets the value of the commandStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandStatus(String value) {
        this.commandStatus = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the commandText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandText() {
        return commandText;
    }

    /**
     * Sets the value of the commandText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandText(String value) {
        this.commandText = value;
    }

    /**
     * Gets the value of the commandAcknowledgementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandAcknowledgementText() {
        return commandAcknowledgementText;
    }

    /**
     * Sets the value of the commandAcknowledgementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandAcknowledgementText(String value) {
        this.commandAcknowledgementText = value;
    }

    /**
     * Gets the value of the commandSentTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getCommandSentTime() {
        return commandSentTime;
    }

    /**
     * Sets the value of the commandSentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setCommandSentTime(DateTimeZone value) {
        this.commandSentTime = value;
    }

    /**
     * Gets the value of the acknowledgementReceivedTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getAcknowledgementReceivedTime() {
        return acknowledgementReceivedTime;
    }

    /**
     * Sets the value of the acknowledgementReceivedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setAcknowledgementReceivedTime(DateTimeZone value) {
        this.acknowledgementReceivedTime = value;
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
