package Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;


public class HashSet_ {

    private static int countUnique(ArrayList<Integer> q){
        HashSet<Integer> list = new HashSet();
        for (Integer i:
            q){
            list.add(i);
        }
        return (list.size());
    }

    private static ArrayList<Integer> addingInArrList(int...q){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i < q.length;i++){
            list.add(q[i]);
        }
        return list;

    }


    private static boolean isInSet(HashSet<Integer> q){
        if(q.size()>0){
            return true;
        }
        else{
            return false;
        }
    }


    private static HashSet<Integer> addingInHashSet(int...q){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < q.length;i++){
            set.add(q[i]);
        }
        return set;
    }


    private static void deleteElements(HashSet<Integer> q){
        Scanner qwerty = new Scanner(System.in);
        q.clear();
        System.out.println(q);
    }


    private static void clearSet(HashSet<Integer> q){
        if(q.isEmpty()){
            System.out.println(q);
        }
        else{
            q.clear();
            System.out.println(q);

        }
    }



    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(addingInArrList(1,3,4,6,5,3,4));
        System.out.println(countUnique(list1));

        HashSet<Integer> set2 = new HashSet<>(addingInHashSet(1,2,3,4,5,6,7,8,9,10,1,4,5));
        System.out.println(set2);
        System.out.println(isInSet(set2));
        deleteElements(set2);
        clearSet(set2);
    }

}
