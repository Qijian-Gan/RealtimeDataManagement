package edu.berkeley.path.mainFunctions;

import com.mongodb.client.MongoCollection;
import edu.berkeley.path.settings.Configuration;
import org.bson.Document;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import static edu.berkeley.path.database.MongoDB.connect.getCollectionMongoDBStandalone;
import static edu.berkeley.path.database.MongoDB.select.documentsForGivenDeviceIdAndTimingPlanAndTimePeriods;
import static edu.berkeley.path.database.MongoDB.select.upToDateDeviceIdAndTPIdAndTimeFromIntSigStatus;
import static edu.berkeley.path.database.MongoDB.extract.sequenceDataToCSVFileForEachDeviceIdAndTimingPlanAndTimePeriod;

public class extractSignalDataSequence {

    public static void main(String[] args) throws ParseException, IOException {

        // Collection: Signal Status
        MongoCollection<Document> collectionSignalStatus = getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionIntersectionSignalStatus);

        // Collection: Signal TP Inventory
        MongoCollection<Document> collectionSignalTPInventory = getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionIntersectionSignalTimingPattern);

        // Get the latest/most up-to-date datetime information for each organizationId & deviceId & timing pattern
        // Key<Organization Id, Device Id, Timing Pattern Id> && Value<Date, Time>
        Map<List<String>, Long> uniqueDevIdTPAndTime = upToDateDeviceIdAndTPIdAndTimeFromIntSigStatus(collectionSignalStatus);

        long duration = Configuration.intervalSignal; // Search window in seconds;

        Iterator iterator = uniqueDevIdTPAndTime.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            List<String> key = (List<String>) pair.getKey();
            String organizationId=key.get(0);
            String deviceId=key.get(1);
            String timingPatternId=key.get(2);
            long endTime = (long) pair.getValue();
            long startTime = endTime - duration * ((long) 1000.0);
            System.out.println("deviceID:"+deviceId+"& timingPatternID:"+timingPatternId);
            sequenceDataToCSVFileForEachDeviceIdAndTimingPlanAndTimePeriod(collectionSignalStatus,collectionSignalTPInventory
                    ,organizationId,deviceId,timingPatternId, startTime, endTime,Configuration.outputFolderSignal);
        }
    }

}

