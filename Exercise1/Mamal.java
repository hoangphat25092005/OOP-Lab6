package Lab6.Exercise1;

public class Mamal extends Animal {
    private int feedingFrequency;

    public Mamal(String id, String species, double weight, String habitat, int feedingFrequency) {
        super(id, species, weight, habitat);
        this.feedingFrequency = feedingFrequency;
    }

    public void setFeedingFrequency(int feedingFrequency) {
        this.feedingFrequency = feedingFrequency;
    }

    public int getFeedingFrequency() {
        return this.feedingFrequency;
    }

    @Override
    public double calculateMonthlyCareCost() {
        return this.getWeight() * this.feedingFrequency * 30 * 2.5;
    }
}
