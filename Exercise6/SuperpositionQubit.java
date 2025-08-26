package Lab6.Exercise6;

import java.util.Random;

public class SuperpositionQubit extends QuantumnBit implements QuantumnOperation {
    private int states;

    public SuperpositionQubit(String qubitId, double probability, int states) {
        super(qubitId, false, probability);
        if (states <= 1) throw new IllegalArgumentException("States must be > 1");
        this.states = states;
    }

    @Override
    public void measure() {
        System.out.println("Superposition Qubit " + getQubitId() + 
                           " with " + states + " states measured. Probability: " + getProbability());
    }

    @Override
    public void applyOperation() {
        Random rand = new Random();
        double newProb = rand.nextDouble();
        setProbability(newProb);
        System.out.println("Superposition operation applied, new probability: " + newProb);
    }
}
