package Collections;
import Flowers.Printer;

import java.util.*;

public class HashMap_ {

    private static ArrayList<Integer> getKeys(int...q){
        ArrayList<Integer>keys_ = new ArrayList<>();
        for(int i = 0;i < q.length;i++){
            keys_.add(q[i]);
        }

        return keys_;
    }
    private static ArrayList<String> getValues(String...q){
        ArrayList<String> values_ = new ArrayList<>();
        for(int i = 0;i < q.length;i++){
            values_.add(q[i]);
        }

        return values_;
    }

    private static HashMap<Integer,String> Maps(int couples){
        Scanner qwerty = new Scanner(System.in);
        int keys_;
        String values_;
        HashMap<Integer,String> q = new HashMap<>();
        for(int i = 0;i < couples;i++){
            keys_ = qwerty.nextInt();
            values_ = qwerty.next();
            q.put(keys_,values_);
        }
        return q;
    }

    private static String getValue(int key,HashMap<Integer,String>q){
        return q.get(key);
    }

    private static ArrayList<Integer> getKey(String value,HashMap<Integer,String>q){
        Object[] s = q.keySet().toArray();
        ArrayList<Integer> res = new ArrayList<>();

        if(q.containsValue(value)){
            for(int i = 0;i < q.size();i++){
                if(q.get(s[i]).equals(value)){
                    res.add((Integer) s[i]);
                }
            }
        }
        return res;
    }

    private static HashMap<Integer,String> removeKey(int key,HashMap<Integer,String>q){
        q.remove(key);
        return q;
    }

    private static HashMap<String,Integer> replaceKeysAndValues(HashMap<Integer,String> q){
        Object[] keys_ = q.keySet().toArray();
        Object[] values_ = new Object[keys_.length];
        ArrayList<String> values = new ArrayList<>();
        HashMap<String,Integer>result = new HashMap<>();


        for(int i = 0;i<keys_.length;i++){
            values.add(q.get(keys_[i]));
            values_[i]=values.get(i);
        }

        for(int i = 0;i < q.size();i++){
            result.put((String) values_[i],(Integer)keys_[i]);
        }

        return result;
    }






    public static void main(String[] args) {
        //task1
        Scanner qwerty = new Scanner(System.in);
        int n1 = qwerty.nextInt();
        HashMap<Integer,String> w = Maps(n1);
        System.out.println(w);
        //
        Set<Integer> k= w.keySet();
        System.out.println(k);
        //task2
        System.out.println(getValue(1,w));
        //
        System.out.println();
        //task3
        System.out.println(getKey("Andre",w));
        //
        System.out.println();
        //task4
        System.out.println(removeKey(3,w));
        //
        System.out.println();
        //task6
        System.out.println();
        //
        System.out.println();
        //task7
        System.out.println(replaceKeysAndValues(w));
        //
        System.out.println();
    }
}
