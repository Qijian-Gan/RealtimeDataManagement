
package org.ntcip.c2c_message_administration;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C2cMessageSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C2cMessageSubscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="informationalText" type="{http://www.ntcip.org/c2c-message-administration}InformationalText" minOccurs="0"/&gt;
 *         &lt;element name="returnAddress" type="{http://www.ntcip.org/c2c-message-administration}ReturnAddress"/&gt;
 *         &lt;element name="subscriptionAction" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionAction"/&gt;
 *         &lt;element name="subscriptionType" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionType"/&gt;
 *         &lt;element name="subscriptionID" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionID"/&gt;
 *         &lt;element name="subscriptionName" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionName" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionTimeFrame" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionTimeFrame" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionFrequency" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionFrequency"/&gt;
 *         &lt;element name="broadcastAlerts" type="{http://www.ntcip.org/c2c-message-administration}BroadcastAlerts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C2cMessageSubscription", propOrder = {
    "informationalText",
    "returnAddress",
    "subscriptionAction",
    "subscriptionType",
    "subscriptionID",
    "subscriptionName",
    "subscriptionTimeFrame",
    "subscriptionFrequency",
    "broadcastAlerts"
})
public class C2CMessageSubscription
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected String informationalText;
    @XmlElement(required = true)
    protected String returnAddress;
    @XmlElement(required = true)
    protected SubscriptionAction subscriptionAction;
    @XmlElement(required = true)
    protected SubscriptionType subscriptionType;
    @XmlElement(required = true)
    protected String subscriptionID;
    protected String subscriptionName;
    protected SubscriptionTimeFrame subscriptionTimeFrame;
    @XmlSchemaType(name = "unsignedInt")
    protected long subscriptionFrequency;
    protected BroadcastAlerts broadcastAlerts;

    /**
     * Gets the value of the informationalText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationalText() {
        return informationalText;
    }

    /**
     * Sets the value of the informationalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationalText(String value) {
        this.informationalText = value;
    }

    /**
     * Gets the value of the returnAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress() {
        return returnAddress;
    }

    /**
     * Sets the value of the returnAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress(String value) {
        this.returnAddress = value;
    }

    /**
     * Gets the value of the subscriptionAction property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionAction }
     *     
     */
    public SubscriptionAction getSubscriptionAction() {
        return subscriptionAction;
    }

    /**
     * Sets the value of the subscriptionAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionAction }
     *     
     */
    public void setSubscriptionAction(SubscriptionAction value) {
        this.subscriptionAction = value;
    }

    /**
     * Gets the value of the subscriptionType property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionType }
     *     
     */
    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * Sets the value of the subscriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionType }
     *     
     */
    public void setSubscriptionType(SubscriptionType value) {
        this.subscriptionType = value;
    }

    /**
     * Gets the value of the subscriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionID() {
        return subscriptionID;
    }

    /**
     * Sets the value of the subscriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionID(String value) {
        this.subscriptionID = value;
    }

    /**
     * Gets the value of the subscriptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * Sets the value of the subscriptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionName(String value) {
        this.subscriptionName = value;
    }

    /**
     * Gets the value of the subscriptionTimeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionTimeFrame }
     *     
     */
    public SubscriptionTimeFrame getSubscriptionTimeFrame() {
        return subscriptionTimeFrame;
    }

    /**
     * Sets the value of the subscriptionTimeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionTimeFrame }
     *     
     */
    public void setSubscriptionTimeFrame(SubscriptionTimeFrame value) {
        this.subscriptionTimeFrame = value;
    }

    /**
     * Gets the value of the subscriptionFrequency property.
     * 
     */
    public long getSubscriptionFrequency() {
        return subscriptionFrequency;
    }

    /**
     * Sets the value of the subscriptionFrequency property.
     * 
     */
    public void setSubscriptionFrequency(long value) {
        this.subscriptionFrequency = value;
    }

    /**
     * Gets the value of the broadcastAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link BroadcastAlerts }
     *     
     */
    public BroadcastAlerts getBroadcastAlerts() {
        return broadcastAlerts;
    }

    /**
     * Sets the value of the broadcastAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadcastAlerts }
     *     
     */
    public void setBroadcastAlerts(BroadcastAlerts value) {
        this.broadcastAlerts = value;
    }

}
