package edu.berkeley.path.mainFunctions.operations;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import edu.berkeley.path.settings.Configuration;

import static edu.berkeley.path.database.MongoDB.create.*;

public class createIndexForCollections {


    public static void main(String[] args) {
        // This function is used to create index for different collections

        // Initiate the connection
        MongoClient mongoClient = new MongoClient();

        // Connect to a predefined database
        MongoDatabase database = mongoClient.getDatabase(Configuration.mongodbName);

        // Detector Data Individual
        indexForDetectorDataIndividual(database, Configuration.collectionDetectorDataIndividual);

        // Detector Data Test Results
        indexForDetectorDataTestResults(database, Configuration.collectionDetectorDataWithTestResult);

        // Detector Inventory Individual
        indexForDetectorInventoryIndividual(database, Configuration.collectionDetectorInventoryIndividual);

        // Detector Inventory Test Results
        indexForDetectorInventoryTestResults(database, Configuration.collectionDetectorInventoryWithTestResult);

        // Detector Status Individual
        indexForDetectorStatusIndividual(database,Configuration.collectionDetectorStatusIndividual);

        // Detector Status Individual Test Results
        indexForDetectorStatusIndividualTestResults(database,Configuration.collectionDetectorStatusWithTestResult);

        // Detector Data Aggregated
        indexForDetectorDataAggregated(database,Configuration.collectionAggregatedTo);

        // Detector Data Pre-process
        indexForDetectorDataPreprocess(database,Configuration.collectionDetectorDataPreprocess);

        // Detector Health
        indexForDetectorHealth(database,Configuration.collectionDetectorHealth);

        // Intersection Signal Control Schedule
        indexForIntersectionSignalControlSchedule(database, Configuration.collectionIntersectionSignalControlSchedule);

        // Intersection Signal Control Schedule Test Results
        indexForIntersectionSignalControlScheduleTestResults(database,
                Configuration.collectionIntersectionSignalControlScheduleWithTestResult);

        // Intersection Signal Inventory
        indexForIntersectionSignalInventory(database,Configuration.collectionIntersectionSignalInventory);

        // Intersection Signal Inventory Test Results
        indexForIntersectionSignalInventoryTestResults(database,Configuration.collectionIntersectionSignalInventoryWithTestResult);

        // Intersection Signal Status
        indexForIntersectionSignalStatus(database,Configuration.collectionIntersectionSignalStatus);

        // Intersection Signal Status Test Results
        indexForIntersectionSignalStatusTestResults(database,Configuration.collectionIntersectionSignalStatusWithTestResult);

        // Intersection Signal Timing Pattern
        indexForIntersectionSignalTimingPattern(database,Configuration.collectionIntersectionSignalTimingPattern);

        // Intersection Signal Timing Pattern Test Results
        indexForIntersectionSignalTimingPatternTestResults(database,Configuration.collectionIntersectionSignalTimingPatternWithTestResult);
    }
}
