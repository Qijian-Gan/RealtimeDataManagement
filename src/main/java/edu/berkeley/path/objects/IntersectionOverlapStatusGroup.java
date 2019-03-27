package edu.berkeley.path.objects;

import org.tmdd._303.messages.IntersectionSignalOverlapStatusGroup;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOverlapStatusGroup {

    private Map<Integer,Integer> overlapGreens; // <Overlap ID, Status(Active/Inactive)>
    private Map<Integer,Integer> overlapYellows; // <Overlap ID, Status(Active/Inactive)>
    private Map<Integer,Integer> overlapReds; // <Overlap ID, Status(Active/Inactive)>

    // Get functions
    public Map<Integer, Integer> getOverlapGreens() {
        return overlapGreens;
    }

    public Map<Integer, Integer> getOverlapYellows() {
        return overlapYellows;
    }

    public Map<Integer, Integer> getOverlapReds() {
        return overlapReds;
    }

    // Set functions
    public void setOverlapGreens(Map<Integer, Integer> overlapGreens) {
        this.overlapGreens = overlapGreens;
    }

    public void setOverlapYellows(Map<Integer, Integer> overlapYellows) {
        this.overlapYellows = overlapYellows;
    }

    public void setOverlapReds(Map<Integer, Integer> overlapReds) {
        this.overlapReds = overlapReds;
    }

    // Initialization
    public void initialization(){
        overlapGreens=new HashMap<>();
        overlapYellows=new HashMap<>();
        overlapReds=new HashMap<>();
    }

    // Update the overlap phase status
    public void update(List<IntersectionSignalOverlapStatusGroup> intersectionSignalOverlapStatusGroupList){

        for(int i=0;i<intersectionSignalOverlapStatusGroupList.size();i++){
            int groupId=intersectionSignalOverlapStatusGroupList.get(i).getOverlapStatusGroupNumber();
            // Green status
            int greenStatus=intersectionSignalOverlapStatusGroupList.get(i).getOverlapStatusGroupGreens();
            String greenStatusStr=Integer.toBinaryString(greenStatus);
            updateGreenStatus(groupId, greenStatusStr);
            // Yellow status
            if(intersectionSignalOverlapStatusGroupList.get(i).getOverlapStatusGroupYellows()!=null) {
                int yellowStatus = intersectionSignalOverlapStatusGroupList.get(i).getOverlapStatusGroupYellows();
                String yellowStatusStr = Integer.toBinaryString(yellowStatus);
                updateYellowStatus(groupId, yellowStatusStr);
            }
            // Red status
            if(intersectionSignalOverlapStatusGroupList.get(i).getOverlapStatusGroupReds()!=null) {
                int redStatus = intersectionSignalOverlapStatusGroupList.get(i).getOverlapStatusGroupReds();
                String redStatusStr = Integer.toBinaryString(redStatus);
                updateRedStatus(groupId, redStatusStr);
            }
        }
    }

    private void updateGreenStatus(int groupId, String status){
        // Update the green status for the overlap phases
        for(int i=0;i<status.length();i++){
            if(status.charAt(status.length()-i-1)=='0'){
                overlapGreens.put((groupId-1)*8+i+1,0);
            }else{
                overlapGreens.put((groupId-1)*8+i+1,1);
            }
        }
        if(status.length()<8){
            for(int i=status.length();i<8;i++){
                int phaseId=(groupId-1)*8+i+1;
                int activeOrNot=0;
                overlapGreens.put(phaseId,activeOrNot);
            }
        }
    }

    private void updateYellowStatus(int groupId, String status){
        // Update the yellow status for the overlap phases
        for(int i=0;i<status.length();i++){
            if(status.charAt(status.length()-i-1)=='0'){
                overlapYellows.put((groupId-1)*8+i+1,0);
            }else{
                overlapYellows.put((groupId-1)*8+i+1,1);
            }
        }
        if(status.length()<8){
            for(int i=status.length();i<8;i++){
                int phaseId=(groupId-1)*8+i+1;
                int activeOrNot=0;
                overlapYellows.put(phaseId,activeOrNot);
            }
        }
    }

    private void updateRedStatus(int groupId, String status){
        // Update the red status for the overlap phases
        for(int i=0;i<status.length();i++){
            if(status.charAt(status.length()-i-1)=='0'){
                overlapReds.put((groupId-1)*8+i+1,0);
            }else{
                overlapReds.put((groupId-1)*8+i+1,1);
            }
        }
        if(status.length()<8){
            for(int i=status.length();i<8;i++){
                int phaseId=(groupId-1)*8+i+1;
                int activeOrNot=0;
                overlapReds.put(phaseId,activeOrNot);
            }
        }
    }

}
