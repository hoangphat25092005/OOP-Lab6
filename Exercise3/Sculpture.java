package Lab6.Exercise3;

public class Sculpture extends Artwork {
    private double weight;
    
    public Sculpture(String artworkId, String artist, double baseValue, double weight) {
        super(artworkId, artist, baseValue);
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    @Override
    public double calculateDisplayCost() {
        return 0.15 * this.getBaseValue() + this.weight * 5;
    }
}
