
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
 * <p>Java class for ESSObservationReportDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSObservationReportDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ess-sensor-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="ess-observation-timestamp" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="ess-observation-type" type="{http://www.tmdd.org/303/messages}ESSObservationType"/&gt;
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
@XmlType(name = "ESSObservationReportDetail", propOrder = {
    "essSensorId",
    "essObservationTimestamp",
    "essObservationType",
    "any"
})
public class ESSObservationReportDetail
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ess-sensor-id", required = true)
    protected String essSensorId;
    @XmlElement(name = "ess-observation-timestamp", required = true)
    protected DateTimeZone essObservationTimestamp;
    @XmlElement(name = "ess-observation-type", required = true)
    protected ESSObservationType essObservationType;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the essSensorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssSensorId() {
        return essSensorId;
    }

    /**
     * Sets the value of the essSensorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssSensorId(String value) {
        this.essSensorId = value;
    }

    /**
     * Gets the value of the essObservationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getEssObservationTimestamp() {
        return essObservationTimestamp;
    }

    /**
     * Sets the value of the essObservationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setEssObservationTimestamp(DateTimeZone value) {
        this.essObservationTimestamp = value;
    }

    /**
     * Gets the value of the essObservationType property.
     * 
     * @return
     *     possible object is
     *     {@link ESSObservationType }
     *     
     */
    public ESSObservationType getEssObservationType() {
        return essObservationType;
    }

    /**
     * Sets the value of the essObservationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSObservationType }
     *     
     */
    public void setEssObservationType(ESSObservationType value) {
        this.essObservationType = value;
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
