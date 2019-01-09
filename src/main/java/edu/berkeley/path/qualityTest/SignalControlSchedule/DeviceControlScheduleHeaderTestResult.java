package edu.berkeley.path.qualityTest.SignalControlSchedule;

import org.tmdd._303.messages.DeviceControlScheduleHeader;

public class DeviceControlScheduleHeaderTestResult {

    private boolean isOrganizationInformationExist;
    private boolean isOrganizationIdValid;
    private boolean isDeviceIdValid;
    private boolean isTimeBaseScheduleNumberValid;
    private boolean isTimeBaseScheduleMonthValid;
    private boolean isTimeBaseScheduleDayValid;
    private boolean isTimeBaseScheduleDateValid;
    private boolean isTimeBaseScheduleDayPlanValid;
    private boolean isDayPlanHourValid;
    private boolean isDayPlanMinuteValid;
    private boolean isLastUpdateTimeValid;
    private String errorMessages;

    // Get functions
    public boolean isOrganizationInformationExist() {
        return isOrganizationInformationExist;
    }

    public boolean isOrganizationIdValid() {
        return isOrganizationIdValid;
    }

    public boolean isDeviceIdValid() {
        return isDeviceIdValid;
    }

    public boolean isTimeBaseScheduleNumberValid() {
        return isTimeBaseScheduleNumberValid;
    }

    public boolean isTimeBaseScheduleMonthValid() {
        return isTimeBaseScheduleMonthValid;
    }

    public boolean isTimeBaseScheduleDayValid() {
        return isTimeBaseScheduleDayValid;
    }

    public boolean isTimeBaseScheduleDateValid() {
        return isTimeBaseScheduleDateValid;
    }

    public boolean isTimeBaseScheduleDayPlanValid() {
        return isTimeBaseScheduleDayPlanValid;
    }

    public boolean isDayPlanHourValid() {
        return isDayPlanHourValid;
    }

    public boolean isDayPlanMinuteValid() {
        return isDayPlanMinuteValid;
    }

