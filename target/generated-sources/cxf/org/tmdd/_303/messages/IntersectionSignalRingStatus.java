
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IntersectionSignal&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IntersectionSignalRingStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalRingStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ring-identifier" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="ring-status" type="{http://www.ntcip.org/c2f-object-references}RingStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntersectionSignalRingStatus", propOrder = {
    "ringIdentifier",
    "ringStatus"
})
public class IntersectionSignalRingStatus
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ring-identifier", required = true)
    protected String ringIdentifier;
    @XmlElement(name = "ring-status")
    @XmlSchemaType(name = "unsignedByte")
    protected short ringStatus;

    /**
     * Gets the value of the ringIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingIdentifier() {
        return ringIdentifier;
    }

    /**
     * Sets the value of the ringIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingIdentifier(String value) {
        this.ringIdentifier = value;
    }

    /**
     * Gets the value of the ringStatus property.
     * 
     */
    public short getRingStatus() {
        return ringStatus;
    }

    /**
     * Sets the value of the ringStatus property.
     * 
     */
    public void setRingStatus(short value) {
        this.ringStatus = value;
    }

}
