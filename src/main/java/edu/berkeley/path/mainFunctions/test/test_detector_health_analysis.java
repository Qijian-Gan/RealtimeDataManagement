package edu.berkeley.path.mainFunctions.test;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.text.ParseException;

import static edu.berkeley.path.detectorHealth.UpdateDetectorHealthAndData.updateForAllOrganizations;

public class test_detector_health_analysis {
    public static void main(String[] args) throws JsonProcessingException {

        updateForAllOrganizations();
    }
}
