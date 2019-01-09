
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Device&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DeviceInformationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInformationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authentication" type="{http://www.tmdd.org/303/messages}Authentication" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="organization-requesting" type="{http://www.tmdd.org/303/messages}OrganizationInformation" minOccurs="0"/&gt;
 *         &lt;element name="device-type" type="{http://www.tmdd.org/303/messages}Device-type"/&gt;
 *         &lt;element name="device-information-type" type="{http://www.tmdd.org/303/messages}Device-information-type"/&gt;
 *         &lt;element name="device-filter" type="{http://www.tmdd.org/303/messages}DeviceInformationRequestFilter" minOccurs="0"/&gt;
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
@XmlType(name = "DeviceInformationRequest", propOrder = {
    "authentication",
    "organizationInformation",
    "organizationRequesting",
    "deviceType",
    "deviceInformationType",
    "deviceFilter",
    "any"
})
public class DeviceInformationRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Authentication authentication;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "organization-requesting")
    protected OrganizationInformation organizationRequesting;
    @XmlElement(name = "device-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String deviceType;
    @XmlElement(name = "device-information-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String deviceInformationType;
    @XmlElement(name = "device-filter")
    protected DeviceInformationRequestFilter deviceFilter;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the organizationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationInformation() {
        return organizationInformation;
    }

    /**
     * Sets the value of the organizationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationInformation(OrganizationInformation value) {
        this.organizationInformation = value;
    }

    /**
     * Gets the value of the organizationRequesting property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationRequesting() {
        return organizationRequesting;
    }

    /**
     * Sets the value of the organizationRequesting property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationRequesting(OrganizationInformation value) {
        this.organizationRequesting = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the deviceInformationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceInformationType() {
        return deviceInformationType;
    }

    /**
     * Sets the value of the deviceInformationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceInformationType(String value) {
        this.deviceInformationType = value;
    }

    /**
     * Gets the value of the deviceFilter property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInformationRequestFilter }
     *     
     */
    public DeviceInformationRequestFilter getDeviceFilter() {
        return deviceFilter;
    }

    /**
     * Sets the value of the deviceFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInformationRequestFilter }
     *     
     */
    public void setDeviceFilter(DeviceInformationRequestFilter value) {
        this.deviceFilter = value;
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
