package edu.berkeley.path.database.MongoDB;

import com.fasterxml.jackson.core.type.TypeReference;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Sorts;
import edu.berkeley.path.objects.IntersectionPhaseStatusGroup;
import edu.berkeley.path.objects.IntersectionRingStatus;
import edu.berkeley.path.processor.SignalStatus;
import edu.berkeley.path.settings.Configuration;
import edu.berkeley.path.util.DateTimeConversion;
import edu.berkeley.path.util.JsonUtil;
import org.bson.Document;
import org.tmdd._303.messages.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Projections.*;
import static edu.berkeley.path.database.MongoDB.connect.getCollectionMongoDBStandalone;
import static edu.berkeley.path.database.MongoDB.select.aggregatedDetectorDataForGivenDetectorIdAndDateAndTimePeriod;
import static edu.berkeley.path.database.MongoDB.select.documentsForGivenDeviceIdAndTimingPlanAndTimePeriodsFromSigStatus;
import static edu.berkeley.path.processor.SignalStatus.*;

public class extract {

    public static void toExcelFileForEachDetector(MongoCollection<Document> collection, String detectorId, String fromDateTimeStr,
                                            String toDateTimeStr, String outputFolder) throws ParseException, IOException {


        FindIterable iterable=aggregatedDetectorDataForGivenDetectorIdAndDateAndTimePeriod(collection,detectorId,
                fromDateTimeStr, toDateTimeStr);

        String fileName=fromDateTimeStr.replace(":","-");
        fileName=fileName.replace(" ","_");
        fileName=detectorId+"_"+fileName+".csv";
        File file=new File(new File("").getAbsolutePath()+outputFolder+fileName);
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);

