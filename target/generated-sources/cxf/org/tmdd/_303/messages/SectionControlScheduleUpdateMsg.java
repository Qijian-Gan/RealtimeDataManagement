
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.ntcip.c2c_message_administration.C2CMessagePublication;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c2cMsgAdmin" type="{http://www.ntcip.org/c2c-message-administration}C2cMessagePublication"/&gt;
 *         &lt;element name="message" type="{http://www.tmdd.org/303/messages}SectionControlScheduleMsg"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "c2CMsgAdmin",
    "message"
})
@XmlRootElement(name = "sectionControlScheduleUpdateMsg")
public class SectionControlScheduleUpdateMsg
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "c2cMsgAdmin", required = true)
    protected C2CMessagePublication c2CMsgAdmin;
    @XmlElement(required = true)
    protected SectionControlScheduleMsg message;

    /**
     * Gets the value of the c2CMsgAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link C2CMessagePublication }
     *     
     */
    public C2CMessagePublication getC2CMsgAdmin() {
        return c2CMsgAdmin;
    }

    /**
     * Sets the value of the c2CMsgAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link C2CMessagePublication }
     *     
     */
    public void setC2CMsgAdmin(C2CMessagePublication value) {
        this.c2CMsgAdmin = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link SectionControlScheduleMsg }
     *     
     */
    public SectionControlScheduleMsg getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionControlScheduleMsg }
     *     
     */
    public void setMessage(SectionControlScheduleMsg value) {
        this.message = value;
    }

}
