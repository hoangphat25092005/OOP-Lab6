package Lab6.Exercise4;

public class SolarBuilding extends CityStructure implements EcoFriendly{
    private double solarPanelArea;
    public SolarBuilding(String structureId, String location, double solarPanelArea) {
        super(structureId, location);
        if (solarPanelArea < 0) {
            throw new Error("SolarPanelArea must be non negative!");
        }
        this.solarPanelArea = solarPanelArea;
    }

    public void setSolarPanelArea(double solarPanelArea) {
        this.solarPanelArea = solarPanelArea;
    }

    public double getSolarPanelArea() {
        return this.solarPanelArea;
    }

    @Override
    public double calculateCarbonFootprint() {
        return -this.solarPanelArea * 50;
    }
}
