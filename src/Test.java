import java.util.Scanner;

public class Test {
    Scanner qwerty = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        //int t = qwerty.nextInt();
        //fibbonachi(t-1);
        int t2 = qwerty.nextInt();
        sort(t2);

    }
    private static void fibbonachi(int q) {
        int[] array = new int[q];
        int a = 0;
        int b = 1;
        int b2 = 1;
        int c = 0;
        System.out.println(a);
        while (c != q) {
            if (b2==a+b){
                b2 += b;
                a = b;


            }else if (b2>a+b){

                while (b!=b2-a) {
                    b++;

                }if (b2==a+b) {
                    b2 += b;
                    a = b;
                }
            }
            c++;
            System.out.println(a);
        }
    }

    private static void sort(int q){
        Scanner qwerty = new Scanner(System.in);

        int[] nums = new int[q];
        int[] nums2 = new int[q];

        for(int i = 0;i < q;i++){
            nums[i] = qwerty.nextInt();
        }
        int r = 0;
        int min_element = nums[0];


        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
        for(int num: nums){
            System.out.println(num);
        }

    }

}

