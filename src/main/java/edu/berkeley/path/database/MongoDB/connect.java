package edu.berkeley.path.database.MongoDB;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


import java.util.Arrays;

public class connect {


    // This function connect to a specific collection inside a specific database
    /**
     *
     * @param databaseName Database Name
     * @param collectionName Collection Name
     * @return MongoCollection<Document>
     */
    public static MongoCollection<Document> getCollectionMongoDBStandalone(String databaseName,String collectionName){

        // Initiate the connection
        MongoClient mongoClient = new MongoClient();

        // Connect to a predefined database
        MongoDatabase database = mongoClient.getDatabase(databaseName);

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        return coll;
    }




}
