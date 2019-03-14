package edu.berkeley.path.database.MongoDB;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.IndexOptions;
import com.mongodb.client.model.Filters;

public class create {

    public static void indexForDetectorData(String databaseName, String collectionName){

        // Initiate the connection
        MongoClient mongoClient = new MongoClient();

        // Connect to a predefined database
        MongoDatabase database = mongoClient.getDatabase(databaseName);

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Key: organization id and detector id
        coll.createIndex(Indexes.ascending("organizationInformation.organizationId",
                "detectorDataList.detectorDataDetail.detectorId"));

        // Key: detector id and start date
        coll.createIndex(Indexes.ascending(
                "detectorDataList.detectorDataDetail.detectorId",
                "detectorDataList.detectorDataDetail.startTime.date"));

        // Key: detector id and start time
        coll.createIndex(Indexes.ascending(
                "detectorDataList.detectorDataDetail.detectorId",
                "detectorDataList.detectorDataDetail.startTime.time"));

        // Key: detector id and end date
        coll.createIndex(Indexes.ascending(
                "detectorDataList.detectorDataDetail.detectorId",
                "detectorDataList.detectorDataDetail.endTime.date"));

        // Key: detector id and end time
        coll.createIndex(Indexes.ascending(
                "detectorDataList.detectorDataDetail.detectorId",
                "detectorDataList.detectorDataDetail.endTime.time"));

        mongoClient.close();
    }

}
