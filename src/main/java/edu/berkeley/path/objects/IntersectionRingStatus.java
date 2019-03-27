package edu.berkeley.path.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionRingStatus {

    private boolean isForceOff; // Bit 5
    private boolean isMaxOut; // Bit 4
    private boolean isGapOut; // Bit 3
    // Bits 0 to 2
    private boolean isMinGreen; // 000
    private boolean isExtension; // 100
    private boolean isMaximun; // 010
    private boolean isGreenReset; // 110
    private boolean isYellowChange; // 001
    private boolean isRedClearance; // 101
    private boolean isRedReset; // 011
    private boolean isUndefined; // 111

    // Get functions
    public boolean isForceOff() {
        return isForceOff;
    }

    public boolean isMaxOut() {
        return isMaxOut;
    }

    public boolean isGapOut() {
        return isGapOut;
    }

    public boolean isMinGreen() {
        return isMinGreen;
    }

    public boolean isExtension() {
        return isExtension;
    }

    public boolean isMaximun() {
        return isMaximun;
    }

    public boolean isGreenReset() {
        return isGreenReset;
    }

    public boolean isYellowChange() {
        return isYellowChange;
    }

    public boolean isRedClearance() {
        return isRedClearance;
    }

    public boolean isRedReset() {
        return isRedReset;
    }

    public boolean isUndefined() {
        return isUndefined;
    }

    // Set functions
    public void setForceOff(boolean forceOff) {
        isForceOff = forceOff;
    }
    public void setMaxOut(boolean maxOut) {
        isMaxOut = maxOut;
    }

    public void setGapOut(boolean gapOut) {
        isGapOut = gapOut;
    }

    public void setMinGreen(boolean minGreen) {
        isMinGreen = minGreen;
    }

    public void setExtension(boolean extension) {
        isExtension = extension;
    }

    public void setMaximun(boolean maximun) {
        isMaximun = maximun;
    }

    public void setGreenReset(boolean greenReset) {
        isGreenReset = greenReset;
    }

    public void setYellowChange(boolean yellowChange) {
        isYellowChange = yellowChange;
    }

    public void setRedClearance(boolean redClearance) {
        isRedClearance = redClearance;
    }

    public void setRedReset(boolean redReset) {
        isRedReset = redReset;
    }

    public void setUndefined(boolean undefined) {
        isUndefined = undefined;
    }

    public void initialization(){
        this.isForceOff=false;
        this.isMaxOut=false;
        this.isGapOut=false;
        this.isMinGreen=false;
        this.isExtension=false;
        this.isMaximun=false;
        this.isGreenReset=false;
        this.isYellowChange=false;
        this.isRedClearance=false;
        this.isRedReset=false;
        this.isUndefined=false;
    }

    public void update(String binaryString){
        // This function is used to update the ring status.

        List<Character> bits= new ArrayList<>();

        for(int i=0;i<binaryString.length();i++){
            bits.add(binaryString.charAt(binaryString.length()-i-1));
        }
        if(bits.size()<8){
            for(int i=bits.size();i<8;i++){
                bits.add('0');
            }
        }

        // The first three bits
        // Minimum Green
        if(bits.get(0)=='0' && bits.get(1)=='0' && bits.get(2)=='0'){
            isMinGreen=true;
        }

        // Extension
        if(bits.get(0)=='1' && bits.get(1)=='0' && bits.get(2)=='0'){
            isExtension=true;
        }

        // Maximum
        if(bits.get(0)=='0' && bits.get(1)=='1' && bits.get(2)=='0'){
            isMaximun=true;
        }

        // Green Reset
        if(bits.get(0)=='1' && bits.get(1)=='1' && bits.get(2)=='0'){
            isGreenReset=true;
        }

        // Yellow Change
        if(bits.get(0)=='0' && bits.get(1)=='0' && bits.get(2)=='1'){
            isYellowChange=true;
        }

        // Red Clearance
        if(bits.get(0)=='1' && bits.get(1)=='0' && bits.get(2)=='1'){
            isRedClearance=true;
        }

        // Red Reset
        if(bits.get(0)=='0' && bits.get(1)=='1' && bits.get(2)=='1'){
            isRedReset=true;
        }

        // Undefined
        if(bits.get(0)=='1' && bits.get(1)=='1' && bits.get(2)=='1'){
            isUndefined=true;
        }

        // The rest 5 bits
        // Gap Out
        if(bits.get(3)=='1'){
            isGapOut=true;
        }

        // Max Out
        if(bits.get(4)=='1'){
            isMaxOut=true;
        }

        // Forced Off
        if(bits.get(5)=='1'){
            isForceOff=true;
        }

    }
}
