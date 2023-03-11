package Generics;

import java.util.*;

public class Task2 {

    public static <T> void task2(T[] q,int q1,int q2){
        T num = q[ q1];
        q[q1] = q[q2];
        q[q2] = num;

        for(int i = 0;i < q.length;i++){
            System.out.println(q[i]);
        }
    }

    public static<T extends Number> void sorting(T[] q,char chr){
        if (chr=='+'){
            for(int i = 0;i < q.length;i++){
                for(int j = 0;j < q.length-1;j++){
                    if(q[j].hashCode()>q[j+1].hashCode()){
                        T temp = q[j];
                        q[j] = q[j+1];
                        q[j+1] = temp;
                    }
                }
            }
        }else if (chr == '-'){
            for(int i = 0;i < q.length;i++){
                for(int j = 0;j < q.length-1;j++){
                    if(q[j].hashCode()<q[j+1].hashCode()){
                        T temp = q[j];
                        q[j] = q[j+1];
                        q[j+1] = temp;
                    }
                }
            }
        }

        for(int i = 0;i < q.length;i++){
            System.out.println(q[i]);
        }
    }

    public static <T> int max(List<T>q){
        Comparator<T> comp = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if(o1.hashCode()>o2.hashCode()){
                    return 1;
                } else if(o1.hashCode()<o2.hashCode()){
                    return -1;
                }else{
                    return 0;
                }
            }

        };
        List<T> list = q.stream().sorted(comp).toList();
        return (int) list.get(list.size()-1);
    }

    public static <T>int averageNumber(Set<T> q){
        int num = 0;
        for(T i:
        q){
            num +=(int)i;

        }

        return num/q.size();
    }

    public static <T>List<T> convertToList(T[] arr){
        List<T>list = new ArrayList<>();

        list.addAll(List.of(arr));

        return list;
    }

    public static <T>T arrElementFinder(T[] arr){
        Scanner qwerty = new Scanner(System.in);
        int index = qwerty.nextInt();

        return arr[index];
    }



    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num1 = 3;
        int num2 = 5;
        task2(arr1, num1, num2);

        char chr = '-';
        System.out.println();
        sorting(arr1,chr);

        List<Integer> q = new ArrayList<>();
        q.add(5);
        q.add(3);
        q.add(6);
        q.add(10);
        q.add(2);

        System.out.println();
        System.out.println(max(q));

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(5);
        set.add(4);
        set.add(2);

        System.out.println();
        System.out.println(averageNumber(set));

        System.out.println();
        System.out.println(convertToList(arr1));

        System.out.println();
        System.out.println(arrElementFinder(arr1));

    }
}
