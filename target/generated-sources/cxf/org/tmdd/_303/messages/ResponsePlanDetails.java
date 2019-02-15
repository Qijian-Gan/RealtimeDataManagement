
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsePlan&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ResponsePlanDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response-plan-request-header" type="{http://www.tmdd.org/303/messages}ResponsePlanRequestHeader"/&gt;
 *         &lt;element name="response-plan-header" type="{http://www.tmdd.org/303/messages}ResponsePlanHeader"/&gt;
 *         &lt;element name="activity-start-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="activity-end-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="agency-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="agency" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="detour-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="detour" type="{http://www.tmdd.org/303/messages}RouteInventoryList"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ramp-metering-control-action-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="ramp-metering-control-action" type="{http://www.tmdd.org/303/messages}RampMeterControlRequest"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="intersection-control-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="intersection-control" type="{http://www.tmdd.org/303/messages}IntersectionSignalControlRequest"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dms-message-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="dms-message" type="{http://www.tmdd.org/303/messages}DMSControlRequest"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="har-message-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="har-message" type="{http://www.tmdd.org/303/messages}HARControlRequest"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="informational-message-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="informational-message" type="{http://www.tmdd.org/303/messages}InformationalMessage"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lcs-schedule-cancellation-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="lcs-schedule-cancellation" type="{http://www.tmdd.org/303/messages}DeviceCancelControlRequest"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="personnel-deployment-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="personnel-deployment" type="{http://www.tmdd.org/303/messages}ResponsePlanPersonnelDeployment"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="aggregate-approval-decision" type="{http://www.tmdd.org/303/messages}ResponsePlanAgencyApproval"/&gt;
 *         &lt;element name="agency-approval-decision-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="agency-approval" type="{http://www.tmdd.org/303/messages}ResponsePlanAgencyApproval"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="response-plan-implementation" type="{http://www.tmdd.org/303/messages}ResponsePlanImplementation" minOccurs="0"/&gt;
 *         &lt;element name="log-detail-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1024"&gt;
 *                   &lt;element name="response-plan-log-details" type="{http://www.tmdd.org/303/messages}ResponsePlanLogDetails"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "ResponsePlanDetails", propOrder = {
    "responsePlanRequestHeader",
    "responsePlanHeader",
    "activityStartTime",
    "activityEndTime",
    "agencyList",
    "detourList",
    "rampMeteringControlActionList",
    "intersectionControlList",
    "dmsMessageList",
    "harMessageList",
    "informationalMessageList",
    "lcsScheduleCancellationList",
    "personnelDeploymentList",
    "aggregateApprovalDecision",
    "agencyApprovalDecisionList",
    "responsePlanImplementation",
    "logDetailList",
    "any"
})
public class ResponsePlanDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "response-plan-request-header", required = true)
    protected ResponsePlanRequestHeader responsePlanRequestHeader;
    @XmlElement(name = "response-plan-header", required = true)
    protected ResponsePlanHeader responsePlanHeader;
    @XmlElement(name = "activity-start-time")
    protected DateTimeZone activityStartTime;
    @XmlElement(name = "activity-end-time")
    protected DateTimeZone activityEndTime;
    @XmlElement(name = "agency-list")
    protected ResponsePlanDetails.AgencyList agencyList;
    @XmlElement(name = "detour-list")
    protected ResponsePlanDetails.DetourList detourList;
    @XmlElement(name = "ramp-metering-control-action-list")
    protected ResponsePlanDetails.RampMeteringControlActionList rampMeteringControlActionList;
    @XmlElement(name = "intersection-control-list")
    protected ResponsePlanDetails.IntersectionControlList intersectionControlList;
    @XmlElement(name = "dms-message-list")
    protected ResponsePlanDetails.DmsMessageList dmsMessageList;
    @XmlElement(name = "har-message-list")
    protected ResponsePlanDetails.HarMessageList harMessageList;
    @XmlElement(name = "informational-message-list")
    protected ResponsePlanDetails.InformationalMessageList informationalMessageList;
    @XmlElement(name = "lcs-schedule-cancellation-list")
    protected ResponsePlanDetails.LcsScheduleCancellationList lcsScheduleCancellationList;
    @XmlElement(name = "personnel-deployment-list")
    protected ResponsePlanDetails.PersonnelDeploymentList personnelDeploymentList;
    @XmlElement(name = "aggregate-approval-decision", required = true)
    protected ResponsePlanAgencyApproval aggregateApprovalDecision;
    @XmlElement(name = "agency-approval-decision-list", required = true)
    protected ResponsePlanDetails.AgencyApprovalDecisionList agencyApprovalDecisionList;
    @XmlElement(name = "response-plan-implementation")
    protected ResponsePlanImplementation responsePlanImplementation;
    @XmlElement(name = "log-detail-list")
    protected ResponsePlanDetails.LogDetailList logDetailList;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the responsePlanRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanRequestHeader }
     *     
     */
    public ResponsePlanRequestHeader getResponsePlanRequestHeader() {
        return responsePlanRequestHeader;
    }

    /**
     * Sets the value of the responsePlanRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanRequestHeader }
     *     
     */
    public void setResponsePlanRequestHeader(ResponsePlanRequestHeader value) {
        this.responsePlanRequestHeader = value;
    }

    /**
     * Gets the value of the responsePlanHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanHeader }
     *     
     */
    public ResponsePlanHeader getResponsePlanHeader() {
        return responsePlanHeader;
    }

    /**
     * Sets the value of the responsePlanHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanHeader }
     *     
     */
    public void setResponsePlanHeader(ResponsePlanHeader value) {
        this.responsePlanHeader = value;
    }

    /**
     * Gets the value of the activityStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getActivityStartTime() {
        return activityStartTime;
    }

    /**
     * Sets the value of the activityStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setActivityStartTime(DateTimeZone value) {
        this.activityStartTime = value;
    }

    /**
     * Gets the value of the activityEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getActivityEndTime() {
        return activityEndTime;
    }

    /**
     * Sets the value of the activityEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setActivityEndTime(DateTimeZone value) {
        this.activityEndTime = value;
    }

    /**
     * Gets the value of the agencyList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.AgencyList }
     *     
     */
    public ResponsePlanDetails.AgencyList getAgencyList() {
        return agencyList;
    }

    /**
     * Sets the value of the agencyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.AgencyList }
     *     
     */
    public void setAgencyList(ResponsePlanDetails.AgencyList value) {
        this.agencyList = value;
    }

    /**
     * Gets the value of the detourList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.DetourList }
     *     
     */
    public ResponsePlanDetails.DetourList getDetourList() {
        return detourList;
    }

    /**
     * Sets the value of the detourList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.DetourList }
     *     
     */
    public void setDetourList(ResponsePlanDetails.DetourList value) {
        this.detourList = value;
    }

    /**
     * Gets the value of the rampMeteringControlActionList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.RampMeteringControlActionList }
     *     
     */
    public ResponsePlanDetails.RampMeteringControlActionList getRampMeteringControlActionList() {
        return rampMeteringControlActionList;
    }

    /**
     * Sets the value of the rampMeteringControlActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.RampMeteringControlActionList }
     *     
     */
    public void setRampMeteringControlActionList(ResponsePlanDetails.RampMeteringControlActionList value) {
        this.rampMeteringControlActionList = value;
    }

    /**
     * Gets the value of the intersectionControlList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.IntersectionControlList }
     *     
     */
    public ResponsePlanDetails.IntersectionControlList getIntersectionControlList() {
        return intersectionControlList;
    }

    /**
     * Sets the value of the intersectionControlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.IntersectionControlList }
     *     
     */
    public void setIntersectionControlList(ResponsePlanDetails.IntersectionControlList value) {
        this.intersectionControlList = value;
    }

    /**
     * Gets the value of the dmsMessageList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.DmsMessageList }
     *     
     */
    public ResponsePlanDetails.DmsMessageList getDmsMessageList() {
        return dmsMessageList;
    }

    /**
     * Sets the value of the dmsMessageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.DmsMessageList }
     *     
     */
    public void setDmsMessageList(ResponsePlanDetails.DmsMessageList value) {
        this.dmsMessageList = value;
    }

    /**
     * Gets the value of the harMessageList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.HarMessageList }
     *     
     */
    public ResponsePlanDetails.HarMessageList getHarMessageList() {
        return harMessageList;
    }

    /**
     * Sets the value of the harMessageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.HarMessageList }
     *     
     */
    public void setHarMessageList(ResponsePlanDetails.HarMessageList value) {
        this.harMessageList = value;
    }

    /**
     * Gets the value of the informationalMessageList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.InformationalMessageList }
     *     
     */
    public ResponsePlanDetails.InformationalMessageList getInformationalMessageList() {
        return informationalMessageList;
    }

    /**
     * Sets the value of the informationalMessageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.InformationalMessageList }
     *     
     */
    public void setInformationalMessageList(ResponsePlanDetails.InformationalMessageList value) {
        this.informationalMessageList = value;
    }

    /**
     * Gets the value of the lcsScheduleCancellationList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.LcsScheduleCancellationList }
     *     
     */
    public ResponsePlanDetails.LcsScheduleCancellationList getLcsScheduleCancellationList() {
        return lcsScheduleCancellationList;
    }

    /**
     * Sets the value of the lcsScheduleCancellationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.LcsScheduleCancellationList }
     *     
     */
    public void setLcsScheduleCancellationList(ResponsePlanDetails.LcsScheduleCancellationList value) {
        this.lcsScheduleCancellationList = value;
    }

    /**
     * Gets the value of the personnelDeploymentList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.PersonnelDeploymentList }
     *     
     */
    public ResponsePlanDetails.PersonnelDeploymentList getPersonnelDeploymentList() {
        return personnelDeploymentList;
    }

    /**
     * Sets the value of the personnelDeploymentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.PersonnelDeploymentList }
     *     
     */
    public void setPersonnelDeploymentList(ResponsePlanDetails.PersonnelDeploymentList value) {
        this.personnelDeploymentList = value;
    }

    /**
     * Gets the value of the aggregateApprovalDecision property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanAgencyApproval }
     *     
     */
    public ResponsePlanAgencyApproval getAggregateApprovalDecision() {
        return aggregateApprovalDecision;
    }

    /**
     * Sets the value of the aggregateApprovalDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanAgencyApproval }
     *     
     */
    public void setAggregateApprovalDecision(ResponsePlanAgencyApproval value) {
        this.aggregateApprovalDecision = value;
    }

    /**
     * Gets the value of the agencyApprovalDecisionList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.AgencyApprovalDecisionList }
     *     
     */
    public ResponsePlanDetails.AgencyApprovalDecisionList getAgencyApprovalDecisionList() {
        return agencyApprovalDecisionList;
    }

    /**
     * Sets the value of the agencyApprovalDecisionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.AgencyApprovalDecisionList }
     *     
     */
    public void setAgencyApprovalDecisionList(ResponsePlanDetails.AgencyApprovalDecisionList value) {
        this.agencyApprovalDecisionList = value;
    }

    /**
     * Gets the value of the responsePlanImplementation property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanImplementation }
     *     
     */
    public ResponsePlanImplementation getResponsePlanImplementation() {
        return responsePlanImplementation;
    }

    /**
     * Sets the value of the responsePlanImplementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanImplementation }
     *     
     */
    public void setResponsePlanImplementation(ResponsePlanImplementation value) {
        this.responsePlanImplementation = value;
    }

    /**
     * Gets the value of the logDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanDetails.LogDetailList }
     *     
     */
    public ResponsePlanDetails.LogDetailList getLogDetailList() {
        return logDetailList;
    }

    /**
     * Sets the value of the logDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanDetails.LogDetailList }
     *     
     */
    public void setLogDetailList(ResponsePlanDetails.LogDetailList value) {
        this.logDetailList = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="agency-approval" type="{http://www.tmdd.org/303/messages}ResponsePlanAgencyApproval"/&gt;
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
        "agencyApproval"
    })
    public static class AgencyApprovalDecisionList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "agency-approval", required = true)
        protected List<ResponsePlanAgencyApproval> agencyApproval;

        /**
         * Gets the value of the agencyApproval property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agencyApproval property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgencyApproval().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponsePlanAgencyApproval }
         * 
         * 
         */
        public List<ResponsePlanAgencyApproval> getAgencyApproval() {
            if (agencyApproval == null) {
                agencyApproval = new ArrayList<ResponsePlanAgencyApproval>();
            }
            return this.agencyApproval;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="agency" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
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
        "agency"
    })
    public static class AgencyList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<OrganizationInformation> agency;

        /**
         * Gets the value of the agency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationInformation }
         * 
         * 
         */
        public List<OrganizationInformation> getAgency() {
            if (agency == null) {
                agency = new ArrayList<OrganizationInformation>();
            }
            return this.agency;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="detour" type="{http://www.tmdd.org/303/messages}RouteInventoryList"/&gt;
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
        "detour"
    })
    public static class DetourList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<RouteInventoryList> detour;

        /**
         * Gets the value of the detour property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detour property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetour().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RouteInventoryList }
         * 
         * 
         */
        public List<RouteInventoryList> getDetour() {
            if (detour == null) {
                detour = new ArrayList<RouteInventoryList>();
            }
            return this.detour;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="dms-message" type="{http://www.tmdd.org/303/messages}DMSControlRequest"/&gt;
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
        "dmsMessage"
    })
    public static class DmsMessageList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "dms-message", required = true)
        protected List<DMSControlRequest> dmsMessage;

        /**
         * Gets the value of the dmsMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dmsMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDmsMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DMSControlRequest }
         * 
         * 
         */
        public List<DMSControlRequest> getDmsMessage() {
            if (dmsMessage == null) {
                dmsMessage = new ArrayList<DMSControlRequest>();
            }
            return this.dmsMessage;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="har-message" type="{http://www.tmdd.org/303/messages}HARControlRequest"/&gt;
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
        "harMessage"
    })
    public static class HarMessageList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "har-message", required = true)
        protected List<HARControlRequest> harMessage;

        /**
         * Gets the value of the harMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the harMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHarMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HARControlRequest }
         * 
         * 
         */
        public List<HARControlRequest> getHarMessage() {
            if (harMessage == null) {
                harMessage = new ArrayList<HARControlRequest>();
            }
            return this.harMessage;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="informational-message" type="{http://www.tmdd.org/303/messages}InformationalMessage"/&gt;
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
        "informationalMessage"
    })
    public static class InformationalMessageList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "informational-message", required = true)
        protected List<InformationalMessage> informationalMessage;

        /**
         * Gets the value of the informationalMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the informationalMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInformationalMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InformationalMessage }
         * 
         * 
         */
        public List<InformationalMessage> getInformationalMessage() {
            if (informationalMessage == null) {
                informationalMessage = new ArrayList<InformationalMessage>();
            }
            return this.informationalMessage;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="intersection-control" type="{http://www.tmdd.org/303/messages}IntersectionSignalControlRequest"/&gt;
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
        "intersectionControl"
    })
    public static class IntersectionControlList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "intersection-control", required = true)
        protected List<IntersectionSignalControlRequest> intersectionControl;

        /**
         * Gets the value of the intersectionControl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the intersectionControl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntersectionControl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalControlRequest }
         * 
         * 
         */
        public List<IntersectionSignalControlRequest> getIntersectionControl() {
            if (intersectionControl == null) {
                intersectionControl = new ArrayList<IntersectionSignalControlRequest>();
            }
            return this.intersectionControl;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="lcs-schedule-cancellation" type="{http://www.tmdd.org/303/messages}DeviceCancelControlRequest"/&gt;
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
        "lcsScheduleCancellation"
    })
    public static class LcsScheduleCancellationList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "lcs-schedule-cancellation", required = true)
        protected List<DeviceCancelControlRequest> lcsScheduleCancellation;

        /**
         * Gets the value of the lcsScheduleCancellation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lcsScheduleCancellation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLcsScheduleCancellation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeviceCancelControlRequest }
         * 
         * 
         */
        public List<DeviceCancelControlRequest> getLcsScheduleCancellation() {
            if (lcsScheduleCancellation == null) {
                lcsScheduleCancellation = new ArrayList<DeviceCancelControlRequest>();
            }
            return this.lcsScheduleCancellation;
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
     *       &lt;sequence maxOccurs="1024"&gt;
     *         &lt;element name="response-plan-log-details" type="{http://www.tmdd.org/303/messages}ResponsePlanLogDetails"/&gt;
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
        "responsePlanLogDetails"
    })
    public static class LogDetailList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "response-plan-log-details", required = true)
        protected List<ResponsePlanLogDetails> responsePlanLogDetails;

        /**
         * Gets the value of the responsePlanLogDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responsePlanLogDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponsePlanLogDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponsePlanLogDetails }
         * 
         * 
         */
        public List<ResponsePlanLogDetails> getResponsePlanLogDetails() {
            if (responsePlanLogDetails == null) {
                responsePlanLogDetails = new ArrayList<ResponsePlanLogDetails>();
            }
            return this.responsePlanLogDetails;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="personnel-deployment" type="{http://www.tmdd.org/303/messages}ResponsePlanPersonnelDeployment"/&gt;
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
        "personnelDeployment"
    })
    public static class PersonnelDeploymentList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "personnel-deployment", required = true)
        protected List<ResponsePlanPersonnelDeployment> personnelDeployment;

        /**
         * Gets the value of the personnelDeployment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the personnelDeployment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersonnelDeployment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponsePlanPersonnelDeployment }
         * 
         * 
         */
        public List<ResponsePlanPersonnelDeployment> getPersonnelDeployment() {
            if (personnelDeployment == null) {
                personnelDeployment = new ArrayList<ResponsePlanPersonnelDeployment>();
            }
            return this.personnelDeployment;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="ramp-metering-control-action" type="{http://www.tmdd.org/303/messages}RampMeterControlRequest"/&gt;
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
        "rampMeteringControlAction"
    })
    public static class RampMeteringControlActionList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "ramp-metering-control-action", required = true)
        protected List<RampMeterControlRequest> rampMeteringControlAction;

        /**
         * Gets the value of the rampMeteringControlAction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rampMeteringControlAction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRampMeteringControlAction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RampMeterControlRequest }
         * 
         * 
         */
        public List<RampMeterControlRequest> getRampMeteringControlAction() {
            if (rampMeteringControlAction == null) {
                rampMeteringControlAction = new ArrayList<RampMeterControlRequest>();
            }
            return this.rampMeteringControlAction;
        }

    }

}
