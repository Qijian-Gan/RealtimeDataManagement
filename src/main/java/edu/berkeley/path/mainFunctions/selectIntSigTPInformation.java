package edu.berkeley.path.mainFunctions;

import com.mongodb.client.MongoCollection;
import edu.berkeley.path.settings.Configuration;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.bson.Document;
import org.tmdd._303.messages.IntersectionSignalTPInventoryPhase;
import org.tmdd._303.messages.IntersectionSignalTimingPatternInventory;
import org.tmdd._303.messages.IntersectionSignalTimingPatternInventory.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static edu.berkeley.path.database.MongoDB.connect.getCollectionMongoDBStandalone;
import edu.berkeley.path.processor.SignalTimingPatternInventory;

import static edu.berkeley.path.database.MongoDB.select.*;


public class selectIntSigTPInformation {

    private static final Logger LOG = LogManager.getLogger(Application.class);

    public static void main(String[] args) throws ParseException, IOException {


        MongoCollection<Document> collection=getCollectionMongoDBStandalone(Configuration.mongodbName,
                Configuration.collectionIntersectionSignalTimingPattern);

        List<String> uniqueDeviceIds=getUniqueListOfDeviceIdsFromIntSigTP(collection);
        System.out.println(uniqueDeviceIds);

        // Key<Organization Id, Device Id, Timing Pattern Id> && Value<Date, Time>
        Map<List<String>,List<String>> uniqueDevIdTPAndTime=upToDateDeviceIdAndTPIdAndTimeFromIntSigTP(collection);

        Iterator iterator=uniqueDevIdTPAndTime.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair=(Map.Entry) iterator.next();
            List<String> key=(List<String>) pair.getKey();
            List<String> value=(List<String>) pair.getValue();

            Document document=documentForGivenDeviceIdAndTimingPlanAndTimeFromIntSigTP(collection
                    , key.get(0), key.get(1), key.get(2), value.get(0), value.get(1));

            SignalTimingPatternInventory.getOrganizationInformationFromTimingPlanDocument(document);
            SignalTimingPatternInventory.getOrganizationIdFromTimingPlanDocument(document);
            SignalTimingPatternInventory.getDeviceIdFromTimingPlanDocument(document);
            SignalTimingPatternInventory.getTimingPatternIdFromTimingPlanDocument(document);
            SignalTimingPatternInventory.getTimingPatternNameFromTimingPlanDocument(document);
            SignalTimingPatternInventory.getCycleLengthFromTimingPlanDocument(document);
            SignalTimingPatternInventory.getOffsetTimeFromTimingPlanDocument(document);
            SignalTimingPatternInventory.getLastUpdateTimeFromTimingPlanDocument(document);
            SignalTimingPatternInventory.getSequenceDataFromTimingPlanDocument(document);
            SignalTimingPatternInventory.getAllPhaseTPFromTimingPlanDocument(document);
            SignalTimingPatternInventory.getTPFromTimingPlanDocumentWithGivenId(document,1);
            SignalTimingPatternInventory.getTPFromTimingPlanDocumentWithGivenId(document,8);
        }

    }
}
