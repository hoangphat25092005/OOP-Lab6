package Lab6.Exercise5;

public class Psychic extends Investigator implements CaseReportable {
    private String specialAbility;
    private double abilityBonus;

    public Psychic(String investigatorId, String name, int experienceYears, String specialAbility, double abilityBonus) {
        super(investigatorId, name, experienceYears);
        this.specialAbility = specialAbility;
        this.abilityBonus = abilityBonus;
    }

    @Override
    public double calculateRiskFactor() {
        return getExperienceYears() * 0.5 + abilityBonus;
    }

    @Override
    public String generateCaseReport() {
        return "Psychic " + getName() + " (" + specialAbility + 
               ") Risk Factor: " + calculateRiskFactor() + 
               ", Total Cases Solved: " + getTotalCasesSolved();
    }
}
