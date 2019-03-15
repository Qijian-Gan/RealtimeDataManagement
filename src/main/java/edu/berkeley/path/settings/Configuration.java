package edu.berkeley.path.settings;

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
    public static String collectionDetectorInventoryIndividual="detectorInventoryIndividual";

    // Detector status
    public static String intersectionDetectorStatus = "Consumer.research.VirtualTopic.CT.D7.DSS.DataOrdered.IntersectionDetectorStatus";
    public static String outputDetectorStatusLocation="\\data\\detectorStatus";
    public static String collectionDetectorStatus="detectorStatus";
    public static String collectionDetectorStatusWithTestResult="detectorStatusWithTestResult";
    public static String collectionDetectorStatusIndividual="detectorStatusIndividual";

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
    public static String intersectionSignalPlanInventory = "Consumer.research.VirtualTopic.CT.D7.DSS.DataOrdered.IntersectionSignalTimingPatternInventory";
    public static String outputSignalPlanInventoryLocation="\\data\\signalTimingPatternInventory";
    public static String collectionIntersectionSignalTimingPattern="intersectionSignalTimingPattern";
    public static String collectionIntersectionSignalTimingPatternWithTestResult="intersectionSignalTimingPatternsWithTestResult";


    // **************************************************************
    // Data Aggregation
    // **************************************************************
    // ******************Detector Data*******************************
    public static String collectionAggregatedFrom="detectorDataIndividual";
    public static String collectionAggregatedTo="detectorDataAggregated";
    public static int interval=300; // in Seconds
    public static String outputFolder="\\data\\output\\";


    // **************************************************************
    // Local Folders
    // **************************************************************
    // ******************Detector Data*******************************
    public static String localFolderForDetectorData="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\detectorData";
    public static String localFolderForDetectorInventory="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\detectorInventory";
    public static String localFolderForDetectorStatus="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\detectorStatus";

    public static String readFolderForDetectorData="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\read\\detectorData";
    public static String readFolderForDetectorInventory="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\read\\detectorInventory";
    public static String readFolderForDetectorStatus="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\read\\detectorStatus";

    // ******************Signal Data*******************************
    public static String localFolderForSignalControlSchedule="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalControl";
    public static String localFolderForSignalInventory="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalInventory";
    public static String localFolderForSignalPlanInventory="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalPlanInventory";
    public static String localFolderForSignalStatus="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalStatus";

    public static String readFolderForSignalControlSchedule="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\read\\signalControl";
    public static String readFolderForSignalInventory="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\read\\signalInventory";
    public static String readFolderForSignalPlanInventory="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\read\\signalPlanInventory";
    public static String readFolderForSignalStatus="C:\\Users\\qgan\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\read\\signalStatus";
    
}
