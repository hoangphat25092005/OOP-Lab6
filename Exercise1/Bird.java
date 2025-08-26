package Lab6.Exercise1;

public class Bird extends Animal {
    private boolean isMigratory;

    public Bird(String id, String species, double weight, String habitat, boolean isMigratory) {
        super(id, species, weight, habitat);
        this.isMigratory = isMigratory;
    }

    public void setisMigratory(boolean isMigratory) {
        this.isMigratory = isMigratory;
    }

    public boolean getisMigratory() {
        return this.isMigratory;
    }

    @Override
    public double calculateMonthlyCareCost() {
        if (this.isMigratory) {
            return this.getWeight() * 10 + 500;
        }
        return this.getWeight() * 10;
    }
}
