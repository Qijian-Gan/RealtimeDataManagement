
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
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="traffic-conditions" type="{http://www.ITIS-Adopted-03-00-02}TrafficConditions"/&gt;
 *         &lt;element name="accidents-and-incidents" type="{http://www.ITIS-Adopted-03-00-02}AccidentsAndIncidents"/&gt;
 *         &lt;element name="closures" type="{http://www.ITIS-Adopted-03-00-02}Closures"/&gt;
 *         &lt;element name="roadwork" type="{http://www.ITIS-Adopted-03-00-02}Roadwork"/&gt;
 *         &lt;element name="obstruction" type="{http://www.ITIS-Adopted-03-00-02}Obstruction"/&gt;
 *         &lt;element name="delay-status-cancellation" type="{http://www.ITIS-Adopted-03-00-02}DelayStatusCancellation"/&gt;
 *         &lt;element name="unusual-driving" type="{http://www.ITIS-Adopted-03-00-02}UnusualDriving"/&gt;
 *         &lt;element name="mobile-situation" type="{http://www.ITIS-Adopted-03-00-02}MobileSituation"/&gt;
 *         &lt;element name="device-status" type="{http://www.ITIS-Adopted-03-00-02}DeviceStatus"/&gt;
 *         &lt;element name="restriction-class" type="{http://www.ITIS-Adopted-03-00-02}RestrictionClass"/&gt;
 *         &lt;element name="incidentResponseStatus" type="{http://www.ITIS-Adopted-03-00-02}IncidentResponseStatus"/&gt;
 *         &lt;element name="disasters" type="{http://www.ITIS-Adopted-03-00-02}Disasters"/&gt;
 *         &lt;element name="disturbances" type="{http://www.ITIS-Adopted-03-00-02}Disturbances"/&gt;
 *         &lt;element name="sporting-events" type="{http://www.ITIS-Adopted-03-00-02}SportingEvents"/&gt;
 *         &lt;element name="special-events" type="{http://www.ITIS-Adopted-03-00-02}SpecialEvents"/&gt;
 *         &lt;element name="parking-information" type="{http://www.ITIS-Adopted-03-00-02}ParkingInformation"/&gt;
 *         &lt;element name="system-information" type="{http://www.ITIS-Adopted-03-00-02}SystemInformation"/&gt;
 *         &lt;element name="weather-conditions" type="{http://www.ITIS-Adopted-03-00-02}WeatherConditions"/&gt;
 *         &lt;element name="precipitation" type="{http://www.ITIS-Adopted-03-00-02}Precipitation"/&gt;
 *         &lt;element name="winds" type="{http://www.ITIS-Adopted-03-00-02}Winds"/&gt;
 *         &lt;element name="visibility-and-air-quality" type="{http://www.ITIS-Adopted-03-00-02}VisibilityAndAirQuality"/&gt;
 *         &lt;element name="temperature" type="{http://www.ITIS-Adopted-03-00-02}Temperature"/&gt;
 *         &lt;element name="pavement-conditions" type="{http://www.ITIS-Adopted-03-00-02}PavementConditions"/&gt;
 *         &lt;element name="winter-driving-restrictions" type="{http://www.ITIS-Adopted-03-00-02}WinterDrivingRestrictions"/&gt;
 *         &lt;element name="winter-driving-index" type="{http://www.ITIS-Adopted-03-00-02}WinterDrivingIndex"/&gt;
 *         &lt;element name="suggestionAdvice" type="{http://www.ITIS-Adopted-03-00-02}SuggestionAdvice"/&gt;
 *         &lt;element name="warningAdvice" type="{http://www.ITIS-Adopted-03-00-02}WarningAdvice"/&gt;
 *         &lt;element name="adviceInstructionsRecommendations" type="{http://www.ITIS-Adopted-03-00-02}AdviceInstructionsRecommendations"/&gt;
 *         &lt;element name="adviceInstructionsMandatory" type="{http://www.ITIS-Adopted-03-00-02}AdviceInstructionsMandatory"/&gt;
 *         &lt;element name="laneRoadway" type="{http://www.ITIS-Adopted-03-00-02}LaneRoadway"/&gt;
 *         &lt;element name="alternateRoute" type="{http://www.ITIS-Adopted-03-00-02}AlternateRoute"/&gt;
 *         &lt;element name="transitMode" type="{http://www.ITIS-Adopted-03-00-02}TransitMode"/&gt;
 *         &lt;element name="vehicleGroupAffected" type="{http://www.ITIS-Adopted-03-00-02}VehicleGroupAffected"/&gt;
 *         &lt;element name="travelerGroupAffected" type="{http://www.ITIS-Adopted-03-00-02}TravelerGroupAffected"/&gt;
 *         &lt;element name="responderGroupAffected" type="{http://www.ITIS-Adopted-03-00-02}ResponderGroupAffected"/&gt;
 *         &lt;element name="incidentResponseEquipment" type="{http://www.ITIS-Adopted-03-00-02}IncidentResponseEquipment"/&gt;
 *         &lt;element name="transitOperations" type="{http://www.ITIS-Adopted-03-00-02}TransitOperations"/&gt;
 *         &lt;element name="transitIncident" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments"/&gt;
 *         &lt;element name="transitConstruction" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments"/&gt;
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
@XmlType(name = "EventType", propOrder = {
    "trafficConditions",
    "accidentsAndIncidents",
    "closures",
    "roadwork",
    "obstruction",
    "delayStatusCancellation",
    "unusualDriving",
    "mobileSituation",
    "deviceStatus",
    "restrictionClass",
    "incidentResponseStatus",
    "disasters",
    "disturbances",
    "sportingEvents",
    "specialEvents",
    "parkingInformation",
    "systemInformation",
    "weatherConditions",
    "precipitation",
    "winds",
    "visibilityAndAirQuality",
    "temperature",
    "pavementConditions",
    "winterDrivingRestrictions",
    "winterDrivingIndex",
    "suggestionAdvice",
    "warningAdvice",
    "adviceInstructionsRecommendations",
    "adviceInstructionsMandatory",
    "laneRoadway",
    "alternateRoute",
    "transitMode",
    "vehicleGroupAffected",
    "travelerGroupAffected",
    "responderGroupAffected",
    "incidentResponseEquipment",
    "transitOperations",
    "transitIncident",
    "transitConstruction",
    "any"
})
public class EventType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "traffic-conditions")
    @XmlSchemaType(name = "anySimpleType")
    protected String trafficConditions;
    @XmlElement(name = "accidents-and-incidents")
    @XmlSchemaType(name = "anySimpleType")
    protected String accidentsAndIncidents;
    @XmlSchemaType(name = "anySimpleType")
    protected String closures;
    @XmlSchemaType(name = "anySimpleType")
    protected String roadwork;
    @XmlSchemaType(name = "anySimpleType")
    protected String obstruction;
    @XmlElement(name = "delay-status-cancellation")
    @XmlSchemaType(name = "anySimpleType")
    protected String delayStatusCancellation;
    @XmlElement(name = "unusual-driving")
    @XmlSchemaType(name = "anySimpleType")
    protected String unusualDriving;
    @XmlElement(name = "mobile-situation")
    @XmlSchemaType(name = "anySimpleType")
    protected String mobileSituation;
    @XmlElement(name = "device-status")
    @XmlSchemaType(name = "anySimpleType")
    protected String deviceStatus;
    @XmlElement(name = "restriction-class")
    @XmlSchemaType(name = "anySimpleType")
    protected String restrictionClass;
    @XmlSchemaType(name = "anySimpleType")
    protected String incidentResponseStatus;
    @XmlSchemaType(name = "anySimpleType")
    protected String disasters;
    @XmlSchemaType(name = "anySimpleType")
    protected String disturbances;
    @XmlElement(name = "sporting-events")
    @XmlSchemaType(name = "anySimpleType")
    protected String sportingEvents;
    @XmlElement(name = "special-events")
    @XmlSchemaType(name = "anySimpleType")
    protected String specialEvents;
    @XmlElement(name = "parking-information")
    @XmlSchemaType(name = "anySimpleType")
    protected String parkingInformation;
    @XmlElement(name = "system-information")
    @XmlSchemaType(name = "anySimpleType")
    protected String systemInformation;
    @XmlElement(name = "weather-conditions")
    @XmlSchemaType(name = "anySimpleType")
    protected String weatherConditions;
    @XmlSchemaType(name = "anySimpleType")
    protected String precipitation;
    @XmlSchemaType(name = "anySimpleType")
    protected String winds;
    @XmlElement(name = "visibility-and-air-quality")
    @XmlSchemaType(name = "anySimpleType")
    protected String visibilityAndAirQuality;
    @XmlSchemaType(name = "anySimpleType")
    protected String temperature;
    @XmlElement(name = "pavement-conditions")
    @XmlSchemaType(name = "anySimpleType")
    protected String pavementConditions;
    @XmlElement(name = "winter-driving-restrictions")
    @XmlSchemaType(name = "anySimpleType")
    protected String winterDrivingRestrictions;
    @XmlElement(name = "winter-driving-index")
    @XmlSchemaType(name = "anySimpleType")
    protected String winterDrivingIndex;
    @XmlSchemaType(name = "anySimpleType")
    protected String suggestionAdvice;
    @XmlSchemaType(name = "anySimpleType")
    protected String warningAdvice;
    @XmlSchemaType(name = "anySimpleType")
    protected String adviceInstructionsRecommendations;
    @XmlSchemaType(name = "anySimpleType")
    protected String adviceInstructionsMandatory;
    @XmlSchemaType(name = "anySimpleType")
    protected String laneRoadway;
    @XmlSchemaType(name = "anySimpleType")
    protected String alternateRoute;
    @XmlSchemaType(name = "anySimpleType")
    protected String transitMode;
    @XmlSchemaType(name = "anySimpleType")
    protected String vehicleGroupAffected;
    @XmlSchemaType(name = "anySimpleType")
    protected String travelerGroupAffected;
    @XmlSchemaType(name = "anySimpleType")
    protected String responderGroupAffected;
    @XmlSchemaType(name = "anySimpleType")
    protected String incidentResponseEquipment;
    @XmlSchemaType(name = "anySimpleType")
    protected String transitOperations;
    protected String transitIncident;
    protected String transitConstruction;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the trafficConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficConditions() {
        return trafficConditions;
    }

    /**
     * Sets the value of the trafficConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficConditions(String value) {
        this.trafficConditions = value;
    }

    /**
     * Gets the value of the accidentsAndIncidents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccidentsAndIncidents() {
        return accidentsAndIncidents;
    }

    /**
     * Sets the value of the accidentsAndIncidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccidentsAndIncidents(String value) {
        this.accidentsAndIncidents = value;
    }

    /**
     * Gets the value of the closures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosures() {
        return closures;
    }

    /**
     * Sets the value of the closures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosures(String value) {
        this.closures = value;
    }

    /**
     * Gets the value of the roadwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadwork() {
        return roadwork;
    }

    /**
     * Sets the value of the roadwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadwork(String value) {
        this.roadwork = value;
    }

    /**
     * Gets the value of the obstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObstruction() {
        return obstruction;
    }

    /**
     * Sets the value of the obstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObstruction(String value) {
        this.obstruction = value;
    }

    /**
     * Gets the value of the delayStatusCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayStatusCancellation() {
        return delayStatusCancellation;
    }

    /**
     * Sets the value of the delayStatusCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayStatusCancellation(String value) {
        this.delayStatusCancellation = value;
    }

    /**
     * Gets the value of the unusualDriving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnusualDriving() {
        return unusualDriving;
    }

    /**
     * Sets the value of the unusualDriving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnusualDriving(String value) {
        this.unusualDriving = value;
    }

    /**
     * Gets the value of the mobileSituation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileSituation() {
        return mobileSituation;
    }

    /**
     * Sets the value of the mobileSituation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileSituation(String value) {
        this.mobileSituation = value;
    }

    /**
     * Gets the value of the deviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceStatus() {
        return deviceStatus;
    }

    /**
     * Sets the value of the deviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceStatus(String value) {
        this.deviceStatus = value;
    }

    /**
     * Gets the value of the restrictionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionClass() {
        return restrictionClass;
    }

    /**
     * Sets the value of the restrictionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionClass(String value) {
        this.restrictionClass = value;
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
     * Gets the value of the disasters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisasters() {
        return disasters;
    }

    /**
     * Sets the value of the disasters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisasters(String value) {
        this.disasters = value;
    }

    /**
     * Gets the value of the disturbances property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisturbances() {
        return disturbances;
    }

    /**
     * Sets the value of the disturbances property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisturbances(String value) {
        this.disturbances = value;
    }

    /**
     * Gets the value of the sportingEvents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportingEvents() {
        return sportingEvents;
    }

    /**
     * Sets the value of the sportingEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportingEvents(String value) {
        this.sportingEvents = value;
    }

    /**
     * Gets the value of the specialEvents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialEvents() {
        return specialEvents;
    }

    /**
     * Sets the value of the specialEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialEvents(String value) {
        this.specialEvents = value;
    }

    /**
     * Gets the value of the parkingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingInformation() {
        return parkingInformation;
    }

    /**
     * Sets the value of the parkingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingInformation(String value) {
        this.parkingInformation = value;
    }

    /**
     * Gets the value of the systemInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemInformation() {
        return systemInformation;
    }

    /**
     * Sets the value of the systemInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemInformation(String value) {
        this.systemInformation = value;
    }

    /**
     * Gets the value of the weatherConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherConditions() {
        return weatherConditions;
    }

    /**
     * Sets the value of the weatherConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherConditions(String value) {
        this.weatherConditions = value;
    }

    /**
     * Gets the value of the precipitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecipitation() {
        return precipitation;
    }

    /**
     * Sets the value of the precipitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecipitation(String value) {
        this.precipitation = value;
    }

    /**
     * Gets the value of the winds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinds() {
        return winds;
    }

    /**
     * Sets the value of the winds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinds(String value) {
        this.winds = value;
    }

    /**
     * Gets the value of the visibilityAndAirQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilityAndAirQuality() {
        return visibilityAndAirQuality;
    }

    /**
     * Sets the value of the visibilityAndAirQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilityAndAirQuality(String value) {
        this.visibilityAndAirQuality = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperature(String value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the pavementConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPavementConditions() {
        return pavementConditions;
    }

    /**
     * Sets the value of the pavementConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPavementConditions(String value) {
        this.pavementConditions = value;
    }

    /**
     * Gets the value of the winterDrivingRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinterDrivingRestrictions() {
        return winterDrivingRestrictions;
    }

    /**
     * Sets the value of the winterDrivingRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinterDrivingRestrictions(String value) {
        this.winterDrivingRestrictions = value;
    }

    /**
     * Gets the value of the winterDrivingIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinterDrivingIndex() {
        return winterDrivingIndex;
    }

    /**
     * Sets the value of the winterDrivingIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinterDrivingIndex(String value) {
        this.winterDrivingIndex = value;
    }

    /**
     * Gets the value of the suggestionAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestionAdvice() {
        return suggestionAdvice;
    }

    /**
     * Sets the value of the suggestionAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestionAdvice(String value) {
        this.suggestionAdvice = value;
    }

    /**
     * Gets the value of the warningAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningAdvice() {
        return warningAdvice;
    }

    /**
     * Sets the value of the warningAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningAdvice(String value) {
        this.warningAdvice = value;
    }

    /**
     * Gets the value of the adviceInstructionsRecommendations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdviceInstructionsRecommendations() {
        return adviceInstructionsRecommendations;
    }

    /**
     * Sets the value of the adviceInstructionsRecommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdviceInstructionsRecommendations(String value) {
        this.adviceInstructionsRecommendations = value;
    }

    /**
     * Gets the value of the adviceInstructionsMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdviceInstructionsMandatory() {
        return adviceInstructionsMandatory;
    }

    /**
     * Sets the value of the adviceInstructionsMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdviceInstructionsMandatory(String value) {
        this.adviceInstructionsMandatory = value;
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
     * Gets the value of the alternateRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateRoute() {
        return alternateRoute;
    }

    /**
     * Sets the value of the alternateRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateRoute(String value) {
        this.alternateRoute = value;
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
     * Gets the value of the transitOperations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitOperations() {
        return transitOperations;
    }

    /**
     * Sets the value of the transitOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitOperations(String value) {
        this.transitOperations = value;
    }

    /**
     * Gets the value of the transitIncident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitIncident() {
        return transitIncident;
    }

    /**
     * Sets the value of the transitIncident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitIncident(String value) {
        this.transitIncident = value;
    }

    /**
     * Gets the value of the transitConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitConstruction() {
        return transitConstruction;
    }

    /**
     * Sets the value of the transitConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitConstruction(String value) {
        this.transitConstruction = value;
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