        String str="detectorId"+","+"dateTime"+","+"vehicleCount"+","+"vehicleOccupancy"+","+"vehicleSpeed"+"\n";
        try {
            bw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Block<Document> writeBlock = new Block<Document>() {
            public void apply(final Document document) {
                Date dateAndTime=new Date(Long.parseLong(document.get("startTimeStamp").toString()));
                String str=document.getString("detectorId")+","+dateAndTime.toString()+","+document.get("vehicleCount")+
                        ","+document.get("vehicleOccupancy")+","+document.get("vehicleSpeed")+"\n";
                try {
                    bw.write(str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        iterable.forEach(writeBlock);

        bw.close();
    }

    public static void sequenceDataToCSVFileForEachDeviceIdAndTimingPlanAndTimePeriod(MongoCollection<Document> collectionSignalStatus
            ,MongoCollection<Document> collectionSignalTPInventory,String organizationId,String deviceId,String timingPatternId
            , long startDateTime, long endDateTime,String outputFolder) throws IOException, ParseException {

        // Date formats
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyyMMdd-HHmmss");
        Date start=new Date(startDateTime);
        Date end=new Date(endDateTime);

        // File name
        String fileName="Int"+deviceId+"_TP"+timingPatternId+"_From"+(formatter.format(start))+"_To"
                +(formatter.format(end))+".csv";
        File file=new File(new File("").getAbsolutePath()+outputFolder+fileName);
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);

        // Header
        try {
            bw.write("Organization ID"+","+organizationId+"\n");
            bw.write("Device ID"+","+deviceId+"\n");
            bw.write("Timing Plan ID"+","+timingPatternId+"\n");
            bw.write("From Time"+","+start.toString()+"\n");
            bw.write("To Time"+","+end.toString()+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Select the latest Signal Timing Plan Inventory
        bw.write("***************************\n");
        bw.write("Timing Plan Inventory"+"\n");
        bw.write("***************************\n");
        FindIterable iterable=collectionSignalTPInventory.find(and(eq("organizationInformation.organizationId",organizationId),
                eq("deviceId",deviceId),eq("timingPatternId",timingPatternId))).projection(fields(exclude("_id")))
                .sort(Sorts.descending("lastUpdateTime.date","lastUpdateTime.time")).limit(1);
        Iterator iterator=iterable.iterator();
        if(iterator.hasNext()){
            // Get the document
            Document document=(Document) iterator.next();
            IntersectionSignalTimingPatternInventory intersectionSignalTimingPatternInventory=(IntersectionSignalTimingPatternInventory)
                    JsonUtil.serializer().fromJson(document.toJson(), new TypeReference<IntersectionSignalTimingPatternInventory>() {});
            bw.write("Last Update Datetime,"+intersectionSignalTimingPatternInventory.getLastUpdateTime().getDate()+
                    "-"+Long.parseLong(intersectionSignalTimingPatternInventory.getLastUpdateTime().getTime())/10000.0+"\n");
            // Cycle Length & Offset Time
            bw.write("Cycle Length(s),"+intersectionSignalTimingPatternInventory.getCycleLength()+"\n");
            bw.write("Offset Time(s),"+intersectionSignalTimingPatternInventory.getOffsetTime()+"\n");
            // Phase Timing Pattern List
            bw.write("Phase Timing Pattern List");
            bw.write("Phase ID,IsCoordinated?,Split Mode, Phase Split(s),Max Green Duration(s),Min Green Duration(s),"+
                    "Clearance (Yellow) Duration(s),All Red Duration (s)\n");
            List<IntersectionSignalTPInventoryPhase> intersectionSignalTPInventoryPhaseList=
                    intersectionSignalTimingPatternInventory.getPhaseTpList().getPhases();
            for(int i=0;i<intersectionSignalTPInventoryPhaseList.size();i++){
                IntersectionSignalTPInventoryPhase intersectionSignalTPInventoryPhase=intersectionSignalTPInventoryPhaseList.get(i);
                bw.write(intersectionSignalTPInventoryPhase.getPhaseIdentifier()+","
                        +intersectionSignalTPInventoryPhase.getCoordinatedPhase()+","
                        +intersectionSignalTPInventoryPhase.getSplitMode()+","
                        +intersectionSignalTPInventoryPhase.getPhaseSplit()+","
                        +(intersectionSignalTPInventoryPhase.getMaximumGreenDuration()/10.0)+","
                        +(intersectionSignalTPInventoryPhase.getMinimumGreenDuration()/10.0)+","
                        +(intersectionSignalTPInventoryPhase.getVehicleClearanceDuration()/10.0)+","
                        +(intersectionSignalTPInventoryPhase.getVehicleRedDuration()/10.0)+"\n");
            }

            // Sequence information for each ring
            bw.write("Phase Sequence For Each Ring");
            bw.write("Ring Id, Phase Sequence\n");
            List<IntersectionSignalSequenceData> intersectionSignalSequenceDataList=
                    intersectionSignalTimingPatternInventory.getSequenceInformation().getSequenceInformation();
            for(int i=0;i<intersectionSignalSequenceDataList.size();i++){
                IntersectionSignalSequenceData intersectionSignalSequenceData=intersectionSignalSequenceDataList.get(i);
                String str=intersectionSignalSequenceData.getRingIdentifier();
                for(int j=0;j<intersectionSignalSequenceData.getSequenceData().getPhaseIdentifier().size();j++){
                    str=str+","+intersectionSignalSequenceData.getSequenceData().getPhaseIdentifier().get(j);
                }
                bw.write(str+"\n");
            }
        }

        // Select the latest Signal Timing Plan Inventory
        bw.write("***************************\n");
        bw.write("Sequence of Phase Events"+"\n");
        bw.write("***************************\n");

        int maxNumPhase=16; // Define the maximum number of phases
        int maxNumRing=4; // Define the maximum number of rings
        List<Document> documentList=documentsForGivenDeviceIdAndTimingPlanAndTimePeriodsFromSigStatus(collectionSignalStatus
                ,organizationId, deviceId, timingPatternId,start.getTime(), end.getTime());
        long previousTime=0;
        for(int i=0;i<documentList.size();i++){
            Document document=(Document) documentList.get(i).get("intersectionSignalStatus");
            IntersectionSignalStatus intersectionSignalStatus=(IntersectionSignalStatus)
                    JsonUtil.serializer().fromJson(document.toJson(),new TypeReference<IntersectionSignalStatus>(){});
            if (i == 0) {
                // Descriptions
                bw.write("Device Comm Status," + intersectionSignalStatus.getDeviceStatusHeader().getDeviceCommStatus() + "\n");
                bw.write("Signal Control Source," + intersectionSignalStatus.getSignalControlSource() + "\n");
                bw.write("Planned Signal Timing Mode," + intersectionSignalStatus.getPlannedSignalTimingMode() + "\n");
                bw.write(",,,Cycle,Information,,%,Offset,Information,%,#,#,#,"+
                        "+,+,+,+,+,+,Phase,Status,+,+,+,+,+,+,+,+,"+
                        "@,Ring, Status,@,"+
                        "x,x,x,x,x,x,Phase,Splits,x,x,x,x,x,x,x,x\n");
                String str = "Date, Time, Current Mode,Planned, Current, Previous," +
                        "Reference Point, Planned, Current,Previous,Cycle Counter, Master Counter,Time Difference";
                for (int j = 0; j < maxNumPhase; j++) {
                    str=str+",Phase"+(j+1);
                }
                for(int j=0;j<maxNumRing;j++){
                    str=str+",Ring"+(j+1);
                }
                for (int j = 0; j < maxNumPhase; j++) {
                    str=str+",Phase "+(j+1);
                }
                str=str+"\n";
                bw.write(str);
            }

            String str="";
            // Date and Time
            String date=intersectionSignalStatus.getControllerTimestamp().getDate();
            String time=intersectionSignalStatus.getControllerTimestamp().getTime();
            str=str+date+","+time+",";
            // Current mode
            str=str+intersectionSignalStatus.getCurrentSignalTimingMode()+",";
            // Cycle lengths
            str=str+intersectionSignalStatus.getCycleLengthPlanned()+","+intersectionSignalStatus.getCycleLengthCurrent()+
                    ","+intersectionSignalStatus.getCycleLengthPrevious()+",";
            // Offsets
            str=str+intersectionSignalStatus.getOffsetReference()+","+intersectionSignalStatus.getOffsetTimePlanned()+
                    ","+intersectionSignalStatus.getOffsetTimeCurrent()+
                    ","+intersectionSignalStatus.getOffsetTimePrevious()+",";
            // Cycle Counters
            str=str+intersectionSignalStatus.getCycleCounter()+","+intersectionSignalStatus.getCycleCounterMaster()+",";
            if(i==0){
                previousTime= DateTimeConversion.TMDDDateTimeToRegularDateTime(date,time).getTime();
                str=str+"0";
            }else{
                str=str+Math.round(DateTimeConversion.TMDDDateTimeToRegularDateTime(date,time).getTime()/1000.0-previousTime/1000.0);
                previousTime=DateTimeConversion.TMDDDateTimeToRegularDateTime(date,time).getTime();
            }

            // Phase status
            if(intersectionSignalStatus.getPhaseStatus()!=null){
                IntersectionPhaseStatusGroup intersectionPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(intersectionSignalStatus);
                Map<Integer,Integer> phaseGreens=intersectionPhaseStatusGroup.getPhaseGreens();
                Map<Integer,Integer> phaseYellow=intersectionPhaseStatusGroup.getPhaseYellows();
                Map<Integer,Integer> phaseReds=intersectionPhaseStatusGroup.getPhaseReds();
                for(int j=0;j<maxNumPhase;j++){
                    str=str+",";
                    // Check green status
                    if(phaseGreens.containsKey(j+1)){
                        if(phaseGreens.get(j+1)==1){
                            str=str+"Green";
                        }
                    }
                    if(phaseYellow.containsKey(j+1)){
                        if(phaseYellow.get(j+1)==1){
                            str=str+"Yellow";
                        }
                    }
                    if(phaseReds.containsKey(j+1)){
                        if(phaseReds.get(j+1)==1){
                            str=str+"Red";
                        }
                    }
                }
            }else{
                for(int j=0;j<maxNumPhase;j++){
                    str=str+",";
                }
            }

            // Ring Status
            if(intersectionSignalStatus.getRingStatusList()!=null) {
                Map<Integer, IntersectionRingStatus> ringstatus = getRingStatusFromSignalStatus(intersectionSignalStatus);
                for(int j=0;j<maxNumRing;j++){
                    str=str+",";
                    if(ringstatus.containsKey(j+1)){
                        IntersectionRingStatus intersectionRingStatus=ringstatus.get(j+1);
                        if(intersectionRingStatus.isMaxOut()){
                            str=str+"Max Out&";
                        }
                        if(intersectionRingStatus.isGapOut()){
                            str=str+"Gap Out&";
                        }
                        if(intersectionRingStatus.isMinGreen()){
                            str=str+"Min Green&";
                        }
                        if(intersectionRingStatus.isExtension()){
                            str=str+"Green Extension&";
                        }
                        if(intersectionRingStatus.isMaximun()){
                            str=str+"Max Green&";
                        }
                        if(intersectionRingStatus.isGreenReset()){
                            str=str+"Green Reset&";
                        }
                        if(intersectionRingStatus.isYellowChange()){
                            str=str+"Yellow Change&";
                        }
                        if(intersectionRingStatus.isRedClearance()){
                            str=str+"Red Clearance&";
                        }
                        if(intersectionRingStatus.isRedReset()){
                            str=str+"Red Reset&";
                        }
                        if(intersectionRingStatus.isUndefined()){
                            str=str+"Undefined";
                        }
                    }
                }
            }else{
                str=str+",,,,";
            }

            // Phase durations/splits
            if(intersectionSignalStatus.getPhaseSplitList()!=null){
                Map<Integer,Integer> phaseDuration=getPhaseDurationListFromSignalStatus(intersectionSignalStatus);
                for(int j=0;j<maxNumPhase;j++){
                    str=str+",";
                    if(phaseDuration.containsKey(j+1)){
                        str=str+phaseDuration.get(j+1);
                    }
                }
            }else{
                for(int j=0;j<maxNumPhase;j++){
                    str=str+",";
                }
            }
            bw.write(str+"\n");
        }
        bw.close();
    }
}
