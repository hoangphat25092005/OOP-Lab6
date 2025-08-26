package Lab6.Exercise1;

public class Wildlifesanctuary {
    private Animal[] animals;
    private int count;

    public Wildlifesanctuary(int size) {
        this.animals = new Animal[size];
        count = 0;
    }

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
        }
    }


    public Animal[] getAnimals() {
        return this.animals;
    }


    public double getTotalCareCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += animals[i].calculateMonthlyCareCost();
        }
        return total;
    }
}
