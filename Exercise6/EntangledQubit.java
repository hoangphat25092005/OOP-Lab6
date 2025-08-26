package Lab6.Exercise6;

public class EntangledQubit extends QuantumnBit implements QuantumnOperation {
    private String pairedQubitId;

    public EntangledQubit(String qubitId, double probability, String pairedQubitId) {
        super(qubitId, true, probability);
        if (pairedQubitId == null || pairedQubitId.isEmpty()) 
            throw new IllegalArgumentException("Paired Qubit ID must be valid");
        this.pairedQubitId = pairedQubitId;
    }

    @Override
    public void measure() {
        System.out.println("Entangled Qubit " + getQubitId() + 
                           " entangled with " + pairedQubitId + 
                           ". Probability: " + getProbability());
    }

    @Override
    public void applyOperation() {
        // Flip probability around 0.5 for entanglement effect
        setProbability(1 - getProbability());
        System.out.println("Entangled operation applied, new probability: " + getProbability());
    }
}
