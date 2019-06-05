package edu.berkeley.path.database.MongoDB;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class capped {
    // This function is to cap the collection

    public static void capACollection(String databaseName, String collectionName,long size, long max,boolean overwriteCappedSetting ){

        // Initiate the connection
        MongoClient mongoClient = new MongoClient();

        // Connect to a predefined database
        MongoDatabase database = mongoClient.getDatabase(databaseName);

        // Get a list of collection names
        List<String> collectionNames=new ArrayList<>();
        database.listCollectionNames().into(collectionNames);

        // If the given collection name is found
        if(collectionNames.contains(collectionName)){
            MongoCollection<Document> coll = database.getCollection(collectionName);

            Document collStatsResults = database.runCommand(new Document("collStats", collectionName));
            System.out.println(collStatsResults.toJson());
            if ((boolean) collStatsResults.get("capped")) {
                System.out.println(collectionName + " is already capped.");
                if (overwriteCappedSetting && size > 0) {
                    System.out.println("Overwrite the capped settings.");
                    Document doc = new Document("convertToCapped", collectionName);
                    doc.append("size", size);
                    if (max > 0) {
                        doc.append("max", max);
                    }
                    Document result = database.runCommand(doc);
                    System.out.println(result.toJson());
                    collStatsResults = database.runCommand(new Document("collStats", collectionName));
                    System.out.println(collStatsResults.toJson());
                }
            } else {
                System.out.println(collectionName + " is uncapped.");
                if (size > 0) {
                    Document doc = new Document("convertToCapped", collectionName);
                    doc.append("size", size);
                    if (max > 0) {
                        doc.append("max", max);
                    }
                    Document result = database.runCommand(doc);
                    System.out.println(result.toJson());
                    collStatsResults = database.runCommand(new Document("collStats", collectionName));
                    System.out.println(collStatsResults.toJson());
                }
            }
        }
    }

}
