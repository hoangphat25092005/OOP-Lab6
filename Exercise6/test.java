package Lab6.Exercise6;

public class test {
    public static void main(String[] args) {
        QuantumnBit[] qubits = new QuantumnBit[4];

        qubits[0] = new SuperpositionQubit("Q1", 0.6, 3);
        qubits[1] = new EntangledQubit("Q2", 0.4, "Q3");
        qubits[2] = new SuperpositionQubit("Q3", 0.5, 4);
        qubits[3] = new EntangledQubit("Q4", 0.7, "Q1");

        QuantumSimulator simulator = new QuantumSimulator(qubits);

        System.out.println("Running Quantum Simulation...");
        simulator.runSimulation();

        System.out.println("\nTotal Simulations Run: " + QuantumSimulator.getSimulationCount());
        System.out.println("Uncertainty Principle Constant: " + QuantumnBit.getUncertaintyPrinciple());
    }
}
