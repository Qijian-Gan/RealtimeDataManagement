
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ESS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ESSDataCollectorInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSDataCollectorInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data-collector-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments"/&gt;
 *         &lt;element name="data-collector-installation-date" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="data-collector-manufacturer" type="{http://www.tmdd.org/303/messages}Organization-resource-name"/&gt;
 *         &lt;element name="data-collector-product-name" type="{http://www.tmdd.org/303/messages}Organization-resource-name"/&gt;
 *         &lt;element name="data-collector-model-number-software-version" type="{http://www.tmdd.org/303/messages}Organization-resource-name"/&gt;
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
@XmlType(name = "ESSDataCollectorInformation", propOrder = {
    "dataCollectorDescription",
    "dataCollectorInstallationDate",
    "dataCollectorManufacturer",
    "dataCollectorProductName",
    "dataCollectorModelNumberSoftwareVersion",
    "any"
})
public class ESSDataCollectorInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "data-collector-description", required = true)
    protected String dataCollectorDescription;
    @XmlElement(name = "data-collector-installation-date", required = true)
    protected DateTimeZone dataCollectorInstallationDate;
    @XmlElement(name = "data-collector-manufacturer", required = true)
    protected String dataCollectorManufacturer;
    @XmlElement(name = "data-collector-product-name", required = true)
    protected String dataCollectorProductName;
    @XmlElement(name = "data-collector-model-number-software-version", required = true)
    protected String dataCollectorModelNumberSoftwareVersion;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the dataCollectorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCollectorDescription() {
        return dataCollectorDescription;
    }

    /**
     * Sets the value of the dataCollectorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCollectorDescription(String value) {
        this.dataCollectorDescription = value;
    }

    /**
     * Gets the value of the dataCollectorInstallationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getDataCollectorInstallationDate() {
        return dataCollectorInstallationDate;
    }

    /**
     * Sets the value of the dataCollectorInstallationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setDataCollectorInstallationDate(DateTimeZone value) {
        this.dataCollectorInstallationDate = value;
    }

    /**
     * Gets the value of the dataCollectorManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCollectorManufacturer() {
        return dataCollectorManufacturer;
    }

    /**
     * Sets the value of the dataCollectorManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCollectorManufacturer(String value) {
        this.dataCollectorManufacturer = value;
    }

    /**
     * Gets the value of the dataCollectorProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCollectorProductName() {
        return dataCollectorProductName;
    }

    /**
     * Sets the value of the dataCollectorProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCollectorProductName(String value) {
        this.dataCollectorProductName = value;
    }

    /**
     * Gets the value of the dataCollectorModelNumberSoftwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCollectorModelNumberSoftwareVersion() {
        return dataCollectorModelNumberSoftwareVersion;
    }

    /**
     * Sets the value of the dataCollectorModelNumberSoftwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCollectorModelNumberSoftwareVersion(String value) {
        this.dataCollectorModelNumberSoftwareVersion = value;
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
