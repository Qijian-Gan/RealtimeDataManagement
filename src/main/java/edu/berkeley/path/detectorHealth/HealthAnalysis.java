package edu.berkeley.path.detectorHealth;

import edu.berkeley.path.objects.DetectorHealthMetrics;
import edu.berkeley.path.settings.DetectorHealthThresholds;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class HealthAnalysis {

    public static DetectorHealthMetrics checkDetectorHealthByDetectorByDay(String orgId, int stationId, int detectorId, Date date
            ,int interval, double [][] measurements, int numOfLanes, DetectorHealthThresholds detectorHealthThresholds) throws ParseException {
        // This function is used to check the detector health by day and detector

        // Note: the input measurements should be "rows" with unique times
        // measurements: time, flow, occupancy, speed
        // healthThreshold: predefined health threshold

        // Check missing rate
        double missingRate=checkMissingRate(interval,measurements);

        // Check high value rate
        double highValueRate=checkHighValueRate(interval, detectorHealthThresholds.getHighFlowValue(), numOfLanes, measurements);

        // Check constant or not
        int constantOrNot=checkConstantOrNot(measurements);

        // Check max length of zero values
        double maxLengthZeroValues=checkMaxLengthZeroValues(interval,detectorHealthThresholds.getStartTime(),
                detectorHealthThresholds.getEndTime(),measurements);

        // Check inconsistency rate (between flow and occupancy
        double inconsisRate=checkInconsisRateWithoutSpeed(interval, measurements);

        // Determine whether a detector is good or bad
        int health=determineGoodOrBad(detectorHealthThresholds, missingRate,highValueRate,constantOrNot,maxLengthZeroValues,inconsisRate);

        // Update and return the health metrics
        DetectorHealthMetrics detectorHealthMetrics= new DetectorHealthMetrics();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1; // Starts from zero
        int day=calendar.get(Calendar.DAY_OF_MONTH);// Starts from 1
        detectorHealthMetrics.Initialization(orgId,stationId,detectorId,date.getTime(),year,month,day,health,interval,numOfLanes
            ,detectorHealthThresholds,missingRate,maxLengthZeroValues,highValueRate,constantOrNot,inconsisRate);

        // Return the metrics
        return detectorHealthMetrics;
    }

    public static int determineGoodOrBad(DetectorHealthThresholds healthThreshold, double missingRate, double highValueRate,
                                         double constantOrNot, double maxLengthZeroValues, double inconsisRate){
        // This function is used to determine whether a detector is good or bad

        // First assume it is good
        int health=1;
        // Determine it is good or bad
        if(missingRate>healthThreshold.getMissingRateThreshold() || // High missing rate
                highValueRate>healthThreshold.getHighValueRateThreshold()|| // High rate of high values
                constantOrNot==1 || // Constant values
                maxLengthZeroValues>healthThreshold.getMaxZeroValueThreshold()|| // Long period with zero values
                inconsisRate>healthThreshold.getInconsisRateWithoutSpeedThreshold()){ // High inconsistency rate between flow and occupancy
            health=0; // Set to bad
        }
        return health;
    }

    public static double checkInconsisRateWithoutSpeed(int interval, double [][] measurements){
        // This function is used to check the inconsistency rate between flow and occupancy

        // Note: the input measurements should be "rows" with unique times
        // measurements: time, flow, occupancy, speed
        int numOfInterval=24*3600/interval; // Get the number of intervals;

        int numOfInconsisData=0;
        for (int i=0;i<measurements.length;i++){
            if(measurements[i][1]>0 && measurements[i][2]==0){ // Flow>0 but Occ=0
                numOfInconsisData=numOfInconsisData+1;
            }
        }

        double inconsisRate=numOfInconsisData*1.0/numOfInterval*100;
        return inconsisRate;
    }

    public static double checkMaxLengthZeroValues(int interval, double startTimeInHour, double endTimeInHour, double [][] measurements){
        // This function is used to check the maximum length of zero values

        // Note: the input measurements should be "rows" with unique times
        // measurements: time, flow, occupancy, speed
        double maxLengthZeroValues=0;

        //Note: this time period is configurable to consider minor streets may have zero flows during midnight
        double startTime=startTimeInHour*3600;
        double endTime=endTimeInHour*3600;

        double curZeroLength=0; // Set the current zero-length to be zero
        for (int i=0;i<measurements.length;i++){ // Loop for each row
            if(measurements[i][0]>=startTime && measurements[i][0]<endTime){ // If it is within the defined time duration
                if(measurements[i][1]==0 && measurements[i][2]==0){ // All zeros: only check flow and occ
                    curZeroLength=curZeroLength+1; // Add one
                }else{
                    if(curZeroLength>=maxLengthZeroValues){ // Assign the value to maxLengthZeroValues
                        maxLengthZeroValues=curZeroLength;
                    }
                    curZeroLength=0; //Reset to zero
                }
            }
        }
        // If is possible that the values are all zero during the selected time period
        if(curZeroLength>=maxLengthZeroValues){
            maxLengthZeroValues=curZeroLength;
        }

        double maxLengthZeroValuesByHour=maxLengthZeroValues*interval/3600.0;
        return maxLengthZeroValuesByHour;
    }

    public static int checkConstantOrNot(double [][] measurements){
        // THis function is used to check the input measurements are constant or not

        // Note: the input measurements should be "rows" with unique times
        // Only check flow and occupancy
        // measurements: time, flow, occupancy, speed
        int constantOrNot=0;

        // Get the means of flow and occupancy
        double meanFlow=0;
        double meanOcc=0;
        for (int i=0;i<measurements.length;i++){
            meanFlow=meanFlow+measurements[i][1]*1.0/measurements.length;
            meanOcc=meanOcc+measurements[i][2]*1.0/measurements.length;
        }

        // Get the std of flow and occupancy
        double devFlow=0;
        double devOcc=0;
        for (int i=0;i<measurements.length;i++){
            devFlow=devFlow+(measurements[i][1]-meanFlow)*(measurements[i][1]-meanFlow)*1.0/(measurements.length-1);
            devOcc=devOcc+(measurements[i][2]-meanOcc)*(measurements[i][2]-meanOcc)*1.0/(measurements.length-1);
        }
        double stdFlow=Math.sqrt(devFlow);
        double stdOcc=Math.sqrt(devOcc);

        // Check whether it is constant or not
        if((meanFlow>=0 && stdFlow==0)||(meanOcc>=0 && stdOcc==0)){ // if one of measurements is constant
            if(meanFlow+meanOcc>0){ // If they are not all empty
                constantOrNot=1;
            }
        }
        return constantOrNot;

    }

    public static double checkHighValueRate(int interval, double flowThreshold, int numOfLane,double[][] measurements){
        // This function is used to check the high value rate

        // Note: the input measurements should be "rows" with unique times
        // measurements: time (in seconds), flow, occupancy, speed
        int numOfInterval=24*3600/interval; // Get the number of intervals;

        // Get the number of high values
        int curHighValueNumber=0;
        for (int i=0;i<measurements.length; i++){
            if(measurements[i][1]>flowThreshold*numOfLane){
                curHighValueNumber=curHighValueNumber+1;
            }
        }

        double highValueRate=curHighValueNumber*100.0/numOfInterval;
        return highValueRate;
    }

    public static double checkMissingRate(int interval, double [][] measurements){
        // This function is used to check the daily data missing rate

        // Note: the input measurements should be "rows" with unique times
        // measurements: time (in seconds), flow, occupancy, speed
        int numOfInterval=24*3600/interval; // Get the number of intervals;
        int curNumOfInterval=measurements.length; // Get the current number of intervals

        double missingRate= Math.max(0,(numOfInterval-curNumOfInterval)*100.0/numOfInterval); // Avoid negative values
        return missingRate;
    }


}
