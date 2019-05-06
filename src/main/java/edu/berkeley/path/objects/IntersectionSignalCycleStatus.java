package edu.berkeley.path.objects;

import com.fasterxml.jackson.core.type.TypeReference;
import edu.berkeley.path.util.JsonUtil;
import org.bson.Document;
import org.tmdd._303.messages.IntersectionSignalSequenceData;
import org.tmdd._303.messages.IntersectionSignalTPInventoryPhase;
import org.tmdd._303.messages.IntersectionSignalTimingPatternInventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionSignalCycleStatus {

    // Keys/Indexes
    private String organizationId;
    private String deviceId;
    private String timingPatternId;
    private String timingPatternName;
    private long cycleStartTime;
    private long cycleEndTime;
    // This tells you which phase ids we use as a reference point to start the search for a new cycle
    private List<Integer> referencePhaseIDs;
    private boolean validOrNot;

    //*****************Inventory Information**************************
    // Cycle length & Offset
    private double plannedCycleLength;
    private double plannedOffset;
    // Phase Sequence Information in a ring
    private List<IntersectionSignalSequenceData> sequenceDataList;
    // Inventory phase splits
    private List<IntersectionSignalTPInventoryPhase> phaseTPList;
    // Duplicated information, but easier to use
    private Map<Integer,IntersectionPhaseStatus> plannedPhaseList;

    //*****************Actual Information**************************
    // Status
    private String deviceStatus;
    private String deviceCommStatus;
    private String signalControlSource;
    private String plannedSignalTimingMode;
    private String currentSignalTimingMode;
    // Cycle and Offset
    private double actualCycleLength;
    private double actualOffset;
    private String offsetReference;
    // Phases
    // <Phase ID, <IntersectionPhaseStatus>>
    private Map<Integer,IntersectionPhaseStatus> actualPhaseList;
    // Phase gap out, max out, and forced off status
    // <Phase ID, True/False>
    private Map<Integer,Boolean> isGapOut;
    private Map<Integer,Boolean> isMaxOut;
    private Map<Integer,Boolean> isForcedOff;

    // Get functions
    public String getOrganizationId() {
        return organizationId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getTimingPatternId() {
        return timingPatternId;
    }

    public String getTimingPatternName() {
        return timingPatternName;
    }

    public long getCycleStartTime() {
        return cycleStartTime;
    }

    public long getCycleEndTime() {
        return cycleEndTime;
    }

    public List<Integer> getReferencePhaseIDs() {
        return referencePhaseIDs;
    }

    public double getPlannedCycleLength() {
        return plannedCycleLength;
    }

    public double getPlannedOffset() {
        return plannedOffset;
    }

    public List<IntersectionSignalSequenceData> getSequenceDataList() {
        return sequenceDataList;
    }

    public List<IntersectionSignalTPInventoryPhase> getPhaseTPList() {
        return phaseTPList;
    }

    public Map<Integer, IntersectionPhaseStatus> getPlannedPhaseList() {
        return plannedPhaseList;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public String getDeviceCommStatus() {
        return deviceCommStatus;
    }

    public String getSignalControlSource() {
        return signalControlSource;
    }

    public String getPlannedSignalTimingMode() {
        return plannedSignalTimingMode;
    }

    public String getCurrentSignalTimingMode() {
        return currentSignalTimingMode;
    }

    public double getActualCycleLength() {
        return actualCycleLength;
    }

    public double getActualOffset() {
        return actualOffset;
    }

    public String getOffsetReference() {
        return offsetReference;
    }

    public Map<Integer, IntersectionPhaseStatus> getActualPhaseList() {
        return actualPhaseList;
    }

    public Map<Integer, Boolean> getIsGapOut() {
        return isGapOut;
    }

    public Map<Integer, Boolean> getIsMaxOut() {
        return isMaxOut;
    }

    public Map<Integer, Boolean> getIsForcedOff() {
        return isForcedOff;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    // Set functions
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setTimingPatternId(String timingPatternId) {
        this.timingPatternId = timingPatternId;
    }

    public void setTimingPatternName(String timingPatternName) {
        this.timingPatternName = timingPatternName;
    }

    public void setCycleStartTime(long cycleStartTime) {
        this.cycleStartTime = cycleStartTime;
    }

    public void setCycleEndTime(long cycleEndTime) {
        this.cycleEndTime = cycleEndTime;
    }

    public void setReferencePhaseIDs(List<Integer> referencePhaseIDs) {
        this.referencePhaseIDs = referencePhaseIDs;
    }

    public void setPlannedCycleLength(double plannedCycleLength) {
        this.plannedCycleLength = plannedCycleLength;
    }

    public void setPlannedOffset(double plannedOffset) {
        this.plannedOffset = plannedOffset;
    }

    public void setSequenceDataList(List<IntersectionSignalSequenceData> sequenceDataList) {
        this.sequenceDataList = sequenceDataList;
    }

    public void setPhaseTPList(List<IntersectionSignalTPInventoryPhase> phaseTPList) {
        this.phaseTPList = phaseTPList;
    }

    public void setPlannedPhaseList(Map<Integer, IntersectionPhaseStatus> plannedPhaseList) {
        this.plannedPhaseList = plannedPhaseList;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public void setDeviceCommStatus(String deviceCommStatus) {
        this.deviceCommStatus = deviceCommStatus;
    }

    public void setPlannedSignalTimingMode(String plannedSignalTimingMode) {
        this.plannedSignalTimingMode = plannedSignalTimingMode;
    }

    public void setCurrentSignalTimingMode(String currentSignalTimingMode) {
        this.currentSignalTimingMode = currentSignalTimingMode;
    }

    public void setSignalControlSource(String signalControlSource) {
        this.signalControlSource = signalControlSource;
    }

    public void setActualCycleLength(double actualCycleLength) {
        this.actualCycleLength = actualCycleLength;
    }

    public void setActualOffset(double actualOffset) {
        this.actualOffset = actualOffset;
    }

    public void setOffsetReference(String offsetReference) {
        this.offsetReference = offsetReference;
    }

    public void setActualPhaseList(Map<Integer, IntersectionPhaseStatus> actualPhaseList) {
        this.actualPhaseList = actualPhaseList;
    }

    public void setIsGapOut(Map<Integer, Boolean> isGapOut) {
        this.isGapOut = isGapOut;
    }

    public void setIsMaxOut(Map<Integer, Boolean> isMaxOut) {
        this.isMaxOut = isMaxOut;
    }

    public void setIsForcedOff(Map<Integer, Boolean> isForcedOff) {
        this.isForcedOff = isForcedOff;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void initialization(){
        organizationId=null;
        deviceId=null;
        timingPatternId=null;
        timingPatternName=null;
        cycleStartTime=-1;
        cycleEndTime=-1;
        referencePhaseIDs=null;
        validOrNot=true;

        plannedCycleLength=-1;
        plannedOffset=-1;
        sequenceDataList=null;
        phaseTPList=null;
        plannedPhaseList=null;

        deviceStatus=null;
        deviceCommStatus=null;
        signalControlSource=null;
        plannedSignalTimingMode=null;
        currentSignalTimingMode=null;

        actualCycleLength=-1;
        actualOffset=-1;
        offsetReference=null;

        actualPhaseList=null;
        isGapOut=null;
        isMaxOut=null;
        isForcedOff=null;
    }

    // Update inventory information
    public void updateInventoryInformation(Document document){

        // Serialize the document
        IntersectionSignalTimingPatternInventory intersectionSignalTimingPatternInventory= JsonUtil.serializer().fromJson
                (document.toJson(),new TypeReference<IntersectionSignalTimingPatternInventory>(){});

        // Set organization ID
        setOrganizationId(intersectionSignalTimingPatternInventory.getOrganizationInformation().getOrganizationId());

        // Set device ID
        setDeviceId(intersectionSignalTimingPatternInventory.getDeviceId());

        // Set timing pattern ID
        setTimingPatternId(intersectionSignalTimingPatternInventory.getTimingPatternId());

        // Set timing pattern name
        setTimingPatternName(intersectionSignalTimingPatternInventory.getTimingPatternName());

        // set planned cycle length
        setPlannedCycleLength(intersectionSignalTimingPatternInventory.getCycleLength());

        // set planned offset
        setPlannedOffset(intersectionSignalTimingPatternInventory.getOffsetTime());

        // set planned sequence data
        if(intersectionSignalTimingPatternInventory.getSequenceInformation()!=null){
            setSequenceDataList(intersectionSignalTimingPatternInventory.getSequenceInformation().getSequenceInformation());
        }

        // set planned phase TP List
        if(intersectionSignalTimingPatternInventory.getPhaseTpList()!=null){
            setPhaseTPList(intersectionSignalTimingPatternInventory.getPhaseTpList().getPhases());

            plannedPhaseList=new HashMap<>();
            actualPhaseList=new HashMap<>(); // Meanwhile, initialize the actual phase list
            for(int i=0;i<phaseTPList.size();i++){
                int phaseId=phaseTPList.get(i).getPhaseIdentifier();
                // Split= Green + Yellow + All Red
                double splitDuration=phaseTPList.get(i).getPhaseSplit();
                // The following are in 1/10 seconds
                double yellowDuration=phaseTPList.get(i).getVehicleClearanceDuration()/10.0;
                double redDuration=phaseTPList.get(i).getVehicleRedDuration()/10.0;
                double minGreen=phaseTPList.get(i).getMinimumGreenDuration()/10.0;
                double maxGreen=phaseTPList.get(i).getMaximumGreenDuration()/10.0;
                // Calculate the green duration
                double greenDuration=Math.max(0,splitDuration-yellowDuration-redDuration);
                String status="planned";
                IntersectionPhaseStatus intersectionPhaseStatus=new IntersectionPhaseStatus();
                intersectionPhaseStatus.setValues(phaseId, splitDuration,greenDuration, yellowDuration,redDuration,
                        minGreen,maxGreen,status,"");
                plannedPhaseList.put(phaseId,intersectionPhaseStatus);

                // Meanwhile, it is necessary to initialize the actual phase list (set to zeros)
                IntersectionPhaseStatus intersectionPhaseStatusActual=new IntersectionPhaseStatus();
                intersectionPhaseStatusActual.setValues(phaseId, 0,0, 0,0,
                        minGreen,maxGreen,"initialized","");
                actualPhaseList.put(phaseId,intersectionPhaseStatusActual);
            }
        }

    }

}
