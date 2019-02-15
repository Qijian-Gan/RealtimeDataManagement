
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
 * <p>Java class for DataIncidentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataIncidentDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="vehicles-involved-count" type="{http://www.tmdd.org/303/messages}Event-incident-vehicles-involved-count"/&gt;
 *         &lt;element name="cars-involved-count" type="{http://www.tmdd.org/303/messages}Event-incident-vehicles-involved-count"/&gt;
 *         &lt;element name="trucks-involved-count" type="{http://www.tmdd.org/303/messages}Event-incident-vehicles-involved-count"/&gt;
 *         &lt;element name="buses-involved-count" type="{http://www.tmdd.org/303/messages}Event-incident-vehicles-involved-count"/&gt;
 *         &lt;element name="human-fatalities-count" type="{http://www.tmdd.org/303/messages}Event-incident-humans-involved-count"/&gt;
 *         &lt;element name="human-injuries-count" type="{http://www.tmdd.org/303/messages}Event-incident-humans-involved-count"/&gt;
 *         &lt;element name="human-major-injuries-count" type="{http://www.tmdd.org/303/messages}Event-incident-humans-involved-count"/&gt;
 *         &lt;element name="human-minor-injuries-count" type="{http://www.tmdd.org/303/messages}Event-incident-humans-involved-count"/&gt;
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
@XmlType(name = "DataIncidentDetails", propOrder = {
    "vehiclesInvolvedCount",
    "carsInvolvedCount",
    "trucksInvolvedCount",
    "busesInvolvedCount",
    "humanFatalitiesCount",
    "humanInjuriesCount",
    "humanMajorInjuriesCount",
    "humanMinorInjuriesCount",
    "any"
})
public class DataIncidentDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "vehicles-involved-count")
    @XmlSchemaType(name = "unsignedByte")
    protected Short vehiclesInvolvedCount;
    @XmlElement(name = "cars-involved-count")
    @XmlSchemaType(name = "unsignedByte")
    protected Short carsInvolvedCount;
    @XmlElement(name = "trucks-involved-count")
    @XmlSchemaType(name = "unsignedByte")
    protected Short trucksInvolvedCount;
    @XmlElement(name = "buses-involved-count")
    @XmlSchemaType(name = "unsignedByte")
    protected Short busesInvolvedCount;
    @XmlElement(name = "human-fatalities-count")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer humanFatalitiesCount;
    @XmlElement(name = "human-injuries-count")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer humanInjuriesCount;
    @XmlElement(name = "human-major-injuries-count")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer humanMajorInjuriesCount;
    @XmlElement(name = "human-minor-injuries-count")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer humanMinorInjuriesCount;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the vehiclesInvolvedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVehiclesInvolvedCount() {
        return vehiclesInvolvedCount;
    }

    /**
     * Sets the value of the vehiclesInvolvedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVehiclesInvolvedCount(Short value) {
        this.vehiclesInvolvedCount = value;
    }

    /**
     * Gets the value of the carsInvolvedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCarsInvolvedCount() {
        return carsInvolvedCount;
    }

    /**
     * Sets the value of the carsInvolvedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCarsInvolvedCount(Short value) {
        this.carsInvolvedCount = value;
    }

    /**
     * Gets the value of the trucksInvolvedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTrucksInvolvedCount() {
        return trucksInvolvedCount;
    }

    /**
     * Sets the value of the trucksInvolvedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTrucksInvolvedCount(Short value) {
        this.trucksInvolvedCount = value;
    }

    /**
     * Gets the value of the busesInvolvedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBusesInvolvedCount() {
        return busesInvolvedCount;
    }

    /**
     * Sets the value of the busesInvolvedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBusesInvolvedCount(Short value) {
        this.busesInvolvedCount = value;
    }

    /**
     * Gets the value of the humanFatalitiesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHumanFatalitiesCount() {
        return humanFatalitiesCount;
    }

    /**
     * Sets the value of the humanFatalitiesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHumanFatalitiesCount(Integer value) {
        this.humanFatalitiesCount = value;
    }

    /**
     * Gets the value of the humanInjuriesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHumanInjuriesCount() {
        return humanInjuriesCount;
    }

    /**
     * Sets the value of the humanInjuriesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHumanInjuriesCount(Integer value) {
        this.humanInjuriesCount = value;
    }

    /**
     * Gets the value of the humanMajorInjuriesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHumanMajorInjuriesCount() {
        return humanMajorInjuriesCount;
    }

    /**
     * Sets the value of the humanMajorInjuriesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHumanMajorInjuriesCount(Integer value) {
        this.humanMajorInjuriesCount = value;
    }

    /**
     * Gets the value of the humanMinorInjuriesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHumanMinorInjuriesCount() {
        return humanMinorInjuriesCount;
    }

    /**
     * Sets the value of the humanMinorInjuriesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHumanMinorInjuriesCount(Integer value) {
        this.humanMinorInjuriesCount = value;
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
