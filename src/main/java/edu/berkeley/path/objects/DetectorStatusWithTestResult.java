package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.DetectorStatus.DetectorStatusTestResult;
import org.tmdd._303.messages.DetectorStatus;

public class DetectorStatusWithTestResult {

    private DetectorStatus message;
    private DetectorStatusTestResult testResult;

    public DetectorStatusWithTestResult(DetectorStatus _message,DetectorStatusTestResult _testResult){
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public DetectorStatus getMessage() {
        return message;
    }

    public DetectorStatusTestResult getTestResult() {
        return testResult;
    }

    // Set functions
    public void setMessage(DetectorStatus message) {
        this.message = message;
    }

    public void setTestResult(DetectorStatusTestResult testResult) {
        this.testResult = testResult;
    }
}
