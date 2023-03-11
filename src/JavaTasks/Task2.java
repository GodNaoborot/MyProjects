package JavaTasks;

import java.util.*;

public class Task2 {

    public static void converter(Integer q){
        String binaryQ = Integer.toBinaryString(q);
        String octalQ = Integer.toOctalString(q);
        String hexQ = Integer.toHexString(q);

        System.out.println(binaryQ+" "+octalQ+" "+hexQ);
    }

    public static void antiConverter(String q,int system){
        char[] chars = q.toCharArray();
        char[] arr = new char[chars.length];


        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',10);
        map.put('b',11);
        map.put('c',12);
        map.put('d',13);
        map.put('e',14);
        map.put('f',15);
        int res = 0;

        for(int i = chars.length-1;i >= 0;i--){
            if(Character.isDigit(chars[i])){
                res += (Integer.parseInt(String.valueOf(chars[i]))*((int)(Math.pow(system,chars.length-i-1))));
            }else{
                res +=(Integer.parseInt(String.valueOf(map.get(chars[i])))*((int)Math.pow(system,chars.length-i-1)));
            }
        }
        System.out.println(res);

    }



    public static void main(String[] args) {
        Integer q = 3316;
        converter(q);

        System.out.println();
        antiConverter("1010",2);//10+10+10+10+10
    }
}
