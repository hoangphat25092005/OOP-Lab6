package Lab6.Exercise5;

public abstract class Investigator {
    private String investigatorId;
    private String name;
    private int experienceYears;
    protected static int totalCasesSolved = 0;

    public Investigator(String investigatorId, String name, int experienceYears) {
        if (experienceYears < 0) throw new IllegalArgumentException("Experience must be >= 0");
        this.investigatorId = investigatorId;
        this.name = name;
        this.experienceYears = experienceYears;
    }

    // Getters
    public String getInvestigatorId() { return investigatorId; }
    public String getName() { return name; }
    public int getExperienceYears() { return experienceYears; }
    public static int getTotalCasesSolved() { return totalCasesSolved; }

    // Abstract method (must be overridden by subclasses)
    public abstract double calculateRiskFactor();

    // Overloaded methods for assigning cases
    public void assignCase(int difficulty) {
        if (difficulty <= 0) throw new IllegalArgumentException("Difficulty must be > 0");
        totalCasesSolved++;
        System.out.println(name + " assigned a case of difficulty " + difficulty);
    }

    public void assignCase(int difficulty, String details) {
        if (difficulty <= 0) throw new IllegalArgumentException("Difficulty must be > 0");
        totalCasesSolved++;
        System.out.println(name + " assigned a case of difficulty " + difficulty + " - Details: " + details);
    }
}
