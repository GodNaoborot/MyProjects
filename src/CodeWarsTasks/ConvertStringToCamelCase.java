package CodeWarsTasks;

import JavaPatterns.Builder.dishes.fast_food.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ConvertStringToCamelCase {

    public static String toCamelCase(String s){
        if(s.isEmpty()){
            return "";
        }
        String[] strings = s.split(" ");
        String str = "";
        List<String> list = new ArrayList<>();
        List<String> finalList = new ArrayList<>();
        for(int i = 0; i < strings.length;i++){
            if(!strings[i].isEmpty()){
                str+=strings[i];
            }
        }
        strings = str.split("");
        for(int i = 0; i < strings.length;i++){
            if(!Character.isLetter(strings[i].charAt(0))){
                strings[i] = " ";
            }
        }
        str = "";
        for(int i = 0;i < strings.length;i++){
            str+=strings[i];

        }

        strings = str.split(" ");
        str = "";
        for(String strs:
        strings){
            if(!strs.isEmpty()){
                list.add(strs);
            }
        }

        for(int i = 0;i < strings.length;i++){

            if(!strings[i].isEmpty()){
                str+=strings[i];
                break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";

        for(int i = 0;i < strings.length;i++){
            str2+=strings[i];
        }

        list.remove(str);
        String finalStr = "";

        strings = list.toArray(new String[0]);
        for(int i = 0; i < strings.length;i++){
            String st = strings[i].substring(0,1).toUpperCase();
            String st2 = strings[i].substring(1,strings[i].length());
            finalList.add(st+st2);
        }
        finalList.add(0,str);

        for(String strs:
        finalList){
            finalStr+=strs;
        }

        return finalStr;
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("-  square- left-Green-^ side  - bridge- Rockstar-Samurai  "));
    }
}
