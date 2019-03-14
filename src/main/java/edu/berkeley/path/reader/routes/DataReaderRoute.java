package edu.berkeley.path.reader.routes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.berkeley.path.qualityTest.DetectorData.DetectorDataTestResult;
import edu.berkeley.path.qualityTest.SignalInventory.IntersectionSignalInventoryTestResult;
import edu.berkeley.path.qualityTest.SignalStatus.IntersectionSignalStatusTestResult;
import edu.berkeley.path.settings.Configuration;
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
import java.util.Date;
import java.util.List;

import edu.berkeley.path.objects.*;
import edu.berkeley.path.database.MongoDB.save;

import static edu.berkeley.path.settings.Configuration.collectionIntersectionSignalStatusWithTestResult;

@Component
public class DataReaderRoute extends RouteBuilder {

    private static final Logger logger = LoggerFactory.getLogger(DataReaderRoute.class);


    @Autowired
    ProducerTemplate producerTemplate;

    public DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

    @Override
    public void configure() throws Exception {

        // ******************************************************************
        // Intersection detector data
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionDetectorData)
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {

                    logger.info("Reading detector data from data-gateway ...");
                    String body = (String) exchange.getIn().getBody();
                    ObjectMapper mapper = new ObjectMapper(); // Write to string

                    // Save the file locally
                    Date date = new Date();
                    String fileName=Constants.Construct_A_File_Name(Configuration.outputDetectorDataLocation,dateFormat.format(date),"Append");
                    producerTemplate.sendBody(fileName, body);

                    // Save original document to mongodb
                    Document document=Document.parse(body);
                    save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorData,document);

                    // Serialize the message
                    DetectorData detectorData = (DetectorData) JsonUtil.serializer().fromJson(body, new TypeReference<DetectorData>() {}) ;

                    // Test the message
                    DetectorDataTestResult detectorDataTestResult=new DetectorDataTestResult();
                    detectorDataTestResult.Initialization();
                    detectorDataTestResult.Check(detectorData);

