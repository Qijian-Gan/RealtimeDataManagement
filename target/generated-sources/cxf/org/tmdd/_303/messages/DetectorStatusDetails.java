
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Detector&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DetectorStatusDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetectorStatusDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detector-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader"/&gt;
 *         &lt;element name="detector-lane-number" type="{http://www.tmdd.org/303/messages}Link-lane-number" minOccurs="0"/&gt;
 *         &lt;element name="lane-direction" type="{http://www.tmdd.org/303/messages}Link-direction" minOccurs="0"/&gt;
 *         &lt;element name="detector-outputmode" type="{http://www.ntcip.org/c2f-object-references}SensorZoneOutputMode" minOccurs="0"/&gt;
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
@XmlType(name = "DetectorStatusDetails", propOrder = {
    "detectorStatusHeader",
    "detectorLaneNumber",
    "laneDirection",
    "detectorOutputmode",
    "any"
})
public class DetectorStatusDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "detector-status-header", required = true)
    protected DeviceStatusHeader detectorStatusHeader;
    @XmlElement(name = "detector-lane-number")
    @XmlSchemaType(name = "unsignedByte")
    protected Short detectorLaneNumber;
    @XmlElement(name = "lane-direction")
    @XmlSchemaType(name = "anySimpleType")
    protected String laneDirection;
    @XmlElement(name = "detector-outputmode")
    @XmlSchemaType(name = "unsignedByte")
    protected Short detectorOutputmode;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the detectorStatusHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public DeviceStatusHeader getDetectorStatusHeader() {
        return detectorStatusHeader;
    }

    /**
     * Sets the value of the detectorStatusHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public void setDetectorStatusHeader(DeviceStatusHeader value) {
        this.detectorStatusHeader = value;
    }

    /**
     * Gets the value of the detectorLaneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDetectorLaneNumber() {
        return detectorLaneNumber;
    }

    /**
     * Sets the value of the detectorLaneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDetectorLaneNumber(Short value) {
        this.detectorLaneNumber = value;
    }

    /**
     * Gets the value of the laneDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneDirection() {
        return laneDirection;
    }

    /**
     * Sets the value of the laneDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneDirection(String value) {
        this.laneDirection = value;
    }

    /**
     * Gets the value of the detectorOutputmode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDetectorOutputmode() {
        return detectorOutputmode;
    }

    /**
     * Sets the value of the detectorOutputmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDetectorOutputmode(Short value) {
        this.detectorOutputmode = value;
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
