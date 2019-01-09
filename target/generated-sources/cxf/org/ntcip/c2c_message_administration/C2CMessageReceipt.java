
package org.ntcip.c2c_message_administration;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C2cMessageReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C2cMessageReceipt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="informationalText" type="{http://www.ntcip.org/c2c-message-administration}InformationalText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C2cMessageReceipt", propOrder = {
    "informationalText"
})
public class C2CMessageReceipt
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String informationalText;

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

}
