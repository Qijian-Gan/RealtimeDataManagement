package edu.berkeley.path.reader.routes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.berkeley.path.qualityTest.DetectorData.DetectorDataTestResult;
import edu.berkeley.path.qualityTest.DetectorInventory.DetectorInventoryTestResult;
import edu.berkeley.path.qualityTest.DetectorStatus.DetectorStatusTestResult;
import edu.berkeley.path.qualityTest.SignalControlSchedule.IntersectionSignalControlScheduleTestResult;
import edu.berkeley.path.qualityTest.SignalInventory.IntersectionSignalInventoryTestResult;
import edu.berkeley.path.qualityTest.SignalPlanInventory.IntersectionSignalTimingPatternInventoryTestResult;
import edu.berkeley.path.qualityTest.SignalStatus.IntersectionSignalStatusTestResult;
import edu.berkeley.path.settings.Configuration;
import edu.berkeley.path.util.Constants;
import edu.berkeley.path.util.DateTimeConversion;
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
import java.time.Instant;
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

        // ************************************************************************************************************
        // *****************************Arterial*****************************
        // ************************************************************************************************************

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
                    String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                            Configuration.outputDetectorDataLocation,dateFormat.format(date),"Append");
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
                    // Key: orgId, stationId & receivedTime
                    long receivedTime=System.currentTimeMillis();
                    String orgId=detectorData.getOrganizationInformation().getOrganizationId();
                    int stationId=Integer.parseInt(detectorData.getDetectorDataList().getDetectorDataDetail().get(0).getStationId());
                    DetectorDataWithTestResult detectorDataWithTestResult=new DetectorDataWithTestResult(orgId,stationId,receivedTime, detectorData
                            ,detectorDataTestResult);
                    String detectorDataWithTestResultInString =mapper.writeValueAsString(detectorDataWithTestResult);
                    Document documentWithTestResult=Document.parse(detectorDataWithTestResultInString);
                    save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorDataWithTestResult,
                            documentWithTestResult);

                    // Construct individual detector data and save it to MongoDB
                    List<DetectorDataIndividual> detectorDataIndividualList=DetectorDataIndividual.
                            constructIndividualDetectorData(detectorData);
                    if(detectorDataIndividualList.size()>0){
                        List<Document> documentList=new ArrayList<Document>();
                        for(int i=0;i<detectorDataIndividualList.size();i++){
                            String detectorDataIndividual =mapper.writeValueAsString(detectorDataIndividualList.get(i));
                            Document documentDetectorDataIndividual=Document.parse(detectorDataIndividual);
                            documentList.add(documentDetectorDataIndividual);
                        }
                        save.insertMultipleToMongodbCollection(Configuration.database,Configuration.
                                collectionDetectorDataIndividual,documentList);
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
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputDetectorInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorInventory,document);

                        // Serialize the message
                        DetectorInventory detectorInventory = (DetectorInventory) JsonUtil.serializer().fromJson(body, new TypeReference<DetectorInventory>() {}) ;

                        // Test the message
                        DetectorInventoryTestResult detectorInventoryTestResult=new DetectorInventoryTestResult();
                        detectorInventoryTestResult.Initialization();
                        detectorInventoryTestResult.Check(detectorInventory);

                        // Construct a new data type with test results and save it to MongoDB
                        // Key: orgId, stationId & receivedTime
                        long receivedTime=System.currentTimeMillis();
                        String orgId=detectorInventory.getDetectorStationInventoryHeader().getOrganizationInformation().getOrganizationId();
                        int stationId=Integer.parseInt(detectorInventory.getDetectorStationInventoryHeader().getDeviceId());
                        DetectorInventoryWithTestResult detectorInventoryWithTestResult=
                                new DetectorInventoryWithTestResult(orgId,stationId,receivedTime,detectorInventory,detectorInventoryTestResult);
                        String detectorInventoryWithTestResultInString =mapper.writeValueAsString(detectorInventoryWithTestResult);
                        Document documentWithTestResult=Document.parse(detectorInventoryWithTestResultInString);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorInventoryWithTestResult
                                ,documentWithTestResult);

                        // Construct individual detector inventory and save it to MongoDB
                        List<DetectorInventoryIndividual> detectorInventoryIndividualList=DetectorInventoryIndividual.
                                constructIndividualDetectorInventory(detectorInventory);
                        if(detectorInventoryIndividualList.size()>0){
                            List<Document> documentList=new ArrayList<Document>();
                            for(int i=0;i<detectorInventoryIndividualList.size();i++){
                                String detectorInventoryIndividual =mapper.writeValueAsString(detectorInventoryIndividualList.get(i));
                                Document documentDetectorInventoryIndividual=Document.parse(detectorInventoryIndividual);
                                documentList.add(documentDetectorInventoryIndividual);
                            }
                            save.insertMultipleToMongodbCollection(Configuration.database,
                                    Configuration.collectionDetectorInventoryIndividual,documentList);
                        }
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
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the file locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputDetectorStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorStatus,document);

                        // Serialize the message
                        DetectorStatus detectorStatus = (DetectorStatus) JsonUtil.serializer().fromJson(body, new TypeReference<DetectorStatus>() {}) ;

                        // Test the message
                        DetectorStatusTestResult detectorStatusTestResult=new DetectorStatusTestResult();
                        detectorStatusTestResult.Initialization();
                        detectorStatusTestResult.Check(detectorStatus);

                        // Construct a new data type with test results and save it to mongo
                        // Key: orgId, stationId & receivedTime
                        long receivedTime=System.currentTimeMillis();
                        String orgId;
                        int deviceId;
                        if(detectorStatus.getDetectorStationStatusHeader()==null) {
                            orgId = detectorStatus.getDetectorStatusList().getDetector().get(0).getDetectorStatusHeader().getOrganizationInformation().getOrganizationId();
                            deviceId = Integer.parseInt(detectorStatus.getDetectorStatusList().getDetector().get(0).getDetectorStatusHeader().getDeviceId());
                        }else{
                            orgId = detectorStatus.getDetectorStationStatusHeader().getOrganizationInformation().getOrganizationId();
                            deviceId = Integer.parseInt(detectorStatus.getDetectorStationStatusHeader().getDeviceId());
                        }
                        DetectorStatusWithTestResult detectorStatusWithTestResult= new DetectorStatusWithTestResult(
                                orgId,deviceId,receivedTime,detectorStatus,detectorStatusTestResult);
                        String detectorStatusWithTestResultInString =mapper.writeValueAsString(detectorStatusWithTestResult);
                        Document documentWithTestResult=Document.parse(detectorStatusWithTestResultInString);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionDetectorStatusWithTestResult
                                ,documentWithTestResult);

                        // Construct individual detector status and save it to MongoDB
                        List<DetectorStatusIndividual> detectorStatusIndividualList=DetectorStatusIndividual.
                                constructIndividualDetectorStatus(detectorStatus);
                        if(detectorStatusIndividualList.size()>0){
                            List<Document> documentList=new ArrayList<Document>();
                            for(int i=0;i<detectorStatusIndividualList.size();i++){
                                String detectorStatusIndividual =mapper.writeValueAsString(detectorStatusIndividualList.get(i));
                                Document documentDetectorStatusIndividual=Document.parse(detectorStatusIndividual);
                                documentList.add(documentDetectorStatusIndividual);
                            }
                            save.insertMultipleToMongodbCollection(Configuration.database,
                                    Configuration.collectionDetectorStatusIndividual,documentList);
                        }
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
                        String fileName = Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputSignalInventoryLocation, dateFormat.format(date), "Append");
                        producerTemplate.sendBody(fileName, body);

                        // Serialize the message
                        IntersectionSignalInventory intersectionSignalInventory = (IntersectionSignalInventory)
                                JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalInventory>() {
                                });

                        // Save the original file to MongoDB with a new set of keys
                        // Keys: organizationId, deviceId, date, time
                        if (intersectionSignalInventory.getDeviceInventoryHeader() == null) {
                            System.out.println("Empty device header for Intersection Signal Inventory!!");
                        } else {
                            Date lastUpdateTime = DateTimeConversion.TMDDDateTimeToRegularDateTime(
                                    intersectionSignalInventory.getDeviceInventoryHeader().getLastUpdateTime().getDate(),
                                    intersectionSignalInventory.getDeviceInventoryHeader().getLastUpdateTime().getTime());

                            IntersectionSignalInventoryRev intersectionSignalInventoryRev =
                                    new IntersectionSignalInventoryRev(intersectionSignalInventory.getDeviceInventoryHeader().getOrganizationInformation().getOrganizationId(),
                                            intersectionSignalInventory.getDeviceInventoryHeader().getDeviceId()
                                            , lastUpdateTime, intersectionSignalInventory);
                            String signalInventoryRevInString = mapper.writeValueAsString(intersectionSignalInventoryRev);
                            Document documentRev = Document.parse(signalInventoryRevInString);
                            save.insertOneToMongodbCollection(Configuration.database, Configuration.collectionIntersectionSignalInventory, documentRev);
                        }

                        // Perform the quality test and save the test results to MongoDB
                        IntersectionSignalInventoryTestResult intersectionSignalInventoryTestResult = new IntersectionSignalInventoryTestResult();
                        intersectionSignalInventoryTestResult.Initialization();
                        intersectionSignalInventoryTestResult.Check(intersectionSignalInventory);

                        // Construct a new data type with test results and save it to mongo
                        // Key: orgId, stationId & receivedTime
                        long receivedTime=System.currentTimeMillis();
                        String orgId=intersectionSignalInventory.getDeviceInventoryHeader().getOrganizationInformation().getOrganizationId();
                        int stationId=Integer.parseInt(intersectionSignalInventory.getDeviceInventoryHeader().getDeviceId());
                        IntersectionSignalInventoryWithTestResult intersectionSignalInventoryWithTestResult = new IntersectionSignalInventoryWithTestResult
                                (orgId,stationId,receivedTime,intersectionSignalInventory, intersectionSignalInventoryTestResult);
                        String signalInventoryWithTestResultInString = mapper.writeValueAsString(intersectionSignalInventoryWithTestResult);
                        Document documentWithTestResult = Document.parse(signalInventoryWithTestResultInString);
                        save.insertOneToMongodbCollection(Configuration.database,
                                Configuration.collectionIntersectionSignalInventoryWithTestResult, documentWithTestResult);
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
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputSignalStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Serialize the message
                        IntersectionSignalStatus intersectionSignalStatus = (IntersectionSignalStatus)
                                JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalStatus>() {}) ;

                        // Save the original file to MongoDB with a new set of keys
                        // Keys: organizationId, deviceId, date, time
                        Date lastUpdateTime= DateTimeConversion.TMDDDateTimeToRegularDateTime(
                                intersectionSignalStatus.getControllerTimestamp().getDate(),
                                intersectionSignalStatus.getControllerTimestamp().getTime());
                        IntersectionSignalStatusRev intersectionSignalStatusRev=new IntersectionSignalStatusRev(
                                intersectionSignalStatus.getDeviceStatusHeader().getOrganizationInformation().getOrganizationId(),
                                intersectionSignalStatus.getDeviceStatusHeader().getDeviceId(),
                                intersectionSignalStatus.getTimingPatternIdCurrent(),
                                lastUpdateTime, intersectionSignalStatus);
                        String signalStatusRevInString =mapper.writeValueAsString(intersectionSignalStatusRev);
                        Document documentRev=Document.parse(signalStatusRevInString);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionIntersectionSignalStatus,documentRev);

                        // Perform the quality test and save the test results to MongoDB
                        IntersectionSignalStatusTestResult intersectionSignalStatusTestResult=new IntersectionSignalStatusTestResult();
                        intersectionSignalStatusTestResult.Initialization();
                        intersectionSignalStatusTestResult.Check(intersectionSignalStatus);

                        // Construct a new data type with test results and save it to mongo
                        // Key: orgId, stationId & receivedTime
                        long receivedTime=System.currentTimeMillis();
                        String orgId=intersectionSignalStatus.getDeviceStatusHeader().getOrganizationInformation().getOrganizationId();
                        int stationId=Integer.parseInt(intersectionSignalStatus.getDeviceStatusHeader().getDeviceId());
                        IntersectionSignalStatusWithTestResult intersectionSignalStatusWithTestResult= new IntersectionSignalStatusWithTestResult(
                                orgId,stationId,receivedTime,intersectionSignalStatus,intersectionSignalStatusTestResult);
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
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputSignalControlLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Serialize the message
                        IntersectionSignalControlSchedule intersectionSignalControlSchedule = (IntersectionSignalControlSchedule)
                                JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalControlSchedule>() {}) ;

                        // Save original document to mongodb
                        Date lastUpdateTime= DateTimeConversion.TMDDDateTimeToRegularDateTime(
                                intersectionSignalControlSchedule.getDeviceControlScheduleHeader().getLastUpdateTime().getDate(),
                                intersectionSignalControlSchedule.getDeviceControlScheduleHeader().getLastUpdateTime().getTime());
                        IntersectionSignalControlScheduleRev intersectionSignalControlScheduleRev=new IntersectionSignalControlScheduleRev(
                                intersectionSignalControlSchedule.getDeviceControlScheduleHeader().getOrganizationInformation().getOrganizationId(),
                                Integer.parseInt(intersectionSignalControlSchedule.getDeviceControlScheduleHeader().getDeviceId()),
                                lastUpdateTime.getTime(),Integer.parseInt(intersectionSignalControlSchedule.getTimingPatternId()),
                                intersectionSignalControlSchedule);
                        String signalControlScheduleRevInString =mapper.writeValueAsString(intersectionSignalControlScheduleRev);
                        Document documentRev=Document.parse(signalControlScheduleRevInString);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionIntersectionSignalControlSchedule,documentRev);

                        // Perform the quality test and save the test results to MongoDB
                        IntersectionSignalControlScheduleTestResult intersectionSignalControlScheduleTestResult=
                                new IntersectionSignalControlScheduleTestResult();
                        intersectionSignalControlScheduleTestResult.Initialization();
                        intersectionSignalControlScheduleTestResult.Check(intersectionSignalControlSchedule);

                        // Construct a new data type with test results and save it to mongo
                        // Key: orgId, stationId & receivedTime
                        long receivedTime=System.currentTimeMillis();
                        String orgId=intersectionSignalControlSchedule.getDeviceControlScheduleHeader().getOrganizationInformation().getOrganizationId();
                        int stationId=Integer.parseInt(intersectionSignalControlSchedule.getDeviceControlScheduleHeader().getDeviceId());
                        IntersectionSignalControlScheduleWithTestResult intersectionSignalControlScheduleWithTestResult= new IntersectionSignalControlScheduleWithTestResult(
                                orgId,stationId,receivedTime,intersectionSignalControlSchedule,intersectionSignalControlScheduleTestResult);
                        String intersectionSignalControlScheduleWithTestResultInString =mapper.writeValueAsString
                                (intersectionSignalControlScheduleWithTestResult);
                        Document documentWithTestResult=Document.parse(intersectionSignalControlScheduleWithTestResultInString);
                        save.insertOneToMongodbCollection(Configuration .database,
                                Configuration.collectionIntersectionSignalControlScheduleWithTestResult,documentWithTestResult);
                    }
                });

        // ******************************************************************
        // Intersection signal plan inventory
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.intersectionSignalTimingPatternInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal plan inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string


                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputSignalTimingPatternInventoryLocation, dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Serialize the message
                        IntersectionSignalTimingPatternInventory intersectionSignalTimingPatternInventory = (IntersectionSignalTimingPatternInventory)
                                JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalTimingPatternInventory>() {}) ;

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionIntersectionSignalTimingPattern
                                ,document);

                        // Perform the quality test and save the test results to MongoDB
                        IntersectionSignalTimingPatternInventoryTestResult intersectionSignalTimingPatternInventoryTestResult=
                                new IntersectionSignalTimingPatternInventoryTestResult();
                        intersectionSignalTimingPatternInventoryTestResult.Initialization();
                        intersectionSignalTimingPatternInventoryTestResult.Check(intersectionSignalTimingPatternInventory);

                        // Construct a new data type with test results and save it to mongo
                        // Key: orgId, stationId & receivedTime
                        long receivedTime=System.currentTimeMillis();
                        String orgId=intersectionSignalTimingPatternInventory.getOrganizationInformation().getOrganizationId();
                        int stationId=Integer.parseInt(intersectionSignalTimingPatternInventory.getDeviceId());
                        IntersectionSignalTimingPatternInventoryWithTestResult intersectionSignalTimingPatternInventoryWithTestResult= new IntersectionSignalTimingPatternInventoryWithTestResult(
                                orgId,stationId,receivedTime,intersectionSignalTimingPatternInventory,intersectionSignalTimingPatternInventoryTestResult);
                        String signalTimingPatternInventoryWithTestResultInString =mapper.writeValueAsString
                                (intersectionSignalTimingPatternInventoryWithTestResult);
                        Document documentWithTestResult=Document.parse(signalTimingPatternInventoryWithTestResultInString);
                        save.insertOneToMongodbCollection(Configuration .database,
                                Configuration.collectionIntersectionSignalTimingPatternWithTestResult,documentWithTestResult);
                    }
                });


        // ************************************************************************************************************
        // *****************************Freeway*****************************
        // ************************************************************************************************************

        // ******************************************************************
        //  Freeway Detector Data
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.freewayDetectorData)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading freeway detector data from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the original document locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputFreewayDetectorDataLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionFreewayDetectorData,document);
                    }
                });


        // ******************************************************************
        // Freeway Detector Inventory
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.freewayDetectorInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading freeway detector inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the original document locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputFreewayDetectorInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionFreewayDetectorInventory,document);
                    }
                });


        // ******************************************************************
        // Freeway Detector Status
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.freewayDetectorStatus)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading freeway detector status from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the original document locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputFreewayDetectorStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionFreewayDetectorStatus,document);
                    }
                });


        // ******************************************************************
        // Ramp Detector Data
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.rampDetectorData)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading ramp detector data from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the original document locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputRampDetectorDataLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionRampDetectorData,document);
                    }
                });


        // ******************************************************************
        // Ramp Detector Inventory
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.rampDetectorInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading ramp detector inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the original document locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputRampDetectorInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionRampDetectorInventory,document);
                    }
                });


        // ******************************************************************
        // Ramp Detector Status
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.rampDetectorStatus)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading ramp detector status from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the original document locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputRampDetectorStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionRampDetectorStatus,document);
                    }
                });


        // ******************************************************************
        // Ramp Meter Inventory
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.rampMeterInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading ramp meter inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the original document locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputRampMeterInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionRampMeterInventory,document);
                    }
                });


        // ******************************************************************
        // Ramp Meter Status
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.rampMeterStatus)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading ramp meter status from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the original document locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputRampMeterStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionRampMeterStatus,document);
                    }
                });


        // ******************************************************************
        // Ramp Meter Plan Inventory
        // ******************************************************************
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,Configuration.rampMeterPlanInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading ramp meter plan inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();
                        ObjectMapper mapper = new ObjectMapper(); // Write to string

                        // Save the original document locally
                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name_FullPath(Configuration.saveRawDataTo,
                                Configuration.outputRampMeterPlanInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                        // Save original document to mongodb
                        Document document=Document.parse(body);
                        save.insertOneToMongodbCollection(Configuration.database,Configuration.collectionRampMeterPlanInventory,document);
                    }
                });



    }

}
