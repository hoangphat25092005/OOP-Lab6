package Lab6.Exercise3;

public abstract class Artwork {
    private String artworkId;
    private String artist;
    protected double baseValue;

    public Artwork(String artworkId, String artist, double baseValue) {
        if (baseValue <  0) {
            throw new Error("BaseValue must be a postive integer number!");
        }
        this.artworkId = artworkId;
        this.artist = artist;
        this.baseValue = baseValue;
    }

    public void setartworkId(String artworkId) {
        this.artworkId = artworkId;
    }

    public String getartworkId() {
        return this.artworkId;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setBasevalue(double baseValue) {
        if (baseValue < 0) {
            return;
        }
        this.baseValue = baseValue;
    }

    public double getBaseValue() {
        return this.baseValue;
    }

    public abstract  double calculateDisplayCost();

}
