
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
 * <p>Java class for DataRoadWeather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataRoadWeather"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="avg-wind-direction" type="{http://www.ntcip.org/c2f-object-references}EssAvgWindDirection"/&gt;
 *         &lt;element name="avg-wind-speed" type="{http://www.ntcip.org/c2f-object-references}EssAvgWindSpeed"/&gt;
 *         &lt;element name="avg-wind-gust-speed" type="{http://www.tmdd.org/303/messages}Ess-avg-wind-gust-speed"/&gt;
 *         &lt;element name="air-temperature" type="{http://www.ntcip.org/c2f-object-references}EssAirTemperature"/&gt;
 *         &lt;element name="dewpoint-temp" type="{http://www.ntcip.org/c2f-object-references}EssDewpointTemp"/&gt;
 *         &lt;element name="max-temp" type="{http://www.ntcip.org/c2f-object-references}EssMaxTemp"/&gt;
 *         &lt;element name="min-temp" type="{http://www.ntcip.org/c2f-object-references}EssMinTemp"/&gt;
 *         &lt;element name="relative-humidity" type="{http://www.ntcip.org/c2f-object-references}EssRelativeHumidity"/&gt;
 *         &lt;element name="atmospheric-pressure" type="{http://www.ntcip.org/c2f-object-references}EssAtmosphericPressure"/&gt;
 *         &lt;element name="precip-rate" type="{http://www.ntcip.org/c2f-object-references}EssPrecipRate"/&gt;
 *         &lt;element name="snowfall-accum-rate" type="{http://www.ntcip.org/c2f-object-references}EssSnowfallAccumRate"/&gt;
 *         &lt;element name="visibility" type="{http://www.ntcip.org/c2f-object-references}EssVisibility"/&gt;
 *         &lt;element name="uv-index" type="{http://www.tmdd.org/303/messages}Ess-uv-index"/&gt;
 *         &lt;element name="probability" type="{http://www.tmdd.org/303/messages}Ess-probability"/&gt;
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
@XmlType(name = "DataRoadWeather", propOrder = {
    "avgWindDirection",
    "avgWindSpeed",
    "avgWindGustSpeed",
    "airTemperature",
    "dewpointTemp",
    "maxTemp",
    "minTemp",
    "relativeHumidity",
    "atmosphericPressure",
    "precipRate",
    "snowfallAccumRate",
    "visibility",
    "uvIndex",
    "probability",
    "any"
})
public class DataRoadWeather
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "avg-wind-direction")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer avgWindDirection;
    @XmlElement(name = "avg-wind-speed")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer avgWindSpeed;
    @XmlElement(name = "avg-wind-gust-speed")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer avgWindGustSpeed;
    @XmlElement(name = "air-temperature")
    protected Short airTemperature;
    @XmlElement(name = "dewpoint-temp")
    protected Short dewpointTemp;
    @XmlElement(name = "max-temp")
    protected Short maxTemp;
    @XmlElement(name = "min-temp")
    protected Short minTemp;
    @XmlElement(name = "relative-humidity")
    @XmlSchemaType(name = "unsignedByte")
    protected Short relativeHumidity;
    @XmlElement(name = "atmospheric-pressure")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer atmosphericPressure;
    @XmlElement(name = "precip-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer precipRate;
    @XmlElement(name = "snowfall-accum-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer snowfallAccumRate;
    @XmlSchemaType(name = "unsignedInt")
    protected Long visibility;
    @XmlElement(name = "uv-index")
    @XmlSchemaType(name = "unsignedByte")
    protected Short uvIndex;
    @XmlSchemaType(name = "unsignedByte")
    protected Short probability;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the avgWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgWindDirection() {
        return avgWindDirection;
    }

    /**
     * Sets the value of the avgWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgWindDirection(Integer value) {
        this.avgWindDirection = value;
    }

    /**
     * Gets the value of the avgWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgWindSpeed() {
        return avgWindSpeed;
    }

    /**
     * Sets the value of the avgWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgWindSpeed(Integer value) {
        this.avgWindSpeed = value;
    }

    /**
     * Gets the value of the avgWindGustSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgWindGustSpeed() {
        return avgWindGustSpeed;
    }

    /**
     * Sets the value of the avgWindGustSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgWindGustSpeed(Integer value) {
        this.avgWindGustSpeed = value;
    }

    /**
     * Gets the value of the airTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAirTemperature() {
        return airTemperature;
    }

    /**
     * Sets the value of the airTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAirTemperature(Short value) {
        this.airTemperature = value;
    }

    /**
     * Gets the value of the dewpointTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDewpointTemp() {
        return dewpointTemp;
    }

    /**
     * Sets the value of the dewpointTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDewpointTemp(Short value) {
        this.dewpointTemp = value;
    }

    /**
     * Gets the value of the maxTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMaxTemp() {
        return maxTemp;
    }

    /**
     * Sets the value of the maxTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMaxTemp(Short value) {
        this.maxTemp = value;
    }

    /**
     * Gets the value of the minTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMinTemp() {
        return minTemp;
    }

    /**
     * Sets the value of the minTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMinTemp(Short value) {
        this.minTemp = value;
    }

    /**
     * Gets the value of the relativeHumidity property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Sets the value of the relativeHumidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRelativeHumidity(Short value) {
        this.relativeHumidity = value;
    }

    /**
     * Gets the value of the atmosphericPressure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAtmosphericPressure() {
        return atmosphericPressure;
    }

    /**
     * Sets the value of the atmosphericPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAtmosphericPressure(Integer value) {
        this.atmosphericPressure = value;
    }

    /**
     * Gets the value of the precipRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecipRate() {
        return precipRate;
    }

    /**
     * Sets the value of the precipRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecipRate(Integer value) {
        this.precipRate = value;
    }

    /**
     * Gets the value of the snowfallAccumRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSnowfallAccumRate() {
        return snowfallAccumRate;
    }

    /**
     * Sets the value of the snowfallAccumRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSnowfallAccumRate(Integer value) {
        this.snowfallAccumRate = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisibility(Long value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the uvIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUvIndex() {
        return uvIndex;
    }

    /**
     * Sets the value of the uvIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUvIndex(Short value) {
        this.uvIndex = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setProbability(Short value) {
        this.probability = value;
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
