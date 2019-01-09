package edu.berkeley.path;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.io.IoBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.berkeley.path.qualityTest.DetectorStatus.DetectorStatusTestResult;


public class Test {

    private static final Logger LOG = LogManager.getLogger(Application.class);

    public static AbstractApplicationContext springCtx;

    public static final void main(String[] args) throws Exception {

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
}
