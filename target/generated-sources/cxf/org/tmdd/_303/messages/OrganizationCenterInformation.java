
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import lrms_adopted_02_00_00.GeoLocation;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Organization&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for OrganizationCenterInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationCenterInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="center-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="center-name" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="center-location" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="center-description" type="{http://www.tmdd.org/303/messages}Organization-function" minOccurs="0"/&gt;
 *         &lt;element name="center-type" type="{http://www.tmdd.org/303/messages}Center-type" minOccurs="0"/&gt;
 *         &lt;element name="center-contact-details" type="{http://www.tmdd.org/303/messages}ContactDetails" minOccurs="0"/&gt;
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
@XmlType(name = "OrganizationCenterInformation", propOrder = {
    "centerId",
    "centerName",
    "centerLocation",
    "centerDescription",
    "centerType",
    "centerContactDetails",
    "any"
})
public class OrganizationCenterInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "center-id", required = true)
    protected String centerId;
    @XmlElement(name = "center-name")
    protected String centerName;
    @XmlElement(name = "center-location")
    protected GeoLocation centerLocation;
    @XmlElement(name = "center-description")
    protected String centerDescription;
    @XmlElement(name = "center-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String centerType;
    @XmlElement(name = "center-contact-details")
    protected ContactDetails centerContactDetails;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the centerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterId() {
        return centerId;
    }

    /**
     * Sets the value of the centerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterId(String value) {
        this.centerId = value;
    }

    /**
     * Gets the value of the centerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterName() {
        return centerName;
    }

    /**
     * Sets the value of the centerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterName(String value) {
        this.centerName = value;
    }

    /**
     * Gets the value of the centerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getCenterLocation() {
        return centerLocation;
    }

    /**
     * Sets the value of the centerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setCenterLocation(GeoLocation value) {
        this.centerLocation = value;
    }

    /**
     * Gets the value of the centerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterDescription() {
        return centerDescription;
    }

    /**
     * Sets the value of the centerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterDescription(String value) {
        this.centerDescription = value;
    }

    /**
     * Gets the value of the centerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterType() {
        return centerType;
    }

    /**
     * Sets the value of the centerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterType(String value) {
        this.centerType = value;
    }

    /**
     * Gets the value of the centerContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getCenterContactDetails() {
        return centerContactDetails;
    }

    /**
     * Sets the value of the centerContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setCenterContactDetails(ContactDetails value) {
        this.centerContactDetails = value;
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
