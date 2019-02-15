package edu.berkeley.path.objects;

import com.mongodb.BasicDBObject;
import org.bson.BsonDateTime;
import org.tmdd._303.messages.DetectorData;
import org.tmdd._303.messages.DetectorDataDetail;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import edu.berkeley.path.util.DateTimeConversion;

public class DetectorDataIndividual {
    // This is a new structure for individual detector data

    private String organizationId;
    private String stationId;
    private String detectorId;
    private Date detectionTimeStamp;
    private Date startTimeStamp;
    private int startDate; // YYYYMMDD
    private int startTime; //HHMMSSXXXX
    private Date endTimeStamp;
    private int endDate; // YYYYMMDD
    private int endTime; //HHMMSSXXXX
    private String detectorDataType;
    private String detectorStatus;
    private double vehicleCount;
    private double vehicleOccupancy;
    private double vehicleSpeed;
    // Note that: currently do not use queue length and vehicle stops

    public DetectorDataIndividual(String _organizationId, String _stationId, String _detectorId, Date _detectionTimeStamp,
                                  Date _startTimeStamp,int _startDate, int _startTime, Date _endTimeStamp,
                                  int _endDate, int _endTime, String _detectorDataType, String _detectorStatus,
                                  double _vehicleCount, double _vehicleOccupancy, double _vehicleSpeed){
        this.organizationId=_organizationId;
        this.stationId=_stationId;
        this.detectorId=_detectorId;
        this.detectionTimeStamp=_detectionTimeStamp;
        this.startTimeStamp=_startTimeStamp;
        this.startDate=_startDate;
        this.startTime=_startTime;
        this.endTimeStamp=_endTimeStamp;
        this.endDate=_endDate;
        this.endTime=_endTime;
        this.detectorDataType=_detectorDataType;
        this.detectorStatus=_detectorStatus;
        this.vehicleCount=_vehicleCount;
        this.vehicleOccupancy=_vehicleOccupancy;
        this.vehicleSpeed=_vehicleSpeed;
    }

    // Get functions
    public String getOrganizationId() {
        return organizationId;
    }

    public String getStationId() {
        return stationId;
    }

    public String getDetectorId() {
        return detectorId;
    }

    public Date getDetectionTimeStamp() {
        return detectionTimeStamp;
    }

    public Date getStartTimeStamp() {
        return startTimeStamp;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getStartTime() {
        return startTime;
    }

    public Date getEndTimeStamp() {
        return endTimeStamp;
    }

    public int getEndDate() {
        return endDate;
    }

    public int getEndTime() {
        return endTime;
    }

    public double getVehicleCount() {
        return vehicleCount;
    }

    public double getVehicleOccupancy() {
        return vehicleOccupancy;
    }

    public double getVehicleSpeed() {
        return vehicleSpeed;
    }

    public String getDetectorDataType() {
        return detectorDataType;
    }

    public String getDetectorStatus() {
        return detectorStatus;
    }

    // Set functions
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    public void setDetectionTimeStamp(Date detectionTimeStamp) {
        this.detectionTimeStamp = detectionTimeStamp;
    }

    public void setDetectorDataType(String detectorDataType) {
        this.detectorDataType = detectorDataType;
    }

    public void setDetectorStatus(String detectorStatus) {
        this.detectorStatus = detectorStatus;
    }

    public void setStartTimeStamp(Date startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTimeStamp(Date endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void setVehicleCount(double vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public void setVehicleOccupancy(double vehicleOccupancy) {
        this.vehicleOccupancy = vehicleOccupancy;
    }

    public void setVehicleSpeed(double vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }


    public static List<DetectorDataIndividual> constructIndividualDetectorData(DetectorData detectorData) throws ParseException {

        List<DetectorDataIndividual> detectorDataIndividualList=new ArrayList<DetectorDataIndividual>();

        List<DetectorDataDetail> detectorDataDetailList=detectorData.getDetectorDataList().getDetectorDataDetail();
        String organizationId=detectorData.getOrganizationInformation().getOrganizationId();
        for(int i=0;i<detectorDataDetailList.size();i++){
            String stationId=detectorDataDetailList.get(i).getStationId();
            String detectorId=detectorDataDetailList.get(i).getDetectorId();

            String detectionDate=detectorDataDetailList.get(i).getDetectionTimeStamp().getDate();
            String detectionTime=detectorDataDetailList.get(i).getDetectionTimeStamp().getTime();
            Date detectionTimeStamp=DateTimeConversion.TMDDDateTimeToRegularDateTime(detectionDate,detectionTime);

            Date startTimeStamp=DateTimeConversion.TMDDDateTimeToRegularDateTime(detectorDataDetailList.get(i).getStartTime().getDate(),
                    detectorDataDetailList.get(i).getStartTime().getTime());
            int startDate=Integer.parseInt(detectorDataDetailList.get(i).getStartTime().getDate());
            int startTime=Integer.parseInt(detectorDataDetailList.get(i).getStartTime().getTime());

            Date endTimeStamp=DateTimeConversion.TMDDDateTimeToRegularDateTime(detectorDataDetailList.get(i).getEndTime().getDate(),
                    detectorDataDetailList.get(i).getEndTime().getTime());
            int endDate=Integer.parseInt(detectorDataDetailList.get(i).getEndTime().getDate());
            int endTime=Integer.parseInt(detectorDataDetailList.get(i).getEndTime().getTime());

            String detectorDataType=detectorDataDetailList.get(i).getDetectorDataType();
            String detectorStatus=detectorDataDetailList.get(i).getDetectorStatus();

            double vehicleCount=detectorDataDetailList.get(i).getVehicleCount();
            double vehicleOccupancy=detectorDataDetailList.get(i).getVehicleOccupancy();
            double vehicleSpeed=detectorDataDetailList.get(i).getVehicleSpeed();

            DetectorDataIndividual detectorDataIndividual=new DetectorDataIndividual(organizationId, stationId, detectorId,
                    detectionTimeStamp,startTimeStamp, startDate, startTime,endTimeStamp,endDate,endTime, detectorDataType,
                    detectorStatus, vehicleCount,vehicleOccupancy,vehicleSpeed);
            detectorDataIndividualList.add(detectorDataIndividual);
        }

        return detectorDataIndividualList;
    }
}
