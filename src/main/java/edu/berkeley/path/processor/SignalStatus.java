package edu.berkeley.path.processor;

import com.fasterxml.jackson.core.type.TypeReference;
import edu.berkeley.path.objects.IntersectionOverlapStatusGroup;
import edu.berkeley.path.objects.IntersectionPhaseStatusGroup;
import edu.berkeley.path.objects.IntersectionRingStatus;
import edu.berkeley.path.util.JsonUtil;
import org.apache.velocity.util.ArrayListWrapper;
import org.bson.Document;
import org.tmdd._303.messages.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignalStatus {

    public static IntersectionSignalStatus getSignalStatusFromDocument(Document signalStatusDocument){
        // This function returns IntersectionSignalStatus

        Document document=(Document)signalStatusDocument.get("intersectionSignalStatus");
        IntersectionSignalStatus intersectionSignalStatus =
                (IntersectionSignalStatus) JsonUtil.serializer().fromJson
                        (document.toJson(), new TypeReference<IntersectionSignalStatus>() {});
        return intersectionSignalStatus;
    }

    public static List<Integer> getCycleLengthsFromSignalStatus(IntersectionSignalStatus intersectionSignalStatus){
        // This function returns [Planned,Current,Previous,Master]Cycle Lengths from the Signal Status

        int plannedCycleLength=intersectionSignalStatus.getCycleLengthPlanned();
        int currentCycleLength=intersectionSignalStatus.getCycleLengthCurrent();
        int previousCycleLength=intersectionSignalStatus.getCycleLengthPrevious();
        int masterCycleLength=intersectionSignalStatus.getCycleLengthMaster();

        List<Integer> cycleLengths= Arrays.asList(plannedCycleLength,currentCycleLength,previousCycleLength,masterCycleLength);

        return cycleLengths;
    }

    public static List<Integer> getOffsetsFromSignalStatus(IntersectionSignalStatus intersectionSignalStatus){
        // This function returns [Planned,Current,Previous] Offsets from the Signal Status

        int plannedOffset=intersectionSignalStatus.getCycleLengthPlanned();
        int currentOffset=intersectionSignalStatus.getCycleLengthCurrent();
        int previousOffset=intersectionSignalStatus.getCycleLengthPrevious();

        List<Integer> offsets=Arrays.asList(plannedOffset,currentOffset,previousOffset);
        return offsets;
    }

    public static List<Integer> getCycleCountersFromSignalStatus(IntersectionSignalStatus intersectionSignalStatus){
        // This function returns [CycleCounter,CycleCounterMaster] from the Signal Status

        int cycleCounter=-1;
        if(intersectionSignalStatus.getCycleCounter()!=null){
            cycleCounter=intersectionSignalStatus.getCycleCounter();
        }else{
            System.out.println("Invalid cycle counter!");
        }

        int cycleCounterMaster=-1;
        if(intersectionSignalStatus.getCycleCounterMaster()!=null){
            cycleCounterMaster=intersectionSignalStatus.getCycleCounterMaster();
        }else{
            System.out.println("Invalid cycle counter master!");
        }

        List<Integer> cycleCounters= Arrays.asList(cycleCounter,cycleCounterMaster);
        return cycleCounters;
    }

    public static Map<Integer,Integer> getPhaseDurationListFromSignalStatus(IntersectionSignalStatus intersectionSignalStatus){

        Map<Integer,Integer> map=new HashMap<>();
        if(intersectionSignalStatus.getPhaseSplitList()!=null){
            List<IntersectionSignalPhaseSplit> intersectionSignalPhaseSplitList=
                    intersectionSignalStatus.getPhaseSplitList().getPhaseSplit();
            for(int i=0;i<intersectionSignalPhaseSplitList.size();i++){
                int phaseId=intersectionSignalPhaseSplitList.get(i).getPhaseIdentifier();
                int phaseDuration=(int) intersectionSignalPhaseSplitList.get(i).getPhaseDuration();
                map.put(phaseId,phaseDuration);
            }
        }
        return map;
    }

    public static Map<String,IntersectionRingStatus> getRingStatusFromSignalStatus(IntersectionSignalStatus intersectionSignalStatus){
        // This function returns a list of Ring Status from the Signal Status

        Map<String,IntersectionRingStatus> map=new HashMap<>();
        if(intersectionSignalStatus.getRingStatusList()!=null){
            List<IntersectionSignalRingStatus> intersectionSignalRingStatusList=
                    intersectionSignalStatus.getRingStatusList().getRingStatus();

            // Loop for each ring status
            for(int i=0;i<intersectionSignalRingStatusList.size();i++){
                // Get ring Id
                String ringId=intersectionSignalRingStatusList.get(i).getRingIdentifier();
                // Decompose the ring information
                IntersectionRingStatus intersectionRingStatus=new IntersectionRingStatus();
                intersectionRingStatus.initialization();
                int ringStatus=intersectionSignalRingStatusList.get(i).getRingStatus();
                String binaryString=Integer.toBinaryString(ringStatus);
                intersectionRingStatus.update(binaryString);
                map.put(ringId,intersectionRingStatus);
            }
        }
        return map;
    }

    public static IntersectionPhaseStatusGroup getPhaseStatusGroupFromSignalStatus(IntersectionSignalStatus intersectionSignalStatus){
        // This function returns IntersectionPhaseStatusGroup from the Signal Status

        IntersectionPhaseStatusGroup intersectionPhaseStatusGroup=null;
        if(intersectionSignalStatus.getPhaseStatus()!=null){
            intersectionPhaseStatusGroup=new IntersectionPhaseStatusGroup();
            intersectionPhaseStatusGroup.initialization();
            List<IntersectionSignalPhaseStatusGroup> intersectionSignalPhaseStatusGroupList=
                    intersectionSignalStatus.getPhaseStatus().getPhaseStatusGroup();
            intersectionPhaseStatusGroup.update(intersectionSignalPhaseStatusGroupList);
        }
        return intersectionPhaseStatusGroup;
    }

    public static IntersectionOverlapStatusGroup getOverlapPhaseStatusGroupFromSiganlStatus(IntersectionSignalStatus intersectionSignalStatus){
        // This function returns IntersectionOverlapStatusGroup from the signal status

        IntersectionOverlapStatusGroup intersectionOverlapStatusGroup=null;
        if(intersectionSignalStatus.getOverlapStatus()!=null){
            intersectionOverlapStatusGroup=new IntersectionOverlapStatusGroup();
            intersectionOverlapStatusGroup.initialization();
            List<IntersectionSignalOverlapStatusGroup> intersectionSignalOverlapStatusGroupList=
                    intersectionSignalStatus.getOverlapStatus().getOverlapStatusGroup();
            intersectionOverlapStatusGroup.update(intersectionSignalOverlapStatusGroupList);
        }
        return intersectionOverlapStatusGroup;
    }



}
