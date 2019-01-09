
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for IntersectionSignalStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader"/&gt;
 *         &lt;element name="signal-control-source" type="{http://www.tmdd.org/303/messages}Intersection-signal-control-source"/&gt;
 *         &lt;element name="planned-signal-timing-mode" type="{http://www.tmdd.org/303/messages}Intersection-planned-signal-timing-mode"/&gt;
 *         &lt;element name="current-signal-timing-mode" type="{http://www.tmdd.org/303/messages}Intersection-signal-timing-mode"/&gt;
 *         &lt;element name="section-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="planned-signal-timing-mode-description" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="timing-pattern-id-current" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="timing-pattern-description" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="actuation-mode" type="{http://www.tmdd.org/303/messages}Intersection-actuation-mode" minOccurs="0"/&gt;
 *         &lt;element name="timing-phase-plan-mode" type="{http://www.ntcip.org/c2f-object-references}SplitMode" minOccurs="0"/&gt;
 *         &lt;element name="cycle-length-planned" type="{http://www.ntcip.org/c2f-object-references}PatternCycleTime" minOccurs="0"/&gt;
 *         &lt;element name="cycle-length-current" type="{http://www.ntcip.org/c2f-object-references}PatternCycleTime" minOccurs="0"/&gt;
 *         &lt;element name="cycle-length-previous" type="{http://www.ntcip.org/c2f-object-references}PatternCycleTime" minOccurs="0"/&gt;
 *         &lt;element name="cycle-length-master" type="{http://www.ntcip.org/c2f-object-references}PatternCycleTime" minOccurs="0"/&gt;
 *         &lt;element name="cycle-counter" type="{http://www.ntcip.org/c2f-object-references}CoordCycleStatus" minOccurs="0"/&gt;
 *         &lt;element name="cycle-counter-master" type="{http://www.ntcip.org/c2f-object-references}CoordSyncStatus" minOccurs="0"/&gt;
 *         &lt;element name="offset-reference" type="{http://www.tmdd.org/303/messages}Intersection-offset-reference" minOccurs="0"/&gt;
 *         &lt;element name="offset-time-planned" type="{http://www.ntcip.org/c2f-object-references}PatternOffsetTime" minOccurs="0"/&gt;
 *         &lt;element name="offset-time-current" type="{http://www.ntcip.org/c2f-object-references}PatternOffsetTime" minOccurs="0"/&gt;
 *         &lt;element name="offset-time-previous" type="{http://www.ntcip.org/c2f-object-references}PatternOffsetTime" minOccurs="0"/&gt;
 *         &lt;element name="controller-timestamp" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="phase-split-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="40"&gt;
 *                   &lt;element name="phase-split" type="{http://www.tmdd.org/303/messages}IntersectionSignalPhaseSplit"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ring-status-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="ring-status" type="{http://www.tmdd.org/303/messages}IntersectionSignalRingStatus"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phase-status" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="5"&gt;
 *                   &lt;element name="phase-status-group" type="{http://www.tmdd.org/303/messages}IntersectionSignalPhaseStatusGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="overlap-status" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="2"&gt;
 *                   &lt;element name="overlap-status-group" type="{http://www.tmdd.org/303/messages}IntersectionSignalOverlapStatusGroup"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="active-special-functions-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="special-functions" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="preempt-priority-description" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="operation-agency" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="maintenance-agency" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="operation-alteration-authorization" type="{http://www.tmdd.org/303/messages}Binary-unknown-flag" minOccurs="0"/&gt;
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
@XmlType(name = "IntersectionSignalStatus", propOrder = {
    "deviceStatusHeader",
    "signalControlSource",
    "plannedSignalTimingMode",
    "currentSignalTimingMode",
    "sectionId",
    "plannedSignalTimingModeDescription",
    "timingPatternIdCurrent",
    "timingPatternDescription",
    "actuationMode",
    "timingPhasePlanMode",
    "cycleLengthPlanned",
    "cycleLengthCurrent",
    "cycleLengthPrevious",
    "cycleLengthMaster",
    "cycleCounter",
    "cycleCounterMaster",
    "offsetReference",
    "offsetTimePlanned",
    "offsetTimeCurrent",
    "offsetTimePrevious",
    "controllerTimestamp",
    "phaseSplitList",
    "ringStatusList",
    "phaseStatus",
    "overlapStatus",
    "activeSpecialFunctionsList",
    "preemptPriorityDescription",
    "operationAgency",
    "maintenanceAgency",
    "operationAlterationAuthorization",
    "any"
})
public class IntersectionSignalStatus
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-status-header", required = true)
    protected DeviceStatusHeader deviceStatusHeader;
    @XmlElement(name = "signal-control-source", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String signalControlSource;
    @XmlElement(name = "planned-signal-timing-mode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String plannedSignalTimingMode;
    @XmlElement(name = "current-signal-timing-mode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String currentSignalTimingMode;
    @XmlElement(name = "section-id")
    protected String sectionId;
    @XmlElement(name = "planned-signal-timing-mode-description")
    protected String plannedSignalTimingModeDescription;
    @XmlElement(name = "timing-pattern-id-current")
    protected String timingPatternIdCurrent;
    @XmlElement(name = "timing-pattern-description")
    protected String timingPatternDescription;
    @XmlElement(name = "actuation-mode")
    @XmlSchemaType(name = "anySimpleType")
    protected String actuationMode;
    @XmlElement(name = "timing-phase-plan-mode")
    @XmlSchemaType(name = "anySimpleType")
    protected String timingPhasePlanMode;
    @XmlElement(name = "cycle-length-planned")
    @XmlSchemaType(name = "unsignedByte")
    protected Short cycleLengthPlanned;
    @XmlElement(name = "cycle-length-current")
    @XmlSchemaType(name = "unsignedByte")
    protected Short cycleLengthCurrent;
    @XmlElement(name = "cycle-length-previous")
    @XmlSchemaType(name = "unsignedByte")
    protected Short cycleLengthPrevious;
    @XmlElement(name = "cycle-length-master")
    @XmlSchemaType(name = "unsignedByte")
    protected Short cycleLengthMaster;
    @XmlElement(name = "cycle-counter")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cycleCounter;
    @XmlElement(name = "cycle-counter-master")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cycleCounterMaster;
    @XmlElement(name = "offset-reference")
    @XmlSchemaType(name = "anySimpleType")
    protected String offsetReference;
    @XmlElement(name = "offset-time-planned")
    @XmlSchemaType(name = "unsignedByte")
    protected Short offsetTimePlanned;
    @XmlElement(name = "offset-time-current")
    @XmlSchemaType(name = "unsignedByte")
    protected Short offsetTimeCurrent;
    @XmlElement(name = "offset-time-previous")
    @XmlSchemaType(name = "unsignedByte")
    protected Short offsetTimePrevious;
    @XmlElement(name = "controller-timestamp")
    protected DateTimeZone controllerTimestamp;
    @XmlElement(name = "phase-split-list")
    protected IntersectionSignalStatus.PhaseSplitList phaseSplitList;
    @XmlElement(name = "ring-status-list")
    protected IntersectionSignalStatus.RingStatusList ringStatusList;
    @XmlElement(name = "phase-status")
    protected IntersectionSignalStatus.PhaseStatus phaseStatus;
    @XmlElement(name = "overlap-status")
    protected IntersectionSignalStatus.OverlapStatus overlapStatus;
    @XmlElement(name = "active-special-functions-list")
    protected IntersectionSignalStatus.ActiveSpecialFunctionsList activeSpecialFunctionsList;
    @XmlElement(name = "preempt-priority-description")
    protected String preemptPriorityDescription;
    @XmlElement(name = "operation-agency")
    protected String operationAgency;
    @XmlElement(name = "maintenance-agency")
    protected String maintenanceAgency;
    @XmlElement(name = "operation-alteration-authorization")
    @XmlSchemaType(name = "anySimpleType")
    protected String operationAlterationAuthorization;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceStatusHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public DeviceStatusHeader getDeviceStatusHeader() {
        return deviceStatusHeader;
    }

    /**
     * Sets the value of the deviceStatusHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public void setDeviceStatusHeader(DeviceStatusHeader value) {
        this.deviceStatusHeader = value;
    }

    /**
     * Gets the value of the signalControlSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalControlSource() {
        return signalControlSource;
    }

    /**
     * Sets the value of the signalControlSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalControlSource(String value) {
        this.signalControlSource = value;
    }

    /**
     * Gets the value of the plannedSignalTimingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedSignalTimingMode() {
        return plannedSignalTimingMode;
    }

    /**
     * Sets the value of the plannedSignalTimingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedSignalTimingMode(String value) {
        this.plannedSignalTimingMode = value;
    }

    /**
     * Gets the value of the currentSignalTimingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentSignalTimingMode() {
        return currentSignalTimingMode;
    }

    /**
     * Sets the value of the currentSignalTimingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentSignalTimingMode(String value) {
        this.currentSignalTimingMode = value;
    }

    /**
     * Gets the value of the sectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionId(String value) {
        this.sectionId = value;
    }

    /**
     * Gets the value of the plannedSignalTimingModeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedSignalTimingModeDescription() {
        return plannedSignalTimingModeDescription;
    }

    /**
     * Sets the value of the plannedSignalTimingModeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedSignalTimingModeDescription(String value) {
        this.plannedSignalTimingModeDescription = value;
    }

    /**
     * Gets the value of the timingPatternIdCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimingPatternIdCurrent() {
        return timingPatternIdCurrent;
    }

    /**
     * Sets the value of the timingPatternIdCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimingPatternIdCurrent(String value) {
        this.timingPatternIdCurrent = value;
    }

    /**
     * Gets the value of the timingPatternDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimingPatternDescription() {
        return timingPatternDescription;
    }

    /**
     * Sets the value of the timingPatternDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimingPatternDescription(String value) {
        this.timingPatternDescription = value;
    }

    /**
     * Gets the value of the actuationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuationMode() {
        return actuationMode;
    }

    /**
     * Sets the value of the actuationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuationMode(String value) {
        this.actuationMode = value;
    }

    /**
     * Gets the value of the timingPhasePlanMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimingPhasePlanMode() {
        return timingPhasePlanMode;
    }

    /**
     * Sets the value of the timingPhasePlanMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimingPhasePlanMode(String value) {
        this.timingPhasePlanMode = value;
    }

    /**
     * Gets the value of the cycleLengthPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCycleLengthPlanned() {
        return cycleLengthPlanned;
    }

    /**
     * Sets the value of the cycleLengthPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCycleLengthPlanned(Short value) {
        this.cycleLengthPlanned = value;
    }

    /**
     * Gets the value of the cycleLengthCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCycleLengthCurrent() {
        return cycleLengthCurrent;
    }

    /**
     * Sets the value of the cycleLengthCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCycleLengthCurrent(Short value) {
        this.cycleLengthCurrent = value;
    }

    /**
     * Gets the value of the cycleLengthPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCycleLengthPrevious() {
        return cycleLengthPrevious;
    }

    /**
     * Sets the value of the cycleLengthPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCycleLengthPrevious(Short value) {
        this.cycleLengthPrevious = value;
    }

    /**
     * Gets the value of the cycleLengthMaster property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCycleLengthMaster() {
        return cycleLengthMaster;
    }

    /**
     * Sets the value of the cycleLengthMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCycleLengthMaster(Short value) {
        this.cycleLengthMaster = value;
    }

    /**
     * Gets the value of the cycleCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycleCounter() {
        return cycleCounter;
    }

    /**
     * Sets the value of the cycleCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycleCounter(Integer value) {
        this.cycleCounter = value;
    }

    /**
     * Gets the value of the cycleCounterMaster property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycleCounterMaster() {
        return cycleCounterMaster;
    }

    /**
     * Sets the value of the cycleCounterMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycleCounterMaster(Integer value) {
        this.cycleCounterMaster = value;
    }

    /**
     * Gets the value of the offsetReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetReference() {
        return offsetReference;
    }

    /**
     * Sets the value of the offsetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetReference(String value) {
        this.offsetReference = value;
    }

    /**
     * Gets the value of the offsetTimePlanned property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOffsetTimePlanned() {
        return offsetTimePlanned;
    }

    /**
     * Sets the value of the offsetTimePlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOffsetTimePlanned(Short value) {
        this.offsetTimePlanned = value;
    }

    /**
     * Gets the value of the offsetTimeCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOffsetTimeCurrent() {
        return offsetTimeCurrent;
    }

    /**
     * Sets the value of the offsetTimeCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOffsetTimeCurrent(Short value) {
        this.offsetTimeCurrent = value;
    }

    /**
     * Gets the value of the offsetTimePrevious property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOffsetTimePrevious() {
        return offsetTimePrevious;
    }

    /**
     * Sets the value of the offsetTimePrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOffsetTimePrevious(Short value) {
        this.offsetTimePrevious = value;
    }

    /**
     * Gets the value of the controllerTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getControllerTimestamp() {
        return controllerTimestamp;
    }

    /**
     * Sets the value of the controllerTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setControllerTimestamp(DateTimeZone value) {
        this.controllerTimestamp = value;
    }

    /**
     * Gets the value of the phaseSplitList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalStatus.PhaseSplitList }
     *     
     */
    public IntersectionSignalStatus.PhaseSplitList getPhaseSplitList() {
        return phaseSplitList;
    }

    /**
     * Sets the value of the phaseSplitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalStatus.PhaseSplitList }
     *     
     */
    public void setPhaseSplitList(IntersectionSignalStatus.PhaseSplitList value) {
        this.phaseSplitList = value;
    }

    /**
     * Gets the value of the ringStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalStatus.RingStatusList }
     *     
     */
    public IntersectionSignalStatus.RingStatusList getRingStatusList() {
        return ringStatusList;
    }

    /**
     * Sets the value of the ringStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalStatus.RingStatusList }
     *     
     */
    public void setRingStatusList(IntersectionSignalStatus.RingStatusList value) {
        this.ringStatusList = value;
    }

    /**
     * Gets the value of the phaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalStatus.PhaseStatus }
     *     
     */
    public IntersectionSignalStatus.PhaseStatus getPhaseStatus() {
        return phaseStatus;
    }

    /**
     * Sets the value of the phaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalStatus.PhaseStatus }
     *     
     */
    public void setPhaseStatus(IntersectionSignalStatus.PhaseStatus value) {
        this.phaseStatus = value;
    }

    /**
     * Gets the value of the overlapStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalStatus.OverlapStatus }
     *     
     */
    public IntersectionSignalStatus.OverlapStatus getOverlapStatus() {
        return overlapStatus;
    }

    /**
     * Sets the value of the overlapStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalStatus.OverlapStatus }
     *     
     */
    public void setOverlapStatus(IntersectionSignalStatus.OverlapStatus value) {
        this.overlapStatus = value;
    }

    /**
     * Gets the value of the activeSpecialFunctionsList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalStatus.ActiveSpecialFunctionsList }
     *     
     */
    public IntersectionSignalStatus.ActiveSpecialFunctionsList getActiveSpecialFunctionsList() {
        return activeSpecialFunctionsList;
    }

    /**
     * Sets the value of the activeSpecialFunctionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalStatus.ActiveSpecialFunctionsList }
     *     
     */
    public void setActiveSpecialFunctionsList(IntersectionSignalStatus.ActiveSpecialFunctionsList value) {
        this.activeSpecialFunctionsList = value;
    }

    /**
     * Gets the value of the preemptPriorityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreemptPriorityDescription() {
        return preemptPriorityDescription;
    }

    /**
     * Sets the value of the preemptPriorityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreemptPriorityDescription(String value) {
        this.preemptPriorityDescription = value;
    }

    /**
     * Gets the value of the operationAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationAgency() {
        return operationAgency;
    }

    /**
     * Sets the value of the operationAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationAgency(String value) {
        this.operationAgency = value;
    }

    /**
     * Gets the value of the maintenanceAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceAgency() {
        return maintenanceAgency;
    }

    /**
     * Sets the value of the maintenanceAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceAgency(String value) {
        this.maintenanceAgency = value;
    }

    /**
     * Gets the value of the operationAlterationAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationAlterationAuthorization() {
        return operationAlterationAuthorization;
    }

    /**
     * Sets the value of the operationAlterationAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationAlterationAuthorization(String value) {
        this.operationAlterationAuthorization = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="8"&gt;
     *         &lt;element name="special-functions" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specialFunctions"
    })
    public static class ActiveSpecialFunctionsList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "special-functions", required = true)
        protected List<String> specialFunctions;

        /**
         * Gets the value of the specialFunctions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialFunctions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialFunctions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSpecialFunctions() {
            if (specialFunctions == null) {
                specialFunctions = new ArrayList<String>();
            }
            return this.specialFunctions;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="2"&gt;
     *         &lt;element name="overlap-status-group" type="{http://www.tmdd.org/303/messages}IntersectionSignalOverlapStatusGroup"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "overlapStatusGroup"
    })
    public static class OverlapStatus
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "overlap-status-group", required = true)
        protected List<IntersectionSignalOverlapStatusGroup> overlapStatusGroup;

        /**
         * Gets the value of the overlapStatusGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the overlapStatusGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOverlapStatusGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalOverlapStatusGroup }
         * 
         * 
         */
        public List<IntersectionSignalOverlapStatusGroup> getOverlapStatusGroup() {
            if (overlapStatusGroup == null) {
                overlapStatusGroup = new ArrayList<IntersectionSignalOverlapStatusGroup>();
            }
            return this.overlapStatusGroup;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="40"&gt;
     *         &lt;element name="phase-split" type="{http://www.tmdd.org/303/messages}IntersectionSignalPhaseSplit"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phaseSplit"
    })
    public static class PhaseSplitList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "phase-split", required = true)
        protected List<IntersectionSignalPhaseSplit> phaseSplit;

        /**
         * Gets the value of the phaseSplit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phaseSplit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhaseSplit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalPhaseSplit }
         * 
         * 
         */
        public List<IntersectionSignalPhaseSplit> getPhaseSplit() {
            if (phaseSplit == null) {
                phaseSplit = new ArrayList<IntersectionSignalPhaseSplit>();
            }
            return this.phaseSplit;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="5"&gt;
     *         &lt;element name="phase-status-group" type="{http://www.tmdd.org/303/messages}IntersectionSignalPhaseStatusGroup"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phaseStatusGroup"
    })
    public static class PhaseStatus
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "phase-status-group", required = true)
        protected List<IntersectionSignalPhaseStatusGroup> phaseStatusGroup;

        /**
         * Gets the value of the phaseStatusGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phaseStatusGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhaseStatusGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalPhaseStatusGroup }
         * 
         * 
         */
        public List<IntersectionSignalPhaseStatusGroup> getPhaseStatusGroup() {
            if (phaseStatusGroup == null) {
                phaseStatusGroup = new ArrayList<IntersectionSignalPhaseStatusGroup>();
            }
            return this.phaseStatusGroup;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="8"&gt;
     *         &lt;element name="ring-status" type="{http://www.tmdd.org/303/messages}IntersectionSignalRingStatus"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ringStatus"
    })
    public static class RingStatusList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "ring-status", required = true)
        protected List<IntersectionSignalRingStatus> ringStatus;

        /**
         * Gets the value of the ringStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ringStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRingStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalRingStatus }
         * 
         * 
         */
        public List<IntersectionSignalRingStatus> getRingStatus() {
            if (ringStatus == null) {
                ringStatus = new ArrayList<IntersectionSignalRingStatus>();
            }
            return this.ringStatus;
        }

    }

}
