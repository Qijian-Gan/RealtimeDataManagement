
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
 * <p>Java class for DataExtent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataExtent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="length-affected" type="{http://www.tmdd.org/303/messages}Event-length-affected"/&gt;
 *         &lt;element name="proportion-affected" type="{http://www.tmdd.org/303/messages}Event-proportion-affected"/&gt;
 *         &lt;element name="above-altitude" type="{http://www.tmdd.org/303/messages}Event-location-coordinates-altitude"/&gt;
 *         &lt;element name="below-altitude" type="{http://www.tmdd.org/303/messages}Event-location-coordinates-altitude"/&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataExtent", propOrder = {
    "lengthAffected",
    "proportionAffected",
    "aboveAltitude",
    "belowAltitude",
    "any"
})
public class DataExtent
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "length-affected")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer lengthAffected;
    @XmlElement(name = "proportion-affected")
    @XmlSchemaType(name = "unsignedByte")
    protected Short proportionAffected;
    @XmlElement(name = "above-altitude")
    protected Integer aboveAltitude;
    @XmlElement(name = "below-altitude")
    protected Integer belowAltitude;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the lengthAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLengthAffected() {
        return lengthAffected;
    }

    /**
     * Sets the value of the lengthAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLengthAffected(Integer value) {
        this.lengthAffected = value;
    }

    /**
     * Gets the value of the proportionAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getProportionAffected() {
        return proportionAffected;
    }

    /**
     * Sets the value of the proportionAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setProportionAffected(Short value) {
        this.proportionAffected = value;
    }

    /**
     * Gets the value of the aboveAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAboveAltitude() {
        return aboveAltitude;
    }

    /**
     * Sets the value of the aboveAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAboveAltitude(Integer value) {
        this.aboveAltitude = value;
    }

    /**
     * Gets the value of the belowAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBelowAltitude() {
        return belowAltitude;
    }

    /**
     * Sets the value of the belowAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBelowAltitude(Integer value) {
        this.belowAltitude = value;
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
