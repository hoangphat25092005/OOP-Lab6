package Lab6.Exercise6;

public abstract class QuantumnBit {
    private String qubitId;
    private boolean isEntangled;
    protected double probability;  // between 0 and 1
    protected static final double UNCERTAINTY_PRINCIPLE = 0.707; // example constant

    public QuantumnBit(String qubitId, boolean isEntangled, double probability) {
        if (probability < 0 || probability > 1) 
            throw new IllegalArgumentException("Probability must be between 0 and 1");
        this.qubitId = qubitId;
        this.isEntangled = isEntangled;
        this.probability = probability;
    }

    public String getQubitId() { return qubitId; }
    public boolean isEntangled() { return isEntangled; }
    public double getProbability() { return probability; }

    public void setProbability(double probability) {
        if (probability < 0 || probability > 1) 
            throw new IllegalArgumentException("Probability must be between 0 and 1");
        this.probability = probability;
    }

    public static double getUncertaintyPrinciple() {
        return UNCERTAINTY_PRINCIPLE;
    }

    // Abstract method
    public abstract void measure();
}
