package Lab6.Exercise6;

public class QuantumSimulator {
    private QuantumnBit[] qubits;
    private static int simulationCount = 0;

    public QuantumSimulator(QuantumnBit[] qubits) {
        this.qubits = qubits;
    }

    public void runSimulation() {
        for (QuantumnBit qb : qubits) {
            if (qb instanceof QuantumnOperation) {
                ((QuantumnOperation) qb).applyOperation();
                qb.measure();
            }
            simulationCount++;
        }
    }

    public static int getSimulationCount() {
        return simulationCount;
    }
}
