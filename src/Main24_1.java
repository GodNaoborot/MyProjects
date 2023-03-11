import java.util.Arrays;
import java.util.Scanner;

public class Main24_1 {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        Main24 q1 = new Main24();
        int num1_1 = qwerty.nextInt();
        int num1_2 = qwerty.nextInt();
        System.out.println(q1.task_1(num1_1, num1_2));

        int num2_1 = qwerty.nextInt();
        System.out.println(q1.task_2(num2_1));

        int num3_1 = qwerty.nextInt();
        System.out.println(Arrays.toString(q1.task_3(num3_1)));

        int num4_1 = qwerty.nextInt();
        System.out.println(q1.task_4(num4_1));

        double num5_1 = qwerty.nextDouble();
        double num5_2 = qwerty.nextDouble();
        System.out.println(q1.task_5(num5_1,num5_2));

        int num6_1 = qwerty.nextInt();
        int num6_2 = qwerty.nextInt();
        int num6_3 = qwerty.nextInt();
        int num6_4 = qwerty.nextInt();
        System.out.println(q1.task_6(num6_1,num6_2,num6_3,num6_4));

        int num7_1 = qwerty.nextInt();
        int num7_2 = qwerty.nextInt();
        char operation = qwerty.next().charAt(0);
        System.out.print(q1.getInt1(num7_1));
        System.out.print(q1.getOperation(operation));
        System.out.print(q1.getInt2(num7_2));
        System.out.print("=");
        System.out.print(q1.calculate(num7_1,num7_2,operation));
    }


}
