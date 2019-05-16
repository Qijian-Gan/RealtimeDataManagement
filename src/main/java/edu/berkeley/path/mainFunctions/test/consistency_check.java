package edu.berkeley.path.mainFunctions.test;

import com.mongodb.client.MongoCollection;
import edu.berkeley.path.settings.Configuration;
import org.bson.Document;

import java.io.IOException;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static edu.berkeley.path.database.MongoDB.connect.getCollectionMongoDBStandalone;
import static edu.berkeley.path.database.MongoDB.select.*;


public class consistency_check {

    public static void main(String[] args) throws ParseException, IOException {
        // This function is used to check the number of detectors/intersections among different message types

        String orgId="1"; // Arcadia is "1"

        // Collection: Detector Inventory Individual
        MongoCollection<Document> collectionDetectorInvIndiv = getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionDetectorInventoryIndividual);
        List<String> uniqueDeviceIdsDetectorInv=getUniqueListOfDeviceIdsForGivenOrgFromDetectorInventory(collectionDetectorInvIndiv,orgId);
        System.out.println("Detector Inventory="+uniqueDeviceIdsDetectorInv.size());
        System.out.println(uniqueDeviceIdsDetectorInv);

        // Collection Detector Data Individual
        MongoCollection<Document> collectionDetectorDataIndiv = getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionDetectorDataIndividual);
        List<String> uniqueDeviceIdsDetectorData=getUniqueListOfDeviceIdsForGivenOrgFromDetectorData(collectionDetectorDataIndiv,orgId,"Arcadia");
        System.out.println("Detector Data ="+uniqueDeviceIdsDetectorData.size());
        System.out.println(uniqueDeviceIdsDetectorData);

        uniqueDeviceIdsDetectorInv.retainAll(uniqueDeviceIdsDetectorData);
        System.out.println("Common Detectors ="+uniqueDeviceIdsDetectorInv.size());
        System.out.println(uniqueDeviceIdsDetectorInv);


        // Collection: Signal Status
        MongoCollection<Document> collectionSignalStatus = getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionIntersectionSignalStatus);
        List<String> uniqueDeviceIdsSigStatus=getUniqueListOfDeviceIdsForGivenOrgFromIntSigStatus(collectionSignalStatus,orgId);
        System.out.println("Signal Status ="+uniqueDeviceIdsSigStatus.size());
        System.out.println(uniqueDeviceIdsSigStatus);

        // Collection: Signal TP Inventory
        MongoCollection<Document> collectionSignalTPInventory = getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionIntersectionSignalTimingPattern);
        List<String> uniqueDeviceIdsSigTPInv=getUniqueListOfDeviceIdsForGivenOrgFromIntSigTP(collectionSignalTPInventory,orgId);
        System.out.println("Signal TP Inventory ="+uniqueDeviceIdsSigTPInv.size());
        System.out.println(uniqueDeviceIdsSigTPInv);


    }


}
