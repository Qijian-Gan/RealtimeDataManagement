package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.SignalInventory.IntersectionSignalInventoryTestResult;
import org.tmdd._303.messages.IntersectionSignalInventory;

public class IntersectionSignalInventoryWithTestResult {

    private IntersectionSignalInventory message;
    private IntersectionSignalInventoryTestResult testResult;

    public IntersectionSignalInventoryWithTestResult(IntersectionSignalInventory _message,
                                                    IntersectionSignalInventoryTestResult _testResult){
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public IntersectionSignalInventory getMessage() {
        return message;
    }

    public IntersectionSignalInventoryTestResult getTestResult() {
        return testResult;
    }

    // Set functions
    public void setMessage(IntersectionSignalInventory message) {
        this.message = message;
    }

    public void setTestResult(IntersectionSignalInventoryTestResult testResult) {
        this.testResult = testResult;
    }
}
