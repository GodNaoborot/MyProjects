import java.util.Scanner;
import java.lang.Math;


public class Main23 {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        int a = qwerty.nextInt();
        int b = qwerty.nextInt();
        double c = (double) a * b * 0.1;
        int d = (int) (Math.round(c));
        System.out.println(d);


        int a1 = 80;
        int b1 = 2;
        int c1 = 95;
        int d1 = qwerty.nextInt();

        int q1 = (d1 * b1) + a1;
        if (q1 > c1) {
            System.out.println("Кто-то очень много ест!");
        } else {
            System.out.println("Всё обошлось...");
        }


        int a2 = 120;
        int b2 = 2;
        int c2 = 0;
        while (a2 < p1.D2) {
            c2++;
            a2 = a2 * b2;
        }
        System.out.println(c2);




    func1();


    }
    public static String func1() {
        Scanner qwerty = new Scanner(System.in);
        int hair_length = 70;
        int b3 = 3;
        System.out.println("У вас есть "+b3+" попыток из 3");
        int c3 = qwerty.nextInt();
        if (c3 == hair_length){
            System.out.println("Принц победил!");
        }
        while (c3!=hair_length) {
            b3--;
            System.out.println("У вас осталось "+b3+" попыток из 3");
            c3 = qwerty.nextInt();
            if (c3 == hair_length) {
                System.out.println("Принц победил!");



            }else if (b3==1) {
                System.out.println("Не повезло");
                return null;
            }

        }


        return null;
    }






}class p1{
    public static final int D2 = 1060;
}