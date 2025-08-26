package Lab6.Exercise2;

public class Rover extends Spacecraft implements MissionReportable{
    private int samplesCollected;

    public Rover(String spacecraftId, String missionName, double fuelLevel, int samplesCollected) {
        super(spacecraftId, missionName, fuelLevel);
        this.samplesCollected = samplesCollected;
    }

    public void setsamplesCollected(int samplesCollected) {
        this.samplesCollected = samplesCollected;
    }

    public int getsamplesCollected() {
        return this.samplesCollected;
    }
    @Override
    public void updateStatus(String status) {
        String tmp = this.getStatus();
        tmp = status;
    }
    @Override
    public void updateStatus(String status, double fuelConssumed) {
        String tmp = this.getStatus();
        double tmp2 = this.getfuelLevel();
        tmp2 -= fuelConssumed;
    }

    @Override
    public String generateMissionReport() {
        return "Rover ID: " + this.getspaceCraftId()
        + " | Mission: " + this.getmissionName()
        + " | Status: " + this.getStatus()
        + " | Fuel: " + String.format("%.2f", this.getfuelLevel())
        + " | Samples: " + this.getsamplesCollected();
    }
}
