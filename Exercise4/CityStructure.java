package Lab6.Exercise4;

public abstract class CityStructure {
    private String structureId;
    private String location;
    private static int totalStuctures = 0;

    public CityStructure(String structureId, String location) {
        this.structureId = structureId;
        this.location = location;
        totalStuctures++;
    }

    public static int getTotalStructures() {
        return totalStuctures;
    }

    public void setStructureId(String structureId) {
        this.structureId = structureId;
    }

    public String getStructureId() {
        return this.structureId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    } 

    public abstract double calculateCarbonFootprint();

}
