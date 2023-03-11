import java.util.Arrays;
import java.util.Scanner;

public class Test_tasks {


    public static void main(String[] args) {
        task_1(4);
    }
    public static void task_1(int q){
        String result = "";
        Scanner qwerty = new Scanner(System.in);
        int[] array1 = new int[q];
        int[] array2 = new int[q];
        int[] array3 = new int[q];
        for (int i = 0;i< array1.length;i++){
            array1[i] = qwerty.nextInt();

        }
        System.out.println();

        for (int i = 0;i< array1.length;i++){
            array2[i] = qwerty.nextInt();
        }

        for (int i = 0;i<array3.length;i++){
            array3[i] = array1[i]*array2[i];
        }

        for (int i = 0;i<array3.length;i++){

            result += Integer.toString(array3[i])+" ";


        }
        System.out.println("First array: "+ Arrays.toString(array1));
        System.out.println("Second array: "+ Arrays.toString(array2));
        System.out.println("Result: "+ result);





        return;
    }
}
