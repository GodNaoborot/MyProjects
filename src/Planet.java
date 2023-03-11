import java.util.Scanner;

public class Planet {
    int id = counter;
    public static int counter;

    public static void main(String[] args) {
        Planet mercury = new Planet();
        Planet mercury1 = new Planet();
        mercury.printq();
        mercury1.printq();


    }

    public void printq(){
        id++;

        System.out.println(id);
    }
}
