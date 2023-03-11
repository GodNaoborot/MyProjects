import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Calculator1 {
    public static void main(String[] args) {
        //binary_calculate();
        int a = 105;
        int b = String.valueOf(a).length();
        System.out.println(b);
        int a1 = a%10;
        int a2 = a/10;
        int a3 = a2%10;
        int a4 = a2/10;
        System.out.println(a);
        calculate_from_binary();
        calculate_into_binary();




    }
    public static void calculate_into_binary() {
        Scanner qwerty = new Scanner(System.in);
        int[] d1 = new int[1];

        int a1 = qwerty.nextInt();
        int c2 = qwerty.nextInt();
        int c1 = a1 % c2;

        System.out.print(c1 + " ");
        System.out.println(a1);

        while (a1 > 1) {
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


        }
    }


    public static void calculate_from_binary(){
        Scanner qwerty = new Scanner(System.in);
        int a1 = qwerty.nextInt();
        int r1 = qwerty.nextInt();
        int b1 = String.valueOf(a1).length();
        int[] d1 = new int[1];
        int e1 = 0;
        while(b1!=0){
            int a2 = a1%10;
            int b2 = a1/10;
            a1 = b2;
            int a3 = (int)(a2*Math.pow(r1,e1));
            e1++;

            for (int i = 0;i<d1.length;i++){
                d1[i]+=a3;
            }



            b1--;
        }
        int total = IntStream.of(d1).sum();
        System.out.println(total);

    }



}
