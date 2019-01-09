
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
 * <p>Java class for ESSObservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSObservationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="weather-data" type="{http://www.ntcip.org/c2f-object-references}EssWeatherBlock"/&gt;
 *         &lt;element name="pavement-data" type="{http://www.ntcip.org/c2f-object-references}EssPavementBlock"/&gt;
 *         &lt;element name="subsurface-data" type="{http://www.ntcip.org/c2f-object-references}EssSubSurfaceData"/&gt;
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
@XmlType(name = "ESSObservationType", propOrder = {
    "weatherData",
    "pavementData",
    "subsurfaceData",
    "any"
})
public class ESSObservationType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "weather-data")
    protected String weatherData;
    @XmlElement(name = "pavement-data")
    protected String pavementData;
    @XmlElement(name = "subsurface-data")
    protected String subsurfaceData;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the weatherData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherData() {
        return weatherData;
    }

    /**
     * Sets the value of the weatherData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherData(String value) {
        this.weatherData = value;
    }

    /**
     * Gets the value of the pavementData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPavementData() {
        return pavementData;
    }

    /**
     * Sets the value of the pavementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPavementData(String value) {
        this.pavementData = value;
    }

    /**
     * Gets the value of the subsurfaceData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsurfaceData() {
        return subsurfaceData;
    }

    /**
     * Sets the value of the subsurfaceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsurfaceData(String value) {
        this.subsurfaceData = value;
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
