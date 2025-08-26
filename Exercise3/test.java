package Lab6.Exercise3;

public class test {
    public static void main(String[] args) {
        ArtGallery a = new ArtGallery(6);
        a.addArt(new Painting("P001", "Van Gogh", 2000, 300));
        a.addArt(new Sculpture("S001", "Michelangelo", 5000, 150));
        a.addArt(new Painting("P002", "Picasso", 5000, 250));
        a.addArt(new Sculpture("S002", "Rodin", 8000, 200));
        a.addArt(new Painting("P003", "Unknown artist", 100, 50));
        a.addArt(new Sculpture("S003", "Modern Artist", 200, 0));

        Artwork[] ak = a.getArt();
        System.out.println("Task 1: Individual Display Costs:");
        System.out.println(ak[0].getartworkId() + "(" + ak[0].getArtist() + "):" + " $" + ak[0].calculateDisplayCost());
        System.out.println(ak[1].getartworkId() + "(" + ak[1].getArtist() + "):" + " $" + ak[1].calculateDisplayCost());
        System.out.println();

        System.out.println("Task 2: All Artwork Display Costs:");
        for (int i = 0; i < 4; i++) {
            System.out.println(ak[i].getartworkId() + "(" + ak[i].getArtist() + "):" + " $" + ak[i].calculateDisplayCost());
        }
        System.out.println("Total Display Cost: " + a.getTototalcost());
        System.out.println();
        
        System.out.println("Task 3: Edge Case Display Costs:");
        System.out.println(ak[4].getartworkId() + "(Unknown Artist):" + " $" + ak[4].calculateDisplayCost());
        System.out.println(ak[5].getartworkId() + "(Modern Artist):" + " $" + ak[5].calculateDisplayCost());
    }
}
