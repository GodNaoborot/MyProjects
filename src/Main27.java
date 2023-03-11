import java.util.Objects;
import java.util.Scanner;

public class Main27 {


    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        //int t1 = qwerty.nextInt();
        //task_1(t1);
        int t2 = qwerty.nextInt();
        //task_2(t2);
        //task_3(t2);
        //task_4(t2);
        task_6(t2);

    }


    public static void task_1(int q){
        Scanner qwerty = new Scanner(System.in);

        String[] nums = new String[q];
        int[] nums2 = new int[q];



        for(int i = 0;i<q;i++) {
            nums[i] = qwerty.next();
            int b = nums[i].length();
            nums2[i] = b;
        }
        String max_str = nums[0];
        String min_str = nums[0];

        for (int i = 0;i<q;i++){
            if (max_str.length()<nums[i].length()){
                max_str = nums[i];
            }
            if (min_str.length()>nums[i].length()){
                min_str = nums[i];
            }


        }
        System.out.println(max_str+" "+max_str.length());
        System.out.println(min_str+" "+min_str.length());

    }


    public static void task_2(int q){
        Scanner qwerty = new Scanner(System.in);

        String[] nums = new String[q];

        for(int i = 0;i<q;i++) {
            nums[i] = qwerty.next();

        }
        for (int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length-1;j++){
                if(nums[j].length()<nums[j+1].length()){
                    String num1 = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = num1;
                }
            }
        }
        for (String str: nums){
            System.out.println(str);
        }

    }


    public static void task_3(int q){
        Scanner qwerty = new Scanner(System.in);

        String[] strings = new String[q];
        int q2 = q/2+1;

        int[] nums = new int[q];

        for(int i = 0;i<q;i++) {
            strings[i] = qwerty.next();
            nums[i] = strings[i].length();


        }
        int r = 0;
        int u = 0;


        for(int i = 0;i < strings.length;i++){
            for(int j = 0;j < strings.length-1;j++){
                if (strings[j].length() > strings[j+1].length()) {
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                }
            }
        }
        for(int i = 0;i < strings.length;i++){
            if(strings[i].length() < strings[q2].length()){
                u+=1;
            }
        }
        String[] strings2 = new String[u-1];


        for (int i = 0;i<strings2.length;i++) {
            if (strings[i].length() < strings[q2].length()){
                strings2[i] = strings[i];

            }
        }
        for(String str: strings2){
            System.out.println(str);
        }


    }

    public static void task_4(int q){
        Scanner qwerty = new Scanner(System.in);

        String[] strings = new String[q];
        int[] nums = new int[q];


        for(int i = 0;i<q;i++) {
            strings[i] = qwerty.next();

        }

        for(int i = 0;i < strings.length;i++){
            for(int j = 0;j < strings.length-1;j++){
                if (strings[j].length() > strings[j+1].length()) {
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length;i++){
            nums[i] = (int) strings[i].chars().distinct().count();
        }
        int temp = nums[0];
        for (int i = 0; i < nums.length;i++){
            if(temp<nums[i]){
                System.out.println(strings[0]);
                return;


            }else if(temp>nums[i]){
                System.out.println(strings[i]);
                return;
            }
        }





    }


    public static void task_5(int q){
        Scanner qwerty = new Scanner(System.in);
        String[] strings = new String[q];
        int[] nums1 = new int[q];
        int[] nums2 = new int[q];

        for(int i = 0;i<strings.length;i++){
            strings[i] = qwerty.next();
            nums1[i] = strings[i].length();
        }

        for(int i = 0;i<strings.length;i++){
            for(int j = 0;j< strings.length-1;j++){
                if(strings[j].length()>strings[j+1].length()){
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                }
            }
        }

        for(int i = 0;i<strings.length;i++) {
            for (int j = 0; j < strings.length - 1; j++) {
                if(nums1[j]>nums1[j+1]){
                    int temp1 = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp1;
                }
            }
        }


        for(int i = 0;i< nums2.length;i++){
            nums2[i] = (int) strings[i].chars().distinct().count();
        }

        for(int i = 0;i< nums1.length;i++){
            if(nums1[i]==nums2[i]){
                System.out.println(strings[i]);
                return;
            }
        }

    }


    public static void task_6(int q) {

        Scanner qwerty = new Scanner(System.in);


        String[] strings1 = new String[q];
        String[] strings2 = new String[q];
        int sum = 0;



        for(int i = 0;i < strings1.length;i++){
            strings1[i] = qwerty.next();
            sum += strings1.length;
        }

        for(int i = 0;i < strings2.length;i++){
            strings2[i] = new StringBuilder(strings1[i]).reverse().toString();

        }
        for(int i = 0;i < strings2.length;i++) {
            if (Objects.equals(strings1[i], strings2[i])) {
                System.out.println(strings1[i]);


        }
        }





    }

}
