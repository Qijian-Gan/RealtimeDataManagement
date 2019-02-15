
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
 * <p>Java class for DataParking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataParking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="parking-spaces" type="{http://www.tmdd.org/303/messages}Event-parking-number-of-spaces"/&gt;
 *         &lt;element name="parking-occupancy" type="{http://www.tmdd.org/303/messages}Event-parking-occupancy"/&gt;
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
@XmlType(name = "DataParking", propOrder = {
    "parkingSpaces",
    "parkingOccupancy",
    "any"
})
public class DataParking
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "parking-spaces")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer parkingSpaces;
    @XmlElement(name = "parking-occupancy")
    @XmlSchemaType(name = "unsignedByte")
    protected Short parkingOccupancy;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the parkingSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParkingSpaces() {
        return parkingSpaces;
    }

    /**
     * Sets the value of the parkingSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParkingSpaces(Integer value) {
        this.parkingSpaces = value;
    }

    /**
     * Gets the value of the parkingOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getParkingOccupancy() {
        return parkingOccupancy;
    }

    /**
     * Sets the value of the parkingOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setParkingOccupancy(Short value) {
        this.parkingOccupancy = value;
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
