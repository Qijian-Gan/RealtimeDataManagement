
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DMS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DMSMessageAppearanceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMSMessageAppearanceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="dms-message" type="{http://www.ntcip.org/c2f-object-references}DmsMessageMultiString"/&gt;
 *         &lt;element name="message-number" type="{http://www.ntcip.org/c2f-object-references}DmsMsgTableSource"/&gt;
 *         &lt;element name="return-current-message-snapshot" type="{http://www.tmdd.org/303/messages}Device-return-current-message-snapshot-flag"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMSMessageAppearanceRequestType", propOrder = {
    "dmsMessage",
    "messageNumber",
    "returnCurrentMessageSnapshot"
})
public class DMSMessageAppearanceRequestType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "dms-message")
    protected String dmsMessage;
    @XmlElement(name = "message-number")
    protected String messageNumber;
    @XmlElement(name = "return-current-message-snapshot")
    @XmlSchemaType(name = "anySimpleType")
    protected String returnCurrentMessageSnapshot;

    /**
     * Gets the value of the dmsMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmsMessage() {
        return dmsMessage;
    }

    /**
     * Sets the value of the dmsMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmsMessage(String value) {
        this.dmsMessage = value;
    }

    /**
     * Gets the value of the messageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageNumber() {
        return messageNumber;
    }

    /**
     * Sets the value of the messageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageNumber(String value) {
        this.messageNumber = value;
    }

    /**
     * Gets the value of the returnCurrentMessageSnapshot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCurrentMessageSnapshot() {
        return returnCurrentMessageSnapshot;
    }

    /**
     * Sets the value of the returnCurrentMessageSnapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCurrentMessageSnapshot(String value) {
        this.returnCurrentMessageSnapshot = value;
    }

}
