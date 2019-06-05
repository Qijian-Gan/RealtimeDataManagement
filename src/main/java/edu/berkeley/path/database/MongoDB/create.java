package edu.berkeley.path.database.MongoDB;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.IndexOptions;
import com.mongodb.client.model.Filters;

public class create {

    public static void indexForDetectorDataIndividual(MongoDatabase database, String collectionName){
        // Indexes for Detector Data Individual

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId"));

        // Key: start time stamp (date and time)
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId", "startTimeStamp"));

        // Key: start date
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId", "startDate"));

        // Key: start time
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId", "startTime"));
    }

    public static void indexForDetectorDataTestResults(MongoDatabase database, String collectionName){
        // Indexes for Detector Data Test Results

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "receivedTime"));
    }

    public static void indexForDetectorInventoryIndividual(MongoDatabase database, String collectionName){
        // Indexes for Detector Inventory Individual

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId"));

        // Key: last update time
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId", "lastUpdateTime"));
    }

    public static void indexForDetectorInventoryTestResults(MongoDatabase database, String collectionName){
        // Indexes for Detector Inventory Test Results

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "receivedTime"));
    }

    public static void indexForDetectorStatusIndividual(MongoDatabase database, String collectionName){
        // Indexes for Detector Status Individual

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "deviceId","lastUpdateTime"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "deviceId"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId","lastUpdateTime"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","deviceId","lastUpdateTime"));
    }

    public static void indexForDetectorStatusIndividualTestResults(MongoDatabase database, String collectionName){
        // Indexes for Detector Status Individual Test Results

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","deviceId","receivedTime"));

    }


    public static void indexForDetectorDataAggregated(MongoDatabase database, String collectionName){
        // Indexes for Detector Data Aggregated

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","startTimeStamp"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId"));

    }

    public static void indexForDetectorDataPreprocess(MongoDatabase database, String collectionName){
        // Indexes for Detector Data Pre-process

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","date"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","year","month","day","timeInSeconds"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","year","month","day"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","year","month"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","year"));
        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","month"));
        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","day"));
        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","timeInSeconds"));

    }

    public static void indexForDetectorHealth(MongoDatabase database, String collectionName){
        // Indexes for Detector Health

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","date"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","year","month","day"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","year","month"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","year"));
        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","month"));
        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "detectorId","day"));

    }


    public static void indexForIntersectionSignalControlSchedule(MongoDatabase database, String collectionName){
        // Indexes for Intersection Signal Control Schedule

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId", "deviceId","lastUpdateTime","timingPatternId"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId", "deviceId","timingPatternId"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId", "deviceId"));

    }

    public static void indexForIntersectionSignalControlScheduleTestResults(MongoDatabase database, String collectionName){
        // Indexes for Intersection Signal Control Schedule Test Results

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "receivedTime"));
    }

    public static void indexForIntersectionSignalInventory(MongoDatabase database, String collectionName){
        // Indexes for Intersection Signal Inventory

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId", "deviceId","lastUpdateTime"));
    }

    public static void indexForIntersectionSignalInventoryTestResults(MongoDatabase database, String collectionName){
        // Indexes for Intersection Signal Inventory Test Results

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "receivedTime"));
    }

    public static void indexForIntersectionSignalStatus(MongoDatabase database, String collectionName){
        // Indexes for Intersection Signal Status

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId", "deviceId","timingPatternIdCurrent","lastUpdateTime"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId", "deviceId","timingPatternIdCurrent"));

        // Key
        coll.createIndex(Indexes.ascending("organizationId", "deviceId"));
    }

    public static void indexForIntersectionSignalStatusTestResults(MongoDatabase database, String collectionName){
        // Indexes for Intersection Signal Status Test Results

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "receivedTime"));
    }

    public static void indexForIntersectionSignalTimingPattern(MongoDatabase database, String collectionName){
        // Indexes for Intersection Signal Timing Pattern

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationInformation.organizationId", "deviceId","timingPatternId"));

        // Key
        coll.createIndex(Indexes.ascending("organizationInformation.organizationId", "deviceId"));
    }

    public static void indexForIntersectionSignalTimingPatternTestResults(MongoDatabase database, String collectionName){
        // Indexes for Intersection Signal Timing Pattern Test Results

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key
        coll.createIndex(Indexes.ascending("organizationId","stationId", "receivedTime"));
    }
}
