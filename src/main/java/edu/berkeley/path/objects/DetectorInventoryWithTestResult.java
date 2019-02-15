package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.DetectorInventory.DetectorInventoryTestResult;
import org.tmdd._303.messages.DetectorInventory;

public class DetectorInventoryWithTestResult {

    private DetectorInventory message;
    private DetectorInventoryTestResult testResult;

    public DetectorInventoryWithTestResult(DetectorInventory _message, DetectorInventoryTestResult _testResult){
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public DetectorInventory getMessage() {
        return message;
    }

    public DetectorInventoryTestResult getTestResult() {
        return testResult;
    }

    // Set functions
    public void setMessage(DetectorInventory message) {
        this.message = message;
    }

    public void setTestResult(DetectorInventoryTestResult testResult) {
        this.testResult = testResult;
    }
}
