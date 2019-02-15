package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.SignalStatus.IntersectionSignalStatusTestResult;
import org.tmdd._303.messages.IntersectionSignalStatus;

public class IntersectionSignalStatusWithTestResult {

    private IntersectionSignalStatus message;
    private IntersectionSignalStatusTestResult testResult;

    public IntersectionSignalStatusWithTestResult(IntersectionSignalStatus _message,
                                                  IntersectionSignalStatusTestResult _testResult){
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public IntersectionSignalStatus getMessage() {
        return message;
    }

    public IntersectionSignalStatusTestResult getTestResult() {
        return testResult;
    }

    // Set functions
    public void setMessage(IntersectionSignalStatus message) {
        this.message = message;
    }

    public void setTestResult(IntersectionSignalStatusTestResult testResult) {
        this.testResult = testResult;
    }
}
