package edu.berkeley.path.mainFunctions;

import com.mongodb.client.MongoCollection;
import edu.berkeley.path.objects.IntersectionOverlapStatusGroup;
import edu.berkeley.path.objects.IntersectionPhaseStatusGroup;
import edu.berkeley.path.objects.IntersectionRingStatus;
import edu.berkeley.path.settings.Configuration;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.bson.Document;
import org.tmdd._303.messages.IntersectionSignalStatus;

import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static edu.berkeley.path.database.MongoDB.connect.getCollectionMongoDBStandalone;
import static edu.berkeley.path.database.MongoDB.select.*;
import static edu.berkeley.path.processor.SignalStatus.*;

public class selectIntSigStatus {

    private static final Logger LOG = LogManager.getLogger(Application.class);


    public static void main(String[] args) throws ParseException, IOException {

        MongoCollection<Document> collection=getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionIntersectionSignalStatus);

        List<String> uniqueDeviceIds=getUniqueListOfDeviceIdsFromIntSigStatus(collection);
        System.out.println(uniqueDeviceIds);

        // Key<Organization Id, Device Id, Timing Pattern Id> && Value<Date, Time>
        Map<List<String>,Long> uniqueDevIdTPAndTime=upToDateDeviceIdAndTPIdAndTimeFromIntSigStatus(collection);

        long duration=5*60; // Search window in seconds;

        Iterator iterator=uniqueDevIdTPAndTime.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair=(Map.Entry) iterator.next();
            List<String> key=(List<String>) pair.getKey();
            long endTime=(long) pair.getValue();
            long startTime=endTime- duration*((long)1000.0);
            List<Document> documentList=documentsForGivenDeviceIdAndTimingPlanAndTimePeriods(collection
                    ,key.get(0), key.get(1), key.get(2),startTime, endTime);

            // functions for each document
            for(int i=0;i<documentList.size();i++){
                IntersectionSignalStatus intersectionSignalStatus=getSignalStatusFromDocument(documentList.get(i));
                System.out.println(intersectionSignalStatus.getDeviceStatusHeader().getDeviceId());
                List<Integer> cycleLengths=getCycleLengthsFromSignalStatus(intersectionSignalStatus);
                System.out.println(cycleLengths);
                List<Integer> offsets=getOffsetsFromSignalStatus(intersectionSignalStatus);
                System.out.println(offsets);
                List<Integer> cycleCounters=getCycleCountersFromSignalStatus(intersectionSignalStatus);
                System.out.println(cycleCounters);
                Map<Integer,Integer> phaseDurations=getPhaseDurationListFromSignalStatus(intersectionSignalStatus);
                if(phaseDurations.isEmpty()){
                    System.out.println("Empty phase duration information!");
                }else{
                    System.out.println(phaseDurations);
                }
                getRingStatusFromSignalStatus(intersectionSignalStatus);
                getPhaseStatusGroupFromSignalStatus(intersectionSignalStatus);
                getOverlapPhaseStatusGroupFromSiganlStatus(intersectionSignalStatus);
            }

        }

    }
}
