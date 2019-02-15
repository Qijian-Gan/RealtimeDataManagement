package edu.berkeley.path;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Configuration {

    // **************************************************************
    // MongoDB Connection
    // **************************************************************
    public static String mongodbName="i210Datahub";
    public static MongoClient mongoClient = new MongoClient();
    public static MongoDatabase database = mongoClient.getDatabase(mongodbName);

    // **************************************************************
    // Settings: should be updated once the message topic is changed
    // **************************************************************
    // *********Message topics: Detector related*********************
    // Detector inventory
    public static String intersectionDetectorInventory = "Consumer.research.VirtualTopic.CT.D7.DSS.DataOrdered.IntersectionDetectorInventory";
    public static String outputDetectorInventoryLocation="\\data\\detectorInventory";
    public static String collectionDetectorInventory="detectorInventory";
    public static String collectionDetectorInventoryWithTestResult="detectorInventoryWithTestResult";

    // Detector status
    public static String intersectionDetectorStatus = "Consumer.research.VirtualTopic.CT.D7.DSS.DataOrdered.IntersectionDetectorStatus";
    public static String outputDetectorStatusLocation="\\data\\detectorStatus";
    public static String collectionDetectorStatus="detectorStatus";
    public static String collectionDetectorStatusWithTestResult="detectorStatusWithTestResult";

    // Detector data
    public static String intersectionDetectorData = "Consumer.research.VirtualTopic.CT.D7.DSS.DataOrdered.IntersectionDetectorData";
    public static String outputDetectorDataLocation="\\data\\detectorData";
    public static String collectionDetectorData="detectorData";
    public static String collectionDetectorDataWithTestResult="detectorDataWithTestResult";
    public static String collectionDetectorDataIndividual="detectorDataIndividual";

    // *********Message topics: Intersection signal related*********************
    // Signal Inventory
    public static String intersectionSignalInventory = "Consumer.research.VirtualTopic.CT.D7.DSS.DataOrdered.IntersectionSignalInventory";
    public static String outputSignalInventoryLocation="\\data\\signalInventory";
    public static String collectionIntersectionSignalInventory="intersectionSignalInventory";
    public static String collectionIntersectionSignalInventoryWithTestResult="intersectionSignalInventoryWithTestResult";

    // Signal control schedule
    // Todo: update the message topic
    public static String intersectionSignalControlSchedule = "Consumer.research.VirtualTopic.CT.D7.210.DSSInterface.IntersectionSignalControlSchedule";
    public static String outputSignalControlLocation="\\data\\signalControl";

    // Signal status
    public static String intersectionSignalStatus = "Consumer.research.VirtualTopic.CT.D7.DSS.DataOrdered.IntersectionSignalStatus";
    public static String outputSignalStatusLocation="\\data\\signalStatus";
    public static String collectionIntersectionSignalStatus="intersectionSignalStatus";
    public static String collectionIntersectionSignalStatusWithTestResult="intersectionSignalStatusWithTestResult";

    // Signal plan Inventory
    // Todo: update the message topic
    public static String intersectionSignalPlanInventory = "Consumer.research.VirtualTopic.CT.D7.210.DSSInterface.IntersectionSignalPlanInventory";
    public static String outputSignalPlanInventoryLocation="\\data\\signalPlanInventory";


    // **************************************************************
    // Data Aggregation
    // **************************************************************
    // ******************Detector Data*******************************
    public static String collectionAggregatedFrom="detectorDataIndividual";
    public static String collectionAggregatedTo="detectorDataAggregated";
    public static int interval=300; // in Seconds


    // **************************************************************
    // Local Folders
    // **************************************************************
    // ******************Detector Data*******************************
    public static String localFolderForDetectorData="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\detectorData";
    public static String localFolderForDetectorInventory="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\detectorInventory";
    public static String localFolderForDetectorStatus="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\detectorStatus";
    // ******************Detector Data*******************************
    public static String localFolderForSignalControlSchedule="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalControl";
    public static String localFolderForSignalInventory="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalInventory";
    public static String localFolderForSignalPlanInventory="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalPlanInventory";
    public static String localFolderForSignalStatus="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalStatus";
    
}
