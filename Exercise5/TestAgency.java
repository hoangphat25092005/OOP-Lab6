package Lab6.Exercise5;

public class TestAgency {
    public static void main(String[] args) {
        Investigator[] investigators = new Investigator[4];
        investigators[0] = new Psychic("PS001", "Alice", 5, "Telepathy", 2.0);
        investigators[1] = new GhostHunter("GH001", "Bob", 7, true, 3.0);
        investigators[2] = new Psychic("PS002", "Charlie", 3, "Clairvoyance", 1.5);
        investigators[3] = new GhostHunter("GH002", "David", 4, false, 0.5);

        // Task 1: Assign simple cases
        investigators[0].assignCase(2);
        investigators[1].assignCase(3);

        System.out.println("\nTask 2: Assign detailed cases...");
        investigators[2].assignCase(4, "Haunted Mansion");
        investigators[3].assignCase(5, "Abandoned Hospital");

        // Create agency
        InvestigationAgency agency = new InvestigationAgency(investigators);

        System.out.println("\nTask 3: Generate Case Reports:");
        agency.generateReports();

        System.out.println("\nTask 4: Calculate Total Risk:");
        agency.calculateTotalRisk();

        System.out.println("\nTotal Cases Solved: " + Investigator.getTotalCasesSolved());
    }
}
