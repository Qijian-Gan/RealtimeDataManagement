package edu.berkeley.path.database.MongoDB;

import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import static edu.berkeley.path.database.MongoDB.select.aggregatedDetectorDataForGivenDetectorIdAndDateAndTimePeriod;

public class extract {

    public static void toExcelFileForEachDetector(MongoCollection<Document> collection, String detectorId, String fromDateTimeStr,
                                            String toDateTimeStr, String outputFolder) throws ParseException, IOException {


        FindIterable iterable=aggregatedDetectorDataForGivenDetectorIdAndDateAndTimePeriod(collection,detectorId,
                fromDateTimeStr, toDateTimeStr);

        String fileName=fromDateTimeStr.replace(":","-");
        fileName=fileName.replace(" ","_");
        fileName=detectorId+"_"+fileName+".csv";
        File file=new File(new File("").getAbsolutePath()+outputFolder+fileName);
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);

        String str="detectorId"+","+"dateTime"+","+"vehicleCount"+","+"vehicleOccupancy"+","+"vehicleSpeed"+"\n";
        try {
            bw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Block<Document> writeBlock = new Block<Document>() {
            public void apply(final Document document) {
                Date dateAndTime=new Date(Long.parseLong(document.get("startTimeStamp").toString()));
                String str=document.getString("detectorId")+","+dateAndTime.toString()+","+document.get("vehicleCount")+
                        ","+document.get("vehicleOccupancy")+","+document.get("vehicleSpeed")+"\n";
                try {
                    bw.write(str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        iterable.forEach(writeBlock);

        bw.close();
    }
}
