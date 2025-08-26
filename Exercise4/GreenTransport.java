package Lab6.Exercise4;

public class GreenTransport extends CityStructure implements EcoFriendly {
    private double passengerCapacity;

    public GreenTransport(String structureId, String location, double passengerCapacity) {
        super(structureId, location);
        if (passengerCapacity < 0) {
            throw new Error("Passenger Capacity must be non negative!");
        } 
        this.passengerCapacity = passengerCapacity;
    }

    public void setPassengerCapacity(double passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getPassengerCapacity() {
        return this.passengerCapacity;
    }

    @Override
    public double calculateCarbonFootprint() {
        return this.passengerCapacity * 10;
    }
}
