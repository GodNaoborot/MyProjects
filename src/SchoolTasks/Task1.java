package SchoolTasks;

import java.util.Scanner;

public class Task1 {

    public static int task1(int a, int b) {
        if (a < b) {
            return a + b - 1;
        } else if (a > b) {
            return a + b - 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        int num1 = qwerty.nextInt();
        int num2 = qwerty.nextInt();
        System.out.println(task1(num1, num2));
    }
}

