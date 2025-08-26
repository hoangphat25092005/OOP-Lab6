package Lab6.Exercise5;

public class InvestigationAgency {
    private Investigator[] investigators;

    public InvestigationAgency(Investigator[] investigators) {
        this.investigators = investigators;
    }

    public void generateReports() {
        for (Investigator inv : investigators) {
            if (inv instanceof CaseReportable) {
                System.out.println(((CaseReportable) inv).generateCaseReport());
            }
        }
    }

    public void calculateTotalRisk() {
        double totalRisk = 0;
        for (Investigator inv : investigators) {
            totalRisk += inv.calculateRiskFactor();
        }
        System.out.println("Total Agency Risk Factor: " + totalRisk);
    }
}
