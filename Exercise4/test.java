package Lab6.Exercise4;

public class test {
    public static void main(String[] args) {
        CityStructure[] cities = new CityStructure[4];
        cities[0] = new SolarBuilding("SB001", "Downtown", 5000.00);
        cities[1] = new GreenTransport("GT001", "Central Station", 500.00);
        cities[2] = new SolarBuilding("SB002", "Eco District", 10000.00);
        cities[3] = new GreenTransport("GT002", "North Terminal", 800.0);

        System.out.println("Task1: Individual Carbon Footprints:");
        System.out.println(cities[0].getStructureId() + "(" + cities[0].getLocation() + "):" + cities[0].calculateCarbonFootprint());
        System.out.println(cities[1].getStructureId() + "(" + cities[1].getLocation() + "):" + cities[1].calculateCarbonFootprint());

        double totalcabon = 0;
        System.out.println("Task 2: All Structure Carbon Footprints:");
        for (int i = 0; i < 4; i++) {
            System.out.println(cities[i].getStructureId() + "(" + cities[i].getLocation() + "):" + cities[i].calculateCarbonFootprint());
            totalcabon += cities[i].calculateCarbonFootprint();
        }
        System.out.println("Total City Carbon Footprint: " + totalcabon + "kg CO2");
        System.out.println("Total Structures: " + CityStructure.getTotalStructures());

        CityStructure[] cities_a = new CityStructure[2];
        cities_a[0] = new SolarBuilding("SB003", "Test Zone", 0.00);
        cities_a[1] = new GreenTransport("GT003", "Empty Stop", 0.00);

        System.out.println("Task 3: Edge Case Carbon Footprints:");
        for (int i = 0; i < cities_a.length; i++) {
            System.out.println(cities_a[i].getStructureId() + "(" + cities_a[i].getLocation() + "):" + cities_a[i].calculateCarbonFootprint());
        }
    }
}
