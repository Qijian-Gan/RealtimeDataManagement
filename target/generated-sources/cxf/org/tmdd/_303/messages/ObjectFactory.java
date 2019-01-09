
package org.tmdd._303.messages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmdd._303.messages package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArchivedDataProcessingDocumentationMetadataRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "archivedDataProcessingDocumentationMetadataRequestMsg");
    private final static QName _ArchivedDataTrafficMonitoringMetadataRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "archivedDataTrafficMonitoringMetadataRequestMsg");
    private final static QName _CCTVControlRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "cCTVControlRequestMsg");
    private final static QName _CCTVInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "cCTVInventoryMsg");
    private final static QName _CCTVStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "cCTVStatusMsg");
    private final static QName _CenterActiveVerificationRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "centerActiveVerificationRequestMsg");
    private final static QName _CenterActiveVerificationResponseMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "centerActiveVerificationResponseMsg");
    private final static QName _ErrorReportMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "errorReportMsg");
    private final static QName _DetectorDataMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "detectorDataMsg");
    private final static QName _DetectorDataRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "detectorDataRequestMsg");
    private final static QName _DetectorInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "detectorInventoryMsg");
    private final static QName _DetectorMaintenanceHistoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "detectorMaintenanceHistoryRequestMsg");
    private final static QName _DetectorStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "detectorStatusMsg");
    private final static QName _DeviceCancelControlRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "deviceCancelControlRequestMsg");
    private final static QName _DeviceControlResponseMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "deviceControlResponseMsg");
    private final static QName _DeviceControlStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "deviceControlStatusRequestMsg");
    private final static QName _DeviceInformationRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "deviceInformationRequestMsg");
    private final static QName _CCTVInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "cCTVInventoryRequestMsg");
    private final static QName _CCTVStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "cCTVStatusRequestMsg");
    private final static QName _DetectorInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "detectorInventoryRequestMsg");
    private final static QName _DetectorStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "detectorStatusRequestMsg");
    private final static QName _DMSInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSInventoryRequestMsg");
    private final static QName _DMSStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSStatusRequestMsg");
    private final static QName _ESSInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eSSInventoryRequestMsg");
    private final static QName _ESSStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eSSStatusRequestMsg");
    private final static QName _ESSObservationMetadataRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eSSObservationMetadataRequestMsg");
    private final static QName _ESSObservationReportRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eSSObservationReportRequestMsg");
    private final static QName _GateInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "gateInventoryRequestMsg");
    private final static QName _GateStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "gateStatusRequestMsg");
    private final static QName _GateControlScheduleRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "gateControlScheduleRequestMsg");
    private final static QName _HARInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "hARInventoryRequestMsg");
    private final static QName _HARMessageInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "hARMessageInventoryRequestMsg");
    private final static QName _HARStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "hARStatusRequestMsg");
    private final static QName _HARControlScheduleRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "hARControlScheduleRequestMsg");
    private final static QName _IntersectionSignalInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalInventoryRequestMsg");
    private final static QName _IntersectionSignalStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalStatusRequestMsg");
    private final static QName _IntersectionSignalControlScheduleRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalControlScheduleRequestMsg");
    private final static QName _CSStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "cSStatusRequestMsg");
    private final static QName _CSControlScheduleRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "cSControlScheduleRequestMsg");
    private final static QName _RampMeterInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "rampMeterInventoryRequestMsg");
    private final static QName _RampMeterStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "rampMeterStatusRequestMsg");
    private final static QName _RampMeterControlScheduleRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "rampMeterControlScheduleRequestMsg");
    private final static QName _SectionStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionStatusRequestMsg");
    private final static QName _SectionControlScheduleRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionControlScheduleRequestMsg");
    private final static QName _VideoSwitchInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "videoSwitchInventoryRequestMsg");
    private final static QName _VideoSwitchStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "videoSwitchStatusRequestMsg");
    private final static QName _CSInventoryRequest_QNAME = new QName("http://www.tmdd.org/303/messages", "cSInventoryRequest");
    private final static QName _DevicePriorityQueueRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "devicePriorityQueueRequestMsg");
    private final static QName _DMSPriorityQueueRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSPriorityQueueRequestMsg");
    private final static QName _HARPriorityQueueRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "hARPriorityQueueRequestMsg");
    private final static QName _IntersectionSignalPriorityQueueRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalPriorityQueueRequestMsg");
    private final static QName _RampMeterPriorityQueueRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "rampMeterPriorityQueueRequestMsg");
    private final static QName _SectionPriorityQueueRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionPriorityQueueRequestMsg");
    private final static QName _DMSControlRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSControlRequestMsg");
    private final static QName _DMSFontTableRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSFontTableRequestMsg");
    private final static QName _DMSInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSInventoryMsg");
    private final static QName _DMSMessageAppearanceMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSMessageAppearanceMsg");
    private final static QName _DMSMessageAppearanceRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSMessageAppearanceRequestMsg");
    private final static QName _DMSMessageInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSMessageInventoryMsg");
    private final static QName _DMSMessageInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSMessageInventoryRequestMsg");
    private final static QName _DMSStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "dMSStatusMsg");
    private final static QName _ESSInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eSSInventoryMsg");
    private final static QName _ESSObservationReportMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eSSObservationReportMsg");
    private final static QName _ESSStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eSSStatusMsg");
    private final static QName _ActionLogMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "actionLogMsg");
    private final static QName _EventIndexMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eventIndexMsg");
    private final static QName _EventRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eventRequestMsg");
    private final static QName _FullEventUpdateRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "fullEventUpdateRequestMsg");
    private final static QName _EventIndexRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eventIndexRequestMsg");
    private final static QName _ActionLogRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "actionLogRequestMsg");
    private final static QName _FEUMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "fEUMsg");
    private final static QName _GateControlRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "gateControlRequestMsg");
    private final static QName _GateControlScheduleMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "gateControlScheduleMsg");
    private final static QName _GateInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "gateInventoryMsg");
    private final static QName _GateStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "gateStatusMsg");
    private final static QName _HARControlRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "hARControlRequestMsg");
    private final static QName _HARControlScheduleMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "hARControlScheduleMsg");
    private final static QName _HARInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "hARInventoryMsg");
    private final static QName _HARMessageInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "hARMessageInventoryMsg");
    private final static QName _HARStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "hARStatusMsg");
    private final static QName _IntersectionSignalControlRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalControlRequestMsg");
    private final static QName _IntersectionSignalControlResponseMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalControlResponseMsg");
    private final static QName _IntersectionSignalControlScheduleMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalControlScheduleMsg");
    private final static QName _IntersectionSignalInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalInventoryMsg");
    private final static QName _IntersectionSignalStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalStatusMsg");
    private final static QName _IntersectionSignalTimingPatternInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalTimingPatternInventoryMsg");
    private final static QName _IntersectionSignalTimingPatternInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "intersectionSignalTimingPatternInventoryRequestMsg");
    private final static QName _LCSControlRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "lCSControlRequestMsg");
    private final static QName _LCSControlScheduleMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "lCSControlScheduleMsg");
    private final static QName _LCSInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "lCSInventoryMsg");
    private final static QName _LCSStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "lCSStatusMsg");
    private final static QName _LinkInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "linkInventoryMsg");
    private final static QName _LinkStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "linkStatusMsg");
    private final static QName _NodeInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "nodeInventoryMsg");
    private final static QName _NodeStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "nodeStatusMsg");
    private final static QName _OrganizationInformationMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "organizationInformationMsg");
    private final static QName _OrganizationInformationRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "organizationInformationRequestMsg");
    private final static QName _RampMeterControlRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "rampMeterControlRequestMsg");
    private final static QName _RampMeterControlScheduleMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "rampMeterControlScheduleMsg");
    private final static QName _RampMeterInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "rampMeterInventoryMsg");
    private final static QName _RampMeterPlanInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "rampMeterPlanInventoryMsg");
    private final static QName _RampMeterStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "rampMeterStatusMsg");
    private final static QName _ResponsePlanApprovalRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "responsePlanApprovalRequestMsg");
    private final static QName _ResponsePlanApprovalMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "responsePlanApprovalMsg");
    private final static QName _ResponsePlanLogRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "responsePlanLogRequestMsg");
    private final static QName _ResponsePlanLogMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "responsePlanLogMsg");
    private final static QName _ResponsePlanStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "responsePlanStatusRequestMsg");
    private final static QName _ResponsePlanStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "responsePlanStatusMsg");
    private final static QName _ResponsePlanRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "responsePlanRequestMsg");
    private final static QName _ResponsePlanMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "responsePlanMsg");
    private final static QName _ResponsePlanTerminationRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "responsePlanTerminationRequestMsg");
    private final static QName _ResponsePlanTerminationMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "responsePlanTerminationMsg");
    private final static QName _RouteInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "routeInventoryMsg");
    private final static QName _RouteStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "routeStatusMsg");
    private final static QName _SectionControlRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionControlRequestMsg");
    private final static QName _SectionControlResponseMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionControlResponseMsg");
    private final static QName _SectionControlScheduleMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionControlScheduleMsg");
    private final static QName _SectionControlStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionControlStatusRequestMsg");
    private final static QName _SectionPriorityQueueMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionPriorityQueueMsg");
    private final static QName _SectionStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionStatusMsg");
    private final static QName _SectionSignalTimingPatternInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionSignalTimingPatternInventoryMsg");
    private final static QName _SectionSignalTimingPatternInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "sectionSignalTimingPatternInventoryRequestMsg");
    private final static QName _TrafficNetworkInformationRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "trafficNetworkInformationRequestMsg");
    private final static QName _LinkInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "linkInventoryRequestMsg");
    private final static QName _LinkStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "linkStatusRequestMsg");
    private final static QName _NodeInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "nodeInventoryRequestMsg");
    private final static QName _NodeStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "nodeStatusRequestMsg");
    private final static QName _RouteInventoryRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "routeInventoryRequestMsg");
    private final static QName _RouteStatusRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "routeStatusRequestMsg");
    private final static QName _VideoSwitchControlRequestMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "videoSwitchControlRequestMsg");
    private final static QName _VideoSwitchInventoryMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "videoSwitchInventoryMsg");
    private final static QName _VideoSwitchStatusMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "videoSwitchStatusMsg");
    private final static QName _DetectorDataSubscriptionMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "detectorDataSubscriptionMsg");
    private final static QName _DeviceInformationSubscriptionMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "deviceInformationSubscriptionMsg");
    private final static QName _FullEventUpdateSubscriptionMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "fullEventUpdateSubscriptionMsg");
    private final static QName _EventIndexSubscriptionMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "eventIndexSubscriptionMsg");
    private final static QName _ActionLogSubscriptionMsg_QNAME = new QName("http://www.tmdd.org/303/messages", "actionLogSubscriptionMsg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmdd._303.messages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VideoSwitchInventory }
     * 
     */
    public VideoSwitchInventory createVideoSwitchInventory() {
        return new VideoSwitchInventory();
    }

    /**
     * Create an instance of {@link VideoSwitchDeviceStatus }
     * 
     */
    public VideoSwitchDeviceStatus createVideoSwitchDeviceStatus() {
        return new VideoSwitchDeviceStatus();
    }

    /**
     * Create an instance of {@link SectionSignalTimingPatternInventory }
     * 
     */
    public SectionSignalTimingPatternInventory createSectionSignalTimingPatternInventory() {
        return new SectionSignalTimingPatternInventory();
    }

    /**
     * Create an instance of {@link SectionTimingPatternInventory }
     * 
     */
    public SectionTimingPatternInventory createSectionTimingPatternInventory() {
        return new SectionTimingPatternInventory();
    }

    /**
     * Create an instance of {@link SectionStatus }
     * 
     */
    public SectionStatus createSectionStatus() {
        return new SectionStatus();
    }

    /**
     * Create an instance of {@link SectionControlSchedule }
     * 
     */
    public SectionControlSchedule createSectionControlSchedule() {
        return new SectionControlSchedule();
    }

    /**
     * Create an instance of {@link RouteStatus }
     * 
     */
    public RouteStatus createRouteStatus() {
        return new RouteStatus();
    }

    /**
     * Create an instance of {@link org.tmdd._303.messages.RouteInventoryList }
     * 
     */
    public org.tmdd._303.messages.RouteInventoryList createRouteInventoryList() {
        return new org.tmdd._303.messages.RouteInventoryList();
    }

    /**
     * Create an instance of {@link RouteInventory }
     * 
     */
    public RouteInventory createRouteInventory() {
        return new RouteInventory();
    }

    /**
     * Create an instance of {@link ResponsePlanLog }
     * 
     */
    public ResponsePlanLog createResponsePlanLog() {
        return new ResponsePlanLog();
    }

    /**
     * Create an instance of {@link IncidentResponse }
     * 
     */
    public IncidentResponse createIncidentResponse() {
        return new IncidentResponse();
    }

    /**
     * Create an instance of {@link ResponsePlanStatus }
     * 
     */
    public ResponsePlanStatus createResponsePlanStatus() {
        return new ResponsePlanStatus();
    }

    /**
     * Create an instance of {@link ResponsePlanApproval }
     * 
     */
    public ResponsePlanApproval createResponsePlanApproval() {
        return new ResponsePlanApproval();
    }

    /**
     * Create an instance of {@link ResponsePlanRequestFilter }
     * 
     */
    public ResponsePlanRequestFilter createResponsePlanRequestFilter() {
        return new ResponsePlanRequestFilter();
    }

    /**
     * Create an instance of {@link EvaluationCycleDetails }
     * 
     */
    public EvaluationCycleDetails createEvaluationCycleDetails() {
        return new EvaluationCycleDetails();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails }
     * 
     */
    public ResponsePlanDetails createResponsePlanDetails() {
        return new ResponsePlanDetails();
    }

    /**
     * Create an instance of {@link RampMeterStatus }
     * 
     */
    public RampMeterStatus createRampMeterStatus() {
        return new RampMeterStatus();
    }

    /**
     * Create an instance of {@link RampMeterInventoryDetails }
     * 
     */
    public RampMeterInventoryDetails createRampMeterInventoryDetails() {
        return new RampMeterInventoryDetails();
    }

    /**
     * Create an instance of {@link RampMeterInventory }
     * 
     */
    public RampMeterInventory createRampMeterInventory() {
        return new RampMeterInventory();
    }

    /**
     * Create an instance of {@link OrganizationInformation }
     * 
     */
    public OrganizationInformation createOrganizationInformation() {
        return new OrganizationInformation();
    }

    /**
     * Create an instance of {@link NodeStatus }
     * 
     */
    public NodeStatus createNodeStatus() {
        return new NodeStatus();
    }

    /**
     * Create an instance of {@link NodeInventory }
     * 
     */
    public NodeInventory createNodeInventory() {
        return new NodeInventory();
    }

    /**
     * Create an instance of {@link org.tmdd._303.messages.LinkStatusList }
     * 
     */
    public org.tmdd._303.messages.LinkStatusList createLinkStatusList() {
        return new org.tmdd._303.messages.LinkStatusList();
    }

    /**
     * Create an instance of {@link LinkStatus }
     * 
     */
    public LinkStatus createLinkStatus() {
        return new LinkStatus();
    }

    /**
     * Create an instance of {@link LinkInventory }
     * 
     */
    public LinkInventory createLinkInventory() {
        return new LinkInventory();
    }

    /**
     * Create an instance of {@link IntersectionSignalTimingPatternInventory }
     * 
     */
    public IntersectionSignalTimingPatternInventory createIntersectionSignalTimingPatternInventory() {
        return new IntersectionSignalTimingPatternInventory();
    }

    /**
     * Create an instance of {@link IntersectionSignalStatus }
     * 
     */
    public IntersectionSignalStatus createIntersectionSignalStatus() {
        return new IntersectionSignalStatus();
    }

    /**
     * Create an instance of {@link IntersectionSignalSequenceData }
     * 
     */
    public IntersectionSignalSequenceData createIntersectionSignalSequenceData() {
        return new IntersectionSignalSequenceData();
    }

    /**
     * Create an instance of {@link IntersectionSignalRing }
     * 
     */
    public IntersectionSignalRing createIntersectionSignalRing() {
        return new IntersectionSignalRing();
    }

    /**
     * Create an instance of {@link IntersectionSignalOverlapPhase }
     * 
     */
    public IntersectionSignalOverlapPhase createIntersectionSignalOverlapPhase() {
        return new IntersectionSignalOverlapPhase();
    }

    /**
     * Create an instance of {@link IntersectionSignalMovement }
     * 
     */
    public IntersectionSignalMovement createIntersectionSignalMovement() {
        return new IntersectionSignalMovement();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventoryPhase }
     * 
     */
    public IntersectionSignalInventoryPhase createIntersectionSignalInventoryPhase() {
        return new IntersectionSignalInventoryPhase();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventory }
     * 
     */
    public IntersectionSignalInventory createIntersectionSignalInventory() {
        return new IntersectionSignalInventory();
    }

    /**
     * Create an instance of {@link ValidPeriod }
     * 
     */
    public ValidPeriod createValidPeriod() {
        return new ValidPeriod();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link RequestLocation }
     * 
     */
    public RequestLocation createRequestLocation() {
        return new RequestLocation();
    }

    /**
     * Create an instance of {@link RequestHeader }
     * 
     */
    public RequestHeader createRequestHeader() {
        return new RequestHeader();
    }

    /**
     * Create an instance of {@link RequestFilter }
     * 
     */
    public RequestFilter createRequestFilter() {
        return new RequestFilter();
    }

    /**
     * Create an instance of {@link RecurrentTime }
     * 
     */
    public RecurrentTime createRecurrentTime() {
        return new RecurrentTime();
    }

    /**
     * Create an instance of {@link PointOnLink }
     * 
     */
    public PointOnLink createPointOnLink() {
        return new PointOnLink();
    }

    /**
     * Create an instance of {@link MessageHeader }
     * 
     */
    public MessageHeader createMessageHeader() {
        return new MessageHeader();
    }

    /**
     * Create an instance of {@link LinkLocation }
     * 
     */
    public LinkLocation createLinkLocation() {
        return new LinkLocation();
    }

    /**
     * Create an instance of {@link FullEventUpdate }
     * 
     */
    public FullEventUpdate createFullEventUpdate() {
        return new FullEventUpdate();
    }

    /**
     * Create an instance of {@link EventTimes }
     * 
     */
    public EventTimes createEventTimes() {
        return new EventTimes();
    }

    /**
     * Create an instance of {@link EventLane }
     * 
     */
    public EventLane createEventLane() {
        return new EventLane();
    }

    /**
     * Create an instance of {@link EventElementDetail }
     * 
     */
    public EventElementDetail createEventElementDetail() {
        return new EventElementDetail();
    }

    /**
     * Create an instance of {@link AlternateRouteDetail }
     * 
     */
    public AlternateRouteDetail createAlternateRouteDetail() {
        return new AlternateRouteDetail();
    }

    /**
     * Create an instance of {@link ESSStatus }
     * 
     */
    public ESSStatus createESSStatus() {
        return new ESSStatus();
    }

    /**
     * Create an instance of {@link ESSObservationReport }
     * 
     */
    public ESSObservationReport createESSObservationReport() {
        return new ESSObservationReport();
    }

    /**
     * Create an instance of {@link ESSInventory }
     * 
     */
    public ESSInventory createESSInventory() {
        return new ESSInventory();
    }

    /**
     * Create an instance of {@link DevicePriorityQueueHeader }
     * 
     */
    public DevicePriorityQueueHeader createDevicePriorityQueueHeader() {
        return new DevicePriorityQueueHeader();
    }

    /**
     * Create an instance of {@link DeviceInformationRequestFilter }
     * 
     */
    public DeviceInformationRequestFilter createDeviceInformationRequestFilter() {
        return new DeviceInformationRequestFilter();
    }

    /**
     * Create an instance of {@link DetectorStatus }
     * 
     */
    public DetectorStatus createDetectorStatus() {
        return new DetectorStatus();
    }

    /**
     * Create an instance of {@link DetectorInventoryDetails }
     * 
     */
    public DetectorInventoryDetails createDetectorInventoryDetails() {
        return new DetectorInventoryDetails();
    }

    /**
     * Create an instance of {@link DetectorInventory }
     * 
     */
    public DetectorInventory createDetectorInventory() {
        return new DetectorInventory();
    }

    /**
     * Create an instance of {@link DetectorData }
     * 
     */
    public DetectorData createDetectorData() {
        return new DetectorData();
    }

    /**
     * Create an instance of {@link CCTVStatus }
     * 
     */
    public CCTVStatus createCCTVStatus() {
        return new CCTVStatus();
    }

    /**
     * Create an instance of {@link CCTVInventory }
     * 
     */
    public CCTVInventory createCCTVInventory() {
        return new CCTVInventory();
    }

    /**
     * Create an instance of {@link TrafficNetworkInformationRequest }
     * 
     */
    public TrafficNetworkInformationRequest createTrafficNetworkInformationRequest() {
        return new TrafficNetworkInformationRequest();
    }

    /**
     * Create an instance of {@link ResponsePlanTerminationRequest }
     * 
     */
    public ResponsePlanTerminationRequest createResponsePlanTerminationRequest() {
        return new ResponsePlanTerminationRequest();
    }

    /**
     * Create an instance of {@link RampMeterControlRequest }
     * 
     */
    public RampMeterControlRequest createRampMeterControlRequest() {
        return new RampMeterControlRequest();
    }

    /**
     * Create an instance of {@link OrganizationInformationRequest }
     * 
     */
    public OrganizationInformationRequest createOrganizationInformationRequest() {
        return new OrganizationInformationRequest();
    }

    /**
     * Create an instance of {@link EventFilterRequest }
     * 
     */
    public EventFilterRequest createEventFilterRequest() {
        return new EventFilterRequest();
    }

    /**
     * Create an instance of {@link ESSObservationMetadata }
     * 
     */
    public ESSObservationMetadata createESSObservationMetadata() {
        return new ESSObservationMetadata();
    }

    /**
     * Create an instance of {@link DMSFontTable }
     * 
     */
    public DMSFontTable createDMSFontTable() {
        return new DMSFontTable();
    }

    /**
     * Create an instance of {@link DevicePriorityQueueRequest }
     * 
     */
    public DevicePriorityQueueRequest createDevicePriorityQueueRequest() {
        return new DevicePriorityQueueRequest();
    }

    /**
     * Create an instance of {@link DetectorMaintenanceHistory }
     * 
     */
    public DetectorMaintenanceHistory createDetectorMaintenanceHistory() {
        return new DetectorMaintenanceHistory();
    }

    /**
     * Create an instance of {@link ArchivedDataTrafficMonitoringMetadata }
     * 
     */
    public ArchivedDataTrafficMonitoringMetadata createArchivedDataTrafficMonitoringMetadata() {
        return new ArchivedDataTrafficMonitoringMetadata();
    }

    /**
     * Create an instance of {@link ArchivedDataProcessingDocumentationMetadataMsg }
     * 
     */
    public ArchivedDataProcessingDocumentationMetadataMsg createArchivedDataProcessingDocumentationMetadataMsg() {
        return new ArchivedDataProcessingDocumentationMetadataMsg();
    }

    /**
     * Create an instance of {@link ArchivedDataProcessingDocumentationMetadata }
     * 
     */
    public ArchivedDataProcessingDocumentationMetadata createArchivedDataProcessingDocumentationMetadata() {
        return new ArchivedDataProcessingDocumentationMetadata();
    }

    /**
     * Create an instance of {@link ArchivedDataProcessingDocumentationMetadataRequest }
     * 
     */
    public ArchivedDataProcessingDocumentationMetadataRequest createArchivedDataProcessingDocumentationMetadataRequest() {
        return new ArchivedDataProcessingDocumentationMetadataRequest();
    }

    /**
     * Create an instance of {@link ArchivedDataTrafficMonitoringMetadataMsg }
     * 
     */
    public ArchivedDataTrafficMonitoringMetadataMsg createArchivedDataTrafficMonitoringMetadataMsg() {
        return new ArchivedDataTrafficMonitoringMetadataMsg();
    }

    /**
     * Create an instance of {@link ArchivedDataTrafficMonitoringMetadataRequest }
     * 
     */
    public ArchivedDataTrafficMonitoringMetadataRequest createArchivedDataTrafficMonitoringMetadataRequest() {
        return new ArchivedDataTrafficMonitoringMetadataRequest();
    }

    /**
     * Create an instance of {@link CCTVControlRequest }
     * 
     */
    public CCTVControlRequest createCCTVControlRequest() {
        return new CCTVControlRequest();
    }

    /**
     * Create an instance of {@link CCTVInventoryMsg }
     * 
     */
    public CCTVInventoryMsg createCCTVInventoryMsg() {
        return new CCTVInventoryMsg();
    }

    /**
     * Create an instance of {@link CCTVStatusMsg }
     * 
     */
    public CCTVStatusMsg createCCTVStatusMsg() {
        return new CCTVStatusMsg();
    }

    /**
     * Create an instance of {@link CenterActiveVerificationRequest }
     * 
     */
    public CenterActiveVerificationRequest createCenterActiveVerificationRequest() {
        return new CenterActiveVerificationRequest();
    }

    /**
     * Create an instance of {@link CenterActiveVerificationResponse }
     * 
     */
    public CenterActiveVerificationResponse createCenterActiveVerificationResponse() {
        return new CenterActiveVerificationResponse();
    }

    /**
     * Create an instance of {@link ErrorReport }
     * 
     */
    public ErrorReport createErrorReport() {
        return new ErrorReport();
    }

    /**
     * Create an instance of {@link DetectorDataMsg }
     * 
     */
    public DetectorDataMsg createDetectorDataMsg() {
        return new DetectorDataMsg();
    }

    /**
     * Create an instance of {@link DetectorDataRequest }
     * 
     */
    public DetectorDataRequest createDetectorDataRequest() {
        return new DetectorDataRequest();
    }

    /**
     * Create an instance of {@link DetectorInventoryMsg }
     * 
     */
    public DetectorInventoryMsg createDetectorInventoryMsg() {
        return new DetectorInventoryMsg();
    }

    /**
     * Create an instance of {@link DetectorMaintenanceHistoryMsg }
     * 
     */
    public DetectorMaintenanceHistoryMsg createDetectorMaintenanceHistoryMsg() {
        return new DetectorMaintenanceHistoryMsg();
    }

    /**
     * Create an instance of {@link DetectorMaintenanceHistoryRequest }
     * 
     */
    public DetectorMaintenanceHistoryRequest createDetectorMaintenanceHistoryRequest() {
        return new DetectorMaintenanceHistoryRequest();
    }

    /**
     * Create an instance of {@link DetectorStatusMsg }
     * 
     */
    public DetectorStatusMsg createDetectorStatusMsg() {
        return new DetectorStatusMsg();
    }

    /**
     * Create an instance of {@link DeviceCancelControlRequest }
     * 
     */
    public DeviceCancelControlRequest createDeviceCancelControlRequest() {
        return new DeviceCancelControlRequest();
    }

    /**
     * Create an instance of {@link DeviceControlResponse }
     * 
     */
    public DeviceControlResponse createDeviceControlResponse() {
        return new DeviceControlResponse();
    }

    /**
     * Create an instance of {@link DeviceControlStatusRequest }
     * 
     */
    public DeviceControlStatusRequest createDeviceControlStatusRequest() {
        return new DeviceControlStatusRequest();
    }

    /**
     * Create an instance of {@link DeviceInformationRequest }
     * 
     */
    public DeviceInformationRequest createDeviceInformationRequest() {
        return new DeviceInformationRequest();
    }

    /**
     * Create an instance of {@link DMSControlRequest }
     * 
     */
    public DMSControlRequest createDMSControlRequest() {
        return new DMSControlRequest();
    }

    /**
     * Create an instance of {@link DMSFontTableMsg }
     * 
     */
    public DMSFontTableMsg createDMSFontTableMsg() {
        return new DMSFontTableMsg();
    }

    /**
     * Create an instance of {@link DMSFontTableRequest }
     * 
     */
    public DMSFontTableRequest createDMSFontTableRequest() {
        return new DMSFontTableRequest();
    }

    /**
     * Create an instance of {@link DMSInventoryMsg }
     * 
     */
    public DMSInventoryMsg createDMSInventoryMsg() {
        return new DMSInventoryMsg();
    }

    /**
     * Create an instance of {@link DMSMessageAppearance }
     * 
     */
    public DMSMessageAppearance createDMSMessageAppearance() {
        return new DMSMessageAppearance();
    }

    /**
     * Create an instance of {@link DMSMessageAppearanceRequest }
     * 
     */
    public DMSMessageAppearanceRequest createDMSMessageAppearanceRequest() {
        return new DMSMessageAppearanceRequest();
    }

    /**
     * Create an instance of {@link DMSMessageInventoryMsg }
     * 
     */
    public DMSMessageInventoryMsg createDMSMessageInventoryMsg() {
        return new DMSMessageInventoryMsg();
    }

    /**
     * Create an instance of {@link DMSMessageInventoryRequest }
     * 
     */
    public DMSMessageInventoryRequest createDMSMessageInventoryRequest() {
        return new DMSMessageInventoryRequest();
    }

    /**
     * Create an instance of {@link DMSPriorityQueueMsg }
     * 
     */
    public DMSPriorityQueueMsg createDMSPriorityQueueMsg() {
        return new DMSPriorityQueueMsg();
    }

    /**
     * Create an instance of {@link DMSPriorityQueue }
     * 
     */
    public DMSPriorityQueue createDMSPriorityQueue() {
        return new DMSPriorityQueue();
    }

    /**
     * Create an instance of {@link DMSStatusMsg }
     * 
     */
    public DMSStatusMsg createDMSStatusMsg() {
        return new DMSStatusMsg();
    }

    /**
     * Create an instance of {@link ESSInventoryMsg }
     * 
     */
    public ESSInventoryMsg createESSInventoryMsg() {
        return new ESSInventoryMsg();
    }

    /**
     * Create an instance of {@link ESSObservationMetadataMsg }
     * 
     */
    public ESSObservationMetadataMsg createESSObservationMetadataMsg() {
        return new ESSObservationMetadataMsg();
    }

    /**
     * Create an instance of {@link ESSObservationReportMsg }
     * 
     */
    public ESSObservationReportMsg createESSObservationReportMsg() {
        return new ESSObservationReportMsg();
    }

    /**
     * Create an instance of {@link ESSStatusMsg }
     * 
     */
    public ESSStatusMsg createESSStatusMsg() {
        return new ESSStatusMsg();
    }

    /**
     * Create an instance of {@link ActionLogMsg }
     * 
     */
    public ActionLogMsg createActionLogMsg() {
        return new ActionLogMsg();
    }

    /**
     * Create an instance of {@link EventIndexMsg }
     * 
     */
    public EventIndexMsg createEventIndexMsg() {
        return new EventIndexMsg();
    }

    /**
     * Create an instance of {@link FEUMsg }
     * 
     */
    public FEUMsg createFEUMsg() {
        return new FEUMsg();
    }

    /**
     * Create an instance of {@link GateControlRequest }
     * 
     */
    public GateControlRequest createGateControlRequest() {
        return new GateControlRequest();
    }

    /**
     * Create an instance of {@link GateControlScheduleMsg }
     * 
     */
    public GateControlScheduleMsg createGateControlScheduleMsg() {
        return new GateControlScheduleMsg();
    }

    /**
     * Create an instance of {@link GateInventoryMsg }
     * 
     */
    public GateInventoryMsg createGateInventoryMsg() {
        return new GateInventoryMsg();
    }

    /**
     * Create an instance of {@link GateStatusMsg }
     * 
     */
    public GateStatusMsg createGateStatusMsg() {
        return new GateStatusMsg();
    }

    /**
     * Create an instance of {@link HARControlRequest }
     * 
     */
    public HARControlRequest createHARControlRequest() {
        return new HARControlRequest();
    }

    /**
     * Create an instance of {@link HARControlScheduleMsg }
     * 
     */
    public HARControlScheduleMsg createHARControlScheduleMsg() {
        return new HARControlScheduleMsg();
    }

    /**
     * Create an instance of {@link HARInventoryMsg }
     * 
     */
    public HARInventoryMsg createHARInventoryMsg() {
        return new HARInventoryMsg();
    }

    /**
     * Create an instance of {@link HARMessageInventoryMsg }
     * 
     */
    public HARMessageInventoryMsg createHARMessageInventoryMsg() {
        return new HARMessageInventoryMsg();
    }

    /**
     * Create an instance of {@link HARPriorityQueueMsg }
     * 
     */
    public HARPriorityQueueMsg createHARPriorityQueueMsg() {
        return new HARPriorityQueueMsg();
    }

    /**
     * Create an instance of {@link HARPriorityQueue }
     * 
     */
    public HARPriorityQueue createHARPriorityQueue() {
        return new HARPriorityQueue();
    }

    /**
     * Create an instance of {@link HARStatusMsg }
     * 
     */
    public HARStatusMsg createHARStatusMsg() {
        return new HARStatusMsg();
    }

    /**
     * Create an instance of {@link IntersectionSignalControlRequest }
     * 
     */
    public IntersectionSignalControlRequest createIntersectionSignalControlRequest() {
        return new IntersectionSignalControlRequest();
    }

    /**
     * Create an instance of {@link IntersectionSignalControlResponse }
     * 
     */
    public IntersectionSignalControlResponse createIntersectionSignalControlResponse() {
        return new IntersectionSignalControlResponse();
    }

    /**
     * Create an instance of {@link IntersectionSignalControlScheduleMsg }
     * 
     */
    public IntersectionSignalControlScheduleMsg createIntersectionSignalControlScheduleMsg() {
        return new IntersectionSignalControlScheduleMsg();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventoryMsg }
     * 
     */
    public IntersectionSignalInventoryMsg createIntersectionSignalInventoryMsg() {
        return new IntersectionSignalInventoryMsg();
    }

    /**
     * Create an instance of {@link IntersectionSignalPriorityQueueMsg }
     * 
     */
    public IntersectionSignalPriorityQueueMsg createIntersectionSignalPriorityQueueMsg() {
        return new IntersectionSignalPriorityQueueMsg();
    }

    /**
     * Create an instance of {@link IntersectionSignalPriorityQueue }
     * 
     */
    public IntersectionSignalPriorityQueue createIntersectionSignalPriorityQueue() {
        return new IntersectionSignalPriorityQueue();
    }

    /**
     * Create an instance of {@link IntersectionSignalStatusMsg }
     * 
     */
    public IntersectionSignalStatusMsg createIntersectionSignalStatusMsg() {
        return new IntersectionSignalStatusMsg();
    }

    /**
     * Create an instance of {@link IntersectionSignalTimingPatternInventoryMsg }
     * 
     */
    public IntersectionSignalTimingPatternInventoryMsg createIntersectionSignalTimingPatternInventoryMsg() {
        return new IntersectionSignalTimingPatternInventoryMsg();
    }

    /**
     * Create an instance of {@link IntersectionSignalTimingPatternInventoryRequest }
     * 
     */
    public IntersectionSignalTimingPatternInventoryRequest createIntersectionSignalTimingPatternInventoryRequest() {
        return new IntersectionSignalTimingPatternInventoryRequest();
    }

    /**
     * Create an instance of {@link LCSControlRequest }
     * 
     */
    public LCSControlRequest createLCSControlRequest() {
        return new LCSControlRequest();
    }

    /**
     * Create an instance of {@link LCSControlScheduleMsg }
     * 
     */
    public LCSControlScheduleMsg createLCSControlScheduleMsg() {
        return new LCSControlScheduleMsg();
    }

    /**
     * Create an instance of {@link LCSInventoryMsg }
     * 
     */
    public LCSInventoryMsg createLCSInventoryMsg() {
        return new LCSInventoryMsg();
    }

    /**
     * Create an instance of {@link LCSStatusMsg }
     * 
     */
    public LCSStatusMsg createLCSStatusMsg() {
        return new LCSStatusMsg();
    }

    /**
     * Create an instance of {@link LinkInventoryMsg }
     * 
     */
    public LinkInventoryMsg createLinkInventoryMsg() {
        return new LinkInventoryMsg();
    }

    /**
     * Create an instance of {@link LinkStatusMsg }
     * 
     */
    public LinkStatusMsg createLinkStatusMsg() {
        return new LinkStatusMsg();
    }

    /**
     * Create an instance of {@link NodeInventoryMsg }
     * 
     */
    public NodeInventoryMsg createNodeInventoryMsg() {
        return new NodeInventoryMsg();
    }

    /**
     * Create an instance of {@link NodeStatusMsg }
     * 
     */
    public NodeStatusMsg createNodeStatusMsg() {
        return new NodeStatusMsg();
    }

    /**
     * Create an instance of {@link OrganizationInformationMsg }
     * 
     */
    public OrganizationInformationMsg createOrganizationInformationMsg() {
        return new OrganizationInformationMsg();
    }

    /**
     * Create an instance of {@link RampMeterControlScheduleMsg }
     * 
     */
    public RampMeterControlScheduleMsg createRampMeterControlScheduleMsg() {
        return new RampMeterControlScheduleMsg();
    }

    /**
     * Create an instance of {@link RampMeterInventoryMsg }
     * 
     */
    public RampMeterInventoryMsg createRampMeterInventoryMsg() {
        return new RampMeterInventoryMsg();
    }

    /**
     * Create an instance of {@link RampMeterPlanInventoryMsg }
     * 
     */
    public RampMeterPlanInventoryMsg createRampMeterPlanInventoryMsg() {
        return new RampMeterPlanInventoryMsg();
    }

    /**
     * Create an instance of {@link RampMeterPriorityQueueMsg }
     * 
     */
    public RampMeterPriorityQueueMsg createRampMeterPriorityQueueMsg() {
        return new RampMeterPriorityQueueMsg();
    }

    /**
     * Create an instance of {@link RampMeterPriorityQueue }
     * 
     */
    public RampMeterPriorityQueue createRampMeterPriorityQueue() {
        return new RampMeterPriorityQueue();
    }

    /**
     * Create an instance of {@link RampMeterStatusMsg }
     * 
     */
    public RampMeterStatusMsg createRampMeterStatusMsg() {
        return new RampMeterStatusMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanApprovalRequest }
     * 
     */
    public ResponsePlanApprovalRequest createResponsePlanApprovalRequest() {
        return new ResponsePlanApprovalRequest();
    }

    /**
     * Create an instance of {@link ResponsePlanApprovalMsg }
     * 
     */
    public ResponsePlanApprovalMsg createResponsePlanApprovalMsg() {
        return new ResponsePlanApprovalMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanLogRequest }
     * 
     */
    public ResponsePlanLogRequest createResponsePlanLogRequest() {
        return new ResponsePlanLogRequest();
    }

    /**
     * Create an instance of {@link ResponsePlanLogMsg }
     * 
     */
    public ResponsePlanLogMsg createResponsePlanLogMsg() {
        return new ResponsePlanLogMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanStatusRequest }
     * 
     */
    public ResponsePlanStatusRequest createResponsePlanStatusRequest() {
        return new ResponsePlanStatusRequest();
    }

    /**
     * Create an instance of {@link ResponsePlanStatusMsg }
     * 
     */
    public ResponsePlanStatusMsg createResponsePlanStatusMsg() {
        return new ResponsePlanStatusMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanRequest }
     * 
     */
    public ResponsePlanRequest createResponsePlanRequest() {
        return new ResponsePlanRequest();
    }

    /**
     * Create an instance of {@link ResponsePlanMsg }
     * 
     */
    public ResponsePlanMsg createResponsePlanMsg() {
        return new ResponsePlanMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanTerminationMsg }
     * 
     */
    public ResponsePlanTerminationMsg createResponsePlanTerminationMsg() {
        return new ResponsePlanTerminationMsg();
    }

    /**
     * Create an instance of {@link RouteInventoryMsg }
     * 
     */
    public RouteInventoryMsg createRouteInventoryMsg() {
        return new RouteInventoryMsg();
    }

    /**
     * Create an instance of {@link RouteStatusMsg }
     * 
     */
    public RouteStatusMsg createRouteStatusMsg() {
        return new RouteStatusMsg();
    }

    /**
     * Create an instance of {@link SectionControlRequest }
     * 
     */
    public SectionControlRequest createSectionControlRequest() {
        return new SectionControlRequest();
    }

    /**
     * Create an instance of {@link SectionControlResponse }
     * 
     */
    public SectionControlResponse createSectionControlResponse() {
        return new SectionControlResponse();
    }

    /**
     * Create an instance of {@link SectionControlScheduleMsg }
     * 
     */
    public SectionControlScheduleMsg createSectionControlScheduleMsg() {
        return new SectionControlScheduleMsg();
    }

    /**
     * Create an instance of {@link SectionControlStatusRequest }
     * 
     */
    public SectionControlStatusRequest createSectionControlStatusRequest() {
        return new SectionControlStatusRequest();
    }

    /**
     * Create an instance of {@link SectionPriorityQueue }
     * 
     */
    public SectionPriorityQueue createSectionPriorityQueue() {
        return new SectionPriorityQueue();
    }

    /**
     * Create an instance of {@link SectionStatusMsg }
     * 
     */
    public SectionStatusMsg createSectionStatusMsg() {
        return new SectionStatusMsg();
    }

    /**
     * Create an instance of {@link SectionSignalTimingPatternInventoryMsg }
     * 
     */
    public SectionSignalTimingPatternInventoryMsg createSectionSignalTimingPatternInventoryMsg() {
        return new SectionSignalTimingPatternInventoryMsg();
    }

    /**
     * Create an instance of {@link SectionSignalTimingPatternInventoryRequest }
     * 
     */
    public SectionSignalTimingPatternInventoryRequest createSectionSignalTimingPatternInventoryRequest() {
        return new SectionSignalTimingPatternInventoryRequest();
    }

    /**
     * Create an instance of {@link VideoSwitchControlRequest }
     * 
     */
    public VideoSwitchControlRequest createVideoSwitchControlRequest() {
        return new VideoSwitchControlRequest();
    }

    /**
     * Create an instance of {@link VideoSwitchInventoryMsg }
     * 
     */
    public VideoSwitchInventoryMsg createVideoSwitchInventoryMsg() {
        return new VideoSwitchInventoryMsg();
    }

    /**
     * Create an instance of {@link VideoSwitchStatusMsg }
     * 
     */
    public VideoSwitchStatusMsg createVideoSwitchStatusMsg() {
        return new VideoSwitchStatusMsg();
    }

    /**
     * Create an instance of {@link CCTVInventoryUpdateMsg }
     * 
     */
    public CCTVInventoryUpdateMsg createCCTVInventoryUpdateMsg() {
        return new CCTVInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link CCTVStatusUpdateMsg }
     * 
     */
    public CCTVStatusUpdateMsg createCCTVStatusUpdateMsg() {
        return new CCTVStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link CenterActiveVerificationUpdateMsg }
     * 
     */
    public CenterActiveVerificationUpdateMsg createCenterActiveVerificationUpdateMsg() {
        return new CenterActiveVerificationUpdateMsg();
    }

    /**
     * Create an instance of {@link DetectorInventoryUpdateMsg }
     * 
     */
    public DetectorInventoryUpdateMsg createDetectorInventoryUpdateMsg() {
        return new DetectorInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link DetectorStatusUpdateMsg }
     * 
     */
    public DetectorStatusUpdateMsg createDetectorStatusUpdateMsg() {
        return new DetectorStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link DetectorDataUpdateMsg }
     * 
     */
    public DetectorDataUpdateMsg createDetectorDataUpdateMsg() {
        return new DetectorDataUpdateMsg();
    }

    /**
     * Create an instance of {@link DMSInventoryUpdateMsg }
     * 
     */
    public DMSInventoryUpdateMsg createDMSInventoryUpdateMsg() {
        return new DMSInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link DMSStatusUpdateMsg }
     * 
     */
    public DMSStatusUpdateMsg createDMSStatusUpdateMsg() {
        return new DMSStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link DMSMessageInventoryUpdateMsg }
     * 
     */
    public DMSMessageInventoryUpdateMsg createDMSMessageInventoryUpdateMsg() {
        return new DMSMessageInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link ESSInventoryUpdateMsg }
     * 
     */
    public ESSInventoryUpdateMsg createESSInventoryUpdateMsg() {
        return new ESSInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link ESSStatusUpdateMsg }
     * 
     */
    public ESSStatusUpdateMsg createESSStatusUpdateMsg() {
        return new ESSStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link ESSObservationReportUpdateMsg }
     * 
     */
    public ESSObservationReportUpdateMsg createESSObservationReportUpdateMsg() {
        return new ESSObservationReportUpdateMsg();
    }

    /**
     * Create an instance of {@link FullEventUpdateUpdateMsg }
     * 
     */
    public FullEventUpdateUpdateMsg createFullEventUpdateUpdateMsg() {
        return new FullEventUpdateUpdateMsg();
    }

    /**
     * Create an instance of {@link EventIndexUpdateMsg }
     * 
     */
    public EventIndexUpdateMsg createEventIndexUpdateMsg() {
        return new EventIndexUpdateMsg();
    }

    /**
     * Create an instance of {@link ActionLogUpdateMsg }
     * 
     */
    public ActionLogUpdateMsg createActionLogUpdateMsg() {
        return new ActionLogUpdateMsg();
    }

    /**
     * Create an instance of {@link GateInventoryUpdateMsg }
     * 
     */
    public GateInventoryUpdateMsg createGateInventoryUpdateMsg() {
        return new GateInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link GateStatusUpdateMsg }
     * 
     */
    public GateStatusUpdateMsg createGateStatusUpdateMsg() {
        return new GateStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link GateControlScheduleUpdateMsg }
     * 
     */
    public GateControlScheduleUpdateMsg createGateControlScheduleUpdateMsg() {
        return new GateControlScheduleUpdateMsg();
    }

    /**
     * Create an instance of {@link HARInventoryUpdateMsg }
     * 
     */
    public HARInventoryUpdateMsg createHARInventoryUpdateMsg() {
        return new HARInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link HARStatusUpdateMsg }
     * 
     */
    public HARStatusUpdateMsg createHARStatusUpdateMsg() {
        return new HARStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link HARControlScheduleUpdateMsg }
     * 
     */
    public HARControlScheduleUpdateMsg createHARControlScheduleUpdateMsg() {
        return new HARControlScheduleUpdateMsg();
    }

    /**
     * Create an instance of {@link HARMessageInventoryUpdateMsg }
     * 
     */
    public HARMessageInventoryUpdateMsg createHARMessageInventoryUpdateMsg() {
        return new HARMessageInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventoryUpdateMsg }
     * 
     */
    public IntersectionSignalInventoryUpdateMsg createIntersectionSignalInventoryUpdateMsg() {
        return new IntersectionSignalInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link IntersectionSignalStatusUpdateMsg }
     * 
     */
    public IntersectionSignalStatusUpdateMsg createIntersectionSignalStatusUpdateMsg() {
        return new IntersectionSignalStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link IntersectionSignalTimingPatternInventoryUpdateMsg }
     * 
     */
    public IntersectionSignalTimingPatternInventoryUpdateMsg createIntersectionSignalTimingPatternInventoryUpdateMsg() {
        return new IntersectionSignalTimingPatternInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link IntersectionSignalControlScheduleUpdateMsg }
     * 
     */
    public IntersectionSignalControlScheduleUpdateMsg createIntersectionSignalControlScheduleUpdateMsg() {
        return new IntersectionSignalControlScheduleUpdateMsg();
    }

    /**
     * Create an instance of {@link LCSInventoryUpdateMsg }
     * 
     */
    public LCSInventoryUpdateMsg createLCSInventoryUpdateMsg() {
        return new LCSInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link LCSStatusUpdateMsg }
     * 
     */
    public LCSStatusUpdateMsg createLCSStatusUpdateMsg() {
        return new LCSStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link LCSControlScheduleUpdateMsg }
     * 
     */
    public LCSControlScheduleUpdateMsg createLCSControlScheduleUpdateMsg() {
        return new LCSControlScheduleUpdateMsg();
    }

    /**
     * Create an instance of {@link LinkInventoryUpdateMsg }
     * 
     */
    public LinkInventoryUpdateMsg createLinkInventoryUpdateMsg() {
        return new LinkInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link LinkStatusUpdateMsg }
     * 
     */
    public LinkStatusUpdateMsg createLinkStatusUpdateMsg() {
        return new LinkStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link NodeInventoryUpdateMsg }
     * 
     */
    public NodeInventoryUpdateMsg createNodeInventoryUpdateMsg() {
        return new NodeInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link NodeStatusUpdateMsg }
     * 
     */
    public NodeStatusUpdateMsg createNodeStatusUpdateMsg() {
        return new NodeStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link OrganizationInformationUpdateMsg }
     * 
     */
    public OrganizationInformationUpdateMsg createOrganizationInformationUpdateMsg() {
        return new OrganizationInformationUpdateMsg();
    }

    /**
     * Create an instance of {@link RampMeterInventoryUpdateMsg }
     * 
     */
    public RampMeterInventoryUpdateMsg createRampMeterInventoryUpdateMsg() {
        return new RampMeterInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link RampMeterStatusUpdateMsg }
     * 
     */
    public RampMeterStatusUpdateMsg createRampMeterStatusUpdateMsg() {
        return new RampMeterStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link RampMeterControlScheduleUpdateMsg }
     * 
     */
    public RampMeterControlScheduleUpdateMsg createRampMeterControlScheduleUpdateMsg() {
        return new RampMeterControlScheduleUpdateMsg();
    }

    /**
     * Create an instance of {@link RampMeterPlanInventoryUpdateMsg }
     * 
     */
    public RampMeterPlanInventoryUpdateMsg createRampMeterPlanInventoryUpdateMsg() {
        return new RampMeterPlanInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanStatusUpdateMsg }
     * 
     */
    public ResponsePlanStatusUpdateMsg createResponsePlanStatusUpdateMsg() {
        return new ResponsePlanStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanUpdateMsg }
     * 
     */
    public ResponsePlanUpdateMsg createResponsePlanUpdateMsg() {
        return new ResponsePlanUpdateMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanApprovalUpdateMsg }
     * 
     */
    public ResponsePlanApprovalUpdateMsg createResponsePlanApprovalUpdateMsg() {
        return new ResponsePlanApprovalUpdateMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanLogUpdateMsg }
     * 
     */
    public ResponsePlanLogUpdateMsg createResponsePlanLogUpdateMsg() {
        return new ResponsePlanLogUpdateMsg();
    }

    /**
     * Create an instance of {@link RouteInventoryUpdateMsg }
     * 
     */
    public RouteInventoryUpdateMsg createRouteInventoryUpdateMsg() {
        return new RouteInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link RouteStatusUpdateMsg }
     * 
     */
    public RouteStatusUpdateMsg createRouteStatusUpdateMsg() {
        return new RouteStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link SectionStatusUpdateMsg }
     * 
     */
    public SectionStatusUpdateMsg createSectionStatusUpdateMsg() {
        return new SectionStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link SectionControlScheduleUpdateMsg }
     * 
     */
    public SectionControlScheduleUpdateMsg createSectionControlScheduleUpdateMsg() {
        return new SectionControlScheduleUpdateMsg();
    }

    /**
     * Create an instance of {@link SectionSignalTimingPatternInventoryUpdateMsg }
     * 
     */
    public SectionSignalTimingPatternInventoryUpdateMsg createSectionSignalTimingPatternInventoryUpdateMsg() {
        return new SectionSignalTimingPatternInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link VideoSwitchInventoryUpdateMsg }
     * 
     */
    public VideoSwitchInventoryUpdateMsg createVideoSwitchInventoryUpdateMsg() {
        return new VideoSwitchInventoryUpdateMsg();
    }

    /**
     * Create an instance of {@link VideoSwitchStatusUpdateMsg }
     * 
     */
    public VideoSwitchStatusUpdateMsg createVideoSwitchStatusUpdateMsg() {
        return new VideoSwitchStatusUpdateMsg();
    }

    /**
     * Create an instance of {@link CenterActiveVerificationSubscriptionMsg }
     * 
     */
    public CenterActiveVerificationSubscriptionMsg createCenterActiveVerificationSubscriptionMsg() {
        return new CenterActiveVerificationSubscriptionMsg();
    }

    /**
     * Create an instance of {@link DeviceInformationSubscription }
     * 
     */
    public DeviceInformationSubscription createDeviceInformationSubscription() {
        return new DeviceInformationSubscription();
    }

    /**
     * Create an instance of {@link DMSMessageInventorySubscriptionMsg }
     * 
     */
    public DMSMessageInventorySubscriptionMsg createDMSMessageInventorySubscriptionMsg() {
        return new DMSMessageInventorySubscriptionMsg();
    }

    /**
     * Create an instance of {@link EventSubscription }
     * 
     */
    public EventSubscription createEventSubscription() {
        return new EventSubscription();
    }

    /**
     * Create an instance of {@link IntersectionSignalTimingPatternInventorySubscriptionMsg }
     * 
     */
    public IntersectionSignalTimingPatternInventorySubscriptionMsg createIntersectionSignalTimingPatternInventorySubscriptionMsg() {
        return new IntersectionSignalTimingPatternInventorySubscriptionMsg();
    }

    /**
     * Create an instance of {@link OrganizationInformationSubscriptionMsg }
     * 
     */
    public OrganizationInformationSubscriptionMsg createOrganizationInformationSubscriptionMsg() {
        return new OrganizationInformationSubscriptionMsg();
    }

    /**
     * Create an instance of {@link RampMeterPlanInventorySubscriptionMsg }
     * 
     */
    public RampMeterPlanInventorySubscriptionMsg createRampMeterPlanInventorySubscriptionMsg() {
        return new RampMeterPlanInventorySubscriptionMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanApprovalSubscriptionMsg }
     * 
     */
    public ResponsePlanApprovalSubscriptionMsg createResponsePlanApprovalSubscriptionMsg() {
        return new ResponsePlanApprovalSubscriptionMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanLogSubscriptionMsg }
     * 
     */
    public ResponsePlanLogSubscriptionMsg createResponsePlanLogSubscriptionMsg() {
        return new ResponsePlanLogSubscriptionMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanStatusSubscriptionMsg }
     * 
     */
    public ResponsePlanStatusSubscriptionMsg createResponsePlanStatusSubscriptionMsg() {
        return new ResponsePlanStatusSubscriptionMsg();
    }

    /**
     * Create an instance of {@link ResponsePlanSubscriptionMsg }
     * 
     */
    public ResponsePlanSubscriptionMsg createResponsePlanSubscriptionMsg() {
        return new ResponsePlanSubscriptionMsg();
    }

    /**
     * Create an instance of {@link SectionSignalTimingPatternInventorySubscriptionMsg }
     * 
     */
    public SectionSignalTimingPatternInventorySubscriptionMsg createSectionSignalTimingPatternInventorySubscriptionMsg() {
        return new SectionSignalTimingPatternInventorySubscriptionMsg();
    }

    /**
     * Create an instance of {@link TrafficNetworkInformationSubscriptionMsg }
     * 
     */
    public TrafficNetworkInformationSubscriptionMsg createTrafficNetworkInformationSubscriptionMsg() {
        return new TrafficNetworkInformationSubscriptionMsg();
    }

    /**
     * Create an instance of {@link CCTVControlDetails }
     * 
     */
    public CCTVControlDetails createCCTVControlDetails() {
        return new CCTVControlDetails();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link DetectorDataDetail }
     * 
     */
    public DetectorDataDetail createDetectorDataDetail() {
        return new DetectorDataDetail();
    }

    /**
     * Create an instance of {@link DetectorMaintenanceHistoryDetail }
     * 
     */
    public DetectorMaintenanceHistoryDetail createDetectorMaintenanceHistoryDetail() {
        return new DetectorMaintenanceHistoryDetail();
    }

    /**
     * Create an instance of {@link DetectorStatusDetails }
     * 
     */
    public DetectorStatusDetails createDetectorStatusDetails() {
        return new DetectorStatusDetails();
    }

    /**
     * Create an instance of {@link DeviceControlRequestHeader }
     * 
     */
    public DeviceControlRequestHeader createDeviceControlRequestHeader() {
        return new DeviceControlRequestHeader();
    }

    /**
     * Create an instance of {@link DeviceControlScheduleHeader }
     * 
     */
    public DeviceControlScheduleHeader createDeviceControlScheduleHeader() {
        return new DeviceControlScheduleHeader();
    }

    /**
     * Create an instance of {@link DeviceInventoryHeader }
     * 
     */
    public DeviceInventoryHeader createDeviceInventoryHeader() {
        return new DeviceInventoryHeader();
    }

    /**
     * Create an instance of {@link DevicePriorityQueueItem }
     * 
     */
    public DevicePriorityQueueItem createDevicePriorityQueueItem() {
        return new DevicePriorityQueueItem();
    }

    /**
     * Create an instance of {@link DeviceReference }
     * 
     */
    public DeviceReference createDeviceReference() {
        return new DeviceReference();
    }

    /**
     * Create an instance of {@link DeviceStatusHeader }
     * 
     */
    public DeviceStatusHeader createDeviceStatusHeader() {
        return new DeviceStatusHeader();
    }

    /**
     * Create an instance of {@link DMSCharacterTableEntry }
     * 
     */
    public DMSCharacterTableEntry createDMSCharacterTableEntry() {
        return new DMSCharacterTableEntry();
    }

    /**
     * Create an instance of {@link DMSControlDetails }
     * 
     */
    public DMSControlDetails createDMSControlDetails() {
        return new DMSControlDetails();
    }

    /**
     * Create an instance of {@link DMSInventory }
     * 
     */
    public DMSInventory createDMSInventory() {
        return new DMSInventory();
    }

    /**
     * Create an instance of {@link DMSMessageAppearanceRequestType }
     * 
     */
    public DMSMessageAppearanceRequestType createDMSMessageAppearanceRequestType() {
        return new DMSMessageAppearanceRequestType();
    }

    /**
     * Create an instance of {@link DMSMessageInventory }
     * 
     */
    public DMSMessageInventory createDMSMessageInventory() {
        return new DMSMessageInventory();
    }

    /**
     * Create an instance of {@link DMSStatus }
     * 
     */
    public DMSStatus createDMSStatus() {
        return new DMSStatus();
    }

    /**
     * Create an instance of {@link ESSClimateRecordDetail }
     * 
     */
    public ESSClimateRecordDetail createESSClimateRecordDetail() {
        return new ESSClimateRecordDetail();
    }

    /**
     * Create an instance of {@link ESSDataCollectorInformation }
     * 
     */
    public ESSDataCollectorInformation createESSDataCollectorInformation() {
        return new ESSDataCollectorInformation();
    }

    /**
     * Create an instance of {@link ESSImageInformation }
     * 
     */
    public ESSImageInformation createESSImageInformation() {
        return new ESSImageInformation();
    }

    /**
     * Create an instance of {@link ESSInventoryDetails }
     * 
     */
    public ESSInventoryDetails createESSInventoryDetails() {
        return new ESSInventoryDetails();
    }

    /**
     * Create an instance of {@link ESSObservationDataSetMetadataDetail }
     * 
     */
    public ESSObservationDataSetMetadataDetail createESSObservationDataSetMetadataDetail() {
        return new ESSObservationDataSetMetadataDetail();
    }

    /**
     * Create an instance of {@link ESSObservationMetadataItem }
     * 
     */
    public ESSObservationMetadataItem createESSObservationMetadataItem() {
        return new ESSObservationMetadataItem();
    }

    /**
     * Create an instance of {@link ESSObservationReportDetail }
     * 
     */
    public ESSObservationReportDetail createESSObservationReportDetail() {
        return new ESSObservationReportDetail();
    }

    /**
     * Create an instance of {@link ESSObservationType }
     * 
     */
    public ESSObservationType createESSObservationType() {
        return new ESSObservationType();
    }

    /**
     * Create an instance of {@link ESSSensorMetadataDetail }
     * 
     */
    public ESSSensorMetadataDetail createESSSensorMetadataDetail() {
        return new ESSSensorMetadataDetail();
    }

    /**
     * Create an instance of {@link ESSSensorStatusDetails }
     * 
     */
    public ESSSensorStatusDetails createESSSensorStatusDetails() {
        return new ESSSensorStatusDetails();
    }

    /**
     * Create an instance of {@link ESSSiteMetadataDetail }
     * 
     */
    public ESSSiteMetadataDetail createESSSiteMetadataDetail() {
        return new ESSSiteMetadataDetail();
    }

    /**
     * Create an instance of {@link ESSStationMetadataDetail }
     * 
     */
    public ESSStationMetadataDetail createESSStationMetadataDetail() {
        return new ESSStationMetadataDetail();
    }

    /**
     * Create an instance of {@link ActionLog }
     * 
     */
    public ActionLog createActionLog() {
        return new ActionLog();
    }

    /**
     * Create an instance of {@link AdditionalText }
     * 
     */
    public AdditionalText createAdditionalText() {
        return new AdditionalText();
    }

    /**
     * Create an instance of {@link AreaLocation }
     * 
     */
    public AreaLocation createAreaLocation() {
        return new AreaLocation();
    }

    /**
     * Create an instance of {@link DataExtent }
     * 
     */
    public DataExtent createDataExtent() {
        return new DataExtent();
    }

    /**
     * Create an instance of {@link DataIncidentDetails }
     * 
     */
    public DataIncidentDetails createDataIncidentDetails() {
        return new DataIncidentDetails();
    }

    /**
     * Create an instance of {@link DataLinkRestrictions }
     * 
     */
    public DataLinkRestrictions createDataLinkRestrictions() {
        return new DataLinkRestrictions();
    }

    /**
     * Create an instance of {@link DataLinkState }
     * 
     */
    public DataLinkState createDataLinkState() {
        return new DataLinkState();
    }

    /**
     * Create an instance of {@link DataParking }
     * 
     */
    public DataParking createDataParking() {
        return new DataParking();
    }

    /**
     * Create an instance of {@link DataRoadWeather }
     * 
     */
    public DataRoadWeather createDataRoadWeather() {
        return new DataRoadWeather();
    }

    /**
     * Create an instance of {@link DataSurfaceConditions }
     * 
     */
    public DataSurfaceConditions createDataSurfaceConditions() {
        return new DataSurfaceConditions();
    }

    /**
     * Create an instance of {@link EventAdvice }
     * 
     */
    public EventAdvice createEventAdvice() {
        return new EventAdvice();
    }

    /**
     * Create an instance of {@link EventComments }
     * 
     */
    public EventComments createEventComments() {
        return new EventComments();
    }

    /**
     * Create an instance of {@link EventDescription }
     * 
     */
    public EventDescription createEventDescription() {
        return new EventDescription();
    }

    /**
     * Create an instance of {@link BoundingBox }
     * 
     */
    public BoundingBox createBoundingBox() {
        return new BoundingBox();
    }

    /**
     * Create an instance of {@link EventHeadline }
     * 
     */
    public EventHeadline createEventHeadline() {
        return new EventHeadline();
    }

    /**
     * Create an instance of {@link EventIndex }
     * 
     */
    public EventIndex createEventIndex() {
        return new EventIndex();
    }

    /**
     * Create an instance of {@link EventIndicator }
     * 
     */
    public EventIndicator createEventIndicator() {
        return new EventIndicator();
    }

    /**
     * Create an instance of {@link EventLocation }
     * 
     */
    public EventLocation createEventLocation() {
        return new EventLocation();
    }

    /**
     * Create an instance of {@link EventPeriod }
     * 
     */
    public EventPeriod createEventPeriod() {
        return new EventPeriod();
    }

    /**
     * Create an instance of {@link EventQualifier }
     * 
     */
    public EventQualifier createEventQualifier() {
        return new EventQualifier();
    }

    /**
     * Create an instance of {@link EventQuantity }
     * 
     */
    public EventQuantity createEventQuantity() {
        return new EventQuantity();
    }

    /**
     * Create an instance of {@link EventReference }
     * 
     */
    public EventReference createEventReference() {
        return new EventReference();
    }

    /**
     * Create an instance of {@link EventSource }
     * 
     */
    public EventSource createEventSource() {
        return new EventSource();
    }

    /**
     * Create an instance of {@link EventTransitLocation }
     * 
     */
    public EventTransitLocation createEventTransitLocation() {
        return new EventTransitLocation();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link FullReportText }
     * 
     */
    public FullReportText createFullReportText() {
        return new FullReportText();
    }

    /**
     * Create an instance of {@link Hazmat }
     * 
     */
    public Hazmat createHazmat() {
        return new Hazmat();
    }

    /**
     * Create an instance of {@link LandmarkLocation }
     * 
     */
    public LandmarkLocation createLandmarkLocation() {
        return new LandmarkLocation();
    }

    /**
     * Create an instance of {@link OtherReference }
     * 
     */
    public OtherReference createOtherReference() {
        return new OtherReference();
    }

    /**
     * Create an instance of {@link ProjectReference }
     * 
     */
    public ProjectReference createProjectReference() {
        return new ProjectReference();
    }

    /**
     * Create an instance of {@link RequestTimes }
     * 
     */
    public RequestTimes createRequestTimes() {
        return new RequestTimes();
    }

    /**
     * Create an instance of {@link GateControlSchedule }
     * 
     */
    public GateControlSchedule createGateControlSchedule() {
        return new GateControlSchedule();
    }

    /**
     * Create an instance of {@link GateInventory }
     * 
     */
    public GateInventory createGateInventory() {
        return new GateInventory();
    }

    /**
     * Create an instance of {@link GateStatus }
     * 
     */
    public GateStatus createGateStatus() {
        return new GateStatus();
    }

    /**
     * Create an instance of {@link DateTimeZone }
     * 
     */
    public DateTimeZone createDateTimeZone() {
        return new DateTimeZone();
    }

    /**
     * Create an instance of {@link UrlReference }
     * 
     */
    public UrlReference createUrlReference() {
        return new UrlReference();
    }

    /**
     * Create an instance of {@link HARControlDetails }
     * 
     */
    public HARControlDetails createHARControlDetails() {
        return new HARControlDetails();
    }

    /**
     * Create an instance of {@link HARControlSchedule }
     * 
     */
    public HARControlSchedule createHARControlSchedule() {
        return new HARControlSchedule();
    }

    /**
     * Create an instance of {@link HARInventory }
     * 
     */
    public HARInventory createHARInventory() {
        return new HARInventory();
    }

    /**
     * Create an instance of {@link HARMessageInventory }
     * 
     */
    public HARMessageInventory createHARMessageInventory() {
        return new HARMessageInventory();
    }

    /**
     * Create an instance of {@link HARStatus }
     * 
     */
    public HARStatus createHARStatus() {
        return new HARStatus();
    }

    /**
     * Create an instance of {@link IntersectionSignalControlDetails }
     * 
     */
    public IntersectionSignalControlDetails createIntersectionSignalControlDetails() {
        return new IntersectionSignalControlDetails();
    }

    /**
     * Create an instance of {@link IntersectionSignalControlSchedule }
     * 
     */
    public IntersectionSignalControlSchedule createIntersectionSignalControlSchedule() {
        return new IntersectionSignalControlSchedule();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventoryLinkList }
     * 
     */
    public IntersectionSignalInventoryLinkList createIntersectionSignalInventoryLinkList() {
        return new IntersectionSignalInventoryLinkList();
    }

    /**
     * Create an instance of {@link IntersectionSignalOverlapStatusGroup }
     * 
     */
    public IntersectionSignalOverlapStatusGroup createIntersectionSignalOverlapStatusGroup() {
        return new IntersectionSignalOverlapStatusGroup();
    }

    /**
     * Create an instance of {@link IntersectionSignalPhaseSplit }
     * 
     */
    public IntersectionSignalPhaseSplit createIntersectionSignalPhaseSplit() {
        return new IntersectionSignalPhaseSplit();
    }

    /**
     * Create an instance of {@link IntersectionSignalPhaseStatusGroup }
     * 
     */
    public IntersectionSignalPhaseStatusGroup createIntersectionSignalPhaseStatusGroup() {
        return new IntersectionSignalPhaseStatusGroup();
    }

    /**
     * Create an instance of {@link IntersectionSignalRingStatus }
     * 
     */
    public IntersectionSignalRingStatus createIntersectionSignalRingStatus() {
        return new IntersectionSignalRingStatus();
    }

    /**
     * Create an instance of {@link IntersectionSignalSpecialFunctions }
     * 
     */
    public IntersectionSignalSpecialFunctions createIntersectionSignalSpecialFunctions() {
        return new IntersectionSignalSpecialFunctions();
    }

    /**
     * Create an instance of {@link IntersectionSignalTPInventoryPhase }
     * 
     */
    public IntersectionSignalTPInventoryPhase createIntersectionSignalTPInventoryPhase() {
        return new IntersectionSignalTPInventoryPhase();
    }

    /**
     * Create an instance of {@link LCSControlSchedule }
     * 
     */
    public LCSControlSchedule createLCSControlSchedule() {
        return new LCSControlSchedule();
    }

    /**
     * Create an instance of {@link LCSInventory }
     * 
     */
    public LCSInventory createLCSInventory() {
        return new LCSInventory();
    }

    /**
     * Create an instance of {@link LCSStatus }
     * 
     */
    public LCSStatus createLCSStatus() {
        return new LCSStatus();
    }

    /**
     * Create an instance of {@link LinearReferenceRange }
     * 
     */
    public LinearReferenceRange createLinearReferenceRange() {
        return new LinearReferenceRange();
    }

    /**
     * Create an instance of {@link org.tmdd._303.messages.LinkInventoryList }
     * 
     */
    public org.tmdd._303.messages.LinkInventoryList createLinkInventoryList() {
        return new org.tmdd._303.messages.LinkInventoryList();
    }

    /**
     * Create an instance of {@link LinkRestrictions }
     * 
     */
    public LinkRestrictions createLinkRestrictions() {
        return new LinkRestrictions();
    }

    /**
     * Create an instance of {@link LinkGeomLocation }
     * 
     */
    public LinkGeomLocation createLinkGeomLocation() {
        return new LinkGeomLocation();
    }

    /**
     * Create an instance of {@link org.tmdd._303.messages.NodeInventoryList }
     * 
     */
    public org.tmdd._303.messages.NodeInventoryList createNodeInventoryList() {
        return new org.tmdd._303.messages.NodeInventoryList();
    }

    /**
     * Create an instance of {@link org.tmdd._303.messages.NodeStatusList }
     * 
     */
    public org.tmdd._303.messages.NodeStatusList createNodeStatusList() {
        return new org.tmdd._303.messages.NodeStatusList();
    }

    /**
     * Create an instance of {@link ContactDetails }
     * 
     */
    public ContactDetails createContactDetails() {
        return new ContactDetails();
    }

    /**
     * Create an instance of {@link OrganizationCenterInformation }
     * 
     */
    public OrganizationCenterInformation createOrganizationCenterInformation() {
        return new OrganizationCenterInformation();
    }

    /**
     * Create an instance of {@link Restrictions }
     * 
     */
    public Restrictions createRestrictions() {
        return new Restrictions();
    }

    /**
     * Create an instance of {@link RampControlDetails }
     * 
     */
    public RampControlDetails createRampControlDetails() {
        return new RampControlDetails();
    }

    /**
     * Create an instance of {@link RampMeterControlSchedule }
     * 
     */
    public RampMeterControlSchedule createRampMeterControlSchedule() {
        return new RampMeterControlSchedule();
    }

    /**
     * Create an instance of {@link RampMeterLaneControlDetails }
     * 
     */
    public RampMeterLaneControlDetails createRampMeterLaneControlDetails() {
        return new RampMeterLaneControlDetails();
    }

    /**
     * Create an instance of {@link RampMeterLaneStatusDetails }
     * 
     */
    public RampMeterLaneStatusDetails createRampMeterLaneStatusDetails() {
        return new RampMeterLaneStatusDetails();
    }

    /**
     * Create an instance of {@link RampMeterPlanInventory }
     * 
     */
    public RampMeterPlanInventory createRampMeterPlanInventory() {
        return new RampMeterPlanInventory();
    }

    /**
     * Create an instance of {@link InformationalMessage }
     * 
     */
    public InformationalMessage createInformationalMessage() {
        return new InformationalMessage();
    }

    /**
     * Create an instance of {@link ResponsePlanRequestHeader }
     * 
     */
    public ResponsePlanRequestHeader createResponsePlanRequestHeader() {
        return new ResponsePlanRequestHeader();
    }

    /**
     * Create an instance of {@link ResponsePlanHeader }
     * 
     */
    public ResponsePlanHeader createResponsePlanHeader() {
        return new ResponsePlanHeader();
    }

    /**
     * Create an instance of {@link ResponsePlanAgencyApproval }
     * 
     */
    public ResponsePlanAgencyApproval createResponsePlanAgencyApproval() {
        return new ResponsePlanAgencyApproval();
    }

    /**
     * Create an instance of {@link ResponsePlanPersonnelDeployment }
     * 
     */
    public ResponsePlanPersonnelDeployment createResponsePlanPersonnelDeployment() {
        return new ResponsePlanPersonnelDeployment();
    }

    /**
     * Create an instance of {@link EventDetails }
     * 
     */
    public EventDetails createEventDetails() {
        return new EventDetails();
    }

    /**
     * Create an instance of {@link ResponsePlanStatusDetails }
     * 
     */
    public ResponsePlanStatusDetails createResponsePlanStatusDetails() {
        return new ResponsePlanStatusDetails();
    }

    /**
     * Create an instance of {@link ResponsePlanImplementation }
     * 
     */
    public ResponsePlanImplementation createResponsePlanImplementation() {
        return new ResponsePlanImplementation();
    }

    /**
     * Create an instance of {@link ResponsePlanTermination }
     * 
     */
    public ResponsePlanTermination createResponsePlanTermination() {
        return new ResponsePlanTermination();
    }

    /**
     * Create an instance of {@link ResponsePlanLogDetails }
     * 
     */
    public ResponsePlanLogDetails createResponsePlanLogDetails() {
        return new ResponsePlanLogDetails();
    }

    /**
     * Create an instance of {@link org.tmdd._303.messages.RouteStatusList }
     * 
     */
    public org.tmdd._303.messages.RouteStatusList createRouteStatusList() {
        return new org.tmdd._303.messages.RouteStatusList();
    }

    /**
     * Create an instance of {@link SectionControlDetails }
     * 
     */
    public SectionControlDetails createSectionControlDetails() {
        return new SectionControlDetails();
    }

    /**
     * Create an instance of {@link VSSwitchedChannelData }
     * 
     */
    public VSSwitchedChannelData createVSSwitchedChannelData() {
        return new VSSwitchedChannelData();
    }

    /**
     * Create an instance of {@link VSVideoChannelData }
     * 
     */
    public VSVideoChannelData createVSVideoChannelData() {
        return new VSVideoChannelData();
    }

    /**
     * Create an instance of {@link VideoSwitchInventory.InputChannelList }
     * 
     */
    public VideoSwitchInventory.InputChannelList createVideoSwitchInventoryInputChannelList() {
        return new VideoSwitchInventory.InputChannelList();
    }

    /**
     * Create an instance of {@link VideoSwitchInventory.OutputChannelList }
     * 
     */
    public VideoSwitchInventory.OutputChannelList createVideoSwitchInventoryOutputChannelList() {
        return new VideoSwitchInventory.OutputChannelList();
    }

    /**
     * Create an instance of {@link VideoSwitchDeviceStatus.SwitchedChannelList }
     * 
     */
    public VideoSwitchDeviceStatus.SwitchedChannelList createVideoSwitchDeviceStatusSwitchedChannelList() {
        return new VideoSwitchDeviceStatus.SwitchedChannelList();
    }

    /**
     * Create an instance of {@link SectionSignalTimingPatternInventory.PhaseTpList }
     * 
     */
    public SectionSignalTimingPatternInventory.PhaseTpList createSectionSignalTimingPatternInventoryPhaseTpList() {
        return new SectionSignalTimingPatternInventory.PhaseTpList();
    }

    /**
     * Create an instance of {@link SectionSignalTimingPatternInventory.SequenceInformation }
     * 
     */
    public SectionSignalTimingPatternInventory.SequenceInformation createSectionSignalTimingPatternInventorySequenceInformation() {
        return new SectionSignalTimingPatternInventory.SequenceInformation();
    }

    /**
     * Create an instance of {@link SectionTimingPatternInventory.IntersectionTpList }
     * 
     */
    public SectionTimingPatternInventory.IntersectionTpList createSectionTimingPatternInventoryIntersectionTpList() {
        return new SectionTimingPatternInventory.IntersectionTpList();
    }

    /**
     * Create an instance of {@link SectionStatus.DeviceIdList }
     * 
     */
    public SectionStatus.DeviceIdList createSectionStatusDeviceIdList() {
        return new SectionStatus.DeviceIdList();
    }

    /**
     * Create an instance of {@link SectionControlSchedule.DeviceIdList }
     * 
     */
    public SectionControlSchedule.DeviceIdList createSectionControlScheduleDeviceIdList() {
        return new SectionControlSchedule.DeviceIdList();
    }

    /**
     * Create an instance of {@link RouteStatus.RouteStatusList }
     * 
     */
    public RouteStatus.RouteStatusList createRouteStatusRouteStatusList() {
        return new RouteStatus.RouteStatusList();
    }

    /**
     * Create an instance of {@link org.tmdd._303.messages.RouteInventoryList.RouteLinkIdList }
     * 
     */
    public org.tmdd._303.messages.RouteInventoryList.RouteLinkIdList createRouteInventoryListRouteLinkIdList() {
        return new org.tmdd._303.messages.RouteInventoryList.RouteLinkIdList();
    }

    /**
     * Create an instance of {@link org.tmdd._303.messages.RouteInventoryList.AlternateRouteNameList }
     * 
     */
    public org.tmdd._303.messages.RouteInventoryList.AlternateRouteNameList createRouteInventoryListAlternateRouteNameList() {
        return new org.tmdd._303.messages.RouteInventoryList.AlternateRouteNameList();
    }

    /**
     * Create an instance of {@link org.tmdd._303.messages.RouteInventoryList.RouteNodeIdList }
     * 
     */
    public org.tmdd._303.messages.RouteInventoryList.RouteNodeIdList createRouteInventoryListRouteNodeIdList() {
        return new org.tmdd._303.messages.RouteInventoryList.RouteNodeIdList();
    }

    /**
     * Create an instance of {@link RouteInventory.RouteInventoryList }
     * 
     */
    public RouteInventory.RouteInventoryList createRouteInventoryRouteInventoryList() {
        return new RouteInventory.RouteInventoryList();
    }

    /**
     * Create an instance of {@link ResponsePlanLog.LogDetailList }
     * 
     */
    public ResponsePlanLog.LogDetailList createResponsePlanLogLogDetailList() {
        return new ResponsePlanLog.LogDetailList();
    }

    /**
     * Create an instance of {@link IncidentResponse.EvaluationCycleList }
     * 
     */
    public IncidentResponse.EvaluationCycleList createIncidentResponseEvaluationCycleList() {
        return new IncidentResponse.EvaluationCycleList();
    }

    /**
     * Create an instance of {@link ResponsePlanStatus.ResponsePlanStatusDetailsList }
     * 
     */
    public ResponsePlanStatus.ResponsePlanStatusDetailsList createResponsePlanStatusResponsePlanStatusDetailsList() {
        return new ResponsePlanStatus.ResponsePlanStatusDetailsList();
    }

    /**
     * Create an instance of {@link ResponsePlanApproval.AgencyApprovalDecisionList }
     * 
     */
    public ResponsePlanApproval.AgencyApprovalDecisionList createResponsePlanApprovalAgencyApprovalDecisionList() {
        return new ResponsePlanApproval.AgencyApprovalDecisionList();
    }

    /**
     * Create an instance of {@link ResponsePlanRequestFilter.EvaluationCycleList }
     * 
     */
    public ResponsePlanRequestFilter.EvaluationCycleList createResponsePlanRequestFilterEvaluationCycleList() {
        return new ResponsePlanRequestFilter.EvaluationCycleList();
    }

    /**
     * Create an instance of {@link ResponsePlanRequestFilter.ResponsePlanRankList }
     * 
     */
    public ResponsePlanRequestFilter.ResponsePlanRankList createResponsePlanRequestFilterResponsePlanRankList() {
        return new ResponsePlanRequestFilter.ResponsePlanRankList();
    }

    /**
     * Create an instance of {@link ResponsePlanRequestFilter.ResponsePlanIdList }
     * 
     */
    public ResponsePlanRequestFilter.ResponsePlanIdList createResponsePlanRequestFilterResponsePlanIdList() {
        return new ResponsePlanRequestFilter.ResponsePlanIdList();
    }

    /**
     * Create an instance of {@link ResponsePlanRequestFilter.ResponsePlanStatusList }
     * 
     */
    public ResponsePlanRequestFilter.ResponsePlanStatusList createResponsePlanRequestFilterResponsePlanStatusList() {
        return new ResponsePlanRequestFilter.ResponsePlanStatusList();
    }

    /**
     * Create an instance of {@link EvaluationCycleDetails.ResponsePlanList }
     * 
     */
    public EvaluationCycleDetails.ResponsePlanList createEvaluationCycleDetailsResponsePlanList() {
        return new EvaluationCycleDetails.ResponsePlanList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.AgencyList }
     * 
     */
    public ResponsePlanDetails.AgencyList createResponsePlanDetailsAgencyList() {
        return new ResponsePlanDetails.AgencyList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.DetourList }
     * 
     */
    public ResponsePlanDetails.DetourList createResponsePlanDetailsDetourList() {
        return new ResponsePlanDetails.DetourList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.RampMeteringControlActionList }
     * 
     */
    public ResponsePlanDetails.RampMeteringControlActionList createResponsePlanDetailsRampMeteringControlActionList() {
        return new ResponsePlanDetails.RampMeteringControlActionList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.IntersectionControlList }
     * 
     */
    public ResponsePlanDetails.IntersectionControlList createResponsePlanDetailsIntersectionControlList() {
        return new ResponsePlanDetails.IntersectionControlList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.DmsMessageList }
     * 
     */
    public ResponsePlanDetails.DmsMessageList createResponsePlanDetailsDmsMessageList() {
        return new ResponsePlanDetails.DmsMessageList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.HarMessageList }
     * 
     */
    public ResponsePlanDetails.HarMessageList createResponsePlanDetailsHarMessageList() {
        return new ResponsePlanDetails.HarMessageList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.InformationalMessageList }
     * 
     */
    public ResponsePlanDetails.InformationalMessageList createResponsePlanDetailsInformationalMessageList() {
        return new ResponsePlanDetails.InformationalMessageList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.LcsScheduleCancellationList }
     * 
     */
    public ResponsePlanDetails.LcsScheduleCancellationList createResponsePlanDetailsLcsScheduleCancellationList() {
        return new ResponsePlanDetails.LcsScheduleCancellationList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.PersonnelDeploymentList }
     * 
     */
    public ResponsePlanDetails.PersonnelDeploymentList createResponsePlanDetailsPersonnelDeploymentList() {
        return new ResponsePlanDetails.PersonnelDeploymentList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.AgencyApprovalDecisionList }
     * 
     */
    public ResponsePlanDetails.AgencyApprovalDecisionList createResponsePlanDetailsAgencyApprovalDecisionList() {
        return new ResponsePlanDetails.AgencyApprovalDecisionList();
    }

    /**
     * Create an instance of {@link ResponsePlanDetails.LogDetailList }
     * 
     */
    public ResponsePlanDetails.LogDetailList createResponsePlanDetailsLogDetailList() {
        return new ResponsePlanDetails.LogDetailList();
    }

    /**
     * Create an instance of {@link RampMeterStatus.MeteredStatusList }
     * 
     */
    public RampMeterStatus.MeteredStatusList createRampMeterStatusMeteredStatusList() {
        return new RampMeterStatus.MeteredStatusList();
    }

    /**
     * Create an instance of {@link RampMeterInventoryDetails.AssociatedDetectors }
     * 
     */
    public RampMeterInventoryDetails.AssociatedDetectors createRampMeterInventoryDetailsAssociatedDetectors() {
        return new RampMeterInventoryDetails.AssociatedDetectors();
    }

    /**
     * Create an instance of {@link RampMeterInventory.MeteredInventoryList }
     * 
     */
    public RampMeterInventory.MeteredInventoryList createRampMeterInventoryMeteredInventoryList() {
        return new RampMeterInventory.MeteredInventoryList();
    }

    /**
     * Create an instance of {@link OrganizationInformation.CenterContactList }
     * 
     */
    public OrganizationInformation.CenterContactList createOrganizationInformationCenterContactList() {
        return new OrganizationInformation.CenterContactList();
    }

    /**
     * Create an instance of {@link NodeStatus.NodeStatusList }
     * 
     */
    public NodeStatus.NodeStatusList createNodeStatusNodeStatusList() {
        return new NodeStatus.NodeStatusList();
    }

    /**
     * Create an instance of {@link NodeInventory.NodeInventoryList }
     * 
     */
    public NodeInventory.NodeInventoryList createNodeInventoryNodeInventoryList() {
        return new NodeInventory.NodeInventoryList();
    }

    /**
     * Create an instance of {@link org.tmdd._303.messages.LinkStatusList.LaneNumbers }
     * 
     */
    public org.tmdd._303.messages.LinkStatusList.LaneNumbers createLinkStatusListLaneNumbers() {
        return new org.tmdd._303.messages.LinkStatusList.LaneNumbers();
    }

    /**
     * Create an instance of {@link LinkStatus.LinkStatusList }
     * 
     */
    public LinkStatus.LinkStatusList createLinkStatusLinkStatusList() {
        return new LinkStatus.LinkStatusList();
    }

    /**
     * Create an instance of {@link LinkInventory.LinkInventoryList }
     * 
     */
    public LinkInventory.LinkInventoryList createLinkInventoryLinkInventoryList() {
        return new LinkInventory.LinkInventoryList();
    }

    /**
     * Create an instance of {@link IntersectionSignalTimingPatternInventory.PhaseTpList }
     * 
     */
    public IntersectionSignalTimingPatternInventory.PhaseTpList createIntersectionSignalTimingPatternInventoryPhaseTpList() {
        return new IntersectionSignalTimingPatternInventory.PhaseTpList();
    }

    /**
     * Create an instance of {@link IntersectionSignalTimingPatternInventory.SequenceInformation }
     * 
     */
    public IntersectionSignalTimingPatternInventory.SequenceInformation createIntersectionSignalTimingPatternInventorySequenceInformation() {
        return new IntersectionSignalTimingPatternInventory.SequenceInformation();
    }

    /**
     * Create an instance of {@link IntersectionSignalStatus.PhaseSplitList }
     * 
     */
    public IntersectionSignalStatus.PhaseSplitList createIntersectionSignalStatusPhaseSplitList() {
        return new IntersectionSignalStatus.PhaseSplitList();
    }

    /**
     * Create an instance of {@link IntersectionSignalStatus.RingStatusList }
     * 
     */
    public IntersectionSignalStatus.RingStatusList createIntersectionSignalStatusRingStatusList() {
        return new IntersectionSignalStatus.RingStatusList();
    }

    /**
     * Create an instance of {@link IntersectionSignalStatus.PhaseStatus }
     * 
     */
    public IntersectionSignalStatus.PhaseStatus createIntersectionSignalStatusPhaseStatus() {
        return new IntersectionSignalStatus.PhaseStatus();
    }

    /**
     * Create an instance of {@link IntersectionSignalStatus.OverlapStatus }
     * 
     */
    public IntersectionSignalStatus.OverlapStatus createIntersectionSignalStatusOverlapStatus() {
        return new IntersectionSignalStatus.OverlapStatus();
    }

    /**
     * Create an instance of {@link IntersectionSignalStatus.ActiveSpecialFunctionsList }
     * 
     */
    public IntersectionSignalStatus.ActiveSpecialFunctionsList createIntersectionSignalStatusActiveSpecialFunctionsList() {
        return new IntersectionSignalStatus.ActiveSpecialFunctionsList();
    }

    /**
     * Create an instance of {@link IntersectionSignalSequenceData.SequenceData }
     * 
     */
    public IntersectionSignalSequenceData.SequenceData createIntersectionSignalSequenceDataSequenceData() {
        return new IntersectionSignalSequenceData.SequenceData();
    }

    /**
     * Create an instance of {@link IntersectionSignalRing.RingPhaseAssignment }
     * 
     */
    public IntersectionSignalRing.RingPhaseAssignment createIntersectionSignalRingRingPhaseAssignment() {
        return new IntersectionSignalRing.RingPhaseAssignment();
    }

    /**
     * Create an instance of {@link IntersectionSignalOverlapPhase.OverlapIncludedPhases }
     * 
     */
    public IntersectionSignalOverlapPhase.OverlapIncludedPhases createIntersectionSignalOverlapPhaseOverlapIncludedPhases() {
        return new IntersectionSignalOverlapPhase.OverlapIncludedPhases();
    }

    /**
     * Create an instance of {@link IntersectionSignalOverlapPhase.ActiveMovementsList }
     * 
     */
    public IntersectionSignalOverlapPhase.ActiveMovementsList createIntersectionSignalOverlapPhaseActiveMovementsList() {
        return new IntersectionSignalOverlapPhase.ActiveMovementsList();
    }

    /**
     * Create an instance of {@link IntersectionSignalMovement.TurningMovementLanes }
     * 
     */
    public IntersectionSignalMovement.TurningMovementLanes createIntersectionSignalMovementTurningMovementLanes() {
        return new IntersectionSignalMovement.TurningMovementLanes();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventoryPhase.ConcurrentPhasesList }
     * 
     */
    public IntersectionSignalInventoryPhase.ConcurrentPhasesList createIntersectionSignalInventoryPhaseConcurrentPhasesList() {
        return new IntersectionSignalInventoryPhase.ConcurrentPhasesList();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventoryPhase.ActiveMovementsList }
     * 
     */
    public IntersectionSignalInventoryPhase.ActiveMovementsList createIntersectionSignalInventoryPhaseActiveMovementsList() {
        return new IntersectionSignalInventoryPhase.ActiveMovementsList();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventory.IntersectionLinkList }
     * 
     */
    public IntersectionSignalInventory.IntersectionLinkList createIntersectionSignalInventoryIntersectionLinkList() {
        return new IntersectionSignalInventory.IntersectionLinkList();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventory.MovementList }
     * 
     */
    public IntersectionSignalInventory.MovementList createIntersectionSignalInventoryMovementList() {
        return new IntersectionSignalInventory.MovementList();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventory.PhaseList }
     * 
     */
    public IntersectionSignalInventory.PhaseList createIntersectionSignalInventoryPhaseList() {
        return new IntersectionSignalInventory.PhaseList();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventory.OverlapPhaseList }
     * 
     */
    public IntersectionSignalInventory.OverlapPhaseList createIntersectionSignalInventoryOverlapPhaseList() {
        return new IntersectionSignalInventory.OverlapPhaseList();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventory.RingList }
     * 
     */
    public IntersectionSignalInventory.RingList createIntersectionSignalInventoryRingList() {
        return new IntersectionSignalInventory.RingList();
    }

    /**
     * Create an instance of {@link IntersectionSignalInventory.SpecialFunctionsList }
     * 
     */
    public IntersectionSignalInventory.SpecialFunctionsList createIntersectionSignalInventorySpecialFunctionsList() {
        return new IntersectionSignalInventory.SpecialFunctionsList();
    }

    /**
     * Create an instance of {@link ValidPeriod.EffectivePeriods }
     * 
     */
    public ValidPeriod.EffectivePeriods createValidPeriodEffectivePeriods() {
        return new ValidPeriod.EffectivePeriods();
    }

    /**
     * Create an instance of {@link RequestType.EventIds }
     * 
     */
    public RequestType.EventIds createRequestTypeEventIds() {
        return new RequestType.EventIds();
    }

    /**
     * Create an instance of {@link RequestType.ResponsePlanIds }
     * 
     */
    public RequestType.ResponsePlanIds createRequestTypeResponsePlanIds() {
        return new RequestType.ResponsePlanIds();
    }

    /**
     * Create an instance of {@link RequestLocation.AreaLocations }
     * 
     */
    public RequestLocation.AreaLocations createRequestLocationAreaLocations() {
        return new RequestLocation.AreaLocations();
    }

    /**
     * Create an instance of {@link RequestLocation.LinkDesignator }
     * 
     */
    public RequestLocation.LinkDesignator createRequestLocationLinkDesignator() {
        return new RequestLocation.LinkDesignator();
    }

    /**
     * Create an instance of {@link RequestHeader.OrganizationRequesting }
     * 
     */
    public RequestHeader.OrganizationRequesting createRequestHeaderOrganizationRequesting() {
        return new RequestHeader.OrganizationRequesting();
    }

    /**
     * Create an instance of {@link RequestFilter.HazmatCode }
     * 
     */
    public RequestFilter.HazmatCode createRequestFilterHazmatCode() {
        return new RequestFilter.HazmatCode();
    }

    /**
     * Create an instance of {@link RequestFilter.PlacardCode }
     * 
     */
    public RequestFilter.PlacardCode createRequestFilterPlacardCode() {
        return new RequestFilter.PlacardCode();
    }

    /**
     * Create an instance of {@link RequestFilter.OrganizationsRequested }
     * 
     */
    public RequestFilter.OrganizationsRequested createRequestFilterOrganizationsRequested() {
        return new RequestFilter.OrganizationsRequested();
    }

    /**
     * Create an instance of {@link RecurrentTime.ScheduleTimes }
     * 
     */
    public RecurrentTime.ScheduleTimes createRecurrentTimeScheduleTimes() {
        return new RecurrentTime.ScheduleTimes();
    }

    /**
     * Create an instance of {@link PointOnLink.CrossStreetDesignator }
     * 
     */
    public PointOnLink.CrossStreetDesignator createPointOnLinkCrossStreetDesignator() {
        return new PointOnLink.CrossStreetDesignator();
    }

    /**
     * Create an instance of {@link PointOnLink.CrossStreetName }
     * 
     */
    public PointOnLink.CrossStreetName createPointOnLinkCrossStreetName() {
        return new PointOnLink.CrossStreetName();
    }

    /**
     * Create an instance of {@link PointOnLink.SignedDestination }
     * 
     */
    public PointOnLink.SignedDestination createPointOnLinkSignedDestination() {
        return new PointOnLink.SignedDestination();
    }

    /**
     * Create an instance of {@link MessageHeader.OrganizationsReceiving }
     * 
     */
    public MessageHeader.OrganizationsReceiving createMessageHeaderOrganizationsReceiving() {
        return new MessageHeader.OrganizationsReceiving();
    }

    /**
     * Create an instance of {@link MessageHeader.OrganizationsResponding }
     * 
     */
    public MessageHeader.OrganizationsResponding createMessageHeaderOrganizationsResponding() {
        return new MessageHeader.OrganizationsResponding();
    }

    /**
     * Create an instance of {@link LinkLocation.AlternateDesignations }
     * 
     */
    public LinkLocation.AlternateDesignations createLinkLocationAlternateDesignations() {
        return new LinkLocation.AlternateDesignations();
    }

    /**
     * Create an instance of {@link FullEventUpdate.ProjectReferences }
     * 
     */
    public FullEventUpdate.ProjectReferences createFullEventUpdateProjectReferences() {
        return new FullEventUpdate.ProjectReferences();
    }

    /**
     * Create an instance of {@link FullEventUpdate.EventIndicators }
     * 
     */
    public FullEventUpdate.EventIndicators createFullEventUpdateEventIndicators() {
        return new FullEventUpdate.EventIndicators();
    }

    /**
     * Create an instance of {@link FullEventUpdate.OtherReferences }
     * 
     */
    public FullEventUpdate.OtherReferences createFullEventUpdateOtherReferences() {
        return new FullEventUpdate.OtherReferences();
    }

    /**
     * Create an instance of {@link FullEventUpdate.EventElementDetails }
     * 
     */
    public FullEventUpdate.EventElementDetails createFullEventUpdateEventElementDetails() {
        return new FullEventUpdate.EventElementDetails();
    }

    /**
     * Create an instance of {@link FullEventUpdate.FullReportTexts }
     * 
     */
    public FullEventUpdate.FullReportTexts createFullEventUpdateFullReportTexts() {
        return new FullEventUpdate.FullReportTexts();
    }

    /**
     * Create an instance of {@link EventTimes.ScheduleElementIds }
     * 
     */
    public EventTimes.ScheduleElementIds createEventTimesScheduleElementIds() {
        return new EventTimes.ScheduleElementIds();
    }

    /**
     * Create an instance of {@link EventTimes.RecurrentTimes }
     * 
     */
    public EventTimes.RecurrentTimes createEventTimesRecurrentTimes() {
        return new EventTimes.RecurrentTimes();
    }

    /**
     * Create an instance of {@link EventLane.EventLanesAffected }
     * 
     */
    public EventLane.EventLanesAffected createEventLaneEventLanesAffected() {
        return new EventLane.EventLanesAffected();
    }

    /**
     * Create an instance of {@link EventElementDetail.EventDescriptions }
     * 
     */
    public EventElementDetail.EventDescriptions createEventElementDetailEventDescriptions() {
        return new EventElementDetail.EventDescriptions();
    }

    /**
     * Create an instance of {@link EventElementDetail.EventLocations }
     * 
     */
    public EventElementDetail.EventLocations createEventElementDetailEventLocations() {
        return new EventElementDetail.EventLocations();
    }

    /**
     * Create an instance of {@link EventElementDetail.EventLanes }
     * 
     */
    public EventElementDetail.EventLanes createEventElementDetailEventLanes() {
        return new EventElementDetail.EventLanes();
    }

    /**
     * Create an instance of {@link EventElementDetail.EventTransitLocations }
     * 
     */
    public EventElementDetail.EventTransitLocations createEventElementDetailEventTransitLocations() {
        return new EventElementDetail.EventTransitLocations();
    }

    /**
     * Create an instance of {@link EventElementDetail.EventHazmatDetails }
     * 
     */
    public EventElementDetail.EventHazmatDetails createEventElementDetailEventHazmatDetails() {
        return new EventElementDetail.EventHazmatDetails();
    }

    /**
     * Create an instance of {@link AlternateRouteDetail.LocationOnAlternateRoute }
     * 
     */
    public AlternateRouteDetail.LocationOnAlternateRoute createAlternateRouteDetailLocationOnAlternateRoute() {
        return new AlternateRouteDetail.LocationOnAlternateRoute();
    }

    /**
     * Create an instance of {@link ESSStatus.EssSensorList }
     * 
     */
    public ESSStatus.EssSensorList createESSStatusEssSensorList() {
        return new ESSStatus.EssSensorList();
    }

    /**
     * Create an instance of {@link ESSObservationReport.EssDataList }
     * 
     */
    public ESSObservationReport.EssDataList createESSObservationReportEssDataList() {
        return new ESSObservationReport.EssDataList();
    }

    /**
     * Create an instance of {@link ESSInventory.EssInventoryList }
     * 
     */
    public ESSInventory.EssInventoryList createESSInventoryEssInventoryList() {
        return new ESSInventory.EssInventoryList();
    }

    /**
     * Create an instance of {@link DevicePriorityQueueHeader.DevicePriorityQueueList }
     * 
     */
    public DevicePriorityQueueHeader.DevicePriorityQueueList createDevicePriorityQueueHeaderDevicePriorityQueueList() {
        return new DevicePriorityQueueHeader.DevicePriorityQueueList();
    }

    /**
     * Create an instance of {@link DeviceInformationRequestFilter.DeviceIdList }
     * 
     */
    public DeviceInformationRequestFilter.DeviceIdList createDeviceInformationRequestFilterDeviceIdList() {
        return new DeviceInformationRequestFilter.DeviceIdList();
    }

    /**
     * Create an instance of {@link DeviceInformationRequestFilter.NetworkIdList }
     * 
     */
    public DeviceInformationRequestFilter.NetworkIdList createDeviceInformationRequestFilterNetworkIdList() {
        return new DeviceInformationRequestFilter.NetworkIdList();
    }

    /**
     * Create an instance of {@link DeviceInformationRequestFilter.LinkIdList }
     * 
     */
    public DeviceInformationRequestFilter.LinkIdList createDeviceInformationRequestFilterLinkIdList() {
        return new DeviceInformationRequestFilter.LinkIdList();
    }

    /**
     * Create an instance of {@link DeviceInformationRequestFilter.LinkDesignatorList }
     * 
     */
    public DeviceInformationRequestFilter.LinkDesignatorList createDeviceInformationRequestFilterLinkDesignatorList() {
        return new DeviceInformationRequestFilter.LinkDesignatorList();
    }

    /**
     * Create an instance of {@link DeviceInformationRequestFilter.SectionIdList }
     * 
     */
    public DeviceInformationRequestFilter.SectionIdList createDeviceInformationRequestFilterSectionIdList() {
        return new DeviceInformationRequestFilter.SectionIdList();
    }

    /**
     * Create an instance of {@link DeviceInformationRequestFilter.PatternIdList }
     * 
     */
    public DeviceInformationRequestFilter.PatternIdList createDeviceInformationRequestFilterPatternIdList() {
        return new DeviceInformationRequestFilter.PatternIdList();
    }

    /**
     * Create an instance of {@link DeviceInformationRequestFilter.CenterIdList }
     * 
     */
    public DeviceInformationRequestFilter.CenterIdList createDeviceInformationRequestFilterCenterIdList() {
        return new DeviceInformationRequestFilter.CenterIdList();
    }

    /**
     * Create an instance of {@link DetectorStatus.DetectorStatusList }
     * 
     */
    public DetectorStatus.DetectorStatusList createDetectorStatusDetectorStatusList() {
        return new DetectorStatus.DetectorStatusList();
    }

    /**
     * Create an instance of {@link DetectorInventoryDetails.DetectionLanes }
     * 
     */
    public DetectorInventoryDetails.DetectionLanes createDetectorInventoryDetailsDetectionLanes() {
        return new DetectorInventoryDetails.DetectionLanes();
    }

    /**
     * Create an instance of {@link DetectorInventory.DetectorInventoryList }
     * 
     */
    public DetectorInventory.DetectorInventoryList createDetectorInventoryDetectorInventoryList() {
        return new DetectorInventory.DetectorInventoryList();
    }

    /**
     * Create an instance of {@link DetectorData.DetectorDataList }
     * 
     */
    public DetectorData.DetectorDataList createDetectorDataDetectorDataList() {
        return new DetectorData.DetectorDataList();
    }

    /**
     * Create an instance of {@link CCTVStatus.CctvImageList }
     * 
     */
    public CCTVStatus.CctvImageList createCCTVStatusCctvImageList() {
        return new CCTVStatus.CctvImageList();
    }

    /**
     * Create an instance of {@link CCTVInventory.CctvRequestsSupportedList }
     * 
     */
    public CCTVInventory.CctvRequestsSupportedList createCCTVInventoryCctvRequestsSupportedList() {
        return new CCTVInventory.CctvRequestsSupportedList();
    }

    /**
     * Create an instance of {@link CCTVInventory.CctvImageList }
     * 
     */
    public CCTVInventory.CctvImageList createCCTVInventoryCctvImageList() {
        return new CCTVInventory.CctvImageList();
    }

    /**
     * Create an instance of {@link TrafficNetworkInformationRequest.NetworkIdentifiers }
     * 
     */
    public TrafficNetworkInformationRequest.NetworkIdentifiers createTrafficNetworkInformationRequestNetworkIdentifiers() {
        return new TrafficNetworkInformationRequest.NetworkIdentifiers();
    }

    /**
     * Create an instance of {@link TrafficNetworkInformationRequest.RoadwayNetworkIdList }
     * 
     */
    public TrafficNetworkInformationRequest.RoadwayNetworkIdList createTrafficNetworkInformationRequestRoadwayNetworkIdList() {
        return new TrafficNetworkInformationRequest.RoadwayNetworkIdList();
    }

    /**
     * Create an instance of {@link ResponsePlanTerminationRequest.ResponsePlanIdList }
     * 
     */
    public ResponsePlanTerminationRequest.ResponsePlanIdList createResponsePlanTerminationRequestResponsePlanIdList() {
        return new ResponsePlanTerminationRequest.ResponsePlanIdList();
    }

    /**
     * Create an instance of {@link RampMeterControlRequest.MeteredLaneList }
     * 
     */
    public RampMeterControlRequest.MeteredLaneList createRampMeterControlRequestMeteredLaneList() {
        return new RampMeterControlRequest.MeteredLaneList();
    }

    /**
     * Create an instance of {@link OrganizationInformationRequest.CenterIdList }
     * 
     */
    public OrganizationInformationRequest.CenterIdList createOrganizationInformationRequestCenterIdList() {
        return new OrganizationInformationRequest.CenterIdList();
    }

    /**
     * Create an instance of {@link EventFilterRequest.RequestFilters }
     * 
     */
    public EventFilterRequest.RequestFilters createEventFilterRequestRequestFilters() {
        return new EventFilterRequest.RequestFilters();
    }

    /**
     * Create an instance of {@link EventFilterRequest.RequestLocations }
     * 
     */
    public EventFilterRequest.RequestLocations createEventFilterRequestRequestLocations() {
        return new EventFilterRequest.RequestLocations();
    }

    /**
     * Create an instance of {@link ESSObservationMetadata.EssCollectorConfiguration }
     * 
     */
    public ESSObservationMetadata.EssCollectorConfiguration createESSObservationMetadataEssCollectorConfiguration() {
        return new ESSObservationMetadata.EssCollectorConfiguration();
    }

    /**
     * Create an instance of {@link ESSObservationMetadata.EssSensorMetadataList }
     * 
     */
    public ESSObservationMetadata.EssSensorMetadataList createESSObservationMetadataEssSensorMetadataList() {
        return new ESSObservationMetadata.EssSensorMetadataList();
    }

    /**
     * Create an instance of {@link DMSFontTable.CharacterTable }
     * 
     */
    public DMSFontTable.CharacterTable createDMSFontTableCharacterTable() {
        return new DMSFontTable.CharacterTable();
    }

    /**
     * Create an instance of {@link DevicePriorityQueueRequest.DeviceIdList }
     * 
     */
    public DevicePriorityQueueRequest.DeviceIdList createDevicePriorityQueueRequestDeviceIdList() {
        return new DevicePriorityQueueRequest.DeviceIdList();
    }

    /**
     * Create an instance of {@link DetectorMaintenanceHistory.DetectorHistoryList }
     * 
     */
    public DetectorMaintenanceHistory.DetectorHistoryList createDetectorMaintenanceHistoryDetectorHistoryList() {
        return new DetectorMaintenanceHistory.DetectorHistoryList();
    }

    /**
     * Create an instance of {@link ArchivedDataTrafficMonitoringMetadata.DataSetRoadwayNetworkIdList }
     * 
     */
    public ArchivedDataTrafficMonitoringMetadata.DataSetRoadwayNetworkIdList createArchivedDataTrafficMonitoringMetadataDataSetRoadwayNetworkIdList() {
        return new ArchivedDataTrafficMonitoringMetadata.DataSetRoadwayNetworkIdList();
    }

    /**
     * Create an instance of {@link ArchivedDataTrafficMonitoringMetadata.DataSetLinkIdList }
     * 
     */
    public ArchivedDataTrafficMonitoringMetadata.DataSetLinkIdList createArchivedDataTrafficMonitoringMetadataDataSetLinkIdList() {
        return new ArchivedDataTrafficMonitoringMetadata.DataSetLinkIdList();
    }

    /**
     * Create an instance of {@link ArchivedDataTrafficMonitoringMetadata.DataSetRouteDesignatorList }
     * 
     */
    public ArchivedDataTrafficMonitoringMetadata.DataSetRouteDesignatorList createArchivedDataTrafficMonitoringMetadataDataSetRouteDesignatorList() {
        return new ArchivedDataTrafficMonitoringMetadata.DataSetRouteDesignatorList();
    }

    /**
     * Create an instance of {@link ArchivedDataTrafficMonitoringMetadata.DataSetLinearReferenceList }
     * 
     */
    public ArchivedDataTrafficMonitoringMetadata.DataSetLinearReferenceList createArchivedDataTrafficMonitoringMetadataDataSetLinearReferenceList() {
        return new ArchivedDataTrafficMonitoringMetadata.DataSetLinearReferenceList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchivedDataProcessingDocumentationMetadataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "archivedDataProcessingDocumentationMetadataRequestMsg")
    public JAXBElement<ArchivedDataProcessingDocumentationMetadataRequest> createArchivedDataProcessingDocumentationMetadataRequestMsg(ArchivedDataProcessingDocumentationMetadataRequest value) {
        return new JAXBElement<ArchivedDataProcessingDocumentationMetadataRequest>(_ArchivedDataProcessingDocumentationMetadataRequestMsg_QNAME, ArchivedDataProcessingDocumentationMetadataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchivedDataTrafficMonitoringMetadataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "archivedDataTrafficMonitoringMetadataRequestMsg")
    public JAXBElement<ArchivedDataTrafficMonitoringMetadataRequest> createArchivedDataTrafficMonitoringMetadataRequestMsg(ArchivedDataTrafficMonitoringMetadataRequest value) {
        return new JAXBElement<ArchivedDataTrafficMonitoringMetadataRequest>(_ArchivedDataTrafficMonitoringMetadataRequestMsg_QNAME, ArchivedDataTrafficMonitoringMetadataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCTVControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "cCTVControlRequestMsg")
    public JAXBElement<CCTVControlRequest> createCCTVControlRequestMsg(CCTVControlRequest value) {
        return new JAXBElement<CCTVControlRequest>(_CCTVControlRequestMsg_QNAME, CCTVControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCTVInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "cCTVInventoryMsg")
    public JAXBElement<CCTVInventoryMsg> createCCTVInventoryMsg(CCTVInventoryMsg value) {
        return new JAXBElement<CCTVInventoryMsg>(_CCTVInventoryMsg_QNAME, CCTVInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CCTVStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "cCTVStatusMsg")
    public JAXBElement<CCTVStatusMsg> createCCTVStatusMsg(CCTVStatusMsg value) {
        return new JAXBElement<CCTVStatusMsg>(_CCTVStatusMsg_QNAME, CCTVStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CenterActiveVerificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "centerActiveVerificationRequestMsg")
    public JAXBElement<CenterActiveVerificationRequest> createCenterActiveVerificationRequestMsg(CenterActiveVerificationRequest value) {
        return new JAXBElement<CenterActiveVerificationRequest>(_CenterActiveVerificationRequestMsg_QNAME, CenterActiveVerificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CenterActiveVerificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "centerActiveVerificationResponseMsg")
    public JAXBElement<CenterActiveVerificationResponse> createCenterActiveVerificationResponseMsg(CenterActiveVerificationResponse value) {
        return new JAXBElement<CenterActiveVerificationResponse>(_CenterActiveVerificationResponseMsg_QNAME, CenterActiveVerificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "errorReportMsg")
    public JAXBElement<ErrorReport> createErrorReportMsg(ErrorReport value) {
        return new JAXBElement<ErrorReport>(_ErrorReportMsg_QNAME, ErrorReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectorDataMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "detectorDataMsg")
    public JAXBElement<DetectorDataMsg> createDetectorDataMsg(DetectorDataMsg value) {
        return new JAXBElement<DetectorDataMsg>(_DetectorDataMsg_QNAME, DetectorDataMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectorDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "detectorDataRequestMsg")
    public JAXBElement<DetectorDataRequest> createDetectorDataRequestMsg(DetectorDataRequest value) {
        return new JAXBElement<DetectorDataRequest>(_DetectorDataRequestMsg_QNAME, DetectorDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectorInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "detectorInventoryMsg")
    public JAXBElement<DetectorInventoryMsg> createDetectorInventoryMsg(DetectorInventoryMsg value) {
        return new JAXBElement<DetectorInventoryMsg>(_DetectorInventoryMsg_QNAME, DetectorInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectorMaintenanceHistoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "detectorMaintenanceHistoryRequestMsg")
    public JAXBElement<DetectorMaintenanceHistoryRequest> createDetectorMaintenanceHistoryRequestMsg(DetectorMaintenanceHistoryRequest value) {
        return new JAXBElement<DetectorMaintenanceHistoryRequest>(_DetectorMaintenanceHistoryRequestMsg_QNAME, DetectorMaintenanceHistoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectorStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "detectorStatusMsg")
    public JAXBElement<DetectorStatusMsg> createDetectorStatusMsg(DetectorStatusMsg value) {
        return new JAXBElement<DetectorStatusMsg>(_DetectorStatusMsg_QNAME, DetectorStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceCancelControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "deviceCancelControlRequestMsg")
    public JAXBElement<DeviceCancelControlRequest> createDeviceCancelControlRequestMsg(DeviceCancelControlRequest value) {
        return new JAXBElement<DeviceCancelControlRequest>(_DeviceCancelControlRequestMsg_QNAME, DeviceCancelControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "deviceControlResponseMsg")
    public JAXBElement<DeviceControlResponse> createDeviceControlResponseMsg(DeviceControlResponse value) {
        return new JAXBElement<DeviceControlResponse>(_DeviceControlResponseMsg_QNAME, DeviceControlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceControlStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "deviceControlStatusRequestMsg")
    public JAXBElement<DeviceControlStatusRequest> createDeviceControlStatusRequestMsg(DeviceControlStatusRequest value) {
        return new JAXBElement<DeviceControlStatusRequest>(_DeviceControlStatusRequestMsg_QNAME, DeviceControlStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "deviceInformationRequestMsg")
    public JAXBElement<DeviceInformationRequest> createDeviceInformationRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_DeviceInformationRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "cCTVInventoryRequestMsg")
    public JAXBElement<DeviceInformationRequest> createCCTVInventoryRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_CCTVInventoryRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "cCTVStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createCCTVStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_CCTVStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "detectorInventoryRequestMsg")
    public JAXBElement<DeviceInformationRequest> createDetectorInventoryRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_DetectorInventoryRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "detectorStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createDetectorStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_DetectorStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSInventoryRequestMsg")
    public JAXBElement<DeviceInformationRequest> createDMSInventoryRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_DMSInventoryRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createDMSStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_DMSStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eSSInventoryRequestMsg")
    public JAXBElement<DeviceInformationRequest> createESSInventoryRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_ESSInventoryRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eSSStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createESSStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_ESSStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eSSObservationMetadataRequestMsg")
    public JAXBElement<DeviceInformationRequest> createESSObservationMetadataRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_ESSObservationMetadataRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eSSObservationReportRequestMsg")
    public JAXBElement<DeviceInformationRequest> createESSObservationReportRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_ESSObservationReportRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "gateInventoryRequestMsg")
    public JAXBElement<DeviceInformationRequest> createGateInventoryRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_GateInventoryRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "gateStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createGateStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_GateStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "gateControlScheduleRequestMsg")
    public JAXBElement<DeviceInformationRequest> createGateControlScheduleRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_GateControlScheduleRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "hARInventoryRequestMsg")
    public JAXBElement<DeviceInformationRequest> createHARInventoryRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_HARInventoryRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "hARMessageInventoryRequestMsg")
    public JAXBElement<DeviceInformationRequest> createHARMessageInventoryRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_HARMessageInventoryRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "hARStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createHARStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_HARStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "hARControlScheduleRequestMsg")
    public JAXBElement<DeviceInformationRequest> createHARControlScheduleRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_HARControlScheduleRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalInventoryRequestMsg")
    public JAXBElement<DeviceInformationRequest> createIntersectionSignalInventoryRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_IntersectionSignalInventoryRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createIntersectionSignalStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_IntersectionSignalStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalControlScheduleRequestMsg")
    public JAXBElement<DeviceInformationRequest> createIntersectionSignalControlScheduleRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_IntersectionSignalControlScheduleRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "cSStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createCSStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_CSStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "cSControlScheduleRequestMsg")
    public JAXBElement<DeviceInformationRequest> createCSControlScheduleRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_CSControlScheduleRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "rampMeterInventoryRequestMsg")
    public JAXBElement<DeviceInformationRequest> createRampMeterInventoryRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_RampMeterInventoryRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "rampMeterStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createRampMeterStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_RampMeterStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "rampMeterControlScheduleRequestMsg")
    public JAXBElement<DeviceInformationRequest> createRampMeterControlScheduleRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_RampMeterControlScheduleRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createSectionStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_SectionStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionControlScheduleRequestMsg")
    public JAXBElement<DeviceInformationRequest> createSectionControlScheduleRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_SectionControlScheduleRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "videoSwitchInventoryRequestMsg")
    public JAXBElement<DeviceInformationRequest> createVideoSwitchInventoryRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_VideoSwitchInventoryRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "videoSwitchStatusRequestMsg")
    public JAXBElement<DeviceInformationRequest> createVideoSwitchStatusRequestMsg(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_VideoSwitchStatusRequestMsg_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "cSInventoryRequest")
    public JAXBElement<DeviceInformationRequest> createCSInventoryRequest(DeviceInformationRequest value) {
        return new JAXBElement<DeviceInformationRequest>(_CSInventoryRequest_QNAME, DeviceInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevicePriorityQueueRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "devicePriorityQueueRequestMsg")
    public JAXBElement<DevicePriorityQueueRequest> createDevicePriorityQueueRequestMsg(DevicePriorityQueueRequest value) {
        return new JAXBElement<DevicePriorityQueueRequest>(_DevicePriorityQueueRequestMsg_QNAME, DevicePriorityQueueRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevicePriorityQueueRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSPriorityQueueRequestMsg")
    public JAXBElement<DevicePriorityQueueRequest> createDMSPriorityQueueRequestMsg(DevicePriorityQueueRequest value) {
        return new JAXBElement<DevicePriorityQueueRequest>(_DMSPriorityQueueRequestMsg_QNAME, DevicePriorityQueueRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevicePriorityQueueRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "hARPriorityQueueRequestMsg")
    public JAXBElement<DevicePriorityQueueRequest> createHARPriorityQueueRequestMsg(DevicePriorityQueueRequest value) {
        return new JAXBElement<DevicePriorityQueueRequest>(_HARPriorityQueueRequestMsg_QNAME, DevicePriorityQueueRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevicePriorityQueueRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalPriorityQueueRequestMsg")
    public JAXBElement<DevicePriorityQueueRequest> createIntersectionSignalPriorityQueueRequestMsg(DevicePriorityQueueRequest value) {
        return new JAXBElement<DevicePriorityQueueRequest>(_IntersectionSignalPriorityQueueRequestMsg_QNAME, DevicePriorityQueueRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevicePriorityQueueRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "rampMeterPriorityQueueRequestMsg")
    public JAXBElement<DevicePriorityQueueRequest> createRampMeterPriorityQueueRequestMsg(DevicePriorityQueueRequest value) {
        return new JAXBElement<DevicePriorityQueueRequest>(_RampMeterPriorityQueueRequestMsg_QNAME, DevicePriorityQueueRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevicePriorityQueueRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionPriorityQueueRequestMsg")
    public JAXBElement<DevicePriorityQueueRequest> createSectionPriorityQueueRequestMsg(DevicePriorityQueueRequest value) {
        return new JAXBElement<DevicePriorityQueueRequest>(_SectionPriorityQueueRequestMsg_QNAME, DevicePriorityQueueRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMSControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSControlRequestMsg")
    public JAXBElement<DMSControlRequest> createDMSControlRequestMsg(DMSControlRequest value) {
        return new JAXBElement<DMSControlRequest>(_DMSControlRequestMsg_QNAME, DMSControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMSFontTableRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSFontTableRequestMsg")
    public JAXBElement<DMSFontTableRequest> createDMSFontTableRequestMsg(DMSFontTableRequest value) {
        return new JAXBElement<DMSFontTableRequest>(_DMSFontTableRequestMsg_QNAME, DMSFontTableRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMSInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSInventoryMsg")
    public JAXBElement<DMSInventoryMsg> createDMSInventoryMsg(DMSInventoryMsg value) {
        return new JAXBElement<DMSInventoryMsg>(_DMSInventoryMsg_QNAME, DMSInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMSMessageAppearance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSMessageAppearanceMsg")
    public JAXBElement<DMSMessageAppearance> createDMSMessageAppearanceMsg(DMSMessageAppearance value) {
        return new JAXBElement<DMSMessageAppearance>(_DMSMessageAppearanceMsg_QNAME, DMSMessageAppearance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMSMessageAppearanceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSMessageAppearanceRequestMsg")
    public JAXBElement<DMSMessageAppearanceRequest> createDMSMessageAppearanceRequestMsg(DMSMessageAppearanceRequest value) {
        return new JAXBElement<DMSMessageAppearanceRequest>(_DMSMessageAppearanceRequestMsg_QNAME, DMSMessageAppearanceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMSMessageInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSMessageInventoryMsg")
    public JAXBElement<DMSMessageInventoryMsg> createDMSMessageInventoryMsg(DMSMessageInventoryMsg value) {
        return new JAXBElement<DMSMessageInventoryMsg>(_DMSMessageInventoryMsg_QNAME, DMSMessageInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMSMessageInventoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSMessageInventoryRequestMsg")
    public JAXBElement<DMSMessageInventoryRequest> createDMSMessageInventoryRequestMsg(DMSMessageInventoryRequest value) {
        return new JAXBElement<DMSMessageInventoryRequest>(_DMSMessageInventoryRequestMsg_QNAME, DMSMessageInventoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMSStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "dMSStatusMsg")
    public JAXBElement<DMSStatusMsg> createDMSStatusMsg(DMSStatusMsg value) {
        return new JAXBElement<DMSStatusMsg>(_DMSStatusMsg_QNAME, DMSStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESSInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eSSInventoryMsg")
    public JAXBElement<ESSInventoryMsg> createESSInventoryMsg(ESSInventoryMsg value) {
        return new JAXBElement<ESSInventoryMsg>(_ESSInventoryMsg_QNAME, ESSInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESSObservationReportMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eSSObservationReportMsg")
    public JAXBElement<ESSObservationReportMsg> createESSObservationReportMsg(ESSObservationReportMsg value) {
        return new JAXBElement<ESSObservationReportMsg>(_ESSObservationReportMsg_QNAME, ESSObservationReportMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESSStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eSSStatusMsg")
    public JAXBElement<ESSStatusMsg> createESSStatusMsg(ESSStatusMsg value) {
        return new JAXBElement<ESSStatusMsg>(_ESSStatusMsg_QNAME, ESSStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionLogMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "actionLogMsg")
    public JAXBElement<ActionLogMsg> createActionLogMsg(ActionLogMsg value) {
        return new JAXBElement<ActionLogMsg>(_ActionLogMsg_QNAME, ActionLogMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventIndexMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eventIndexMsg")
    public JAXBElement<EventIndexMsg> createEventIndexMsg(EventIndexMsg value) {
        return new JAXBElement<EventIndexMsg>(_EventIndexMsg_QNAME, EventIndexMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventFilterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eventRequestMsg")
    public JAXBElement<EventFilterRequest> createEventRequestMsg(EventFilterRequest value) {
        return new JAXBElement<EventFilterRequest>(_EventRequestMsg_QNAME, EventFilterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventFilterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "fullEventUpdateRequestMsg")
    public JAXBElement<EventFilterRequest> createFullEventUpdateRequestMsg(EventFilterRequest value) {
        return new JAXBElement<EventFilterRequest>(_FullEventUpdateRequestMsg_QNAME, EventFilterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventFilterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eventIndexRequestMsg")
    public JAXBElement<EventFilterRequest> createEventIndexRequestMsg(EventFilterRequest value) {
        return new JAXBElement<EventFilterRequest>(_EventIndexRequestMsg_QNAME, EventFilterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventFilterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "actionLogRequestMsg")
    public JAXBElement<EventFilterRequest> createActionLogRequestMsg(EventFilterRequest value) {
        return new JAXBElement<EventFilterRequest>(_ActionLogRequestMsg_QNAME, EventFilterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FEUMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "fEUMsg")
    public JAXBElement<FEUMsg> createFEUMsg(FEUMsg value) {
        return new JAXBElement<FEUMsg>(_FEUMsg_QNAME, FEUMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GateControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "gateControlRequestMsg")
    public JAXBElement<GateControlRequest> createGateControlRequestMsg(GateControlRequest value) {
        return new JAXBElement<GateControlRequest>(_GateControlRequestMsg_QNAME, GateControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GateControlScheduleMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "gateControlScheduleMsg")
    public JAXBElement<GateControlScheduleMsg> createGateControlScheduleMsg(GateControlScheduleMsg value) {
        return new JAXBElement<GateControlScheduleMsg>(_GateControlScheduleMsg_QNAME, GateControlScheduleMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GateInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "gateInventoryMsg")
    public JAXBElement<GateInventoryMsg> createGateInventoryMsg(GateInventoryMsg value) {
        return new JAXBElement<GateInventoryMsg>(_GateInventoryMsg_QNAME, GateInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GateStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "gateStatusMsg")
    public JAXBElement<GateStatusMsg> createGateStatusMsg(GateStatusMsg value) {
        return new JAXBElement<GateStatusMsg>(_GateStatusMsg_QNAME, GateStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HARControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "hARControlRequestMsg")
    public JAXBElement<HARControlRequest> createHARControlRequestMsg(HARControlRequest value) {
        return new JAXBElement<HARControlRequest>(_HARControlRequestMsg_QNAME, HARControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HARControlScheduleMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "hARControlScheduleMsg")
    public JAXBElement<HARControlScheduleMsg> createHARControlScheduleMsg(HARControlScheduleMsg value) {
        return new JAXBElement<HARControlScheduleMsg>(_HARControlScheduleMsg_QNAME, HARControlScheduleMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HARInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "hARInventoryMsg")
    public JAXBElement<HARInventoryMsg> createHARInventoryMsg(HARInventoryMsg value) {
        return new JAXBElement<HARInventoryMsg>(_HARInventoryMsg_QNAME, HARInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HARMessageInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "hARMessageInventoryMsg")
    public JAXBElement<HARMessageInventoryMsg> createHARMessageInventoryMsg(HARMessageInventoryMsg value) {
        return new JAXBElement<HARMessageInventoryMsg>(_HARMessageInventoryMsg_QNAME, HARMessageInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HARStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "hARStatusMsg")
    public JAXBElement<HARStatusMsg> createHARStatusMsg(HARStatusMsg value) {
        return new JAXBElement<HARStatusMsg>(_HARStatusMsg_QNAME, HARStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionSignalControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalControlRequestMsg")
    public JAXBElement<IntersectionSignalControlRequest> createIntersectionSignalControlRequestMsg(IntersectionSignalControlRequest value) {
        return new JAXBElement<IntersectionSignalControlRequest>(_IntersectionSignalControlRequestMsg_QNAME, IntersectionSignalControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionSignalControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalControlResponseMsg")
    public JAXBElement<IntersectionSignalControlResponse> createIntersectionSignalControlResponseMsg(IntersectionSignalControlResponse value) {
        return new JAXBElement<IntersectionSignalControlResponse>(_IntersectionSignalControlResponseMsg_QNAME, IntersectionSignalControlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionSignalControlScheduleMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalControlScheduleMsg")
    public JAXBElement<IntersectionSignalControlScheduleMsg> createIntersectionSignalControlScheduleMsg(IntersectionSignalControlScheduleMsg value) {
        return new JAXBElement<IntersectionSignalControlScheduleMsg>(_IntersectionSignalControlScheduleMsg_QNAME, IntersectionSignalControlScheduleMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionSignalInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalInventoryMsg")
    public JAXBElement<IntersectionSignalInventoryMsg> createIntersectionSignalInventoryMsg(IntersectionSignalInventoryMsg value) {
        return new JAXBElement<IntersectionSignalInventoryMsg>(_IntersectionSignalInventoryMsg_QNAME, IntersectionSignalInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionSignalStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalStatusMsg")
    public JAXBElement<IntersectionSignalStatusMsg> createIntersectionSignalStatusMsg(IntersectionSignalStatusMsg value) {
        return new JAXBElement<IntersectionSignalStatusMsg>(_IntersectionSignalStatusMsg_QNAME, IntersectionSignalStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionSignalTimingPatternInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalTimingPatternInventoryMsg")
    public JAXBElement<IntersectionSignalTimingPatternInventoryMsg> createIntersectionSignalTimingPatternInventoryMsg(IntersectionSignalTimingPatternInventoryMsg value) {
        return new JAXBElement<IntersectionSignalTimingPatternInventoryMsg>(_IntersectionSignalTimingPatternInventoryMsg_QNAME, IntersectionSignalTimingPatternInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntersectionSignalTimingPatternInventoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "intersectionSignalTimingPatternInventoryRequestMsg")
    public JAXBElement<IntersectionSignalTimingPatternInventoryRequest> createIntersectionSignalTimingPatternInventoryRequestMsg(IntersectionSignalTimingPatternInventoryRequest value) {
        return new JAXBElement<IntersectionSignalTimingPatternInventoryRequest>(_IntersectionSignalTimingPatternInventoryRequestMsg_QNAME, IntersectionSignalTimingPatternInventoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LCSControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "lCSControlRequestMsg")
    public JAXBElement<LCSControlRequest> createLCSControlRequestMsg(LCSControlRequest value) {
        return new JAXBElement<LCSControlRequest>(_LCSControlRequestMsg_QNAME, LCSControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LCSControlScheduleMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "lCSControlScheduleMsg")
    public JAXBElement<LCSControlScheduleMsg> createLCSControlScheduleMsg(LCSControlScheduleMsg value) {
        return new JAXBElement<LCSControlScheduleMsg>(_LCSControlScheduleMsg_QNAME, LCSControlScheduleMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LCSInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "lCSInventoryMsg")
    public JAXBElement<LCSInventoryMsg> createLCSInventoryMsg(LCSInventoryMsg value) {
        return new JAXBElement<LCSInventoryMsg>(_LCSInventoryMsg_QNAME, LCSInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LCSStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "lCSStatusMsg")
    public JAXBElement<LCSStatusMsg> createLCSStatusMsg(LCSStatusMsg value) {
        return new JAXBElement<LCSStatusMsg>(_LCSStatusMsg_QNAME, LCSStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "linkInventoryMsg")
    public JAXBElement<LinkInventoryMsg> createLinkInventoryMsg(LinkInventoryMsg value) {
        return new JAXBElement<LinkInventoryMsg>(_LinkInventoryMsg_QNAME, LinkInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "linkStatusMsg")
    public JAXBElement<LinkStatusMsg> createLinkStatusMsg(LinkStatusMsg value) {
        return new JAXBElement<LinkStatusMsg>(_LinkStatusMsg_QNAME, LinkStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "nodeInventoryMsg")
    public JAXBElement<NodeInventoryMsg> createNodeInventoryMsg(NodeInventoryMsg value) {
        return new JAXBElement<NodeInventoryMsg>(_NodeInventoryMsg_QNAME, NodeInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "nodeStatusMsg")
    public JAXBElement<NodeStatusMsg> createNodeStatusMsg(NodeStatusMsg value) {
        return new JAXBElement<NodeStatusMsg>(_NodeStatusMsg_QNAME, NodeStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationInformationMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "organizationInformationMsg")
    public JAXBElement<OrganizationInformationMsg> createOrganizationInformationMsg(OrganizationInformationMsg value) {
        return new JAXBElement<OrganizationInformationMsg>(_OrganizationInformationMsg_QNAME, OrganizationInformationMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "organizationInformationRequestMsg")
    public JAXBElement<OrganizationInformationRequest> createOrganizationInformationRequestMsg(OrganizationInformationRequest value) {
        return new JAXBElement<OrganizationInformationRequest>(_OrganizationInformationRequestMsg_QNAME, OrganizationInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RampMeterControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "rampMeterControlRequestMsg")
    public JAXBElement<RampMeterControlRequest> createRampMeterControlRequestMsg(RampMeterControlRequest value) {
        return new JAXBElement<RampMeterControlRequest>(_RampMeterControlRequestMsg_QNAME, RampMeterControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RampMeterControlScheduleMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "rampMeterControlScheduleMsg")
    public JAXBElement<RampMeterControlScheduleMsg> createRampMeterControlScheduleMsg(RampMeterControlScheduleMsg value) {
        return new JAXBElement<RampMeterControlScheduleMsg>(_RampMeterControlScheduleMsg_QNAME, RampMeterControlScheduleMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RampMeterInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "rampMeterInventoryMsg")
    public JAXBElement<RampMeterInventoryMsg> createRampMeterInventoryMsg(RampMeterInventoryMsg value) {
        return new JAXBElement<RampMeterInventoryMsg>(_RampMeterInventoryMsg_QNAME, RampMeterInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RampMeterPlanInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "rampMeterPlanInventoryMsg")
    public JAXBElement<RampMeterPlanInventoryMsg> createRampMeterPlanInventoryMsg(RampMeterPlanInventoryMsg value) {
        return new JAXBElement<RampMeterPlanInventoryMsg>(_RampMeterPlanInventoryMsg_QNAME, RampMeterPlanInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RampMeterStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "rampMeterStatusMsg")
    public JAXBElement<RampMeterStatusMsg> createRampMeterStatusMsg(RampMeterStatusMsg value) {
        return new JAXBElement<RampMeterStatusMsg>(_RampMeterStatusMsg_QNAME, RampMeterStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePlanApprovalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "responsePlanApprovalRequestMsg")
    public JAXBElement<ResponsePlanApprovalRequest> createResponsePlanApprovalRequestMsg(ResponsePlanApprovalRequest value) {
        return new JAXBElement<ResponsePlanApprovalRequest>(_ResponsePlanApprovalRequestMsg_QNAME, ResponsePlanApprovalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePlanApprovalMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "responsePlanApprovalMsg")
    public JAXBElement<ResponsePlanApprovalMsg> createResponsePlanApprovalMsg(ResponsePlanApprovalMsg value) {
        return new JAXBElement<ResponsePlanApprovalMsg>(_ResponsePlanApprovalMsg_QNAME, ResponsePlanApprovalMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePlanLogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "responsePlanLogRequestMsg")
    public JAXBElement<ResponsePlanLogRequest> createResponsePlanLogRequestMsg(ResponsePlanLogRequest value) {
        return new JAXBElement<ResponsePlanLogRequest>(_ResponsePlanLogRequestMsg_QNAME, ResponsePlanLogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePlanLogMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "responsePlanLogMsg")
    public JAXBElement<ResponsePlanLogMsg> createResponsePlanLogMsg(ResponsePlanLogMsg value) {
        return new JAXBElement<ResponsePlanLogMsg>(_ResponsePlanLogMsg_QNAME, ResponsePlanLogMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePlanStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "responsePlanStatusRequestMsg")
    public JAXBElement<ResponsePlanStatusRequest> createResponsePlanStatusRequestMsg(ResponsePlanStatusRequest value) {
        return new JAXBElement<ResponsePlanStatusRequest>(_ResponsePlanStatusRequestMsg_QNAME, ResponsePlanStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePlanStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "responsePlanStatusMsg")
    public JAXBElement<ResponsePlanStatusMsg> createResponsePlanStatusMsg(ResponsePlanStatusMsg value) {
        return new JAXBElement<ResponsePlanStatusMsg>(_ResponsePlanStatusMsg_QNAME, ResponsePlanStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePlanRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "responsePlanRequestMsg")
    public JAXBElement<ResponsePlanRequest> createResponsePlanRequestMsg(ResponsePlanRequest value) {
        return new JAXBElement<ResponsePlanRequest>(_ResponsePlanRequestMsg_QNAME, ResponsePlanRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePlanMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "responsePlanMsg")
    public JAXBElement<ResponsePlanMsg> createResponsePlanMsg(ResponsePlanMsg value) {
        return new JAXBElement<ResponsePlanMsg>(_ResponsePlanMsg_QNAME, ResponsePlanMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePlanTerminationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "responsePlanTerminationRequestMsg")
    public JAXBElement<ResponsePlanTerminationRequest> createResponsePlanTerminationRequestMsg(ResponsePlanTerminationRequest value) {
        return new JAXBElement<ResponsePlanTerminationRequest>(_ResponsePlanTerminationRequestMsg_QNAME, ResponsePlanTerminationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsePlanTerminationMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "responsePlanTerminationMsg")
    public JAXBElement<ResponsePlanTerminationMsg> createResponsePlanTerminationMsg(ResponsePlanTerminationMsg value) {
        return new JAXBElement<ResponsePlanTerminationMsg>(_ResponsePlanTerminationMsg_QNAME, ResponsePlanTerminationMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "routeInventoryMsg")
    public JAXBElement<RouteInventoryMsg> createRouteInventoryMsg(RouteInventoryMsg value) {
        return new JAXBElement<RouteInventoryMsg>(_RouteInventoryMsg_QNAME, RouteInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "routeStatusMsg")
    public JAXBElement<RouteStatusMsg> createRouteStatusMsg(RouteStatusMsg value) {
        return new JAXBElement<RouteStatusMsg>(_RouteStatusMsg_QNAME, RouteStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionControlRequestMsg")
    public JAXBElement<SectionControlRequest> createSectionControlRequestMsg(SectionControlRequest value) {
        return new JAXBElement<SectionControlRequest>(_SectionControlRequestMsg_QNAME, SectionControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionControlResponseMsg")
    public JAXBElement<SectionControlResponse> createSectionControlResponseMsg(SectionControlResponse value) {
        return new JAXBElement<SectionControlResponse>(_SectionControlResponseMsg_QNAME, SectionControlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionControlScheduleMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionControlScheduleMsg")
    public JAXBElement<SectionControlScheduleMsg> createSectionControlScheduleMsg(SectionControlScheduleMsg value) {
        return new JAXBElement<SectionControlScheduleMsg>(_SectionControlScheduleMsg_QNAME, SectionControlScheduleMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionControlStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionControlStatusRequestMsg")
    public JAXBElement<SectionControlStatusRequest> createSectionControlStatusRequestMsg(SectionControlStatusRequest value) {
        return new JAXBElement<SectionControlStatusRequest>(_SectionControlStatusRequestMsg_QNAME, SectionControlStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionPriorityQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionPriorityQueueMsg")
    public JAXBElement<SectionPriorityQueue> createSectionPriorityQueueMsg(SectionPriorityQueue value) {
        return new JAXBElement<SectionPriorityQueue>(_SectionPriorityQueueMsg_QNAME, SectionPriorityQueue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionStatusMsg")
    public JAXBElement<SectionStatusMsg> createSectionStatusMsg(SectionStatusMsg value) {
        return new JAXBElement<SectionStatusMsg>(_SectionStatusMsg_QNAME, SectionStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionSignalTimingPatternInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionSignalTimingPatternInventoryMsg")
    public JAXBElement<SectionSignalTimingPatternInventoryMsg> createSectionSignalTimingPatternInventoryMsg(SectionSignalTimingPatternInventoryMsg value) {
        return new JAXBElement<SectionSignalTimingPatternInventoryMsg>(_SectionSignalTimingPatternInventoryMsg_QNAME, SectionSignalTimingPatternInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectionSignalTimingPatternInventoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "sectionSignalTimingPatternInventoryRequestMsg")
    public JAXBElement<SectionSignalTimingPatternInventoryRequest> createSectionSignalTimingPatternInventoryRequestMsg(SectionSignalTimingPatternInventoryRequest value) {
        return new JAXBElement<SectionSignalTimingPatternInventoryRequest>(_SectionSignalTimingPatternInventoryRequestMsg_QNAME, SectionSignalTimingPatternInventoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficNetworkInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "trafficNetworkInformationRequestMsg")
    public JAXBElement<TrafficNetworkInformationRequest> createTrafficNetworkInformationRequestMsg(TrafficNetworkInformationRequest value) {
        return new JAXBElement<TrafficNetworkInformationRequest>(_TrafficNetworkInformationRequestMsg_QNAME, TrafficNetworkInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficNetworkInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "linkInventoryRequestMsg")
    public JAXBElement<TrafficNetworkInformationRequest> createLinkInventoryRequestMsg(TrafficNetworkInformationRequest value) {
        return new JAXBElement<TrafficNetworkInformationRequest>(_LinkInventoryRequestMsg_QNAME, TrafficNetworkInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficNetworkInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "linkStatusRequestMsg")
    public JAXBElement<TrafficNetworkInformationRequest> createLinkStatusRequestMsg(TrafficNetworkInformationRequest value) {
        return new JAXBElement<TrafficNetworkInformationRequest>(_LinkStatusRequestMsg_QNAME, TrafficNetworkInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficNetworkInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "nodeInventoryRequestMsg")
    public JAXBElement<TrafficNetworkInformationRequest> createNodeInventoryRequestMsg(TrafficNetworkInformationRequest value) {
        return new JAXBElement<TrafficNetworkInformationRequest>(_NodeInventoryRequestMsg_QNAME, TrafficNetworkInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficNetworkInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "nodeStatusRequestMsg")
    public JAXBElement<TrafficNetworkInformationRequest> createNodeStatusRequestMsg(TrafficNetworkInformationRequest value) {
        return new JAXBElement<TrafficNetworkInformationRequest>(_NodeStatusRequestMsg_QNAME, TrafficNetworkInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficNetworkInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "routeInventoryRequestMsg")
    public JAXBElement<TrafficNetworkInformationRequest> createRouteInventoryRequestMsg(TrafficNetworkInformationRequest value) {
        return new JAXBElement<TrafficNetworkInformationRequest>(_RouteInventoryRequestMsg_QNAME, TrafficNetworkInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficNetworkInformationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "routeStatusRequestMsg")
    public JAXBElement<TrafficNetworkInformationRequest> createRouteStatusRequestMsg(TrafficNetworkInformationRequest value) {
        return new JAXBElement<TrafficNetworkInformationRequest>(_RouteStatusRequestMsg_QNAME, TrafficNetworkInformationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoSwitchControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "videoSwitchControlRequestMsg")
    public JAXBElement<VideoSwitchControlRequest> createVideoSwitchControlRequestMsg(VideoSwitchControlRequest value) {
        return new JAXBElement<VideoSwitchControlRequest>(_VideoSwitchControlRequestMsg_QNAME, VideoSwitchControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoSwitchInventoryMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "videoSwitchInventoryMsg")
    public JAXBElement<VideoSwitchInventoryMsg> createVideoSwitchInventoryMsg(VideoSwitchInventoryMsg value) {
        return new JAXBElement<VideoSwitchInventoryMsg>(_VideoSwitchInventoryMsg_QNAME, VideoSwitchInventoryMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoSwitchStatusMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "videoSwitchStatusMsg")
    public JAXBElement<VideoSwitchStatusMsg> createVideoSwitchStatusMsg(VideoSwitchStatusMsg value) {
        return new JAXBElement<VideoSwitchStatusMsg>(_VideoSwitchStatusMsg_QNAME, VideoSwitchStatusMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationSubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "detectorDataSubscriptionMsg")
    public JAXBElement<DeviceInformationSubscription> createDetectorDataSubscriptionMsg(DeviceInformationSubscription value) {
        return new JAXBElement<DeviceInformationSubscription>(_DetectorDataSubscriptionMsg_QNAME, DeviceInformationSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceInformationSubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "deviceInformationSubscriptionMsg")
    public JAXBElement<DeviceInformationSubscription> createDeviceInformationSubscriptionMsg(DeviceInformationSubscription value) {
        return new JAXBElement<DeviceInformationSubscription>(_DeviceInformationSubscriptionMsg_QNAME, DeviceInformationSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventSubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "fullEventUpdateSubscriptionMsg")
    public JAXBElement<EventSubscription> createFullEventUpdateSubscriptionMsg(EventSubscription value) {
        return new JAXBElement<EventSubscription>(_FullEventUpdateSubscriptionMsg_QNAME, EventSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventSubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "eventIndexSubscriptionMsg")
    public JAXBElement<EventSubscription> createEventIndexSubscriptionMsg(EventSubscription value) {
        return new JAXBElement<EventSubscription>(_EventIndexSubscriptionMsg_QNAME, EventSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventSubscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tmdd.org/303/messages", name = "actionLogSubscriptionMsg")
    public JAXBElement<EventSubscription> createActionLogSubscriptionMsg(EventSubscription value) {
        return new JAXBElement<EventSubscription>(_ActionLogSubscriptionMsg_QNAME, EventSubscription.class, null, value);
    }

}
