
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
 * <p>Java class for AreaLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="area-id" type="{http://www.tmdd.org/303/messages}Event-location-area-identifier" minOccurs="0"/&gt;
 *         &lt;element name="area-name" type="{http://www.tmdd.org/303/messages}Event-area-name" minOccurs="0"/&gt;
 *         &lt;element name="location-rank" type="{http://www.tmdd.org/303/messages}Event-location-rank" minOccurs="0"/&gt;
 *         &lt;element name="upward-area-reference" type="{http://www.tmdd.org/303/messages}AreaLocation" minOccurs="0"/&gt;
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
@XmlType(name = "AreaLocation", propOrder = {
    "areaId",
    "areaName",
    "locationRank",
    "upwardAreaReference",
    "any"
})
public class AreaLocation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "area-id")
    protected String areaId;
    @XmlElement(name = "area-name")
    protected String areaName;
    @XmlElement(name = "location-rank")
    @XmlSchemaType(name = "unsignedByte")
    protected Short locationRank;
    @XmlElement(name = "upward-area-reference")
    protected AreaLocation upwardAreaReference;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the areaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * Sets the value of the areaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaId(String value) {
        this.areaId = value;
    }

    /**
     * Gets the value of the areaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * Sets the value of the areaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

    /**
     * Gets the value of the locationRank property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLocationRank() {
        return locationRank;
    }

    /**
     * Sets the value of the locationRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLocationRank(Short value) {
        this.locationRank = value;
    }

    /**
     * Gets the value of the upwardAreaReference property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLocation }
     *     
     */
    public AreaLocation getUpwardAreaReference() {
        return upwardAreaReference;
    }

    /**
     * Sets the value of the upwardAreaReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLocation }
     *     
     */
    public void setUpwardAreaReference(AreaLocation value) {
        this.upwardAreaReference = value;
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
