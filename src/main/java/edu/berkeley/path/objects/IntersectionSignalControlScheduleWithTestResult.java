package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.SignalControlSchedule.IntersectionSignalControlScheduleTestResult;
import org.tmdd._303.messages.IntersectionSignalControlSchedule;

public class IntersectionSignalControlScheduleWithTestResult {

    private IntersectionSignalControlSchedule message;
    private IntersectionSignalControlScheduleTestResult testResult;

    public IntersectionSignalControlScheduleWithTestResult(IntersectionSignalControlSchedule _message,
                                                           IntersectionSignalControlScheduleTestResult _testResult){
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public IntersectionSignalControlSchedule getMessage() {
        return message;
    }

    public IntersectionSignalControlScheduleTestResult getTestResult() {
        return testResult;
    }

    // Set functions
    public void setMessage(IntersectionSignalControlSchedule message) {
        this.message = message;
    }

    public void setTestResult(IntersectionSignalControlScheduleTestResult testResult) {
        this.testResult = testResult;
    }
}
