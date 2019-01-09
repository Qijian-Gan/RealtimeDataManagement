
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
 * <p>Java class for DataSurfaceConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSurfaceConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="water-depth" type="{http://www.ntcip.org/c2f-object-references}EssWaterDepth"/&gt;
 *         &lt;element name="adjacent-snow-depth" type="{http://www.ntcip.org/c2f-object-references}EssAdjacentSnowDepth"/&gt;
 *         &lt;element name="roadway-snow-depth" type="{http://www.ntcip.org/c2f-object-references}EssRoadwaySnowDepth"/&gt;
 *         &lt;element name="roadway-snow-pack-depth" type="{http://www.ntcip.org/c2f-object-references}EssRoadwaySnowPackDepth"/&gt;
 *         &lt;element name="ice-thickness" type="{http://www.ntcip.org/c2f-object-references}EssIceThickness"/&gt;
 *         &lt;element name="surface-temperature" type="{http://www.ntcip.org/c2f-object-references}EssSurfaceTemperature"/&gt;
 *         &lt;element name="pavement-temperature" type="{http://www.ntcip.org/c2f-object-references}EssPavementTemperature"/&gt;
 *         &lt;element name="surface-water-depth" type="{http://www.ntcip.org/c2f-object-references}EssSurfaceWaterDepth"/&gt;
 *         &lt;element name="surface-salinity" type="{http://www.ntcip.org/c2f-object-references}EssSurfaceSalinity"/&gt;
 *         &lt;element name="surface-freeze-point" type="{http://www.ntcip.org/c2f-object-references}EssSurfaceFreezePoint"/&gt;
 *         &lt;element name="mobile-friction" type="{http://www.ntcip.org/c2f-object-references}EssMobileFriction"/&gt;
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
@XmlType(name = "DataSurfaceConditions", propOrder = {
    "waterDepth",
    "adjacentSnowDepth",
    "roadwaySnowDepth",
    "roadwaySnowPackDepth",
    "iceThickness",
    "surfaceTemperature",
    "pavementTemperature",
    "surfaceWaterDepth",
    "surfaceSalinity",
    "surfaceFreezePoint",
    "mobileFriction",
    "any"
})
public class DataSurfaceConditions
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "water-depth")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer waterDepth;
    @XmlElement(name = "adjacent-snow-depth")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer adjacentSnowDepth;
    @XmlElement(name = "roadway-snow-depth")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer roadwaySnowDepth;
    @XmlElement(name = "roadway-snow-pack-depth")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer roadwaySnowPackDepth;
    @XmlElement(name = "ice-thickness")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer iceThickness;
    @XmlElement(name = "surface-temperature")
    protected Short surfaceTemperature;
    @XmlElement(name = "pavement-temperature")
    protected Short pavementTemperature;
    @XmlElement(name = "surface-water-depth")
    @XmlSchemaType(name = "unsignedByte")
    protected Short surfaceWaterDepth;
    @XmlElement(name = "surface-salinity")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer surfaceSalinity;
    @XmlElement(name = "surface-freeze-point")
    protected Short surfaceFreezePoint;
    @XmlElement(name = "mobile-friction")
    @XmlSchemaType(name = "unsignedByte")
    protected Short mobileFriction;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the waterDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaterDepth() {
        return waterDepth;
    }

    /**
     * Sets the value of the waterDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaterDepth(Integer value) {
        this.waterDepth = value;
    }

    /**
     * Gets the value of the adjacentSnowDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdjacentSnowDepth() {
        return adjacentSnowDepth;
    }

    /**
     * Sets the value of the adjacentSnowDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdjacentSnowDepth(Integer value) {
        this.adjacentSnowDepth = value;
    }

    /**
     * Gets the value of the roadwaySnowDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadwaySnowDepth() {
        return roadwaySnowDepth;
    }

    /**
     * Sets the value of the roadwaySnowDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadwaySnowDepth(Integer value) {
        this.roadwaySnowDepth = value;
    }

    /**
     * Gets the value of the roadwaySnowPackDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadwaySnowPackDepth() {
        return roadwaySnowPackDepth;
    }

    /**
     * Sets the value of the roadwaySnowPackDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadwaySnowPackDepth(Integer value) {
        this.roadwaySnowPackDepth = value;
    }

    /**
     * Gets the value of the iceThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIceThickness() {
        return iceThickness;
    }

    /**
     * Sets the value of the iceThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIceThickness(Integer value) {
        this.iceThickness = value;
    }

    /**
     * Gets the value of the surfaceTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSurfaceTemperature() {
        return surfaceTemperature;
    }

    /**
     * Sets the value of the surfaceTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSurfaceTemperature(Short value) {
        this.surfaceTemperature = value;
    }

    /**
     * Gets the value of the pavementTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPavementTemperature() {
        return pavementTemperature;
    }

    /**
     * Sets the value of the pavementTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPavementTemperature(Short value) {
        this.pavementTemperature = value;
    }

    /**
     * Gets the value of the surfaceWaterDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSurfaceWaterDepth() {
        return surfaceWaterDepth;
    }

    /**
     * Sets the value of the surfaceWaterDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSurfaceWaterDepth(Short value) {
        this.surfaceWaterDepth = value;
    }

    /**
     * Gets the value of the surfaceSalinity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSurfaceSalinity() {
        return surfaceSalinity;
    }

    /**
     * Sets the value of the surfaceSalinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSurfaceSalinity(Integer value) {
        this.surfaceSalinity = value;
    }

    /**
     * Gets the value of the surfaceFreezePoint property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSurfaceFreezePoint() {
        return surfaceFreezePoint;
    }

    /**
     * Sets the value of the surfaceFreezePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSurfaceFreezePoint(Short value) {
        this.surfaceFreezePoint = value;
    }

    /**
     * Gets the value of the mobileFriction property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMobileFriction() {
        return mobileFriction;
    }

    /**
     * Sets the value of the mobileFriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMobileFriction(Short value) {
        this.mobileFriction = value;
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
