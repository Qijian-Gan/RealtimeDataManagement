package edu.berkeley.path.processor;

import com.fasterxml.jackson.core.type.TypeReference;
import edu.berkeley.path.util.JsonUtil;
import org.bson.Document;
import org.tmdd._303.messages.DateTimeZone;
import org.tmdd._303.messages.IntersectionSignalSequenceData;
import org.tmdd._303.messages.IntersectionSignalTPInventoryPhase;
import org.tmdd._303.messages.OrganizationInformation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignalTimingPatternInventory {

    // ***************************************************************
    // Organization Information and Organization Id
    // ***************************************************************
    public static OrganizationInformation getOrganizationInformationFromTimingPlanDocument(Document timingPlanDocument){
        // This function is used to return the organization Information

        Document document=(Document)timingPlanDocument.get("organizationInformation");
        OrganizationInformation organizationInformation =
                (OrganizationInformation) JsonUtil.serializer().fromJson
                        (document.toJson(), new TypeReference<OrganizationInformation>() {});
       return organizationInformation;
    }

    public static String getOrganizationIdFromTimingPlanDocument(Document timingPlanDocument){
        // This function is used to return the organization Id

        Document document=(Document)timingPlanDocument.get("organizationInformation");
        OrganizationInformation organizationInformation =
                (OrganizationInformation) JsonUtil.serializer().fromJson
                        (document.toJson(), new TypeReference<OrganizationInformation>() {});
        String organizationId= organizationInformation.getOrganizationId();
        return organizationId;
    }

    // ***************************************************************
    // Device Id
    // ***************************************************************
    public static String getDeviceIdFromTimingPlanDocument(Document timingPlanDocument){
        // This function is used to return Device Id
        String deviceId=timingPlanDocument.get("deviceId").toString();
        return deviceId;
    }

    // ***************************************************************
    // Timing Pattern Id
    // ***************************************************************
    public static String getTimingPatternIdFromTimingPlanDocument(Document timingPlanDocument){
        // This function is used to return Timing Pattern Id
        String tpId=timingPlanDocument.get("timingPatternId").toString();
        return tpId;
    }

    // ***************************************************************
    // Timing Pattern Name
    // ***************************************************************
    public static String getTimingPatternNameFromTimingPlanDocument(Document timingPlanDocument){
        // This function is used to return Timing Pattern Name
        String tpName=timingPlanDocument.get("timingPatternName").toString();
        return tpName;
    }

    // ***************************************************************
    // Cycle Length
    // ***************************************************************
    public static int getCycleLengthFromTimingPlanDocument(Document timingPlanDocument){
        // This function is used to return Cycle Length
        int cycleLength=(int)timingPlanDocument.get("cycleLength");
        return cycleLength;
    }

    // ***************************************************************
    // Offset Time
    // ***************************************************************
    public static int getOffsetTimeFromTimingPlanDocument(Document timingPlanDocument){
        // This function is used to return Offset Time
        int offsetTime=(int)timingPlanDocument.get("offsetTime");
        return offsetTime;
    }

    // ***************************************************************
    // Last Update Time
    // ***************************************************************
    public static DateTimeZone getLastUpdateTimeFromTimingPlanDocument(Document timingPlanDocument){
        // This function is used to return Last Update Time
        Document document=(Document) timingPlanDocument.get("lastUpdateTime");
        DateTimeZone dateTimeZone =
                (DateTimeZone) JsonUtil.serializer().fromJson
                        (document.toJson(), new TypeReference<DateTimeZone>() {});
        return dateTimeZone;
    }

    // ***************************************************************
    // Phase TP List
    // ***************************************************************
    public static Map<Integer, IntersectionSignalTPInventoryPhase> getAllPhaseTPFromTimingPlanDocument(Document timingPlanDocument){
        // This function is used to return a list of Phase Timing Plans
        // The return format is: <Phase ID,IntersectionSignalTPInventoryPhase>

        // Get the phase TP documents
        Document document=(Document)timingPlanDocument.get("phaseTpList");
        List<Document> phaseList=(List<Document>)document.get("phases");

        // Construct the hash map
        Map<Integer,IntersectionSignalTPInventoryPhase> phaseTPMap=new HashMap<>();
        for(int i=0;i<phaseList.size();i++) {
            IntersectionSignalTPInventoryPhase intersectionSignalTPInventoryPhase =
                    (IntersectionSignalTPInventoryPhase) JsonUtil.serializer().fromJson
                            (phaseList.get(i).toJson(), new TypeReference<IntersectionSignalTPInventoryPhase>() {});
            Integer phaseId=(int) intersectionSignalTPInventoryPhase.getPhaseIdentifier();
            phaseTPMap.put(phaseId,intersectionSignalTPInventoryPhase);
        }
        return phaseTPMap;
    }

    public static IntersectionSignalTPInventoryPhase getTPFromTimingPlanDocumentWithGivenId(Document timingPlanDocument,
                                                                                            int phaseId){

        Map<Integer,IntersectionSignalTPInventoryPhase> phaseTPMap=getAllPhaseTPFromTimingPlanDocument(timingPlanDocument);

        if(phaseTPMap.containsKey(phaseId)){
            return phaseTPMap.get(phaseId);
        }else{
            System.out.println("Can not find the timing plan information for the given phase Id!");
            return null;
        }
    }


    // ***************************************************************
    // Phase Sequence Information in a ring
    // ***************************************************************
    public static Map<String, IntersectionSignalSequenceData> getSequenceDataFromTimingPlanDocument(Document timingPlanDocument){
        // This function is used to get phase sequence from the timing plan document
        // The return format is: <Ring ID,IntersectionSignalSequenceData>

        Document document=(Document)timingPlanDocument.get("sequenceInformation");
        List<Document> sequenceInformationList=(List<Document>) document.get("sequenceInformation");
        Map<String, IntersectionSignalSequenceData> phaseInRing=new HashMap<>();

        for(int i=0;i<sequenceInformationList.size();i++){
            IntersectionSignalSequenceData intersectionSignalSequenceData=
                    (IntersectionSignalSequenceData) JsonUtil.serializer().fromJson
                            (sequenceInformationList.get(i).toJson(), new TypeReference<IntersectionSignalSequenceData>() {});
            String ringIdentifier=intersectionSignalSequenceData.getRingIdentifier();
            phaseInRing.put(ringIdentifier,intersectionSignalSequenceData);
        }
        return phaseInRing;
    }
}
