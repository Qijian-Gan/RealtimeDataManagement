package edu.berkeley.path.reader.routes;

import com.fasterxml.jackson.core.type.TypeReference;
import edu.berkeley.path.util.Constants;
import edu.berkeley.path.util.JsonUtil;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tmdd._303.messages.*;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Component
public class DataReaderRoute extends RouteBuilder {

    private static final Logger logger = LoggerFactory.getLogger(DataReaderRoute.class);

    // **************************************************************
    // Settings: should be updated once the message topic is changed
    // **************************************************************
    // Message topics: Detector related
    // Detector inventory
    private String intersectionDetectorInventory = "Consumer.research.VirtualTopic.CT.D7.210.DSSInterface.IntersectionDetectorInventory";
    private String outputDetectorInventoryLocation="file://I:\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\detectorInventory";
    // Detector status
    private String intersectionDetectorStatus = "Consumer.research.VirtualTopic.CT.D7.210.DSSInterface.IntersectionDetectorStatus";
    private String outputDetectorStatusLocation="file://I:\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\detectorStatus";
    // Detector data
    private String intersectionDetectorData = "Consumer.research.VirtualTopic.CT.D7.210.DSSInterface.IntersectionDetectorData";
    private String outputDetectorDataLocation="file://I:\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\detectorData";

    // Message topics: Intersection signal related
    // Signal Inventory
    private String intersectionSignalInventory = "Consumer.research.VirtualTopic.CT.D7.210.DSSInterface.IntersectionSignalInventory";
    private String outputSignalInventoryLocation="file://I:\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalInventory";
    // Signal control schedule
    private String intersectionSignalControlSchedule = "Consumer.research.VirtualTopic.CT.D7.210.DSSInterface.IntersectionSignalControlSchedule";
    private String outputSignalControlLocation="file://I:\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalControl";
    // Signal status
    private String intersectionSignalStatus = "Consumer.research.VirtualTopic.CT.D7.210.DSSInterface.IntersectionSignalStatus";
    private String outputSignalStatusLocation="file://I:\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalStatus";
    // Signal plan Inventory
    private String intersectionSignalPlanInventory = "Consumer.research.VirtualTopic.CT.D7.210.DSSInterface.IntersectionSignalPlanInventory";
    private String outputSignalPlanInventoryLocation="file://I:\\Dropbox\\WorkAtBerkeley\\Programs\\RealtimeDataManagement\\data\\signalPlanInventory";

    @Autowired
    ProducerTemplate producerTemplate;

    public DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

    @Override
    public void configure() throws Exception {

        // Intersection detector data
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,intersectionDetectorData)
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {

                    logger.info("Reading detector data from data-gateway ...");
                    String body = (String) exchange.getIn().getBody();

                    //DetectorData detectorData = (DetectorData) JsonUtil.serializer().fromJson(body, new TypeReference<DetectorData>() {}) ;
                    //logger.info("printing data " + detectorData.toString());

                    Date date = new Date();
                    String fileName=Constants.Construct_A_File_Name(outputDetectorDataLocation,dateFormat.format(date),"Append");
                    producerTemplate.sendBody(fileName, body);

                }
            });

        // Intersection detector inventory
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,intersectionDetectorInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading detector inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();

                        //DetectorInventory detectorInventory = (DetectorInventory) JsonUtil.serializer().fromJson(body, new TypeReference<DetectorInventory>() {}) ;
                        //logger.info("printing data " + detectorInventory.toString());

                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputDetectorInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                    }
                });

        // Intersection detector status
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,intersectionDetectorStatus)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading detector status from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();

                        //DetectorStatus detectorStatus = (DetectorStatus) JsonUtil.serializer().fromJson(body, new TypeReference<DetectorStatus>() {}) ;
                        //logger.info("printing data " + detectorStatus.toString());

                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputDetectorStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                    }
                });


        // Intersection signal inventory
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,intersectionSignalInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal inventory data-gateway ...");
                        String body = (String) exchange.getIn().getBody();

                        //IntersectionSignalInventory intersectionSignalInventory1 = (IntersectionSignalInventory) JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalInventory>() {}) ;
                        //logger.info("printing data " + intersectionSignalInventory1.toString());

                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputSignalInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                    }
                });

        // Intersection signal status
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,intersectionSignalStatus)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal status from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();

                        //IntersectionSignalStatus intersectionSignalStatus1 = (IntersectionSignalStatus) JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalStatus>() {}) ;
                        //logger.info("printing data " + intersectionSignalStatus1.toString());

                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputSignalStatusLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                    }
                });

        // Intersection signal control schedule
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,intersectionSignalControlSchedule)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal control schedule from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();

                        IntersectionSignalControlSchedule intersectionSignalControlSchedule1 = (IntersectionSignalControlSchedule) JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalControlSchedule>() {}) ;
                        //logger.info("printing data " + intersectionSignalControlSchedule1.toString());

                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputSignalControlLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                    }
                });

        // Intersection signal plan inventory
        fromF(Constants.SEND_ACTIVEMQ_W_QUEUE,intersectionSignalPlanInventory)
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {

                        logger.info("Reading signal plan inventory from data-gateway ...");
                        String body = (String) exchange.getIn().getBody();

                        //IntersectionSignalTimingPatternInventory intersectionSignalTimingPatternInventory = (IntersectionSignalTimingPatternInventory) JsonUtil.serializer().fromJson(body, new TypeReference<IntersectionSignalTimingPatternInventory>() {}) ;
                        //logger.info("printing data " + intersectionSignalTimingPatternInventory.toString());

                        Date date = new Date();
                        String fileName=Constants.Construct_A_File_Name(outputSignalPlanInventoryLocation,dateFormat.format(date),"Append");
                        producerTemplate.sendBody(fileName, body);

                    }
                });


    }

}
