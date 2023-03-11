package Recursion;
import java.util.ArrayList;

public class Tasks2 {

    public static int arrSumm(int[] q,int n){
        if (n<=0){
            return 0;
        }else{

            return arrSumm(q,n-1)+q[n-1];

        }
    }

    public static void reverseString(String q){
        if (q.length()==0){
            return;
        }else{

            System.out.print(q.charAt(q.length()-1));
            reverseString(q.substring(0,q.length()-1));
        }
    }

    public static int solution(int number) {

        if (number < 0) {
            return 0;
        } else {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    arr.add(i);
                }


            }

            System.out.println(arr);
            return arr.get(2);
        }
    }


    public static int digital_root(int n){
        int res = 0;
        while(n>=0){

            int w = n/10;
            n = n%10;
            res+=w;

        }
        return res;


    }





    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arrSumm(arr,arr.length));
        reverseString("Hello");
        System.out.println(solution(25));
        System.out.println();
        System.out.println(digital_root(16));

    }
}
