
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;HAR&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for HARControlDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HARControlDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="har-message" type="{http://www.tmdd.org/303/messages}Har-message"/&gt;
 *         &lt;element name="har-message-number" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HARControlDetails", propOrder = {
    "harMessage",
    "harMessageNumber"
})
public class HARControlDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "har-message")
    protected String harMessage;
    @XmlElement(name = "har-message-number")
    protected String harMessageNumber;

    /**
     * Gets the value of the harMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarMessage() {
        return harMessage;
    }

    /**
     * Sets the value of the harMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarMessage(String value) {
        this.harMessage = value;
    }

    /**
     * Gets the value of the harMessageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarMessageNumber() {
        return harMessageNumber;
    }

    /**
     * Sets the value of the harMessageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarMessageNumber(String value) {
        this.harMessageNumber = value;
    }

}
