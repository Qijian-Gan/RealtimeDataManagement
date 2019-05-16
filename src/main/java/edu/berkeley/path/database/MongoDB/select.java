package edu.berkeley.path.database.MongoDB;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Sorts;
import edu.berkeley.path.util.DateTimeConversion;
import org.bson.Document;
import org.tmdd._303.messages.IntersectionSignalSequenceData;
import org.tmdd._303.messages.IntersectionSignalTimingPatternInventory;
import org.tmdd._303.messages.SectionSignalTimingPatternInventory;
import org.tmdd._303.messages.IntersectionSignalTimingPatternInventory.SequenceInformation;

import javax.print.Doc;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;

public class select {

    // ***************************************************************
    // Detector Data
    // ***************************************************************
    public static FindIterable aggregatedDetectorDataForGivenDetectorIdAndDateAndTimePeriod(MongoCollection<Document> collection
            ,String detectorId, String fromDateTimeStr, String toDateTimeStr) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat( "MM-dd-yyyy HH:mm:ss");

        Date fromDateTime=formatter.parse(fromDateTimeStr);
        Date toDateTime=formatter.parse(toDateTimeStr);

        FindIterable iterable=collection.find(and(eq("detectorId", detectorId),
                gte("startTimeStamp",fromDateTime.getTime()),
                lt("startTimeStamp",toDateTime.getTime())));

