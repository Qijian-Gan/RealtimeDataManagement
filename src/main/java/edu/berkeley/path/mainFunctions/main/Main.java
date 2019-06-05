package edu.berkeley.path.mainFunctions.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.berkeley.path.aggregation.DetectorDataAggregation;
import edu.berkeley.path.database.MongoDB.save;
import edu.berkeley.path.localTest.readFromLocalFiles;
import edu.berkeley.path.mainFunctions.Other.Application;
import edu.berkeley.path.settings.Configuration;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.io.IoBuilder;
import org.bson.Document;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import static edu.berkeley.path.aggregation.DetectorDataAggregation.aggregateDataForOrganizations;
import static edu.berkeley.path.detectorHealth.UpdateDetectorHealthAndData.updateForAllOrganizations;

public class Main {

    private static final Logger LOG = LogManager.getLogger(Application.class);

    public static AbstractApplicationContext springCtx;

    public static void main(String[] args) throws JsonProcessingException {

        // Get the task ID
        int taskID=0;
        if(args.length==0) {
            // Selection of type of tasks
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please choose one of the following tasks (MAKE SURE you update corresponding fields in Configuration.java first!):\n");
            System.out.print("1:  Get data from the data hub via D7 \n");
            System.out.print("2:  Read data from local folders and insert to MongoDB \n");
            System.out.print("3:  Aggregate data into longer time intervals\n");
            System.out.print("4:  Daily detector health analysis");
            System.out.print("Please enter your selection (number):");
            taskID = Integer.parseInt(scanner.next());
        }else{
            taskID=Integer.parseInt(args[0].trim());
        }

        if(taskID==1){
            System.out.print("1:  Get data from the data hub via D7 \n");
            //Capture all outputStream logs
            System.setErr(IoBuilder.forLogger(LogManager.getRootLogger()).setLevel(Level.ERROR).buildPrintStream());
            System.setOut(IoBuilder.forLogger(LogManager.getRootLogger()).setLevel(Level.INFO).buildPrintStream());
            try {
                springCtx = new ClassPathXmlApplicationContext("spring-context.xml");
                springCtx.start();
                LOG.info("Starting application....");
            } catch (Throwable e) {
                LOG.error("Exception caught in Main method " + e.getMessage());
            }
        }
        else if(taskID==2){
            System.out.print("2:  Read data from local folders and insert to MongoDB \n"); // Load configuration files
            readFromLocalFiles.saveDetectorDataToMongoDB(Configuration.localFolderForDetectorData,Configuration.readFolderForDetectorData);
        }
        else if(taskID==3){
            System.out.print("3:  Aggregate data into longer time intervals\n"); // Extract the health results
            Scanner scanner = new Scanner(System.in);
            aggregateDataForOrganizations();
        }
        else if(taskID==4){
            System.out.print("4:  Daily detector health analysis");
            updateForAllOrganizations();
        }

    }

}
