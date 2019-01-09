
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
 * <p>Java class for EventTransitLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventTransitLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transit-route-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="transit-direction" type="{http://www.tmdd.org/303/messages}Event-transit-direction-of-travel" minOccurs="0"/&gt;
 *         &lt;element name="transit-stop-detail" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="transit-location-text" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
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
@XmlType(name = "EventTransitLocation", propOrder = {
    "transitRouteId",
    "transitDirection",
    "transitStopDetail",
    "transitLocationText",
    "any"
})
public class EventTransitLocation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "transit-route-id", required = true)
    protected String transitRouteId;
    @XmlElement(name = "transit-direction")
    @XmlSchemaType(name = "anySimpleType")
    protected String transitDirection;
    @XmlElement(name = "transit-stop-detail")
    protected String transitStopDetail;
    @XmlElement(name = "transit-location-text")
    protected String transitLocationText;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the transitRouteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitRouteId() {
        return transitRouteId;
    }

    /**
     * Sets the value of the transitRouteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitRouteId(String value) {
        this.transitRouteId = value;
    }

    /**
     * Gets the value of the transitDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitDirection() {
        return transitDirection;
    }

    /**
     * Sets the value of the transitDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitDirection(String value) {
        this.transitDirection = value;
    }

    /**
     * Gets the value of the transitStopDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitStopDetail() {
        return transitStopDetail;
    }

    /**
     * Sets the value of the transitStopDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitStopDetail(String value) {
        this.transitStopDetail = value;
    }

    /**
     * Gets the value of the transitLocationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitLocationText() {
        return transitLocationText;
    }

    /**
     * Sets the value of the transitLocationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitLocationText(String value) {
        this.transitLocationText = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
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
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
