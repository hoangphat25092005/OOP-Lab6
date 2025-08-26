package Lab6.Exercise1;


public class test {
    public static void main(String[] args) {
        Wildlifesanctuary sanctuary = new Wildlifesanctuary(5);
        System.out.println("Sanctuary capacity: 5");
        System.out.println("Animals added: ");
        sanctuary.addAnimal(new Mamal("1", "Lion", 190, null, 3));
        sanctuary.addAnimal(new Mamal("2", "Elephant", 5400, null, 2));
        sanctuary.addAnimal(new Bird("3", "Parrot", 1.5, null, false));
        sanctuary.addAnimal(new Bird("4", "Goose", 5, null, true));
        sanctuary.addAnimal(new Bird("5", "Eagle", 6, null, false));

        System.out.println("Task1: Individual Monthly Costs");
        Animal[] arr = sanctuary.getAnimals();
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Lion: " +  "$" + arr[i].calculateMonthlyCareCost());
            } else if (i == 2) {
                System.out.println("Elephant: " + "$" + arr[i].calculateMonthlyCareCost());
            } else {
                System.out.println("Parrot: " + "$" + arr[i].calculateMonthlyCareCost());
            }
        }

        System.out.println("Bird Monthly Costs (with/without migration)");
        for (int i = 3; i <= 4; i++) {
            if (i == 3) {
                System.out.println("Goose (Migratory): " + "$" + arr[i].calculateMonthlyCareCost());
            } else {
                System.out.println("Eagle (Non-Migratory): " + "$" + arr[i].calculateMonthlyCareCost());
            }
        }

        System.out.println("Total Monthly Care Cost for sanctuary: ");
        System.out.println("Total: " + sanctuary.getTotalCareCost());
    }
}
