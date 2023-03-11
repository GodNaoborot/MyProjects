package Collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {

        Date q = new Date();

        ArrayList<Integer> nums = new ArrayList<>();

        LinkedList<String> strings = new LinkedList<>();

        long t1=q.getTime();

        for (int i = 0;i < 10001;i++){
            nums.add(i);



        }
        Date q2 = new Date();
        long t2 = q2.getTime();
        System.out.println();

        System.out.println(t2-t1+" ArrayList add");

        System.out.println();
        Date q3 = new Date();
        long t3 = q3.getTime();

        for (int i = 0;i < 10001;i++){
            strings.add(""+i);
        }
        Date q4 = new Date();
        long t4 = q4.getTime();
        System.out.println();

        System.out.println(t4-t3+" LinkedList add");

        System.out.println();


        Date q5 = new Date();
        long t5 = q5.getTime();
        for(int i =10000;i > 0;i--) {
            System.out.println(nums.get(i));
        }
        Date q6 = new Date();
        long t6 = q6.getTime();
        System.out.println();

        System.out.println(t6-t5+" ArrayList get");

        System.out.println();
        Date q7 = new Date();
        long t7 = q7.getTime();
        for(int i =10000;i > 0;i--) {
            System.out.println(strings.get(i));
        }
        Date q8 = new Date();
        long t8 = q8.getTime();
        System.out.println();

        System.out.println(t8-t7+" LinkedList get");

        System.out.println();


        Date q9 = new Date();
        long t9 = q9.getTime();
        for(int i =10000;i > 0;i--){
            nums.remove(i);
        }
        Date q10 = new Date();
        long t10 = q10.getTime();
        System.out.println();

        System.out.println(t10-t9+" ArrayList remove");

        System.out.println();


        Date q11 = new Date();
        long t11 = q11.getTime();
        for(int i =10000;i > 0;i--){
            strings.remove(i);
        }
        Date q12 = new Date();
        long t12 = q12.getTime();
        System.out.println();

        System.out.println(t12-t11+" LinkedList remove");

        System.out.println();

        System.out.println(nums);
        System.out.println(strings);

        System.out.println();





    }
}
