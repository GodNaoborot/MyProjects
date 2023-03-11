package JavaPatterns;

import JavaPatterns.Singleton.Storage;
import JavaPatterns.Singleton.Workers;

public class Main {
    public static void main(String[] args) {
        //Singleton
        Workers w1 = new Workers();
        Workers w2 = new Workers();

        System.out.println("worker1 addItem");
        w1.work("Book");
        System.out.println("worker2 addItem");
        w2.work("Shoes");
        for(String item: w1.getStorage().getItems()){
            System.out.println(item+ ' ');

        }
        System.out.println();

        //Singleton multithreading
        Thread worker1 = new Thread(()->Storage.getInstance().addItem("glasses"));
        Thread worker2 = new Thread(()->Storage.getInstance().addItem("chain"));


        worker1.start();
        worker2.start();

        try {
            worker1.join();
            worker2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        for(String item: w1.getStorage().getItems()){
            System.out.println(item+ ' ');

        }
        System.out.println();





    }




}
