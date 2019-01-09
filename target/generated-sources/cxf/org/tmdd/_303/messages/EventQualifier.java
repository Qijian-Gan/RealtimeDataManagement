
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
 * <p>Java class for EventQualifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventQualifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="qualifier-generic" type="{http://www.ITIS-Adopted-03-00-02}Qualifiers"/&gt;
 *         &lt;element name="location-generic" type="{http://www.ITIS-Adopted-03-00-02}GenericLocations"/&gt;
 *         &lt;element name="lane-roadway" type="{http://www.ITIS-Adopted-03-00-02}LaneRoadway"/&gt;
 *         &lt;element name="transit-mode" type="{http://www.ITIS-Adopted-03-00-02}TransitMode"/&gt;
 *         &lt;element name="vehicle-group-affected" type="{http://www.ITIS-Adopted-03-00-02}VehicleGroupAffected"/&gt;
 *         &lt;element name="traveler-group-affected" type="{http://www.ITIS-Adopted-03-00-02}TravelerGroupAffected"/&gt;
 *         &lt;element name="responder-group-affected" type="{http://www.ITIS-Adopted-03-00-02}ResponderGroupAffected"/&gt;
 *         &lt;element name="incident-response-equipment" type="{http://www.ITIS-Adopted-03-00-02}IncidentResponseEquipment"/&gt;
 *         &lt;element name="transit-locations" type="{http://www.ITIS-Adopted-03-00-02}GenericLocations"/&gt;
 *         &lt;element name="incident-response-status" type="{http://www.ITIS-Adopted-03-00-02}IncidentResponseStatus"/&gt;
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
@XmlType(name = "EventQualifier", propOrder = {
    "qualifierGeneric",
    "locationGeneric",
    "laneRoadway",
    "transitMode",
    "vehicleGroupAffected",
    "travelerGroupAffected",
    "responderGroupAffected",
    "incidentResponseEquipment",
    "transitLocations",
    "incidentResponseStatus",
    "any"
})
public class EventQualifier
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "qualifier-generic")
    @XmlSchemaType(name = "anySimpleType")
    protected String qualifierGeneric;
    @XmlElement(name = "location-generic")
    @XmlSchemaType(name = "anySimpleType")
    protected String locationGeneric;
    @XmlElement(name = "lane-roadway")
    @XmlSchemaType(name = "anySimpleType")
    protected String laneRoadway;
    @XmlElement(name = "transit-mode")
    @XmlSchemaType(name = "anySimpleType")
    protected String transitMode;
    @XmlElement(name = "vehicle-group-affected")
    @XmlSchemaType(name = "anySimpleType")
    protected String vehicleGroupAffected;
    @XmlElement(name = "traveler-group-affected")
    @XmlSchemaType(name = "anySimpleType")
    protected String travelerGroupAffected;
    @XmlElement(name = "responder-group-affected")
    @XmlSchemaType(name = "anySimpleType")
    protected String responderGroupAffected;
    @XmlElement(name = "incident-response-equipment")
    @XmlSchemaType(name = "anySimpleType")
    protected String incidentResponseEquipment;
    @XmlElement(name = "transit-locations")
    @XmlSchemaType(name = "anySimpleType")
    protected String transitLocations;
    @XmlElement(name = "incident-response-status")
    @XmlSchemaType(name = "anySimpleType")
    protected String incidentResponseStatus;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the qualifierGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifierGeneric() {
        return qualifierGeneric;
    }

    /**
     * Sets the value of the qualifierGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifierGeneric(String value) {
        this.qualifierGeneric = value;
    }

    /**
     * Gets the value of the locationGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationGeneric() {
        return locationGeneric;
    }

    /**
     * Sets the value of the locationGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationGeneric(String value) {
        this.locationGeneric = value;
    }

    /**
     * Gets the value of the laneRoadway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneRoadway() {
        return laneRoadway;
    }

    /**
     * Sets the value of the laneRoadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneRoadway(String value) {
        this.laneRoadway = value;
    }

    /**
     * Gets the value of the transitMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitMode() {
        return transitMode;
    }

    /**
     * Sets the value of the transitMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitMode(String value) {
        this.transitMode = value;
    }

    /**
     * Gets the value of the vehicleGroupAffected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleGroupAffected() {
        return vehicleGroupAffected;
    }

    /**
     * Sets the value of the vehicleGroupAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleGroupAffected(String value) {
        this.vehicleGroupAffected = value;
    }

    /**
     * Gets the value of the travelerGroupAffected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerGroupAffected() {
        return travelerGroupAffected;
    }

    /**
     * Sets the value of the travelerGroupAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerGroupAffected(String value) {
        this.travelerGroupAffected = value;
    }

    /**
     * Gets the value of the responderGroupAffected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponderGroupAffected() {
        return responderGroupAffected;
    }

    /**
     * Sets the value of the responderGroupAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponderGroupAffected(String value) {
        this.responderGroupAffected = value;
    }

    /**
     * Gets the value of the incidentResponseEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentResponseEquipment() {
        return incidentResponseEquipment;
    }

    /**
     * Sets the value of the incidentResponseEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentResponseEquipment(String value) {
        this.incidentResponseEquipment = value;
    }

    /**
     * Gets the value of the transitLocations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitLocations() {
        return transitLocations;
    }

    /**
     * Sets the value of the transitLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitLocations(String value) {
        this.transitLocations = value;
    }

    /**
     * Gets the value of the incidentResponseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentResponseStatus() {
        return incidentResponseStatus;
    }

    /**
     * Sets the value of the incidentResponseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentResponseStatus(String value) {
        this.incidentResponseStatus = value;
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
