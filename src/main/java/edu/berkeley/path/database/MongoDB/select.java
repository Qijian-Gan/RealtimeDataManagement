package edu.berkeley.path.database.MongoDB;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.mongodb.client.model.Filters.*;

public class select {

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


}
