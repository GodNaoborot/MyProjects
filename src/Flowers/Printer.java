package Flowers;

public class Printer {

    public static void printBouquet(Flower[] flowers){
        StringBuilder str = new StringBuilder(flowers.length);
        str.append("[");
        for(Flower flower:
        flowers){
            str.append(flower.getName());
            str.append(" ");
        }
        str.append("]");
        System.out.println(str.toString());
    }

    public static void printPrice(int price){
        System.out.println("Bouquet price is "+price);
    }

}
