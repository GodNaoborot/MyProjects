package String_Revision;

import java.util.*;

public class Task3 {


    public static String mask(String q){

        if(q.length()>5){
            String w = "";
            String e = "";
            char[] chars = q.toCharArray();
            for(int i = 0;i < chars.length-4;i++){
                w += chars[i];
                e +="#";
            }
            q = q.replaceAll(w,e);
            return q;
        }else if(q.length()==5){
            q = q.replace(q.charAt(0),'#');
            return q;
        }else{
            return q;
        }


    }

    public static ArrayList<String> addToList1(String...k){
        ArrayList<String> list1 = new ArrayList<>();
        for(int i = 0;i < k.length;i++){
            list1.add(k[i]);
        }
        return list1;
    }

    public static ArrayList<String> addToList2(String...v){
        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0;i < v.length;i++){
            list2.add(v[i]);
        }
        return list2;
    }

    public static HashMap<String,String> addToMap(ArrayList<String> k,ArrayList<String> v){
        HashMap<String,String> map = new HashMap<>();
        for(int i = 0;i < k.size();i++){
            map.put(k.get(i),v.get(i));
        }
        return map;
    }



    public static String englishToMorse(String morseCode, HashMap<String,String> map){
        String wordDecode = "";
        String finalWord = "";
        char[] arr = morseCode.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0;i < arr.length;i++){
            list.add(arr[i]);

        }
        for(int i = 0;i < morseCode.length();i++){
            if(arr[i]!=' ') {
                wordDecode += arr[i];


            }else if(arr[i]==' '&&arr[i+1]==' '&&arr[i+2]==' '){
                if (wordDecode.length() > 0) {
                    finalWord += map.get(wordDecode);
                }
                finalWord += " ";
                wordDecode = "";
                i+=2;


            }else if(arr[i]==' '){
                finalWord += map.get(wordDecode);
                wordDecode = "";

            }
        }

        finalWord+=map.get(wordDecode);
        return finalWord;

    }

    public static String MorseToEnglish(String morseCode,HashMap<String,String> map){
        String wordDecode = "";
        String finalWord = "";
        char[] arr = morseCode.toCharArray();

        for(int i = 0;i < arr.length;i++){
            if(arr[i]!=' '){
                wordDecode += arr[i];
                finalWord += map.get(wordDecode)+" ";
                wordDecode = "";
            }else if(arr[i] == ' '){
                finalWord += "  ";
            }
        }
        if(morseCode.charAt(morseCode.length()-1)==' '){
            finalWord = finalWord;
        }else{
            finalWord = finalWord.substring(0,finalWord.length()-1);
        }



        return finalWord;
    }

    public static void main(String[] args) {
        System.out.println(mask("n1234"));

        ArrayList<String> list1 = new ArrayList<>(addToList1(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"));
        ArrayList<String> list2 = new ArrayList<>(addToList2("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0"));
        HashMap<String,String> map = new HashMap<>(addToMap(list1,list2));

        HashMap<String,String> map2 = new HashMap<>(addToMap(list2,list1));

        System.out.println(map);

        System.out.println(englishToMorse("... -.-. .... --- --- .-..", map));

        System.out.println(MorseToEnglish("WE ARE LEADERS",map2));




    }
}
