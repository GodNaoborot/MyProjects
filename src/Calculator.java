import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);

        int[] d1 = new int[1];

        int a1 = qwerty.nextInt();
        int c2 = qwerty.nextInt();
        int c1 = a1 % c2;

        System.out.print(c1+" ");
        System.out.println(a1);

        while (a1>1) {
            int b1 = a1 / c2;
            c1 = b1 % c2;
            a1 = b1;

            for (int i = 0; i < d1.length; i++) {
                d1[i] = c1;

            }
            System.out.println();
            for (int i = 0; i < d1.length; i++) {
                System.out.print(d1[i] + " ");
            }
            System.out.println(b1);

        }




    }
}
