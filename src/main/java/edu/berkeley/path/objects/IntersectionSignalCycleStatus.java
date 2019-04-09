package edu.berkeley.path.objects;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class IntersectionSignalCycleStatus {

    // Keys/Indexes
    private String organizationId;
    private String deviceId;
    private String timingPatternId;
    private Date cycleStartTime;
    private Date cycleEndTime;

    // Cycle length & Offset
    private double actualCycleLength;
    private double plannedCycleLength;
    private double actualOffset;
    private double plannedOffset;

    // Phase Sequence Information by Ring <Ring Id, <Phase Sequence>>
    private Map<Integer,List<Integer>> phaseSequenceInformation;

    // Phase splits <Phase Id, <Green, Yellow, All red>>
    private Map<Integer, List<Double>> actualPhaseSplits;
    private Map<Integer, List<Double>> plannedPhaseSplits;

    // Phase gap out, max out, and forced off status
    



}
