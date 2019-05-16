package edu.berkeley.path.mainFunctions.test;

import com.mongodb.client.MongoCollection;
import edu.berkeley.path.mainFunctions.Other.Application;
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
import static edu.berkeley.path.database.MongoDB.select.documentsForGivenDeviceIdAndTimingPlanAndTimePeriodsFromSigStatus;
import static edu.berkeley.path.database.MongoDB.select.upToDateDeviceIdAndTPIdAndTimeFromIntSigStatus;
import static edu.berkeley.path.processor.SignalStatus.*;
import static edu.berkeley.path.processor.SignalStatus.getOverlapPhaseStatusGroupFromSiganlStatus;

public class getLatestCycleInformation {

    private static final Logger LOG = LogManager.getLogger(Application.class);


    public static void main(String[] args) throws ParseException, IOException {

        // Collection: Signal Status
        MongoCollection<Document> collectionSignalStatus=getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionIntersectionSignalStatus);
        // Collection: Signal TP Inventory
        MongoCollection<Document> collectionSignalTPInventory=getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionIntersectionSignalTimingPattern);

        // Get the latest/most up-to-date datetime information for each organizationId & deviceId & timing pattern
        // Key<Organization Id, Device Id, Timing Pattern Id> && Value<Date, Time>
        Map<List<String>,Long> uniqueDevIdTPAndTime=upToDateDeviceIdAndTPIdAndTimeFromIntSigStatus(collectionSignalStatus);

        long duration=5*60; // Search window in seconds;

        Iterator iterator=uniqueDevIdTPAndTime.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair=(Map.Entry) iterator.next();
            List<String> key=(List<String>) pair.getKey();
            long endTime=(long) pair.getValue();
            long startTime=endTime- duration*((long)1000.0);
            List<Document> documentList=documentsForGivenDeviceIdAndTimingPlanAndTimePeriodsFromSigStatus(collectionSignalStatus
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
