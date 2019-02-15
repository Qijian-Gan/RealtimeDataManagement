package edu.berkeley.path.aggregation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import edu.berkeley.path.objects.DetectorDataAggregated;
import edu.berkeley.path.Configuration;
import edu.berkeley.path.database.connect;
import org.bson.Document;
import java.util.*;
import static com.mongodb.client.model.Filters.*;

public class detectorDataAggregation {

    // Raw data structure
    public static class DetectorDataStructure{
        protected Date startTime;
        protected Date endTime;
        protected double duration; // In seconds
        protected double vehicleCount; // Hourly flow
        protected double vehicleOccupancy; // Percentage
        protected double vehicleSpeed; // mph ??

        public DetectorDataStructure(Date _startTime, Date _endTime, double _duration, double _vehicleCount,double _vehicleOccupancy,
                                    double _vehicleSpeed){
            this.startTime=_startTime;
            this.endTime=_endTime;
            this.duration=_duration;
            this.vehicleCount=_vehicleCount;
            this.vehicleOccupancy=_vehicleOccupancy;
            this.vehicleSpeed=_vehicleSpeed;
        }
    }

    // Print Block
    private static Block<Document> printBlock = new Block<Document>() {
        public void apply(final Document document) {
            System.out.println(document.toJson());
        }
    };

    public static List<Document> atGivenInterval(String collectionFrom,String collectionTo,final int interval) throws JsonProcessingException {
        // This function is used to aggregate raw traffic data in "collectionFrom" at the "interval" level

        List<DetectorDataAggregated> detectorDataAggregatedList=new ArrayList<>();

        // Connect to the two collections
        final MongoCollection<Document> collFrom=connect.getCollectionMongoDBStandalone(Configuration.mongodbName,collectionFrom);
        final MongoCollection<Document> collTo=connect.getCollectionMongoDBStandalone(Configuration.mongodbName,collectionTo);

        // Get a list of detector id in the raw data
        AggregateIterable<Document> documentAggregateIterable=getDetectorDataIndexFromGivenCollection(collFrom);

        // For each unique id of organization-station-detector
        documentAggregateIterable.forEach((Block<Document>) document -> {
            // Get the key
            Document key=(Document) document.get("_id");
            // Get the start time: depends on "collFrom" and "collTo"
            Date startTime=getStartTimeForEachKeyForAggregation(key,collFrom,collTo,interval);
            // Get the end time: depends on "collFrom" and the current time
            Date endTime=getEndTimeForEachKeyForAggregation(key,collFrom,interval);
            // Select the raw data for each key in the given time period
            List<DetectorDataStructure> detectorDataStructureList=selectDataForGivenTimePeriodForEachKey(key, collFrom,startTime, endTime);
            // Aggregation
            List<DetectorDataAggregated> detectorDataAggregatedListByBlock=aggregateDataToDefinedInterval(key,detectorDataStructureList,startTime,endTime,interval);
            // Add the aggregates
            detectorDataAggregatedList.addAll(detectorDataAggregatedListByBlock);
            // Printing summary
            System.out.println("Org"+key.get("organizationId")+"&Int"+key.get("stationId")+"&Det"+key.get("detectorId")+
                    ": Start Time="+startTime.toString()+" & End Time="+endTime.toString()+" & Rows to insert="+detectorDataAggregatedListByBlock.size());
        });

        // Create a list of documents to insert into MongoDB
        List<Document> detectorDataAggregatedDocument=new ArrayList<>();
        if(detectorDataAggregatedList.size()>0){
            ObjectMapper mapper = new ObjectMapper(); // Write to string
            for(int i=0;i<detectorDataAggregatedList.size();i++) {
                String detectorDataAggregatedInStr = mapper.writeValueAsString(detectorDataAggregatedList.get(i));
                detectorDataAggregatedDocument.add(Document.parse(detectorDataAggregatedInStr));
            }
        }

        return detectorDataAggregatedDocument;
    }

