
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IntersectionSignal&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IntersectionSignalTPInventoryPhase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalTPInventoryPhase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phase-identifier" type="{http://www.ntcip.org/c2f-object-references}PhaseNumber"/&gt;
 *         &lt;element name="coordinated-phase" type="{http://www.ntcip.org/c2f-object-references}SplitCoordPhase"/&gt;
 *         &lt;element name="split-mode" type="{http://www.ntcip.org/c2f-object-references}SplitMode"/&gt;
 *         &lt;element name="phase-split" type="{http://www.ntcip.org/c2f-object-references}SplitTime"/&gt;
 *         &lt;element name="maximum-green-duration" type="{http://www.tmdd.org/303/messages}Intersection-timing-duration" minOccurs="0"/&gt;
 *         &lt;element name="minimum-green-duration" type="{http://www.tmdd.org/303/messages}Intersection-timing-duration" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-clearance-duration" type="{http://www.tmdd.org/303/messages}Intersection-timing-duration" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-red-duration" type="{http://www.tmdd.org/303/messages}Intersection-timing-duration" minOccurs="0"/&gt;
 *         &lt;element name="minimum-walk-duration" type="{http://www.tmdd.org/303/messages}Intersection-timing-duration" minOccurs="0"/&gt;
 *         &lt;element name="pedestrian-clearance-duration" type="{http://www.tmdd.org/303/messages}Intersection-timing-duration" minOccurs="0"/&gt;
 *         &lt;element name="steady-dont-walk-duration" type="{http://www.tmdd.org/303/messages}Intersection-timing-duration" minOccurs="0"/&gt;
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
@XmlType(name = "IntersectionSignalTPInventoryPhase", propOrder = {
    "phaseIdentifier",
    "coordinatedPhase",
    "splitMode",
    "phaseSplit",
    "maximumGreenDuration",
    "minimumGreenDuration",
    "vehicleClearanceDuration",
    "vehicleRedDuration",
    "minimumWalkDuration",
    "pedestrianClearanceDuration",
    "steadyDontWalkDuration",
    "any"
})
public class IntersectionSignalTPInventoryPhase
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "phase-identifier")
    @XmlSchemaType(name = "unsignedByte")
    protected short phaseIdentifier;
    @XmlElement(name = "coordinated-phase")
    @XmlSchemaType(name = "unsignedByte")
    protected short coordinatedPhase;
    @XmlElement(name = "split-mode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String splitMode;
    @XmlElement(name = "phase-split")
    @XmlSchemaType(name = "unsignedByte")
    protected short phaseSplit;
    @XmlElement(name = "maximum-green-duration")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maximumGreenDuration;
    @XmlElement(name = "minimum-green-duration")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minimumGreenDuration;
    @XmlElement(name = "vehicle-clearance-duration")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleClearanceDuration;
    @XmlElement(name = "vehicle-red-duration")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleRedDuration;
    @XmlElement(name = "minimum-walk-duration")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minimumWalkDuration;
    @XmlElement(name = "pedestrian-clearance-duration")
    @XmlSchemaType(name = "unsignedInt")
    protected Long pedestrianClearanceDuration;
    @XmlElement(name = "steady-dont-walk-duration")
    @XmlSchemaType(name = "unsignedInt")
    protected Long steadyDontWalkDuration;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the phaseIdentifier property.
     * 
     */
    public short getPhaseIdentifier() {
        return phaseIdentifier;
    }

    /**
     * Sets the value of the phaseIdentifier property.
     * 
     */
    public void setPhaseIdentifier(short value) {
        this.phaseIdentifier = value;
    }

    /**
     * Gets the value of the coordinatedPhase property.
     * 
     */
    public short getCoordinatedPhase() {
        return coordinatedPhase;
    }

    /**
     * Sets the value of the coordinatedPhase property.
     * 
     */
    public void setCoordinatedPhase(short value) {
        this.coordinatedPhase = value;
    }

    /**
     * Gets the value of the splitMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitMode() {
        return splitMode;
    }

    /**
     * Sets the value of the splitMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitMode(String value) {
        this.splitMode = value;
    }

    /**
     * Gets the value of the phaseSplit property.
     * 
     */
    public short getPhaseSplit() {
        return phaseSplit;
    }

    /**
     * Sets the value of the phaseSplit property.
     * 
     */
    public void setPhaseSplit(short value) {
        this.phaseSplit = value;
    }

    /**
     * Gets the value of the maximumGreenDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumGreenDuration() {
        return maximumGreenDuration;
    }

    /**
     * Sets the value of the maximumGreenDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumGreenDuration(Long value) {
        this.maximumGreenDuration = value;
    }

    /**
     * Gets the value of the minimumGreenDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinimumGreenDuration() {
        return minimumGreenDuration;
    }

    /**
     * Sets the value of the minimumGreenDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinimumGreenDuration(Long value) {
        this.minimumGreenDuration = value;
    }

    /**
     * Gets the value of the vehicleClearanceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleClearanceDuration() {
        return vehicleClearanceDuration;
    }

    /**
     * Sets the value of the vehicleClearanceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleClearanceDuration(Long value) {
        this.vehicleClearanceDuration = value;
    }

    /**
     * Gets the value of the vehicleRedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleRedDuration() {
        return vehicleRedDuration;
    }

    /**
     * Sets the value of the vehicleRedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleRedDuration(Long value) {
        this.vehicleRedDuration = value;
    }

    /**
     * Gets the value of the minimumWalkDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinimumWalkDuration() {
        return minimumWalkDuration;
    }

    /**
     * Sets the value of the minimumWalkDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinimumWalkDuration(Long value) {
        this.minimumWalkDuration = value;
    }

    /**
     * Gets the value of the pedestrianClearanceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPedestrianClearanceDuration() {
        return pedestrianClearanceDuration;
    }

    /**
     * Sets the value of the pedestrianClearanceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPedestrianClearanceDuration(Long value) {
        this.pedestrianClearanceDuration = value;
    }

    /**
     * Gets the value of the steadyDontWalkDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSteadyDontWalkDuration() {
        return steadyDontWalkDuration;
    }

    /**
     * Sets the value of the steadyDontWalkDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSteadyDontWalkDuration(Long value) {
        this.steadyDontWalkDuration = value;
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
