package Lab6.Exercise1;

public abstract class Animal {
    private String id;
    private String species;
    private double weight;
    private String habitat;

    public Animal(String id, String species, double weight, String habitat) {
        if (weight < 0) {
            return;
        }
        this.id = id;
        this.species = species;
        this.weight = weight;
        this.habitat = habitat;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            return;
        }
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public abstract double calculateMonthlyCareCost();
}
