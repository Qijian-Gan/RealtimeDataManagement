package edu.berkeley.path.reader.routes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import edu.berkeley.path.qualityTest.DetectorData.DetectorDataTestResult;
import edu.berkeley.path.qualityTest.DetectorInventory.DetectorInventoryTestResult;
import edu.berkeley.path.qualityTest.DetectorStatus.DetectorStatusTestResult;
import edu.berkeley.path.qualityTest.SignalInventory.IntersectionSignalInventoryTestResult;
import edu.berkeley.path.qualityTest.SignalStatus.IntersectionSignalStatusTestResult;
import edu.berkeley.path.Configuration;
import edu.berkeley.path.util.Constants;
import edu.berkeley.path.util.JsonUtil;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tmdd._303.messages.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import edu.berkeley.path.objects.*;
import edu.berkeley.path.database.save;

@Component
public class DataReaderRoute extends RouteBuilder {

    private static final Logger logger = LoggerFactory.getLogger(DataReaderRoute.class);


    @Autowired
    ProducerTemplate producerTemplate;

    public DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

    @Override
    public void configure() throws Exception {

        // Intersection detector data
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionDetectorData)
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {

                    logger.info("Reading detector data from data-gateway ...");
                    String body = (String) exchange.getIn().getBody();
                    // Save original document to mongodb
                    Document document=Document.parse(body);
                    save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorData,document);

                    /*
                    // Save the file locally
                    Date date = new Date();
                    String fileName=Constants.Construct_A_File_Name(outputDetectorDataLocation,dateFormat.format(date),"Append");
                    producerTemplate.sendBody(fileName, body);
                    */

                    // Serialize and test the message
                    DetectorData detectorData = (DetectorData) JsonUtil.serializer().fromJson(body, new TypeReference<DetectorData>() {}) ;
                    DetectorDataTestResult detectorDataTestResult=new DetectorDataTestResult();
                    detectorDataTestResult.Initialization();
                    detectorDataTestResult.Check(detectorData);

