package edu.berkeley.path;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import edu.berkeley.path.database.connect;
import edu.berkeley.path.database.create;
import edu.berkeley.path.database.save;
import edu.berkeley.path.database.select;
import edu.berkeley.path.objects.DetectorDataAggregated;
import org.bson.Document;
import edu.berkeley.path.aggregation.detectorDataAggregation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.mongodb.client.model.Filters.*;

public class databaseOperations {

    public static void main(String[] args) throws ParseException, JsonProcessingException {

        /*
        MongoCollection<Document> collection= connect.getCollectionMongoDBStandalone("i210Datahub","detectorDataIndividual");
        SimpleDateFormat formatter = new SimpleDateFormat( "MM-dd-yyyy HH:mm:ss.SSSS");
        Date date1=formatter.parse("02-01-2019 16:27:00.0000");
        long tic = System.currentTimeMillis();
        FindIterable iterable=collection.find(and(eq("detectorId", "514107"),
                lt("startTimeStamp",date1.getTime())));
        long toc = System.currentTimeMillis();
        System.out.println(toc-tic);

        Block<Document> printBlock = new Block<Document>() {
            public void apply(final Document document) {
                System.out.println(document.toJson());
            }
        };

        iterable.forEach(printBlock);

        String databaseName="i210Datahub";
        String collectionName="detectorData";

        String date="20190201";
        String fromTime="2130000000";
        String toTime="2135000000";
        String detectorId="514107";
        */

        // Create indexes
        //create.indexForDetectorData(databaseName,collectionName);

        // Select detector data
        //MongoCollection<Document> collection= connect.getCollectionMongoDBStandalone(databaseName,collectionName);
        //select.detectorDataForGivenDetectorIdAndDateAndTimePeriod(collection,detectorId,date,fromTime,toTime);

        List<Document> detectorDataAggregatedList=detectorDataAggregation.atGivenInterval(Configuration.collectionAggregatedFrom,Configuration.collectionAggregatedTo,Configuration.interval);
        save.insertMultipleToMongodbCollection(Configuration.database,Configuration.collectionAggregatedTo,detectorDataAggregatedList);
    }

}
