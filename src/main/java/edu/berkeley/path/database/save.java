package edu.berkeley.path.database;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.List;

// This function is to save documents to a mongodb collection
public class save {

    // Insert one document to mongodb
    public static void insertOneToMongodbCollection(MongoDatabase database, String collectionName, Document document){

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Save the document
        coll.insertOne(document);
    }


    // Insert multiple document to mongodb
    public static void insertMultipleToMongodbCollection(MongoDatabase database,String collectionName, List<Document> documentList){

        // Connect to a predefined collection
        MongoCollection<Document> coll = database.getCollection(collectionName);

        // Insert many documents
        coll.insertMany(documentList);
    }

}
