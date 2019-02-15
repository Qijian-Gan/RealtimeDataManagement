package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.DetectorData.DetectorDataTestResult;
import org.tmdd._303.messages.DetectorData;

public class DetectorDataWithTestResult {

    private DetectorData message;
    private DetectorDataTestResult testResult;

    public DetectorDataWithTestResult(DetectorData _message, DetectorDataTestResult _testResult){
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public DetectorData getMessage() {
        return message;
    }

    public DetectorDataTestResult getTestResult() {
        return testResult;
    }

    // Set functions
    public void setMessage(DetectorData message) {
        this.message = message;
    }

    public void setTestResult(DetectorDataTestResult testResult) {
        this.testResult = testResult;
    }
}