    public static AggregateIterable<Document> getDetectorDataIndexFromGivenCollection(MongoCollection<Document> coll){

        AggregateIterable<Document> iterable=coll.aggregate(
                Arrays.asList(new Document("$group",new Document("_id",new Document("organizationId","$organizationId").
                        append("stationId","$stationId").append("detectorId","$detectorId")))));
        return iterable;
    }

    public static Date getStartTimeForEachKeyForAggregation(Document key,MongoCollection<Document> collFrom
            ,MongoCollection<Document> collTo, int interval){
        // Get the start time for each key for aggregation

        Date startTime=null;
        Date dateCollFrom=getEarliestTimeStampForEachKeyFromACollection(collFrom,key);
        Date dateCollTo=getLatestTimeStampForEachKeyFromACollection(collTo,key); // Need to add the interval
        if(dateCollFrom!=null){
            startTime=getTruncatedTimeByDefaultInterval(dateCollFrom,interval);
            if(dateCollTo!=null){
                Date tmpTime=getTruncatedTimeByDefaultInterval(dateCollTo,interval);
                if(tmpTime.getTime()+interval*1000.0>startTime.getTime()){
                    startTime=new Date((long)(tmpTime.getTime()+interval*1000.0));
                }
            }
        }
        return startTime;
    }

    public static Date getEarliestTimeStampForEachKeyFromACollection(MongoCollection<Document> coll, Document key){
        // Get the earliest time in the collection

        String organizationId=key.get("organizationId").toString();
        String stationId=key.get("stationId").toString();
        String detectorId=key.get("detectorId").toString();

        Date date=null;
        FindIterable<Document> iterable=coll.find(and(eq("organizationId",organizationId),
                eq("stationId",stationId),eq("detectorId",detectorId)))
                .sort(new BasicDBObject("startTimeStamp",1)).limit(1);
        for(Document doc:iterable){
            date=new Date(Long.parseLong(doc.get("startTimeStamp").toString()));
            //System.out.println(date);
        }
        return date;
    }

    public static Date getLatestTimeStampForEachKeyFromACollection(MongoCollection<Document> coll,Document key){
        // Get the latest time in the collection

        String organizationId=key.get("organizationId").toString();
        String stationId=key.get("stationId").toString();
        String detectorId=key.get("detectorId").toString();

        Date date=null;
        FindIterable<Document> iterable=coll.find(and(eq("organizationId",organizationId),
                eq("stationId",stationId),eq("detectorId",detectorId)))
                .sort(new BasicDBObject("startTimeStamp",-1)).limit(1);

        for(Document doc:iterable){
            date = new Date(Long.parseLong(doc.get("startTimeStamp").toString()));
            //System.out.println(date);
        }
        return date;
    }

    public static Date getTruncatedTimeByDefaultInterval(Date inputDate,int interval){
        // Truncate the time according to the default interval

        Calendar calendar=Calendar.getInstance();
        calendar.setTime(inputDate); // Set the date
        // Round the minutes to integer number of "interval"
        int minute=calendar.get(Calendar.MINUTE);
        int intervalInMinute=interval/60;
        minute=(minute/intervalInMinute)*intervalInMinute;
        // Update the date
        calendar.set(Calendar.MINUTE,minute);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        // Print and return
        //System.out.println(calendar.getTime());
        return calendar.getTime();
    }

    public static Date getEndTimeForEachKeyForAggregation(Document key,MongoCollection<Document> collFrom,int interval){
        // Get the end time for each key for aggregation

        Date endTime=null;
        Date dateCollFrom=getLatestTimeStampForEachKeyFromACollection(collFrom,key); // Latest update in the raw collection
        Date dateCollCurrent=Calendar.getInstance().getTime(); // Current time
        if(dateCollFrom!=null){
            endTime=getTruncatedTimeByDefaultInterval(dateCollFrom,interval);
            if(dateCollCurrent!=null){
                Date tmpTime=getTruncatedTimeByDefaultInterval(dateCollCurrent,interval);
                if(tmpTime.getTime()<endTime.getTime()){
                    endTime=tmpTime;
                }
            }
        }
        return endTime;
    }

