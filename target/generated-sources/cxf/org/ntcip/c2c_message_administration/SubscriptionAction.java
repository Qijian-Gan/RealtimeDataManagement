
package org.ntcip.c2c_message_administration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="10"&gt;
 *         &lt;element name="subscriptionAction-item" type="{http://www.ntcip.org/c2c-message-administration}SubscriptionActionItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionAction", propOrder = {
    "subscriptionActionItem"
})
public class SubscriptionAction
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "subscriptionAction-item", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> subscriptionActionItem;

    /**
     * Gets the value of the subscriptionActionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionActionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionActionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubscriptionActionItem() {
        if (subscriptionActionItem == null) {
            subscriptionActionItem = new ArrayList<String>();
        }
        return this.subscriptionActionItem;
    }

}
