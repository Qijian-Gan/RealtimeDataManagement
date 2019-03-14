package edu.berkeley.path.localTest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.berkeley.path.settings.Configuration;
import edu.berkeley.path.database.MongoDB.save;
import edu.berkeley.path.objects.DetectorDataIndividual;
import edu.berkeley.path.objects.DetectorDataWithTestResult;
import edu.berkeley.path.qualityTest.DetectorData.DetectorDataTestResult;
import edu.berkeley.path.util.JsonUtil;
import edu.berkeley.path.util.MoveFile;
import org.bson.Document;
import org.tmdd._303.messages.DetectorData;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class readFromLocalFiles {

    public static void saveDetectorDataToMongoDB(String folderFrom, String folderTo){

        List<Document> detectorDataList=new ArrayList<>();

        File folder=new File(folderFrom);
        File [] listOfFiles=folder.listFiles();

        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        for(int i=0;i<listOfFiles.length;i++){
            if(listOfFiles[i].isFile()){
                System.out.println(listOfFiles[i].getAbsolutePath());
                try {
                    fileReader=new FileReader(listOfFiles[i]);
                    bufferedReader=new BufferedReader(fileReader);
                    String line=bufferedReader.readLine();
                    String[] lineStrings=line.split("[{]\"organizationInformation\"");
                    for(int j=0;j<lineStrings.length;j++){
                        if(!lineStrings[j].equals("") && !lineStrings[j].isEmpty()) {
                            String body = "{\"organizationInformation\"" + lineStrings[j];
                            Document document = Document.parse(body);
                            save.insertOneToMongodbCollection(Configuration.database, Configuration.collectionDetectorData, document);

                            // Serialize and test the message
                            DetectorData detectorData = JsonUtil.serializer().fromJson(body, new TypeReference<DetectorData>() {});
                            DetectorDataTestResult detectorDataTestResult = new DetectorDataTestResult();
                            detectorDataTestResult.Initialization();
                            detectorDataTestResult.Check(detectorData);

                            ObjectMapper mapper = new ObjectMapper(); // Write to string
                            // Construct a new data type with test results and save it to mongo
                            DetectorDataWithTestResult detectorDataWithTestResult = new DetectorDataWithTestResult(detectorData, detectorDataTestResult);
                            String detectorDataWithTestResultInString = mapper.writeValueAsString(detectorDataWithTestResult);
                            Document documentWithTestResult = Document.parse(detectorDataWithTestResultInString);
                            save.insertOneToMongodbCollection(Configuration.database, Configuration.collectionDetectorDataWithTestResult, documentWithTestResult);

                            // Construct individual detector data
                            List<DetectorDataIndividual> detectorDataIndividualList = DetectorDataIndividual.constructIndividualDetectorData(detectorData);
                            if (detectorDataIndividualList.size() > 0) {
                                List<Document> documentList = new ArrayList<Document>();
                                for (int k = 0; k < detectorDataIndividualList.size(); k++) {
                                    String detectorDataIndividual = mapper.writeValueAsString(detectorDataIndividualList.get(k));
                                    Document documentDetectorDataIndividual = Document.parse(detectorDataIndividual);
                                    documentList.add(documentDetectorDataIndividual);
                                }
                                save.insertMultipleToMongodbCollection(Configuration.database, Configuration.collectionDetectorDataIndividual, documentList);
                            }
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
        }

        // Move the files
        for(int i=0;i<listOfFiles.length;i++) {
            if (listOfFiles[i].isFile()) {
                MoveFile.moveFileFromAToB(folderFrom,folderTo,listOfFiles[i].getName());
            }
        }
    }

}