    public boolean isLastUpdateTimeValid() {
        return isLastUpdateTimeValid;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    // Set functions
    public void setOrganizationInformationExist(boolean organizationInformationExist) {
        isOrganizationInformationExist = organizationInformationExist;
    }

    public void setOrganizationIdValid(boolean organizationIdValid) {
        isOrganizationIdValid = organizationIdValid;
    }

    public void setDeviceIdValid(boolean deviceIdValid) {
        isDeviceIdValid = deviceIdValid;
    }

    public void setTimeBaseScheduleNumberValid(boolean timeBaseScheduleNumberValid) {
        isTimeBaseScheduleNumberValid = timeBaseScheduleNumberValid;
    }

    public void setTimeBaseScheduleMonthValid(boolean timeBaseScheduleMonthValid) {
        isTimeBaseScheduleMonthValid = timeBaseScheduleMonthValid;
    }

    public void setTimeBaseScheduleDayValid(boolean timeBaseScheduleDayValid) {
        isTimeBaseScheduleDayValid = timeBaseScheduleDayValid;
    }

    public void setTimeBaseScheduleDateValid(boolean timeBaseScheduleDateValid) {
        isTimeBaseScheduleDateValid = timeBaseScheduleDateValid;
    }

    public void setTimeBaseScheduleDayPlanValid(boolean timeBaseScheduleDayPlanValid) {
        isTimeBaseScheduleDayPlanValid = timeBaseScheduleDayPlanValid;
    }

    public void setDayPlanHourValid(boolean dayPlanHourValid) {
        isDayPlanHourValid = dayPlanHourValid;
    }

    public void setDayPlanMinuteValid(boolean dayPlanMinuteValid) {
        isDayPlanMinuteValid = dayPlanMinuteValid;
    }

    public void setLastUpdateTimeValid(boolean lastUpdateTimeValid) {
        isLastUpdateTimeValid = lastUpdateTimeValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    // Initialization
    public void Initialization(){
        isOrganizationInformationExist=true;
        isOrganizationIdValid=true;
        isDeviceIdValid=true;
        isTimeBaseScheduleNumberValid=true;
        isTimeBaseScheduleMonthValid=true;
        isTimeBaseScheduleDayValid=true;
        isTimeBaseScheduleDateValid=true;
        isTimeBaseScheduleDayPlanValid=true;
        isDayPlanHourValid=true;
        isDayPlanMinuteValid=true;
        isLastUpdateTimeValid=true;
        errorMessages="";
    }

    // Check each element
    public void Check(DeviceControlScheduleHeader deviceControlScheduleHeader){

        // Organization Information
        if(deviceControlScheduleHeader.getOrganizationInformation()==null){
            isOrganizationInformationExist=false;
            isOrganizationIdValid=false;
            errorMessages+="Empty organization information;";
        }else{
            if(deviceControlScheduleHeader.getOrganizationInformation().getOrganizationId()==null){
                isOrganizationIdValid=false;
                errorMessages+="Empty organization id;";
            }
        }

        // Device ID
        if(deviceControlScheduleHeader.getDeviceId()==null){
            isDeviceIdValid=false;
            errorMessages+="Empty device Id;";
        }

        // Time Base Schedule Number
        if(deviceControlScheduleHeader.getTimeBaseScheduleNumber()<0 ||
                deviceControlScheduleHeader.getTimeBaseScheduleNumber()>65535){
            isTimeBaseScheduleNumberValid=false;
            errorMessages+="Time base schedule number invalid;";
        }

        // Time Base Schedule Month
        if(deviceControlScheduleHeader.getTimeBaseScheduleMonth()<0 ||
                deviceControlScheduleHeader.getTimeBaseScheduleMonth()>65535){
            isTimeBaseScheduleMonthValid=false;
            errorMessages+="Time base schedule month invalid;";
        }

        // Time Base Schedule Day
        if(deviceControlScheduleHeader.getTimeBaseScheduleDay()<0 ||
                deviceControlScheduleHeader.getTimeBaseScheduleDay()>255){
            isTimeBaseScheduleDayValid=false;
            errorMessages+="Time base schedule day invalid;";
        }

        // Time Base Schedule Date
        if(deviceControlScheduleHeader.getTimeBaseScheduleDate()<0 ||
                deviceControlScheduleHeader.getTimeBaseScheduleDate()>4294967295L){
            isTimeBaseScheduleDateValid=false;
            errorMessages+="Time base schedule date invalid;";
        }

        // Time Base Schedule Day Plan
        if(deviceControlScheduleHeader.getTimeBaseScheduleDayPlan()<0||
                deviceControlScheduleHeader.getTimeBaseScheduleDayPlan()>255){
            isTimeBaseScheduleDayPlanValid=false;
            errorMessages+="Time base schedule day plan invalid;";
        }

        // Day Plan Hour
        if(deviceControlScheduleHeader.getDayPlanHour()<0||
                deviceControlScheduleHeader.getDayPlanHour()>23){
            isDayPlanHourValid=false;
            errorMessages+="Day plan hour invalid;";
        }

        // Day Plan Minute
        if(deviceControlScheduleHeader.getDayPlanMinute()<0||
                deviceControlScheduleHeader.getDayPlanMinute()>59){
            isDayPlanMinuteValid=false;
            errorMessages+="Day plan minute invalid;";
        }

        // Last Update Time
        if(deviceControlScheduleHeader.getLastUpdateTime()==null){
            isLastUpdateTimeValid=false;
            errorMessages+="Empty last update time;";
        }else{
            if(deviceControlScheduleHeader.getLastUpdateTime().getDate()==null){
                isLastUpdateTimeValid=false;
                errorMessages+="Last update time invalid: empty date;";
            }
            if(deviceControlScheduleHeader.getLastUpdateTime().getTime()==null){
                isLastUpdateTimeValid=false;
                errorMessages+="Last update time invalid: empty time;";
            }
        }

    }

}
