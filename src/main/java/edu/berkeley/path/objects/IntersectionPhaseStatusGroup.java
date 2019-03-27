package edu.berkeley.path.objects;

import org.tmdd._303.messages.IntersectionSignalPhaseStatusGroup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionPhaseStatusGroup {

    private Map<Integer,Integer> phaseGreens; // <Phase ID, Status(Active/Inactive)>
    private Map<Integer,Integer> phaseYellows; // <Phase ID, Status(Active/Inactive)>
    private Map<Integer,Integer> phaseReds; // <Phase ID, Status(Active/Inactive)>

    // Get functions
    public Map<Integer, Integer> getPhaseGreens() {
        return phaseGreens;
    }

    public Map<Integer, Integer> getPhaseYellows() {
        return phaseYellows;
    }

    public Map<Integer, Integer> getPhaseReds() {
        return phaseReds;
    }

    // Set functions
    public void setPhaseGreens(Map<Integer, Integer> phaseGreens) {
        this.phaseGreens = phaseGreens;
    }

    public void setPhaseYellows(Map<Integer, Integer> phaseYellows) {
        this.phaseYellows = phaseYellows;
    }

    public void setPhaseReds(Map<Integer, Integer> phaseReds) {
        this.phaseReds = phaseReds;
    }

    // Initialization
    public void initialization(){
        phaseGreens=new HashMap<>();
        phaseYellows=new HashMap<>();
        phaseReds=new HashMap<>();
    }

    // Update the phase group status
    public void update(List<IntersectionSignalPhaseStatusGroup> intersectionSignalPhaseStatusGroupList){

        for(int i=0;i<intersectionSignalPhaseStatusGroupList.size();i++){
            int groupId=intersectionSignalPhaseStatusGroupList.get(i).getPhaseStatusGroupNumber();
            // Green status
            int greenStatus=intersectionSignalPhaseStatusGroupList.get(i).getPhaseStatusGroupGreens();
            String greenStatusStr=Integer.toBinaryString(greenStatus);
            updateGreenStatus(groupId,greenStatusStr);
            // Yellow status
            if(intersectionSignalPhaseStatusGroupList.get(i).getPhaseStatusGroupYellows()!=null) {
                int yellowStatus = intersectionSignalPhaseStatusGroupList.get(i).getPhaseStatusGroupYellows();
                String yellowStatusStr = Integer.toBinaryString(yellowStatus);
                updateYellowStatus(groupId, yellowStatusStr);
            }
            // Red status
            if(intersectionSignalPhaseStatusGroupList.get(i).getPhaseStatusGroupReds()!=null) {
                int redStatus = intersectionSignalPhaseStatusGroupList.get(i).getPhaseStatusGroupReds();
                String redStatusStr = Integer.toBinaryString(redStatus);
                updateRedStatus(groupId, redStatusStr);
            }
        }
    }

    private void updateGreenStatus(int groupId,String status){
        // Update the green status for the phases

        for(int i=0;i<status.length();i++){
            if(status.charAt(status.length()-i-1)=='0'){
                phaseGreens.put((groupId-1)*8+i+1,0);
            }else{
                phaseGreens.put((groupId-1)*8+i+1,1);
            }
        }
        if(status.length()<8){
            for(int i=status.length();i<8;i++){
                int phaseId=(groupId-1)*8+i+1;
                int activeOrNot=0;
                phaseGreens.put(phaseId,activeOrNot);
            }
        }
    }

    private void updateYellowStatus(int groupId,String status){
        // Update the yellow status for the phases

        for(int i=0;i<status.length();i++){
            if(status.charAt(status.length()-i-1)=='0'){
                phaseYellows.put((groupId-1)*8+i+1,0);
            }else{
                phaseYellows.put((groupId-1)*8+i+1,1);
            }
        }
        if(status.length()<8){
            for(int i=status.length();i<8;i++){
                int phaseId=(groupId-1)*8+i+1;
                int activeOrNot=0;
                phaseYellows.put(phaseId,activeOrNot);
            }
        }
    }

    private void updateRedStatus(int groupId,String status){
        // Update the red status for the phases

        for(int i=0;i<status.length();i++){
            if(status.charAt(status.length()-i-1)=='0'){
                phaseReds.put((groupId-1)*8+i+1,0);
            }else{
                phaseReds.put((groupId-1)*8+i+1,1);
            }
        }
        if(status.length()<8){
            for(int i=status.length();i<8;i++){
                int phaseId=(groupId-1)*8+i+1;
                int activeOrNot=0;
                phaseReds.put(phaseId,activeOrNot);
            }
        }
    }

}
