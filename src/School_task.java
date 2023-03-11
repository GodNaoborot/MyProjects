import java.util.Scanner;

public class School_task {

    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        int n = qwerty.nextInt();
        task(n);


    }
    public static void task(int n){
        Scanner qwerty = new Scanner(System.in);
        int[] array = new int [n];



        for (int i = 0;i < array.length;i++){
            array[i] = qwerty.nextInt();
        }
        int count = 0;

        for(int i:
        array){
            if(i%2==0 & i>0){
                count++;
            }
        }

        int[] array2 = new int[count];
        int r = 0;
        for(int i:
        array){
            if(i%2==0 & i>0){
                array2[r] = i;
                r++;
            }
        }
        int max;
        int min;

        if (array2.length > 0) {

            max = array2[0];
            min = array2[0];
        }else{
            System.out.println(-1+" "+-1);
            return;
        }

        int[] array3 = new int[2];

        for(int i = 0;i < array2.length;i++){
            if(max<array2[i]){
                max = array2[i];
            }
            if(min>array2[i]){
                min = array2[i];
            }
        }

        array3[0] = min;
        array3[1] = max;

        if (array3.length>0){
            System.out.println(array3[0]+" "+array3[1]);
        }


    }
}
