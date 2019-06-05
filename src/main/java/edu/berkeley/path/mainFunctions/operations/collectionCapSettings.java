package edu.berkeley.path.mainFunctions.operations;


import edu.berkeley.path.settings.Configuration;

import static edu.berkeley.path.database.MongoDB.capped.capACollection;

public class collectionCapSettings {

    public static void main(String[] args) {
        // This function is used to check whether a collection is capped or not

        // Overwrite capped settings
        boolean overwriteCappedSettings=false;

        //******************************************************************************
        //****************************Freeway*******************************************
        //******************************************************************************
        // Freeway Data: 100GB
        capACollection(Configuration.mongodbName, Configuration.collectionFreewayDetectorData, 100000000000L, 0, overwriteCappedSettings);


        //******************************************************************************
        //****************************Arterial******************************************
        //******************************************************************************
        // Detector Data Pre-process
        // Detector Data: 30GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorData, 30000000000L, 0, overwriteCappedSettings);
        // Detector Data Individual: 30GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorDataIndividual, 30000000000L, 0, overwriteCappedSettings);
        // Detector Data Test Results: 100GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorDataWithTestResult, 100000000000L, 0, overwriteCappedSettings);

        // Detector Data Aggregated: 10GB
        capACollection(Configuration.mongodbName, Configuration.collectionAggregatedTo, 10000000000L, 0, overwriteCappedSettings);

        // Detector Data Pre-process: 10GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorDataPreprocess, 10000000000L, 0, overwriteCappedSettings);

        // Detector Data Health: 1GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorHealth, 1000000000L, 0, overwriteCappedSettings);

        // Detector Inventory: 1GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorInventory, 1000000000L, 0, overwriteCappedSettings);
        // Detector Inventory Individual: 1GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorInventoryIndividual, 1000000000L, 0, overwriteCappedSettings);
        // Detector Inventory Test Results: 3GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorInventoryWithTestResult, 3000000000L, 0, overwriteCappedSettings);

        // Detector Status (streaming data but with lower frequency): 1GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorStatus, 1000000000L, 0, overwriteCappedSettings);
        // Detector Status Individual: 1GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorStatusIndividual, 1000000000L, 0, overwriteCappedSettings);
        // Detector Status Test Results: 3GB
        capACollection(Configuration.mongodbName, Configuration.collectionDetectorStatusWithTestResult, 3000000000L, 0, overwriteCappedSettings);

        // Intersection Cycle Information: 1GB
        capACollection(Configuration.mongodbName, Configuration.collectionCycleInformation, 1000000000L, 0, overwriteCappedSettings);

        // Intersection Signal Control Schedule: 1GB
        capACollection(Configuration.mongodbName, Configuration.collectionIntersectionSignalControlSchedule, 1000000000L, 0, overwriteCappedSettings);
        // Intersection Signal Control Schedule Test Results: 3GB
        capACollection(Configuration.mongodbName, Configuration.collectionIntersectionSignalControlScheduleWithTestResult, 3000000000L, 0, overwriteCappedSettings);

        // Intersection Signal Inventory: 1GB
        capACollection(Configuration.mongodbName, Configuration.collectionIntersectionSignalInventory, 1000000000L, 0, overwriteCappedSettings);
        // Intersection Signal Inventory Test Results: 3GB
        capACollection(Configuration.mongodbName, Configuration.collectionIntersectionSignalInventoryWithTestResult, 3000000000L, 0, overwriteCappedSettings);

        // Intersection Signal Status: 30GB
        capACollection(Configuration.mongodbName, Configuration.collectionIntersectionSignalStatus, 30000000000L, 0, overwriteCappedSettings);
        // Intersection Signal Status Test Results: 100GB
        capACollection(Configuration.mongodbName, Configuration.collectionIntersectionSignalStatusWithTestResult, 100000000000L, 0, overwriteCappedSettings);

        // Intersection Signal Timing Pattern: 10GB
        capACollection(Configuration.mongodbName, Configuration.collectionIntersectionSignalTimingPattern, 10000000000L, 0, overwriteCappedSettings);
        // Intersection Signal Timing Pattern Test Results: 30GB
        capACollection(Configuration.mongodbName, Configuration.collectionIntersectionSignalTimingPatternWithTestResult, 30000000000L, 0, overwriteCappedSettings);


    }
}
