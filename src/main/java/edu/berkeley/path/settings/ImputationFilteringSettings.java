package edu.berkeley.path.settings;

public class ImputationFilteringSettings {

    // The following are just simple settings to do imputation and filtering
    // It can be improved in the future by adding more functions and variables

    // Imputation
    protected int spanImputation=5;
    protected int useMedianOrNotImputation=0;

    //Date smoothing settings
    // method (currently): MovingAverage
    protected String methodSmoothing="MovingAverage";
    protected int spanSmoothing=5;

    // Get functions
    public int getSpanImputation() {
        return spanImputation;
    }

    public int getSpanSmoothing() {
        return spanSmoothing;
    }

    public int getUseMedianOrNotImputation() {
        return useMedianOrNotImputation;
    }

    public String getMethodSmoothing() {
        return methodSmoothing;
    }

    // Set functions
    public void setMethodSmoothing(String methodSmoothing) {
        this.methodSmoothing = methodSmoothing;
    }

    public void setSpanImputation(int spanImputation) {
        this.spanImputation = spanImputation;
    }

    public void setSpanSmoothing(int spanSmoothing) {
        this.spanSmoothing = spanSmoothing;
    }

    public void setUseMedianOrNotImputation(int useMedianOrNotImputation) {
        this.useMedianOrNotImputation = useMedianOrNotImputation;
    }

    public void Initialization(int _spanImputation, int _useMedianOrNotImputation, String _methodSmoothing, int _spanSmoothing){
        this.spanImputation=_spanImputation;
        this.useMedianOrNotImputation=_useMedianOrNotImputation;
        this.methodSmoothing=_methodSmoothing;
        this.spanSmoothing=_spanSmoothing;
    }
}
