package Lab6.Exercise2;

public class test {
    public static void main(String[] args) {
        Rover r1 = new Rover("1", "Mars Exploration", 100, 5);
        r1.updateStatus("Landed on Mars");
        r1.updateStatus("Collecting samples", 10);

        Rover r2 = new Rover("2", "Rock Analysis", 120, 2);
        r2.updateStatus("Moving to new site", 15);

        Rover r3 = new Rover("3", "Soil Study", 80, 0);
        r3.updateStatus("Conducting soil tests", 5);

        System.out.println("Task1 Report:");
        System.out.println(r1.generateMissionReport());

        System.out.println("Task2 Report:");
        System.out.println(r2.generateMissionReport());
        System.out.println(r3.generateMissionReport());

        System.out.println("Task3 Report:");
        System.out.println("Total Missions: " + Spacecraft.getTotalMissions());
    }
}
