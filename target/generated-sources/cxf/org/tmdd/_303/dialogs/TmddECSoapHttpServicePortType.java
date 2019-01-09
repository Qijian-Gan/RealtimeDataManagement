package org.tmdd._303.dialogs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2018-12-05T12:28:39.965-08:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://www.tmdd.org/303/dialogs", name = "tmddECSoapHttpServicePortType")
@XmlSeeAlso({lrms_adopted_02_00_00.ObjectFactory.class, itis_local_03_00_02.ObjectFactory.class, org.ntcip.c2c_message_administration.ObjectFactory.class, lrms_local_02_00_00.ObjectFactory.class, org.tmdd._303.messages.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TmddECSoapHttpServicePortType {

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlRouteStatusUpdate(
        @WebParam(partName = "message", name = "routeStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.RouteStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlFullEventUpdateUpdate(
        @WebParam(partName = "message", name = "fullEventUpdateUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.FullEventUpdateUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlHARInventoryUpdate(
        @WebParam(partName = "message", name = "hARInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.HARInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlNodeInventoryUpdate(
        @WebParam(partName = "message", name = "nodeInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.NodeInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlLCSControlScheduleUpdate(
        @WebParam(partName = "message", name = "lCSControlScheduleUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.LCSControlScheduleUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlCenterActiveVerificationUpdate(
        @WebParam(partName = "message", name = "centerActiveVerificationUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.CenterActiveVerificationUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlRampMeterPlanInventoryUpdate(
        @WebParam(partName = "message", name = "rampMeterPlanInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.RampMeterPlanInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlDMSMessageInventoryUpdate(
        @WebParam(partName = "message", name = "dMSMessageInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.DMSMessageInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlDetectorDataUpdate(
        @WebParam(partName = "message", name = "detectorDataUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.DetectorDataUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlCCTVStatusUpdate(
        @WebParam(partName = "message", name = "cCTVStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.CCTVStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlDetectorInventoryUpdate(
        @WebParam(partName = "message", name = "detectorInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.DetectorInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlRampMeterControlScheduleUpdate(
        @WebParam(partName = "message", name = "rampMeterControlScheduleUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.RampMeterControlScheduleUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlVideoSwitchStatusUpdate(
        @WebParam(partName = "message", name = "videoSwitchStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.VideoSwitchStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlLinkInventoryUpdate(
        @WebParam(partName = "message", name = "linkInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.LinkInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlActionLogUpdate(
        @WebParam(partName = "message", name = "actionLogUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.ActionLogUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlRampMeterInventoryUpdate(
        @WebParam(partName = "message", name = "rampMeterInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.RampMeterInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlResponsePlanStatusUpdate(
        @WebParam(partName = "message", name = "responsePlanStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.ResponsePlanStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlIntersectionSignalInventoryUpdate(
        @WebParam(partName = "message", name = "intersectionSignalInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.IntersectionSignalInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlRouteInventoryUpdate(
        @WebParam(partName = "message", name = "routeInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.RouteInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlESSObservationReportUpdate(
        @WebParam(partName = "message", name = "eSSObservationReportUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.ESSObservationReportUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlLinkStatusUpdate(
        @WebParam(partName = "message", name = "linkStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.LinkStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlDetectorStatusUpdate(
        @WebParam(partName = "message", name = "detectorStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.DetectorStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlSectionControlScheduleUpdate(
        @WebParam(partName = "message", name = "sectionControlScheduleUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.SectionControlScheduleUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlGateStatusUpdate(
        @WebParam(partName = "message", name = "gateStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.GateStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlDMSInventoryUpdate(
        @WebParam(partName = "message", name = "dMSInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.DMSInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlResponsePlanUpdate(
        @WebParam(partName = "message", name = "responsePlanUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.ResponsePlanUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlHARControlScheduleUpdate(
        @WebParam(partName = "message", name = "hARControlScheduleUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.HARControlScheduleUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlHARMessageInventoryUpdate(
        @WebParam(partName = "message", name = "hARMessageInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.HARMessageInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlHARStatusUpdate(
        @WebParam(partName = "message", name = "hARStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.HARStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlRampMeterStatusUpdate(
        @WebParam(partName = "message", name = "rampMeterStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.RampMeterStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlLCSInventoryUpdate(
        @WebParam(partName = "message", name = "lCSInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.LCSInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlResponsePlanApprovalUpdate(
        @WebParam(partName = "message", name = "responsePlanApprovalUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.ResponsePlanApprovalUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlVideoSwitchInventoryUpdate(
        @WebParam(partName = "message", name = "videoSwitchInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.VideoSwitchInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlESSInventoryUpdate(
        @WebParam(partName = "message", name = "eSSInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.ESSInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlGateControlScheduleUpdate(
        @WebParam(partName = "message", name = "gateControlScheduleUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.GateControlScheduleUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlNodeStatusUpdate(
        @WebParam(partName = "message", name = "nodeStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.NodeStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlGateInventoryUpdate(
        @WebParam(partName = "message", name = "gateInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.GateInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlDMSStatusUpdate(
        @WebParam(partName = "message", name = "dMSStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.DMSStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlIntersectionSignalTimingPatternInventoryUpdate(
        @WebParam(partName = "message", name = "intersectionSignalTimingPatternInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.IntersectionSignalTimingPatternInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlLCSStatusUpdate(
        @WebParam(partName = "message", name = "lCSStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.LCSStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlOrganizationInformationUpdate(
        @WebParam(partName = "message", name = "organizationInformationUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.OrganizationInformationUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlSectionSignalTimingPatternInventoryUpdate(
        @WebParam(partName = "message", name = "sectionSignalTimingPatternInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.SectionSignalTimingPatternInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlIntersectionSignalStatusUpdate(
        @WebParam(partName = "message", name = "intersectionSignalStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.IntersectionSignalStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlCCTVInventoryUpdate(
        @WebParam(partName = "message", name = "cCTVInventoryUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.CCTVInventoryUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlESSStatusUpdate(
        @WebParam(partName = "message", name = "eSSStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.ESSStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlResponsePlanLogUpdate(
        @WebParam(partName = "message", name = "responsePlanLogUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.ResponsePlanLogUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlIntersectionSignalControlScheduleUpdate(
        @WebParam(partName = "message", name = "intersectionSignalControlScheduleUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.IntersectionSignalControlScheduleUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlSectionStatusUpdate(
        @WebParam(partName = "message", name = "sectionStatusUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.SectionStatusUpdateMsg message
    ) throws MSGErrorReport;

    /**
     * 
     * 
     * 
     * 
     * 
     *             
     */
    @WebMethod(action = "''")
    @WebResult(name = "c2cMessageReceipt", targetNamespace = "http://www.ntcip.org/c2c-message-administration", partName = "message")
    public org.ntcip.c2c_message_administration.C2CMessageReceipt dlEventIndexUpdate(
        @WebParam(partName = "message", name = "eventIndexUpdateMsg", targetNamespace = "http://www.tmdd.org/303/messages")
        org.tmdd._303.messages.EventIndexUpdateMsg message
    ) throws MSGErrorReport;
}
