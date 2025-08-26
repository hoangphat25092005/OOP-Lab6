package Lab6.Exercise3;

public class ArtGallery {
    private Artwork[] arr;
    private int count = 0;

    public ArtGallery(int size) {
        this.arr = new Artwork[size];
    }

    public void addArt(Artwork obj) {
        if (count < arr.length) {
            arr[count++] = obj;
        }
    }

    public Artwork[] getArt() {
        return this.arr;
    } 

    public double getTototalcost() {
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total += arr[i].calculateDisplayCost();
        }
        return total;
    }
}
