
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.ntcip.c2c_message_administration.C2CMessageSubscription;


/**
 * <p>Java class for EventSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventSubscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c2cMsgAdmin" type="{http://www.ntcip.org/c2c-message-administration}C2cMessageSubscription"/&gt;
 *         &lt;element name="message" type="{http://www.tmdd.org/303/messages}EventFilterRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventSubscription", propOrder = {
    "c2CMsgAdmin",
    "message"
})
public class EventSubscription
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "c2cMsgAdmin", required = true)
    protected C2CMessageSubscription c2CMsgAdmin;
    @XmlElement(required = true)
    protected EventFilterRequest message;

    /**
     * Gets the value of the c2CMsgAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link C2CMessageSubscription }
     *     
     */
    public C2CMessageSubscription getC2CMsgAdmin() {
        return c2CMsgAdmin;
    }

    /**
     * Sets the value of the c2CMsgAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link C2CMessageSubscription }
     *     
     */
    public void setC2CMsgAdmin(C2CMessageSubscription value) {
        this.c2CMsgAdmin = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link EventFilterRequest }
     *     
     */
    public EventFilterRequest getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFilterRequest }
     *     
     */
    public void setMessage(EventFilterRequest value) {
        this.message = value;
    }

}
