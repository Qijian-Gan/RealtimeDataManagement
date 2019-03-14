package edu.berkeley.path.mainFunctions;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import edu.berkeley.path.database.MongoDB.extract;
import edu.berkeley.path.settings.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.Document;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static edu.berkeley.path.database.MongoDB.connect.getCollectionMongoDBStandalone;
import static edu.berkeley.path.database.MongoDB.select.aggregatedDetectorDataForGivenDetectorIdAndDateAndTimePeriod;


public class selectAggregatedData {

    private static final Logger LOG = LogManager.getLogger(Application.class);

    public static void main(String[] args) throws ParseException, IOException {


        SimpleDateFormat formatter = new SimpleDateFormat( "MM-dd-yyyy HH:mm:ss");
        String fromDateTimeStr="02-25-2019 15:30:00";
        String toDateTimeStr="02-25-2019 20:30:00";
        List<String> detectorIds= Arrays.asList("608214","608202","608206","608217","608219",
                "608213","608209","608201","608205","608223","608203","608207","608224","608204","608208");

        MongoCollection<Document> collection=getCollectionMongoDBStandalone(Configuration.mongodbName,Configuration.collectionAggregatedTo);
        for(int i=0;i<detectorIds.size();i++){
            extract.toExcelFileForEachDetector(collection, detectorIds.get(i), fromDateTimeStr, toDateTimeStr, Configuration.outputFolder);
        }
    }

}