                    // Construct a new data type with test results and save it to mongoDB
                    DetectorDataWithTestResult detectorDataWithTestResult=new DetectorDataWithTestResult(detectorData,detectorDataTestResult);
                    String detectorDataWithTestResultInString =mapper.writeValueAsString(detectorDataWithTestResult);
                    Document documentWithTestResult=Document.parse(detectorDataWithTestResultInString);
                    save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorDataWithTestResult,
                            documentWithTestResult);

                    // Construct individual detector data and save it to MongoDB
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

        // ******************************************************************
        // Intersection detector inventory
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionDetectorInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading detector inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the file locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(Configuration.outputDetectorInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorInventory,document);


                        // Serialize the message
                        /*
                        DetectorInventory detectorInventory = (DetectorInventory) JsonUtil.serializer().fromJson(body, new TypeReference<DetectorInventory>() {}) ;
                        DetectorInventoryTestResult detectorInventoryTestResult=new DetectorInventoryTestResult();
                        detectorInventoryTestResult.Initialization();
                        detectorInventoryTestResult.Check(detectorInventory);


                        // Construct a new data type with test results and save it to mongo
                        DetectorInventoryWithTestResult detectorInventoryWithTestResult=
                                new DetectorInventoryWithTestResult(detectorInventory,detectorInventoryTestResult);
                        String detectorInventoryWithTestResultInString =mapper.writeValueAsString(detectorInventoryWithTestResult);
                        Document documentWithTestResult=Document.parse(detectorInventoryWithTestResultInString);
                        save.insertOneToMongodbCollection(mongodbName,collectionDetectorInventoryWithTestResult,documentWithTestResult);
*/
                    }
                });

        // ******************************************************************
        // Intersection detector status
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionDetectorStatus)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading detector status from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorStatus,document);

                        // Save the file locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(Configuration.outputDetectorStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Serialize the message
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


        // ******************************************************************
        // Intersection signal inventory
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionSignalInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        // Get the information
                        logger.info("Reading signal inventory data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper();

                        // Save the original file locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(Configuration.outputSignalInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Serialize the message
                        IntersectionSignalInventory intersectionSignalInventory = (IntersectionSignalInventory)
                                JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalInventory>() {}) ;

                        // Save the original file to MongoDB with a new set of keys
                        // Keys: organizationId, deviceId, date, time
                        IntersectionSignalInventoryRev intersectionSignalInventoryRev=
                                new IntersectionSignalInventoryRev(intersectionSignalInventory.getDeviceInventoryHeader().getOrganizationInformation().getOrganizationId(),
                                        intersectionSignalInventory.getDeviceInventoryHeader().getDeviceId(),
                                        intersectionSignalInventory.getDeviceInventoryHeader().getLastUpdateTime().getDate(),
                                        intersectionSignalInventory.getDeviceInventoryHeader().getLastUpdateTime().getTime(),
                                        intersectionSignalInventory);
                        String signalInventoryRevInString =mapper.writeValueAsString(intersectionSignalInventoryRev);
                        Document documentRev=Document.parse(signalInventoryRevInString);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionIntersectionSignalInventory,documentRev);

                        // Perform the quality test and save the test results to MongoDB
                        IntersectionSignalInventoryTestResult intersectionSignalInventoryTestResult= new IntersectionSignalInventoryTestResult();
                        intersectionSignalInventoryTestResult.Initialization();
                        intersectionSignalInventoryTestResult.Check(intersectionSignalInventory);
                        // Construct a new data type with test results and save it to mongo
                        IntersectionSignalInventoryWithTestResult intersectionSignalInventoryWithTestResult=
                                new IntersectionSignalInventoryWithTestResult(intersectionSignalInventory,intersectionSignalInventoryTestResult);
                        String signalInventoryWithTestResultInString =mapper.writeValueAsString(intersectionSignalInventoryWithTestResult);
                        Document documentWithTestResult=Document.parse(signalInventoryWithTestResultInString);
                        save.insertOneToMongodbCollection(Configuration.database,
                                Configuration.collectionIntersectionSignalInventoryWithTestResult,documentWithTestResult);
                    }
                });

        // ******************************************************************
        // Intersection signal status
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionSignalStatus)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        // Get the information
                        logger.info("Reading signal status from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the file locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(Configuration.outputSignalStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Serialize the message
                        IntersectionSignalStatus intersectionSignalStatus = (IntersectionSignalStatus)
                                JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalStatus>() {}) ;

                        // Save the original file to MongoDB with a new set of keys
                        // Keys: organizationId, deviceId, date, time
                        IntersectionSignalStatusRev intersectionSignalStatusRev=new IntersectionSignalStatusRev(
                                intersectionSignalStatus.getDeviceStatusHeader().getOrganizationInformation().getOrganizationId(),
                                intersectionSignalStatus.getDeviceStatusHeader().getDeviceId(),
                                intersectionSignalStatus.getDeviceStatusHeader().getLastCommTime().getDate(),
                                intersectionSignalStatus.getDeviceStatusHeader().getLastCommTime().getTime(),
                                intersectionSignalStatus);
                        String signalStatusRevInString =mapper.writeValueAsString(intersectionSignalStatusRev);
                        Document documentRev=Document.parse(signalStatusRevInString);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionIntersectionSignalStatus,documentRev);

                        // Perform the quality test and save the test results to MongoDB
                        IntersectionSignalStatusTestResult intersectionSignalStatusTestResult=new IntersectionSignalStatusTestResult();
                        intersectionSignalStatusTestResult.Initialization();
                        intersectionSignalStatusTestResult.Check(intersectionSignalStatus);
                        // Construct a new data type with test results and save it to mongo
                        IntersectionSignalStatusWithTestResult intersectionSignalStatusWithTestResult=
                                new IntersectionSignalStatusWithTestResult(intersectionSignalStatus,intersectionSignalStatusTestResult);
                        String signalStatusWithTestResultInString =mapper.writeValueAsString(intersectionSignalStatusWithTestResult);
                        Document documentWithTestResult=Document.parse(signalStatusWithTestResultInString);
                        save.insertOneToMongodbCollection(Configuration .database,
                                Configuration.collectionIntersectionSignalStatusWithTestResult,documentWithTestResult);
                    }
                });

        // ******************************************************************
        // Intersection signal control schedule
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionSignalControlSchedule)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal control schedule from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the file locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(Configuration.outputSignalControlLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Serialize the message
                        IntersectionSignalControlSchedule intersectionSignalControlSchedule1 = (IntersectionSignalControlSchedule)
                                JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalControlSchedule>() {}) ;


                    }
                });

        // ******************************************************************
        // Intersection signal plan inventory
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionSignalPlanInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal plan inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string


                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(Configuration.outputSignalPlanInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Serialize the message
                        IntersectionSignalTimingPatternInventory intersectionSignalTimingPatternInventory = (IntersectionSignalTimingPatternInventory)
                                JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalTimingPatternInventory>() {}) ;




                    }
                });


    }

}