                    ObjectMapper mapper = new ObjectMapper(); // Write to string
                    // Construct a new data type with test results and save it to mongo
                    DetectorDataWithTestResult detectorDataWithTestResult=new DetectorDataWithTestResult(detectorData,detectorDataTestResult);
                    String detectorDataWithTestResultInString =mapper.writeValueAsString(detectorDataWithTestResult);
                    Document documentWithTestResult=Document.parse(detectorDataWithTestResultInString);
                    save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorDataWithTestResult,documentWithTestResult);

                    // Construct individual detector data
                    List<DetectorDataIndividual> detectorDataIndividualList=DetectorDataIndividual.constructIndividualDetectorData(detectorData);
                    if(detectorDataIndividualList.size()>0){
                        List<Document> documentList=new ArrayList<Document>();
                        for(int i=0;i<detectorDataIndividualList.size();i++){
                            String detectorDataIndividual =mapper.writeValueAsString(detectorDataIndividualList.get(i));
                            Document documentDetectorDataIndividual=Document.parse(detectorDataIndividual);
                            documentList.add(documentDetectorDataIndividual);
                        }
                        save.insertMultipleToMongodbCollection(Configuration.database,Configuration.collectionDetectorDataIndividual,documentList);
                    }

                }
            });

        // Intersection detector inventory
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionDetectorInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading detector inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorInventory,document);

                        /*
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputDetectorInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);
                        */

                        /*
                        DetectorInventory detectorInventory = (DetectorInventory) JsonUtil.serializer().fromJson(body, new TypeReference<DetectorInventory>() {}) ;
                        DetectorInventoryTestResult detectorInventoryTestResult=new DetectorInventoryTestResult();
                        detectorInventoryTestResult.Initialization();
                        detectorInventoryTestResult.Check(detectorInventory);

                        ObjectMapper mapper = new ObjectMapper(); // Write to string
                        // Construct a new data type with test results and save it to mongo
                        DetectorInventoryWithTestResult detectorInventoryWithTestResult=
                                new DetectorInventoryWithTestResult(detectorInventory,detectorInventoryTestResult);
                        String detectorInventoryWithTestResultInString =mapper.writeValueAsString(detectorInventoryWithTestResult);
                        Document documentWithTestResult=Document.parse(detectorInventoryWithTestResultInString);
                        save.insertOneToMongodbCollection(mongodbName,collectionDetectorInventoryWithTestResult,documentWithTestResult);
*/
                    }
                });

        // Intersection detector status
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionDetectorStatus)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading detector status from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorStatus,document);

                        /*
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputDetectorStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);
                        */

                        /*
                        DetectorStatus detectorStatus = (DetectorStatus) JsonUtil.serializer().fromJson(body, new TypeReference<DetectorStatus>() {}) ;
                        DetectorStatusTestResult detectorStatusTestResult=new DetectorStatusTestResult();
                        detectorStatusTestResult.Initialization();
                        detectorStatusTestResult.Check(detectorStatus);

                        ObjectMapper mapper = new ObjectMapper(); // Write to string
                        // Construct a new data type with test results and save it to mongo
                        DetectorStatusWithTestResult detectorStatusWithTestResult=
                                new DetectorStatusWithTestResult(detectorStatus,detectorStatusTestResult);
                        String detectorStatusWithTestResultInString =mapper.writeValueAsString(detectorStatusWithTestResult);
                        Document documentWithTestResult=Document.parse(detectorStatusWithTestResultInString);
                        save.insertOneToMongodbCollection(mongodbName,collectionDetectorStatusWithTestResult,documentWithTestResult);
*/
                    }
                });


        // Intersection signal inventory
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionSignalInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal inventory data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionIntersectionSignalInventory,document);

                        /*
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputSignalInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);
                        */

                        /*
                        IntersectionSignalInventory intersectionSignalInventory = (IntersectionSignalInventory) JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalInventory>() {}) ;
                        IntersectionSignalInventoryTestResult intersectionSignalInventoryTestResult=
                                new IntersectionSignalInventoryTestResult();
                        intersectionSignalInventoryTestResult.Initialization();
                        intersectionSignalInventoryTestResult.Check(intersectionSignalInventory);

                        ObjectMapper mapper = new ObjectMapper(); // Write to string
                        // Construct a new data type with test results and save it to mongo
                        IntersectionSignlInventoryWithTestResult intersectionSignlInventoryWithTestResult=
                                new IntersectionSignlInventoryWithTestResult(intersectionSignalInventory,intersectionSignalInventoryTestResult);
                        String signalInventoryWithTestResultInString =mapper.writeValueAsString(intersectionSignlInventoryWithTestResult);
                        Document documentWithTestResult=Document.parse(signalInventoryWithTestResultInString);
                        save.insertOneToMongodbCollection(mongodbName,collectionIntersectionSignalInventoryWithTestResult,documentWithTestResult);
*/
                    }
                });

        // Intersection signal status
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionSignalStatus)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal status from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionIntersectionSignalStatus,document);

                        /*
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputSignalStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);
                        */

                        /*
                        IntersectionSignalStatus intersectionSignalStatus = (IntersectionSignalStatus) JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalStatus>() {}) ;
                        IntersectionSignalStatusTestResult intersectionSignalStatusTestResult=new IntersectionSignalStatusTestResult();
                        intersectionSignalStatusTestResult.Initialization();
                        intersectionSignalStatusTestResult.Check(intersectionSignalStatus);

                        ObjectMapper mapper = new ObjectMapper(); // Write to string
                        // Construct a new data type with test results and save it to mongo
                        IntersectionSignalStatusWithTestResult intersectionSignalStatusWithTestResult=
                                new IntersectionSignalStatusWithTestResult(intersectionSignalStatus,intersectionSignalStatusTestResult);
                        String signalStatusWithTestResultInString =mapper.writeValueAsString(intersectionSignalStatusWithTestResult);
                        Document documentWithTestResult=Document.parse(signalStatusWithTestResultInString);
                        save.insertOneToMongodbCollection(mongodbName,collectionIntersectionSignalStatusWithTestResult,documentWithTestResult);

*/
                    }
                });

        // Intersection signal control schedule
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionSignalControlSchedule)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal control schedule from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();

                        //IntersectionSignalControlSchedule intersectionSignalControlSchedule1 = (IntersectionSignalControlSchedule) JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalControlSchedule>() {}) ;
                        //logger.info("printing data " + intersectionSignalControlSchedule1.toString());

                        /*
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputSignalControlLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);
                        */

                    }
                });

        // Intersection signal plan inventory
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionSignalPlanInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal plan inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();

                        //IntersectionSignalTimingPatternInventory intersectionSignalTimingPatternInventory = (IntersectionSignalTimingPatternInventory) JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalTimingPatternInventory>() {}) ;
                        //logger.info("printing data " + intersectionSignalTimingPatternInventory.toString());

                        /*
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputSignalPlanInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);
                        */

                    }
                });


    }

}