    public static List<DetectorDataStructure> selectDataForGivenTimePeriodForEachKey(Document key, MongoCollection<Document> coll
            ,Date startTime, Date endTime){
        // Select data for given time period for each key

        List<DetectorDataStructure> detectorDataStructureList=new ArrayList<DetectorDataStructure>();

        String organizationId=key.get("organizationId").toString();
        String stationId=key.get("stationId").toString();
        String detectorId=key.get("detectorId").toString();

        // Find the documents that belong to the Key and within the defined time periods
        // Sort them according to the "startTimeStamp"
        FindIterable<Document> iterable=coll.find(and(eq("organizationId",organizationId),
                eq("stationId",stationId),eq("detectorId",detectorId),
                gt("startTimeStamp",startTime.getTime()),
                lt("endTimeStamp",endTime.getTime())))
                .sort(new BasicDBObject("startTimeStamp",1));

        // Iterate for each block of document
        iterable.forEach((Block<Document>) document -> {
            Date startTime1 = new Date(document.getLong("startTimeStamp"));
            Date endTime1 = new Date(document.getLong("endTimeStamp"));
            double duration=(endTime1.getTime()- startTime1.getTime())/1000.0; // In seconds
            double vehicleCount=document.getDouble("vehicleCount");
            double vehicleOccupancy=document.getDouble("vehicleOccupancy");
            double vehicleSpeed=document.getDouble("vehicleSpeed");
            DetectorDataStructure detectorDataStructure=new DetectorDataStructure(startTime1, endTime1,duration,vehicleCount,vehicleOccupancy,vehicleSpeed);
            detectorDataStructureList.add(detectorDataStructure);
        });
        return detectorDataStructureList;
    }

    public static List<DetectorDataAggregated> aggregateDataToDefinedInterval(Document key,List<DetectorDataStructure> detectorDataStructureList,
                                                                              Date startTime,Date endTime, double interval){
        // Aggregate data to defined intervals

        List<DetectorDataAggregated> detectorDataAggregatedList=new ArrayList<>();

        String organizationId=key.get("organizationId").toString();
        String stationId=key.get("stationId").toString();
        String detectorId=key.get("detectorId").toString();

        int NumInterval=(int) Math.floor((endTime.getTime()-startTime.getTime())/1000.0/interval);

        if(detectorDataStructureList.size()!=0){
            for(int i=0;i<NumInterval;i++){
                long timeFrom=(long)(startTime.getTime()+i*interval*1000.0);
                long timeTo=(long) (startTime.getTime()+(i+1)*interval*1000.0);
                double avgFlow=0;
                double avgOccupancy=0;
                double avgSpeed=0;
                List<DetectorDataStructure> deleteData=new ArrayList<>();
                for(int j=0;j<detectorDataStructureList.size();j++){
                    long tmpTimeFrom=Math.max(detectorDataStructureList.get(j).startTime.getTime(),timeFrom);
                    long tmpTimeTo=Math.min(detectorDataStructureList.get(j).endTime.getTime(),timeTo);
                    if(tmpTimeTo>tmpTimeFrom){ // Within [timeFrom, timeTo]
                        deleteData.add(detectorDataStructureList.get(j));
                        // Weighted Hourly flow
                        avgFlow=avgFlow+detectorDataStructureList.get(j).vehicleCount*detectorDataStructureList.get(j).duration/interval;
                        // Weighted Occupancy
                        avgOccupancy=avgOccupancy+detectorDataStructureList.get(j).vehicleOccupancy*detectorDataStructureList.get(j).duration/interval;
                        // Weighted Speed
                        avgSpeed=avgSpeed+detectorDataStructureList.get(j).vehicleSpeed*detectorDataStructureList.get(j).duration/interval;
                    }
                }
                if(deleteData.size()>0){
                    DetectorDataAggregated detectorDataAggregated=new DetectorDataAggregated(organizationId, stationId, detectorId,
                            new Date(timeFrom).toString(), new Date(timeFrom), interval, avgFlow,avgOccupancy,avgSpeed);
                    detectorDataAggregatedList.add(detectorDataAggregated);
                    detectorDataStructureList.removeAll(deleteData);
                }
            }
        }
        return detectorDataAggregatedList;
    }



}
