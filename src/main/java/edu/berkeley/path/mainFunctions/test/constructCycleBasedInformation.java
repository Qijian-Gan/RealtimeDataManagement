package edu.berkeley.path.mainFunctions.test;

import com.mongodb.client.MongoCollection;
import edu.berkeley.path.mainFunctions.Other.Application;
import edu.berkeley.path.settings.Configuration;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.bson.Document;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

import static edu.berkeley.path.aggregation.intersectionCycleBuilderByRing.buildAndSaveCycleInformation;
import static edu.berkeley.path.aggregation.intersectionCycleBuilder.getCycleBuildingPeriodForAllIntersections;
import static edu.berkeley.path.database.MongoDB.connect.getCollectionMongoDBStandalone;

public class constructCycleBasedInformation {

    private static final Logger LOG = LogManager.getLogger(Application.class);


    public static void main(String[] args) throws ParseException, IOException {

        // Collection: Signal Status
        MongoCollection<Document> collectionSignalStatus=getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionIntersectionSignalStatus);
        // Collection: Signal TP Inventory
        MongoCollection<Document> collectionSignalTPInventory=getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionIntersectionSignalTimingPattern);
        // Collection: Signal Cycle Information
        MongoCollection<Document> collectionCycleInformation=getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionCycleInformation);

        String orgId="1"; // Now only for Arcadia with orgID=1
        // Get the building period: <devId, [beginning time, ending time]>
        Map<String,Long[]> buildingTimePeriod=getCycleBuildingPeriodForAllIntersections(collectionSignalStatus
                ,collectionSignalTPInventory, collectionCycleInformation,orgId);

        // Get the list of documents for cycle information
        buildAndSaveCycleInformation(buildingTimePeriod,orgId,
                collectionSignalStatus,collectionSignalTPInventory,collectionCycleInformation);
    }

}
