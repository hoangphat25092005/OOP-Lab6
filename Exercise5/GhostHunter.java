package Lab6.Exercise5;

public class GhostHunter extends Investigator implements CaseReportable {
    private boolean hasEquipment;
    private double equipmentAdjustment;

    public GhostHunter(String investigatorId, String name, int experienceYears, boolean hasEquipment, double equipmentAdjustment) {
        super(investigatorId, name, experienceYears);
        this.hasEquipment = hasEquipment;
        this.equipmentAdjustment = equipmentAdjustment;
    }

    @Override
    public double calculateRiskFactor() {
        return getExperienceYears() * 0.8 + equipmentAdjustment;
    }

    @Override
    public String generateCaseReport() {
        return "GhostHunter " + getName() + " (Equipment: " + hasEquipment + 
               ") Risk Factor: " + calculateRiskFactor() + 
               ", Total Cases Solved: " + getTotalCasesSolved();
    }
}
