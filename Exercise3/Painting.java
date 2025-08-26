package Lab6.Exercise3;

public class Painting extends Artwork {
    private double frameCost;
    public Painting(String artworkId, String artist, double baseValue, double frameCost) {
        super(artworkId, artist, baseValue);
        this.frameCost = frameCost;
    }

    public void setframeCost(double frameCost) {
        if (frameCost < 0) {
            return;
        }
        this.frameCost = frameCost;
    }

    public double getframeCost() {
        return this.frameCost;
    }

    @Override
    public double calculateDisplayCost() {
        return 0.1 * this.getBaseValue() + this.frameCost;
    }
}