        /*
        Block<Document> printBlock = new Block<Document>() {
            public void apply(final Document document) {
                System.out.println(document.toJson());
            }
        };
        iterable.forEach(printBlock);
        */
        return iterable;
    }

    public static List<String> getUniqueListOfDeviceIdsForGivenOrgFromDetectorInventory(MongoCollection<Document> collection,String orgId){
        // This function is used to get a unique list of device Ids for a given organization from Detector Inventory

        // Get all available Device Ids in the collection
        FindIterable iterable=collection.find(eq("organizationId",orgId)).projection(fields(include("deviceId")));

        Iterator iterator=iterable.iterator();
        List<String> uniqueDeviceIds=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        while(iterator.hasNext()){
            Document document=(Document) iterator.next();
            if(set.add(document.get("deviceId").toString())){
                uniqueDeviceIds.add(document.get("deviceId").toString());
            }
        }
        Collections.sort(uniqueDeviceIds);// Sort the device Ids
        return uniqueDeviceIds;
    }

    public static List<String> getUniqueListOfDeviceIdsForGivenOrgFromDetectorData(MongoCollection<Document> collection,String orgId,String orgName){
        // This function is used to get a unique list of device Ids for a given organization from Detector Data

        // Get all available Device Ids in the collection
        int filterThreshold;
        if(orgName.equals("Arcadia")){
            orgId="1";
            filterThreshold=99999;
        }else{
            filterThreshold=0;
        }
        FindIterable iterable=collection.find(eq("organizationId",orgId)).projection(fields(include("detectorId")));

        Iterator iterator=iterable.iterator();
        List<String> uniqueDeviceIds=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        while(iterator.hasNext()){
            Document document=(Document) iterator.next();
            if(Integer.parseInt(document.get("detectorId").toString())>filterThreshold && set.add(document.get("detectorId").toString())){
                uniqueDeviceIds.add(document.get("detectorId").toString());
            }
        }
        Collections.sort(uniqueDeviceIds);// Sort the device Ids
        return uniqueDeviceIds;
    }


    // ***************************************************************
    // ***************************************************************
    // Signal Inventory
    // ***************************************************************
    // ***************************************************************
    public static Map<List<String>,List<String>> upToDateDeviceIdAndTPIdAndTimeFromIntSigTP(MongoCollection<Document> collection){
        // This function returns the most up-to-date Device Id--Timing Plan--DateTime from the Intersection Signal Timing Plan Inventory

        // Get all available Device Id--Timing Plan--DateTime in the collection
        FindIterable iterable=collection.find().projection(
                fields(include("organizationInformation.organizationId","deviceId","timingPatternId",
                        "lastUpdateTime.date","lastUpdateTime.time")));

        // Get the (unique) most up-to-date set of Device Id--Timing Plan--DateTime
        Map<List<String>,List<String>> uniqueDevIdTPAndTime=new HashMap<>();
        Block<Document> hashBlock = new Block<Document>() {
            public void apply(final Document document) {
                String organizationId=((Document)document.get("organizationInformation")).get("organizationId").toString();
                String deviceId=document.getString("deviceId");
                String timingPatternId=document.getString("timingPatternId");
                String date=((Document)document.get("lastUpdateTime")).get("date").toString();
                String time=((Document)document.get("lastUpdateTime")).get("time").toString();
                try {
                    Date lastUpdateTime= DateTimeConversion.TMDDDateTimeToRegularDateTime(date,time);

                    List<String> key=Arrays.asList(organizationId,deviceId,timingPatternId);
                    if(uniqueDevIdTPAndTime.containsKey(key)){
                        List<String> tmpDateTimeStr=uniqueDevIdTPAndTime.get(key);
                        Date tmpDateTime=DateTimeConversion.TMDDDateTimeToRegularDateTime(tmpDateTimeStr.get(0),tmpDateTimeStr.get(1));
                        if(lastUpdateTime.getTime()>tmpDateTime.getTime()){// Find a latest one
                            uniqueDevIdTPAndTime.replace(key,tmpDateTimeStr,Arrays.asList(date,time));
                        }
                    }else{
                        uniqueDevIdTPAndTime.put(key,Arrays.asList(date,time));
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
        };
        iterable.forEach(hashBlock);
        return uniqueDevIdTPAndTime;
    }

    public static Map<Integer,Document> upToDateTPInventoryForGivenDeviceIdFromIntSigTP(MongoCollection<Document> collection
            , String organizationId, String deviceId){
        // This function returns the most up-to-date Timing Plans for a given device Id from the Intersection Signal Timing Plan Inventory

        // Get all available Device Id--Timing Plan--DateTime in the collection
        FindIterable iterable=collection.find(and(eq("organizationInformation.organizationId",organizationId),
                eq("deviceId",deviceId))).projection(exclude("_id"));

        // Get the (unique) most up-to-date Timing Plans
        Map<Integer,Document> uniqueTPInventory=new HashMap<>();
        Map<Integer,Long> mostUpToDateTP=new HashMap<>();
        Block<Document> hashBlock = new Block<Document>() {
            public void apply(final Document document) {
                int timingPatternId=Integer.parseInt(document.getString("timingPatternId"));
                String date=((Document)document.get("lastUpdateTime")).get("date").toString();
                String time=((Document)document.get("lastUpdateTime")).get("time").toString();
                try {
                    long lastUpdateTime= DateTimeConversion.TMDDDateTimeToRegularDateTime(date,time).getTime();

                    if(mostUpToDateTP.containsKey(timingPatternId)){
                        long tmpDateTime=mostUpToDateTP.get(timingPatternId);
                        Document tmpDocument=uniqueTPInventory.get(timingPatternId);
                        if(lastUpdateTime>tmpDateTime){// Find a latest one
                            mostUpToDateTP.replace(timingPatternId,tmpDateTime,lastUpdateTime);
                            uniqueTPInventory.replace(timingPatternId,tmpDocument,document);
                        }
                    }else{
                        mostUpToDateTP.put(timingPatternId,lastUpdateTime);
                        uniqueTPInventory.put(timingPatternId,document);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
        };
        iterable.forEach(hashBlock);
        return uniqueTPInventory;
    }

    public static List<String> getUniqueListOfDeviceIdsFromIntSigTP(MongoCollection<Document> collection){
        // This function is used to get a unique list of device Ids from Intersection Signal Timing Pattern Inventory

        // Get all available Device Ids in the collection
        FindIterable iterable=collection.find().projection(
                fields(include("deviceId")));

        Iterator iterator=iterable.iterator();
        List<String> uniqueDeviceIds=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        while(iterator.hasNext()){
            Document document=(Document) iterator.next();
            if(set.add(document.get("deviceId").toString())){
                uniqueDeviceIds.add(document.get("deviceId").toString());
            }
        }
        Collections.sort(uniqueDeviceIds);// Sort the device Ids
        return uniqueDeviceIds;
    }

    public static List<String> getUniqueListOfDeviceIdsForGivenOrgFromIntSigTP(MongoCollection<Document> collection, String orgId){
        // This function is used to get a unique list of device Ids for a given organization from Intersection Signal Timing Pattern Inventory

        // Get all available Device Ids in the collection
        FindIterable iterable=collection.find(eq("organizationInformation.organizationId",orgId)).projection(
                fields(include("deviceId")));

        Iterator iterator=iterable.iterator();
        List<String> uniqueDeviceIds=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        while(iterator.hasNext()){
            Document document=(Document) iterator.next();
            if(set.add(document.get("deviceId").toString())){
                uniqueDeviceIds.add(document.get("deviceId").toString());
            }
        }
        Collections.sort(uniqueDeviceIds);// Sort the device Ids
        return uniqueDeviceIds;
    }

    public static Document documentForGivenDeviceIdAndTimingPlanAndTimeFromIntSigTP(MongoCollection<Document> collection
            ,String organizationId, String deviceId, String timingPlanId,String date, String time){
        // This function is used to get the Json document for a given device id, timing plan, date and time.

        FindIterable iterable=collection.find(and(eq("organizationInformation.organizationId",organizationId),
                eq("deviceId",deviceId),eq("timingPatternId",timingPlanId),
                eq("lastUpdateTime.date",date),eq("lastUpdateTime.time",time)));

        Iterator iterator=iterable.iterator();
        if(iterator.hasNext()){
            Document document=(Document) iterator.next();
            return document;
        }else{
            System.out.println("Document is not found for the given inputs!");
            return null;
        }
    }

    // ***************************************************************
    // ***************************************************************
    // Signal Status
    // ***************************************************************
    // ***************************************************************
    public static Map<List<String>,Long> upToDateDeviceIdAndTPIdAndTimeFromIntSigStatus(MongoCollection<Document> collection){
        // This function returns the most up-to-date Device Id--Timing Plan--DateTime from the Intersection Signal Status

        // Get all available Device Id--Timing Plan--DateTime in the collection
        FindIterable iterable=collection.find().projection(
                fields(include("organizationId","deviceId","timingPatternIdCurrent",
                        "lastUpdateTime")));

        // Get the (unique) most up-to-date set of Device Id--Timing Plan--DateTime
        Map<List<String>,Long> uniqueDevIdTPAndTime=new HashMap<>();
        Block<Document> hashBlock = new Block<Document>() {
            public void apply(final Document document) {
                String organizationId=document.get("organizationId").toString();
                String deviceId=document.getString("deviceId");
                String timingPatternId=document.getString("timingPatternIdCurrent");
                long lastUpdateTime=(long)document.get("lastUpdateTime");
                List<String> key=Arrays.asList(organizationId,deviceId,timingPatternId);
                if(uniqueDevIdTPAndTime.containsKey(key)){
                    long tmpDateTime=uniqueDevIdTPAndTime.get(key);
                    if(lastUpdateTime>tmpDateTime){// Find a latest one
                        uniqueDevIdTPAndTime.replace(key,tmpDateTime,lastUpdateTime);
                    }
                }else{
                    uniqueDevIdTPAndTime.put(key,lastUpdateTime);
                }
            }
        };
        iterable.forEach(hashBlock);
        return uniqueDevIdTPAndTime;
    }

    public static List<String> getUniqueListOfDeviceIdsFromIntSigStatus(MongoCollection<Document> collection){
        // This function is used to get a unique list of device Ids from Intersection Signal Status

        // Get all available Device Ids in the collection
        FindIterable iterable=collection.find().projection(
                fields(include("deviceId")));

        Iterator iterator=iterable.iterator();
        List<String> uniqueDeviceIds=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        while(iterator.hasNext()){
            Document document=(Document) iterator.next();
            if(set.add(document.get("deviceId").toString())){
                uniqueDeviceIds.add(document.get("deviceId").toString());
            }
        }
        Collections.sort(uniqueDeviceIds);// Sort the device Ids
        return uniqueDeviceIds;
    }

    public static List<String> getUniqueListOfDeviceIdsForGivenOrgFromIntSigStatus(MongoCollection<Document> collection,String orgId){
        // This function is used to get a unique list of device Ids for a given organization from Intersection Signal Status

        // Get all available Device Ids in the collection
        FindIterable iterable=collection.find(eq("organizationId",orgId)).projection(fields(include("deviceId")));

        Iterator iterator=iterable.iterator();
        List<String> uniqueDeviceIds=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        while(iterator.hasNext()){
            Document document=(Document) iterator.next();
            if(set.add(document.get("deviceId").toString())){
                uniqueDeviceIds.add(document.get("deviceId").toString());
            }
        }
        Collections.sort(uniqueDeviceIds);// Sort the device Ids
        return uniqueDeviceIds;
    }

    public static List<Document> documentsForGivenDeviceIdAndTimingPlanAndTimePeriodsFromSigStatus(MongoCollection<Document> collection
            ,String organizationId, String deviceId, String timingPlanId,long startTime, long endTime){
        // This function is used to get the Json documents for a given device id, timing plan, and time periods.

        FindIterable iterable=collection.find(and(eq("organizationId",organizationId),
                eq("deviceId",deviceId),eq("timingPatternIdCurrent",timingPlanId),
                gte("lastUpdateTime",startTime),lt("lastUpdateTime",endTime))).sort(Sorts.ascending("lastUpdateTime"));

        // Get the list of documents
        List<Document> documentList=new ArrayList<>();
        Iterator iterator=iterable.iterator();
        while(iterator.hasNext()){
            Document document=(Document) iterator.next();
            documentList.add(document);
        }
        return documentList;
    }

    public static List<Document> documentsForGivenDeviceIdAndTimePeriodsFromSigStatus(MongoCollection<Document> collection
            ,String organizationId, String deviceId, long startTime, long endTime){
        // This function is used to get the Json documents for a given device id, timing plan, and time periods.

        // Should be sorted by time!
        FindIterable iterable=collection.find(and(eq("organizationId",organizationId),
                eq("deviceId",deviceId), gte("lastUpdateTime",startTime),
                lt("lastUpdateTime",endTime))).sort(Sorts.ascending("lastUpdateTime"));

        // Get the list of documents
        List<Document> documentList=new ArrayList<>();
        Iterator iterator=iterable.iterator();
        while(iterator.hasNext()){
            Document document=(Document) iterator.next();
            documentList.add(document);
        }
        return documentList;
    }

   }
