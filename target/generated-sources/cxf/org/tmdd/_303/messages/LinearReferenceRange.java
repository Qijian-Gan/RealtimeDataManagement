
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Link&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for LinearReferenceRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearReferenceRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linear-reference-start" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference"/&gt;
 *         &lt;element name="linear-reference-end" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearReferenceRange", propOrder = {
    "linearReferenceStart",
    "linearReferenceEnd"
})
public class LinearReferenceRange
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "linear-reference-start", required = true)
    protected String linearReferenceStart;
    @XmlElement(name = "linear-reference-end", required = true)
    protected String linearReferenceEnd;

    /**
     * Gets the value of the linearReferenceStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearReferenceStart() {
        return linearReferenceStart;
    }

    /**
     * Sets the value of the linearReferenceStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearReferenceStart(String value) {
        this.linearReferenceStart = value;
    }

    /**
     * Gets the value of the linearReferenceEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearReferenceEnd() {
        return linearReferenceEnd;
    }

    /**
     * Sets the value of the linearReferenceEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearReferenceEnd(String value) {
        this.linearReferenceEnd = value;
    }

}
