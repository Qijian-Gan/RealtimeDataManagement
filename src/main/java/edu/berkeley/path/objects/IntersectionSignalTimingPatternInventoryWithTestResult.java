package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.SignalPlanInventory.IntersectionSignalTimingPatternInventoryTestResult;
import org.tmdd._303.messages.IntersectionSignalTimingPatternInventory;

public class IntersectionSignalTimingPatternInventoryWithTestResult {

    private IntersectionSignalTimingPatternInventory message;
    private IntersectionSignalTimingPatternInventoryTestResult testResult;

    public IntersectionSignalTimingPatternInventoryWithTestResult(IntersectionSignalTimingPatternInventory _message,
                                                                  IntersectionSignalTimingPatternInventoryTestResult _testResult){
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public IntersectionSignalTimingPatternInventory getMessage() {
        return message;
    }

    public IntersectionSignalTimingPatternInventoryTestResult getTestResult() {
        return testResult;
    }

    // Set functions
    public void setMessage(IntersectionSignalTimingPatternInventory message) {
        this.message = message;
    }

    public void setTestResult(IntersectionSignalTimingPatternInventoryTestResult testResult) {
        this.testResult = testResult;
    }
}
