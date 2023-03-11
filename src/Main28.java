import java.util.Objects;
import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        double t = qwerty.nextDouble();
        task_1(t);
        int t2 = qwerty.nextInt();
        int t3 = qwerty.nextInt();
        task_2(t2,t3);
        String t33 = qwerty.next();
        task_3(t33);
        int t4 = qwerty.nextInt();
        task_4(t4);
        int t5_1 = qwerty.nextInt();
        int t5_2 = qwerty.nextInt();
        task_5(t5_1,t5_2);
        int t6 = qwerty.nextInt();
        task_6(t6);
        int t7 = qwerty.nextInt();
        task_7(t7);


    }

    public static void task_1(double q){

        Scanner qwerty = new Scanner(System.in);
        int q2 = (int) (q/1);

        if (q==q2){

            System.out.println(q+" Это целое число");
        }else{
            System.out.println(q+" это не целое число");
        }

    }


    public static void task_2(int q1, int q2){
        int salary = q1*q2;
        if(q1<8) {
            System.out.println("Работник не может получать меньше 8 долларов в час");
            return;
        }
        if(q2>60) {
            System.out.println("Работник не может работать больше 60 часов в неделю");
            return;
        }
        System.out.println("ЗП составляет "+salary+" долларов в неделю");

    }


    public static void task_3(String q){

        char[] chars1 = new char[q.length()];
        int r = q.length()-1;
        char[] chars2 = new char[q.length()];
        int k = 0;

        for (int i = 0;i< chars1.length;i++){
            chars1[i] = q.charAt(r);
            chars2[i] = q.charAt(i);
            r--;
            if(chars1[i]!=chars2[i]){
                System.out.println(q+" не палиндром");
                return;
            }else if(chars1[i]==chars2[i]){
                k++;
                if(k==q.length()){
                    System.out.println("Это палиндром");
                }
            }

        }

    }


    public static void task_4(int q){


        int num1 = 1;
        int result;
        for(int i = 0;i<10;i++){
            result = num1*q;
            System.out.println(q+" * "+num1+" = "+ result);
            num1++;
        }
    }


    public static void task_5(int q1,int q2) {

        int[][] array1 = new int[q1][q2];
        int[] array2 = new int[q1 * q2];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 50);
            }
        }
        System.out.println();
        int y_cor = q1;
        int x_cor = 0;
        int k = 0;

        for(int i = 0;i < array1.length;i++){
            for(int j = 0;j< array1[i].length;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();


        }

        for(int i = 0;i < array1.length;i++){
            for(int j = 0;j < array1[i].length;j++){
                array2[k] = array1[i][j];
                k++;

            }
        }
        System.out.println();


        for(int i = 0;i< array2.length;i++){
            System.out.print(array2[i]+" ");
        }
        System.out.println();
    }


    public static void task_6(int q){
        int hours = q*24;
        int minutes = hours*60;
        int secs = minutes*60;
        System.out.println("В "+q+" дне(ях) - "+hours+" часов");
        System.out.println("В "+q+" дне(ях) - "+minutes+" минут");
        System.out.println("В "+q+" дне(ях) - "+secs+" секунд");
    }


    public static void task_7(int q){

        int count = 0;
        int s = q;
        while(q>0){
            q = q/10;
            count++;
        }
        int[] number = new int[count];
        int[] number2 = new int[count];
        for(int i = 0;i < number.length;i++){
            number[i] = s%10;
            s = s/10;

        }

        for(int i = 0;i < number2.length;i++){
            number2[i] = number[count-1];
            count--;

        }

        for(int num:
        number2){
            System.out.print(num);
        }
    }

}
