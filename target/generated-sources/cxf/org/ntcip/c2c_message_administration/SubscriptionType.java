
package org.ntcip.c2c_message_administration;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionType-item" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionTypeItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionType", propOrder = {
    "subscriptionTypeItem"
})
public class SubscriptionType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "subscriptionType-item", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String subscriptionTypeItem;

    /**
     * Gets the value of the subscriptionTypeItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionTypeItem() {
        return subscriptionTypeItem;
    }

    /**
     * Sets the value of the subscriptionTypeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionTypeItem(String value) {
        this.subscriptionTypeItem = value;
    }

}
