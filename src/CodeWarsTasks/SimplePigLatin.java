package CodeWarsTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplePigLatin {

    public static String pigIt(String str) {
        char[] chars = str.toCharArray();
        String[] strings = str.split(" ");

        String s = "";
        List<String> list = new ArrayList<>();
        for(int i = 0;i < strings.length;i++){
            StringBuilder stringBuilder = new StringBuilder();
            char ch = strings[i].charAt(0);
            s = strings[i];

            s = s.substring(1,s.length());
            s+=String.valueOf(ch);
            if(Character.isLetter(s.charAt(0))){
                s+="ay";
            }
            list.add(s);
            s = "";
        }

        s = "";

        for(int i = 0;i < list.size();i++){
            s+=list.get(i)+" ";
        }

        s = s.substring(0,s.length()-1);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(pigIt("This is , my string !"));
    }

}
