package Flowers;

public class Main {

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet(5);
        Flower rose = new Rose();
        Flower orchid = new Orchid();
        Flower rose2 = new Rose();
        Flower peony = new Peony();
        Flower chrysanthemum = new Chrysanthemum();

        bouquet.addFlower(rose);
        bouquet.addFlower(orchid);
        bouquet.addFlower(rose2);
        bouquet.addFlower(peony);
        bouquet.addFlower(chrysanthemum);

        Printer.printBouquet(bouquet.getFlowers());
        Printer.printPrice(bouquet.getBouquetCost());
    }
}
