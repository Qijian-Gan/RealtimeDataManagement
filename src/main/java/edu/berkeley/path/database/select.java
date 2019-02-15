package edu.berkeley.path.database;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;

import static com.mongodb.client.model.Filters.*;

public class select {

    public static void detectorDataForGivenDetectorIdAndDateAndTimePeriod(MongoCollection<Document> collection
            ,String detectorId, String date, String fromTime, String toTime){


        long tic = System.currentTimeMillis();
        FindIterable iterable=collection.find(and(eq("detectorDataList.detectorDataDetail.detectorId", detectorId),
                eq("detectorDataList.detectorDataDetail.startTime.date",date),
                gt("detectorDataList.detectorDataDetail.startTime.time",fromTime)));
        long toc = System.currentTimeMillis();
        System.out.println(toc-tic);

        /*
        Block<Document> printBlock = new Block<Document>() {
            public void apply(final Document document) {
                System.out.println(document.toJson());
            }
        };

        iterable.forEach(printBlock);
        */

    }


}
