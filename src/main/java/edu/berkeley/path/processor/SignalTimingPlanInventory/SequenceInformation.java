package edu.berkeley.path.processor.SignalTimingPlanInventory;

import com.fasterxml.jackson.core.type.TypeReference;
import edu.berkeley.path.util.JsonUtil;
import org.bson.Document;
import org.tmdd._303.messages.IntersectionSignalSequenceData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SequenceInformation {

    public static Map<String, IntersectionSignalSequenceData> getFromTimingPlanDocument(Document timingPlanDocument){
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
