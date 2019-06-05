package edu.berkeley.path.detectorHealth;

import edu.berkeley.path.settings.ImputationFilteringSettings;

import java.util.Arrays;

public class DataFiltering {

    public static double [][] smoothingData(double [][] dataInput,
                                            ImputationFilteringSettings imputationFilteringSettings){
        // This function is used to smooth the input data

        // dataInput: time, flow, occupancy, and speed
        // Create the same size of the matrix
        double [][] dataOutput= new double[dataInput.length][dataInput[0].length];

        // Check the smoothing method
        String methodSmoothing=imputationFilteringSettings.getMethodSmoothing();
        int spanForSmoothing=imputationFilteringSettings.getSpanSmoothing();
        if(methodSmoothing.equals("MovingAverage")){
            // Method: moving average
            if(spanForSmoothing>=dataInput.length){
                System.out.println("Span for moving average is longer than the array length!");
            }else{
                for(int i=0;i<dataInput.length;i++){ // Loop for all rows
                    dataOutput[i][0]=dataInput[i][0]; //Get the time stamps
                    if(i<spanForSmoothing){ // Less than the span
                        dataOutput[i][1]=dataInput[i][1];
                        dataOutput[i][2]=dataInput[i][2];
                        dataOutput[i][3]=dataInput[i][3];
                    }else{ // If longer than the span
                        // Select the data
                        double [] tmpFlow=fromMatrixToArrayByColumn(dataInput,1,i-spanForSmoothing,i-1);
                        double [] tmpOcc=fromMatrixToArrayByColumn(dataInput,2,i-spanForSmoothing,i-1);
                        double [] tmpSpeed=fromMatrixToArrayByColumn(dataInput,3,i-spanForSmoothing,i-1);

                        // Calculate the mean
                        dataOutput[i][1]=calculateMean(tmpFlow);
                        dataOutput[i][2]=calculateMean(tmpOcc);
                        dataOutput[i][3]=calculateMean(tmpSpeed);
                    }
                }
            }
        }else{
            // TODO: this part can be improved with more advanced functions in the future
            System.out.println("Unknown smoothing method!");
        }
        return dataOutput;
    }

    public static double[][] fillInMissingValues(double [][] dataInput, int interval,
                                                 ImputationFilteringSettings imputationFilteringSettings){
        // This function is used to fillInMissingValues

        // dataInput: Time,Flow,Occupancy,Speed (four columns);
        // Important: all values are SORTED in time.

        // TODO: this part can be improved with more advanced functions in the future
        int spanImputation=imputationFilteringSettings.getSpanImputation();
        int useMedianOrNot=imputationFilteringSettings.getUseMedianOrNotImputation();

        int numOfIntervals=24*3600/interval; //Set the number of intervals

        double [][] dataOutput= new double[numOfIntervals][dataInput[0].length];

        int curIndex=0; // Set the current index to be zero
        for(int i=0; i<numOfIntervals; i++){ // Loop for the number of intervals

            double time=i*interval; // Get the current time stamp

            //Search for the right time index
            double sumFlow=0;
            double sumOcc=0;
            double sumSpeed=0;
            double numOfSample=0;
            int j;
            for (j=curIndex;j<dataInput.length;j++){
                if(dataInput[j][0]>=time && dataInput[j][0]<time+interval){
                    // It is possible that the reported time from the raw data is within [time, time+interval]
                    // It is also possible to have multiple data points for a given interval, therefore we take the averages
                    sumFlow=sumFlow+dataInput[j][1];
                    sumOcc=sumOcc+dataInput[j][2];
                    sumSpeed=sumSpeed+dataInput[j][3];
                    numOfSample=numOfSample+1;
                }
                if(dataInput[j][0]>=time+interval)
                { // If it is out of the range of the searching interval
                    break;
                }
            }
            // Update the current index
            // If j==dataInput.length, it reaches the end of the input data, and the output data will use the smoothed
            // values of the previous steps. If no data samples are found, j would not change
            curIndex=j;

            // Check whether the corresponding data points are found or not
            dataOutput[i][0]=time;
            if(numOfSample>=1){
                // If have samples in the corresponding time interval, take the mean
                dataOutput[i][1]=sumFlow/numOfSample;
                dataOutput[i][2]=sumOcc/numOfSample;
                dataOutput[i][3]=sumSpeed/numOfSample;
            }else{
                // If no samples
                if(i==0){
                    // If it is the first data point, set it to be the first value of dataInput
                    dataOutput[i][1]=dataInput[0][1];
                    dataOutput[i][2]=dataInput[0][2];
                    dataOutput[i][3]=dataInput[0][3];
                }else{
                    double [] tmpFlow;
                    double [] tmpOcc;
                    double [] tmpSpeed;
                    if(i<spanImputation){
                        // If it is less than the span
                        tmpFlow=fromMatrixToArrayByColumn(dataOutput,1,0,i-1);
                        tmpOcc=fromMatrixToArrayByColumn(dataOutput,2,0,i-1);
                        tmpSpeed=fromMatrixToArrayByColumn(dataOutput,3,0,i-1);
                    }else{
                        // If it is greater than the span
                        tmpFlow=fromMatrixToArrayByColumn(dataOutput,1,i-spanImputation,i-1);
                        tmpOcc=fromMatrixToArrayByColumn(dataOutput,2,i-spanImputation,i-1);
                        tmpSpeed=fromMatrixToArrayByColumn(dataOutput,3,i-spanImputation,i-1);
                    }

                    if(useMedianOrNot==1) {
                        // Use median
                        dataOutput[i][1] = calculateMedian(tmpFlow);
                        dataOutput[i][2] = calculateMedian(tmpOcc);
                        dataOutput[i][3] = calculateMedian(tmpSpeed);
                    }else
                    {// Use mean
                        dataOutput[i][1] = calculateMean(tmpFlow);
                        dataOutput[i][2] = calculateMean(tmpOcc);
                        dataOutput[i][3] = calculateMean(tmpSpeed);
                    }
                }
            }
        }
        return dataOutput;
    }


    public static double [] fromMatrixToArrayByColumn(double [][] inputMatrix, int colNumber, int fromRow, int toRow){
        // This function is to assign the value from a matrix to an array with a given column number

        double [] outputArray= new double[toRow-fromRow+1];

        for(int i=0; i<=toRow-fromRow;i++) {
            outputArray[i]=inputMatrix[i+fromRow][colNumber];
        }

        return outputArray;
    }

    public static double calculateMean(double[] inputArray) {
        // This function is to calculate the mean value

        double sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum / inputArray.length;
    }

    public static double calculateMedian(double [] inputArray){
        // This function is to calcualte the median value

        double median;

        // Sort the array
        Arrays.sort(inputArray);

        if (inputArray.length % 2 == 0) // If it is even number
            median = (inputArray[inputArray.length/2] + inputArray[inputArray.length/2 - 1])/2;
        else // If it is odd number
            median = inputArray[inputArray.length/2];

        return median;
    }
}
