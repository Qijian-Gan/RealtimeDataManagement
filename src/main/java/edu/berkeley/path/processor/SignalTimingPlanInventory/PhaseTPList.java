package edu.berkeley.path.processor.SignalTimingPlanInventory;

import com.fasterxml.jackson.core.type.TypeReference;
import edu.berkeley.path.util.JsonUtil;
import org.bson.Document;
import org.tmdd._303.messages.IntersectionSignalTPInventoryPhase;
import org.tmdd._303.messages.IntersectionSignalTimingPatternInventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhaseTPList {

    public static Map<Integer,IntersectionSignalTPInventoryPhase> getAllPhaseTPFromTimingPlanDocument(Document timingPlanDocument){
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
}
