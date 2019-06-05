package edu.berkeley.path.detectorHealth;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import edu.berkeley.path.database.MongoDB.connect;
import edu.berkeley.path.database.MongoDB.save;
import edu.berkeley.path.objects.DetectorHealthMetrics;
import edu.berkeley.path.objects.DetectorDataProcessed;
import edu.berkeley.path.settings.Configuration;
import edu.berkeley.path.settings.DetectorHealthThresholds;
import edu.berkeley.path.settings.ImputationFilteringSettings;
import org.bson.Document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.mongodb.client.model.Filters.*;
import static edu.berkeley.path.detectorHealth.DataFiltering.fillInMissingValues;
import static edu.berkeley.path.detectorHealth.DataFiltering.smoothingData;
import static edu.berkeley.path.detectorHealth.HealthAnalysis.checkDetectorHealthByDetectorByDay;

public class UpdateDetectorHealthAndData {

    public static void updateForAllOrganizations() throws JsonProcessingException {
        // Update detector health and pre-process data for all organizations

        // Get the connections
        final MongoCollection<Document> collAggregatedData=connect.getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionAggregatedTo);
        final MongoCollection<Document> collDetectorHealth=connect.getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionDetectorHealth);

        // Get a list of detector id in the aggregated data
        AggregateIterable<Document> documentAggregateIterable=getDetectorDataIndexFromGivenCollection(collAggregatedData);

        // Initialization
        List<DetectorHealthMetrics> detectorHealthMetricsList=new ArrayList<>();
        List<DetectorDataProcessed> detectorDataProcessedList=new ArrayList<>();

        documentAggregateIterable.forEach((Block<Document>) document -> {
            // Get the key
            Document key = (Document) document.get("_id");

            // Get number of lane from the inventory
            int numOfLanes=getNumberOfLanesForGivenDetectorFromInventory(key);

            // Get the starting date: max[the earliest day in the Data Aggregated collection,
            // one day after the current day in the Detector Health collection]
            Date startDate=getStartDate(key, collAggregatedData, collDetectorHealth);
            // Get the ending date: min[yesterday,the day before the current day in the Data Aggregated collection]
            Date endDate=getEndDate(key,collAggregatedData);

            if(startDate!=null && startDate.getTime()<=endDate.getTime()){
                // Days available for analysis??
                System.out.println("Org" + key.get("organizationId") + "&Int" + key.get("stationId") + "&Det" + key.get("detectorId")
                +" &Start Date="+startDate.toString()+ " &End Date="+endDate.toString());

                // Get the key information
                String organizationId=key.get("organizationId").toString();
                String stationId=key.get("stationId").toString();
                String detectorId=key.get("detectorId").toString();

                while(startDate.getTime()<=endDate.getTime()){
                    long startTime=startDate.getTime();
                    long endTime=startTime+24*3600*1000;
                    // Get the detector measurements: [time, flow, occupancy, speed]
                    double [][] measurements=getDetectorMeasurementsFromAggregatedDataForGivenKey(collAggregatedData,key,startTime,endTime);

                    // Detector Health Analysis
                    DetectorHealthThresholds detectorHealthThresholds=new DetectorHealthThresholds();
                    try {
                        DetectorHealthMetrics detectorHealthMetrics=checkDetectorHealthByDetectorByDay(organizationId,Integer.parseInt(stationId)
                                , Integer.parseInt(detectorId), startDate, Configuration.interval, measurements, numOfLanes, detectorHealthThresholds);
                        detectorHealthMetricsList.add(detectorHealthMetrics);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    // Data filtering and imputation
                    ImputationFilteringSettings imputationFilteringSettings=new ImputationFilteringSettings();
                    double [][] dataFillInMissingValue=fillInMissingValues(measurements,Configuration.interval,imputationFilteringSettings);
                    double [][] dataSmooth=smoothingData(dataFillInMissingValue,imputationFilteringSettings);
                    List<DetectorDataProcessed> tmpDetectorDataProcessedList= createListOfDetectorDataProcessedDocuments(organizationId
                            , Integer.parseInt(stationId),Integer.parseInt(detectorId), startDate, Configuration.interval
                            ,imputationFilteringSettings,dataSmooth);
                    detectorDataProcessedList.addAll(tmpDetectorDataProcessedList);
                    // Update the start date
                    startDate=addDays(startDate, 1);
                }
            }else{
                System.out.println("Skip: Org" + key.get("organizationId") + "&Int" + key.get("stationId") + "&Det" + key.get("detectorId"));
            }
        });

        // Create a list of documents to insert into MongoDB
        List<Document> detectorHealthMetricsDocument=new ArrayList<>();
        if(detectorHealthMetricsList.size()>0){
            ObjectMapper mapper = new ObjectMapper(); // Write to string
            for(int i=0;i<detectorHealthMetricsList.size();i++) {
                String detectorHealthMetricsInStr = mapper.writeValueAsString(detectorHealthMetricsList.get(i));
                detectorHealthMetricsDocument.add(Document.parse(detectorHealthMetricsInStr));
            }
            // Save the documents into MongoDB
            save.insertMultipleToMongodbCollection(Configuration.database, Configuration.collectionDetectorHealth, detectorHealthMetricsDocument);
        }

        List<Document> detectorDataProcessedDocument=new ArrayList<>();
        if(detectorDataProcessedList.size()>0){
            ObjectMapper mapper = new ObjectMapper(); // Write to string
            for(int i=0;i<detectorDataProcessedList.size();i++) {
                String detectorDataProcessedInStr = mapper.writeValueAsString(detectorDataProcessedList.get(i));
                detectorDataProcessedDocument.add(Document.parse(detectorDataProcessedInStr));
            }
            // Save the documents into MongoDB
            save.insertMultipleToMongodbCollection(Configuration.database, Configuration.collectionDetectorDataPreprocess
                    , detectorDataProcessedDocument);
        }
    }

    public static List<DetectorDataProcessed> createListOfDetectorDataProcessedDocuments(String organizationId, int stationId
            ,int detectorId, Date startDate,int interval,ImputationFilteringSettings imputationFilteringSettings,double [][] dataInput){
        // This function is used to create list of Detector Data Processed Documents

        List<DetectorDataProcessed> detectorDataProcessedList=new ArrayList<>();

        for(int i=0;i<dataInput.length;i++){
            int timeInSeconds=(int) dataInput[i][0];
            double flow=dataInput[i][1];
            double occupancy=dataInput[i][2];
            double speed=dataInput[i][3];

            Calendar calendar=Calendar.getInstance();
            calendar.setTime(startDate);
            int year=calendar.get(Calendar.YEAR);
            int month=calendar.get(Calendar.MONTH)+1; // Start from zero
            int day=calendar.get(Calendar.DAY_OF_MONTH);
            int hour=timeInSeconds/3600;
            int minute= (timeInSeconds-hour*3600)/60;
            int second= timeInSeconds-hour*3600-minute*60;
            calendar.set(Calendar.HOUR_OF_DAY,hour);
            calendar.set(Calendar.MINUTE,minute);
            calendar.set(Calendar.SECOND,second);
            Date date=calendar.getTime();

            DetectorDataProcessed detectorDataProcessed=new DetectorDataProcessed(organizationId, stationId, detectorId, date
                    ,year,month,day,timeInSeconds, imputationFilteringSettings, interval, flow,occupancy,speed);
            detectorDataProcessedList.add(detectorDataProcessed);
        }

        return detectorDataProcessedList;
    }

    public static double [][] getDetectorMeasurementsFromAggregatedDataForGivenKey(MongoCollection<Document> collDataAggregated,
                                                                                   Document key,long startTime,long endTime){
        // This function is used to get detector measurements from aggregated data for a given detector

        // Get the key information
        String organizationId=key.get("organizationId").toString();
        String stationId=key.get("stationId").toString();
        String detectorId=key.get("detectorId").toString();

        // Search the data
        FindIterable<Document> iterable=collDataAggregated.find(and(eq("organizationId",organizationId),
                eq("stationId",stationId),eq("detectorId",detectorId),
                gte("startTimeStamp",startTime),
                lt("startTimeStamp",endTime))).
                sort(new BasicDBObject("startTimeStamp",1));

        List<double[]> measurementList=new ArrayList<>();
        Iterator iterator=iterable.iterator();
        while(iterator.hasNext()){
            Document document=(Document) iterator.next();
            Date startTimeStamp=new Date(Long.parseLong(document.get("startTimeStamp").toString()));
            double time=getTimeInSeconds(startTimeStamp);
            double flow=Double.parseDouble(document.get("vehicleCount").toString());
            double occupancy=Double.parseDouble(document.get("vehicleOccupancy").toString());
            double speed=Double.parseDouble(document.get("vehicleSpeed").toString());
            measurementList.add(new double[]{time,flow,occupancy,speed});
        }

        // Convert the list into matrix
        if(measurementList.size()>0) {
            double[][] measurements = new double[measurementList.size()][4];
            for(int i=0;i<measurementList.size();i++){
                measurements[i]=measurementList.get(i);
            }
            return measurements;
        }else{
            return null;
        }
    }

    public static double getTimeInSeconds(Date date){
        // Get the HH:MM:SS from the given date into seconds

        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE);
        int second=calendar.get(Calendar.SECOND);

        return hour*3600.0+minute*60.0+second;
    }

    public static Date addDays(Date date, int days){
        // Add days to the given date

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    public static Date getStartDate(Document key, MongoCollection<Document> collDataAggregated, MongoCollection<Document> collDetectorHealth){
        // Get the start date for the given detector

        Date startDate=null;
        // Get the key information
        String organizationId=key.get("organizationId").toString();
        String stationId=key.get("stationId").toString();
        String detectorId=key.get("detectorId").toString();

        // Find the documents that belong to the Key in the "Data Aggregated" collection
        // Sort them according to the "startTimeStamp"
        FindIterable<Document> iterable=collDataAggregated.find(and(eq("organizationId",organizationId),
                eq("stationId",stationId),eq("detectorId",detectorId))).sort(new BasicDBObject("startTimeStamp",1)).limit(1);
        if(iterable.iterator().hasNext()) {// If not empty
            Date earliestDateInDataAggregated = new Date(Long.parseLong(iterable.iterator().next().get("startTimeStamp").toString()));
            // Set time to be zeros
            Calendar calendar=Calendar.getInstance();
            calendar.setTime(earliestDateInDataAggregated);
            calendar.set(Calendar.HOUR_OF_DAY,0);
            calendar.set(Calendar.MINUTE,0);
            calendar.set(Calendar.SECOND,0);
            calendar.set(Calendar.MILLISECOND,0);
            startDate=calendar.getTime();
        }

        // Find the documents that belong to the Key in the "Detector Health" collection
        // Sort them according to the "date"
        // "stationId" and "detectorId" are integers in the "Detector Health" collection
        iterable=collDetectorHealth.find(and(eq("organizationId",organizationId),eq("stationId",Integer.parseInt(stationId)),
                eq("detectorId",Integer.parseInt(detectorId)))).sort(new BasicDBObject("date",-1)).limit(1);
        if(iterable.iterator().hasNext()) { // If not empty
            Date latestDateInDetectorHealth = new Date(Long.parseLong(iterable.iterator().next().get("date").toString()));
            // Set time to be zeros
            Calendar calendar=Calendar.getInstance();
            calendar.setTime(latestDateInDetectorHealth);
            calendar.add(Calendar.DATE,1); // Add one more day
            // Get the maximum value
            if(startDate.getTime()<calendar.getTime().getTime()){
                startDate=calendar.getTime();
            }
        }

        return startDate;
    }

    public static Date getEndDate(Document key, MongoCollection<Document> collDataAggregated){
        // Get the end date for the given detector

        Date endDate=null;
        // Get the key information
        String organizationId=key.get("organizationId").toString();
        String stationId=key.get("stationId").toString();
        String detectorId=key.get("detectorId").toString();

        // First, get the date for yesterday
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);// Yesterday, subtract one day
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        endDate=calendar.getTime();

        // Second, check the most recent date in the DateAggregated collection
        FindIterable<Document> iterable=collDataAggregated.find(and(eq("organizationId",organizationId),
                eq("stationId",stationId),eq("detectorId",detectorId))).sort(new BasicDBObject("startTimeStamp",-1)).limit(1);
        if(iterable.iterator().hasNext()) {// If not empty
            Date latestDateInDataAggregated = new Date(Long.parseLong(iterable.iterator().next().get("startTimeStamp").toString()));
            // Set time to be zeros
            calendar=Calendar.getInstance();
            calendar.setTime(latestDateInDataAggregated);
            calendar.add(Calendar.DATE,-1); // Get the date before, thus subtract one day
            calendar.set(Calendar.HOUR_OF_DAY,0);
            calendar.set(Calendar.MINUTE,0);
            calendar.set(Calendar.SECOND,0);
            calendar.set(Calendar.MILLISECOND,0);

            // Get the minimum value
            if(calendar.getTime().getTime()<endDate.getTime()){
                endDate=calendar.getTime();
            }
        }

        return endDate;
    }

    public static int getNumberOfLanesForGivenDetectorFromInventory(Document key){
        // Get number of lanes for a given detector from the inventory information

        int numOfLanes=1;// Default value



        return numOfLanes;
    }

    public static AggregateIterable<Document> getDetectorDataIndexFromGivenCollection(MongoCollection<Document> coll){
        // This function is used to get the list of detectors from given collection

        AggregateIterable<Document> iterable=coll.aggregate(
                Arrays.asList(new Document("$group",new Document("_id",new Document("organizationId","$organizationId").
                        append("stationId","$stationId").append("detectorId","$detectorId")))));
        return iterable;
    }

}
