package Lab6.Exercise2;

public abstract class Spacecraft {
    private static int totalMissions;
    private String spacecraftId;
    private String missionName;
    private double fuelLevel;
    private String status = "";


    public Spacecraft(String spacecraftId, String missionName, double fuelLevel) {
        this.spacecraftId = spacecraftId;
        this.missionName = missionName;
        this.fuelLevel = fuelLevel;
        totalMissions++;
    }

    public static int getTotalMissions() {
        return totalMissions;
    }

    public void setspaceCraftId(String spacecraftId) {
        this.spacecraftId = spacecraftId;
    }

    public String getspaceCraftId() {
        return this.spacecraftId;
    }

    public void setmissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getmissionName() {
        return this.missionName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setfuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getfuelLevel() {
        return this.fuelLevel;
    }

    public abstract void updateStatus(String status);

    public abstract void updateStatus(String status, double fuelConssumed);

}