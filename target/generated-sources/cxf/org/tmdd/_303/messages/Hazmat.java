
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Hazmat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hazmat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hazmat-code" type="{http://www.tmdd.org/303/messages}Event-hazmat-code" minOccurs="0"/&gt;
 *         &lt;element name="placard-code" type="{http://www.tmdd.org/303/messages}Event-placard-code" minOccurs="0"/&gt;
 *         &lt;element name="placard-displayed-accuracy" type="{http://www.tmdd.org/303/messages}Event-placard-displayed-code" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hazmat", propOrder = {
    "hazmatCode",
    "placardCode",
    "placardDisplayedAccuracy",
    "any"
})
public class Hazmat
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "hazmat-code")
    @XmlSchemaType(name = "unsignedInt")
    protected Long hazmatCode;
    @XmlElement(name = "placard-code")
    @XmlSchemaType(name = "unsignedInt")
    protected Long placardCode;
    @XmlElement(name = "placard-displayed-accuracy")
    @XmlSchemaType(name = "anySimpleType")
    protected String placardDisplayedAccuracy;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the hazmatCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHazmatCode() {
        return hazmatCode;
    }

    /**
     * Sets the value of the hazmatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHazmatCode(Long value) {
        this.hazmatCode = value;
    }

    /**
     * Gets the value of the placardCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlacardCode() {
        return placardCode;
    }

    /**
     * Sets the value of the placardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlacardCode(Long value) {
        this.placardCode = value;
    }

    /**
     * Gets the value of the placardDisplayedAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacardDisplayedAccuracy() {
        return placardDisplayedAccuracy;
    }

    /**
     * Sets the value of the placardDisplayedAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacardDisplayedAccuracy(String value) {
        this.placardDisplayedAccuracy = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
