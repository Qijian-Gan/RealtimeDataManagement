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
    // Save raw data to
    public static String saveRawDataTo="I:\\MongoDB_Data";
    // *********Message topics: Detector related*********************
    // Detector inventory
    public static String intersectionDetectorInventory = "Consumer.research.VirtualTopic.CT.D7.DSS.Data.IntersectionDetectorInventory";
    public static String outputDetectorInventoryLocation="\\data\\detectorInventory";
    public static String collectionDetectorInventory="detectorInventory";
    public static String collectionDetectorInventoryWithTestResult="detectorInventoryWithTestResult";
    public static String collectionDetectorInventoryIndividual="detectorInventoryIndividual";

    // Detector status
    public static String intersectionDetectorStatus = "Consumer.research.VirtualTopic.CT.D7.DSS.Data.IntersectionDetectorStatus";
    public static String outputDetectorStatusLocation="\\data\\detectorStatus";
    public static String collectionDetectorStatus="detectorStatus";
    public static String collectionDetectorStatusWithTestResult="detectorStatusWithTestResult";
    public static String collectionDetectorStatusIndividual="detectorStatusIndividual";

    // Detector data
    public static String intersectionDetectorData = "Consumer.research.VirtualTopic.CT.D7.DSS.Data.IntersectionDetectorData";
    public static String outputDetectorDataLocation="\\data\\detectorData";
    public static String collectionDetectorData="detectorData";
    public static String collectionDetectorDataWithTestResult="detectorDataWithTestResult";
    public static String collectionDetectorDataIndividual="detectorDataIndividual";

    // *********Message topics: Intersection signal related*********************
    // Signal Inventory
    public static String intersectionSignalInventory = "Consumer.research.VirtualTopic.CT.D7.DSS.Data.IntersectionSignalInventory";
    public static String outputSignalInventoryLocation="\\data\\signalInventory";
    public static String collectionIntersectionSignalInventory="intersectionSignalInventory";
    public static String collectionIntersectionSignalInventoryWithTestResult="intersectionSignalInventoryWithTestResult";

    // Signal control schedule
    public static String intersectionSignalControlSchedule = "Consumer.research.VirtualTopic.CT.D7.DSS.Data.IntersectionSignalControlSchedule";
    public static String outputSignalControlLocation="\\data\\signalControl";
    public static String collectionIntersectionSignalControlSchedule="intersectionSignalControlSchedule";
    public static String collectionIntersectionSignalControlScheduleWithTestResult="intersectionSignalControlScheduleWithTestResult";

    // Signal status
    public static String intersectionSignalStatus = "Consumer.research.VirtualTopic.CT.D7.DSS.Data.IntersectionSignalStatus";
    public static String outputSignalStatusLocation="\\data\\signalStatus";
    public static String collectionIntersectionSignalStatus="intersectionSignalStatus";
    public static String collectionIntersectionSignalStatusWithTestResult="intersectionSignalStatusWithTestResult";

    // Signal plan Inventory
    public static String intersectionSignalTimingPatternInventory = "Consumer.research.VirtualTopic.CT.D7.DSS.Data.IntersectionSignalTimingPatternInventory";
    public static String outputSignalTimingPatternInventoryLocation="\\data\\signalTimingPatternInventory";
    public static String collectionIntersectionSignalTimingPattern="intersectionSignalTimingPattern";
    public static String collectionIntersectionSignalTimingPatternWithTestResult="intersectionSignalTimingPatternsWithTestResult";


    // *********Message topics: Freeway data related*********************
    // *********Freeway**********
    // Freeway Detector Data
    public static String freewayDetectorData="Consumer.research.VirtualTopic.CT.D7.DSS.Data.FreewayDetectorData";
    public static String outputFreewayDetectorDataLocation="\\data\\freewayDetectorData";
    public static String collectionFreewayDetectorData="freewayDetectorData";
    public static String collectionFreewayDetectorDataWithTestResult="freewayDetectorDataWithTestResult";

    // Freeway Detector Inventory
    public static String freewayDetectorInventory="Consumer.research.VirtualTopic.CT.D7.DSS.Data.FreewayDetectorInventory";
    public static String outputFreewayDetectorInventoryLocation="\\data\\freewayDetectorInventory";
    public static String collectionFreewayDetectorInventory="freewayDetectorInventory";
    public static String collectionFreewayDetectorInventoryWithTestResult="freewayDetectorInventoryWithTestResult";

    // Freeway Detector Status
    public static String freewayDetectorStatus="Consumer.research.VirtualTopic.CT.D7.DSS.Data.FreewayDetectorStatus";
    public static String outputFreewayDetectorStatusLocation="\\data\\freewayDetectorStatus";
    public static String collectionFreewayDetectorStatus="freewayDetectorStatus";
    public static String collectionFreewayDetectorStatusWithTestResult="freewayDetectorStatusWithTestResult";

    // *********Ramp Detector**********
    // Ramp Detector Data
    public static String rampDetectorData="Consumer.research.VirtualTopic.CT.D7.DSS.Data.RampDetectorData";
    public static String outputRampDetectorDataLocation="\\data\\rampDetectorData";
    public static String collectionRampDetectorData="rampDetectorData";
    public static String collectionRampDetectorDataWithTestResult="rampDetectorDataWithTestResult";

    // Ramp Detector Inventory
    public static String rampDetectorInventory="Consumer.research.VirtualTopic.CT.D7.DSS.Data.RampDetectorInventory";
    public static String outputRampDetectorInventoryLocation="\\data\\rampDetectorInventory";
    public static String collectionRampDetectorInventory="rampDetectorInventory";
    public static String collectionRampDetectorInventoryWithTestResult="rampDetectorInventoryWithTestResult";

    // Ramp Detector Status
    public static String rampDetectorStatus="Consumer.research.VirtualTopic.CT.D7.DSS.Data.RampDetectorStatus";
    public static String outputRampDetectorStatusLocation="\\data\\rampDetectorStatus";
    public static String collectionRampDetectorStatus="rampDetectorStatus";
    public static String collectionRampDetectorStatusWithTestResult="rampDetectorStatusWithTestResult";

    // *********Ramp Meter**********
    // Ramp Meter Inventory
    public static String rampMeterInventory="Consumer.research.VirtualTopic.CT.D7.DSS.Data.RampMeterInventory";
    public static String outputRampMeterInventoryLocation="\\data\\rampMeterInventory";
    public static String collectionRampMeterInventory="rampMeterInventory";
    public static String collectionRampMeterInventoryWithTestResult="rampMeterInventoryWithTestResult";

    // Ramp Meter Status
    public static String rampMeterStatus="Consumer.research.VirtualTopic.CT.D7.DSS.Data.RampMeterStatus";
    public static String outputRampMeterStatusLocation="\\data\\rampMeterStatus";
    public static String collectionRampMeterStatus="rampMeterStatus";
    public static String collectionRampMeterStatusWithTestResult="rampMeterStatusWithTestResult";

    // Ramp Meter Plan Inventory
    public static String rampMeterPlanInventory="Consumer.research.VirtualTopic.CT.D7.DSS.Data.RampMeterPlanInventory";
    public static String outputRampMeterPlanInventoryLocation="\\data\\rampMeterPlanInventory";
    public static String collectionRampMeterPlanInventory="rampMeterPlanInventory";
    public static String collectionRampMeterPlanInventoryWithTestResult="rampMeterPlanInventoryWithTestResult";

    // **************************************************************
    // Data aggregation
    // **************************************************************
    // ******************Detector Data*******************************
    public static String organizations="Arcadia;"; // We need to specify the organization here using the format: Arcadia;LACO;Pasadena;
    public static String collectionAggregatedFrom="detectorDataIndividual";
    public static String collectionAggregatedTo="detectorDataAggregated";
    public static int interval=300; // in Seconds
    public static int delay=1; // A delay of (number of intervals)
    public static String outputFolder="\\data\\output\\detector\\";
    // ******************Signal Data*******************************
    public static int intervalSignal=3600*4; // in Seconds
    public static String outputFolderSignal="\\data\\output\\signal\\";
    public static String collectionCycleInformation="intersectionCycleInformation";

    // **************************************************************
    // Detector Health and Data Pre-processing
    // **************************************************************
    public static String collectionDetectorHealth="detectorHealth";
    public static String collectionDetectorDataPreprocess="detectorDataPreprocess";

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
