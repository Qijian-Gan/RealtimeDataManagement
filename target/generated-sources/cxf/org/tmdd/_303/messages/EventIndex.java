
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
 * <p>Java class for EventIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventIndex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feu-url" type="{http://www.tmdd.org/303/messages}UrlReference"/&gt;
 *         &lt;element name="file-update-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="event-update-time" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="event-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="event-update" type="{http://www.tmdd.org/303/messages}Event-update"/&gt;
 *         &lt;element name="status" type="{http://www.tmdd.org/303/messages}Event-incident-status"/&gt;
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
@XmlType(name = "EventIndex", propOrder = {
    "feuUrl",
    "fileUpdateTime",
    "eventUpdateTime",
    "eventId",
    "eventUpdate",
    "status",
    "any"
})
public class EventIndex
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "feu-url", required = true)
    protected UrlReference feuUrl;
    @XmlElement(name = "file-update-time")
    protected DateTimeZone fileUpdateTime;
    @XmlElement(name = "event-update-time", required = true)
    protected DateTimeZone eventUpdateTime;
    @XmlElement(name = "event-id", required = true)
    protected String eventId;
    @XmlElement(name = "event-update")
    @XmlSchemaType(name = "unsignedShort")
    protected int eventUpdate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String status;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the feuUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlReference }
     *     
     */
    public UrlReference getFeuUrl() {
        return feuUrl;
    }

    /**
     * Sets the value of the feuUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlReference }
     *     
     */
    public void setFeuUrl(UrlReference value) {
        this.feuUrl = value;
    }

    /**
     * Gets the value of the fileUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getFileUpdateTime() {
        return fileUpdateTime;
    }

    /**
     * Sets the value of the fileUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setFileUpdateTime(DateTimeZone value) {
        this.fileUpdateTime = value;
    }

    /**
     * Gets the value of the eventUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getEventUpdateTime() {
        return eventUpdateTime;
    }

    /**
     * Sets the value of the eventUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setEventUpdateTime(DateTimeZone value) {
        this.eventUpdateTime = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventUpdate property.
     * 
     */
    public int getEventUpdate() {
        return eventUpdate;
    }

    /**
     * Sets the value of the eventUpdate property.
     * 
     */
    public void setEventUpdate(int value) {
        this.eventUpdate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
