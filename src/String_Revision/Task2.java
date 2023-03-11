package String_Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task2 {


    public static String findLongestPalindrom(String q) {

        System.out.println(q);
        int spaceCounter = 0;
        char[] chars = q.toCharArray();
        String str = "";
        int ind = 0;



        for (int i = 0; i < q.length(); i++) {
            if (chars[i] == ' ') {
                spaceCounter++;
            }
        }


        String[] arr = new String[spaceCounter];
        int[] intArr = new int[arr.length];
        int[] intArr2 = new int[arr.length];

        for (int i = 0; i < q.length(); i++) {
            if (chars[i] != ' ') {
                str += chars[i];


            } else if (chars[i] == ' ') {
                if (ind < arr.length) {

                    if (str.startsWith(" ")) {
                        str = str.substring(1, str.length());
                        arr[ind] = str;
                        str = " ";
                        ind++;
                        spaceCounter--;

                    } else {
                        arr[ind] = str;
                        str = " ";
                        ind++;
                        spaceCounter--;
                    }
                }
            }
        }

        str = str.substring(1,str.length());
        arr[arr.length-1] = str;
        int num = 0;



        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() % 2 != 0) {
                num = oddWord(arr[i]);
                intArr[i] = num;
                intArr2[i] = num;
            } else {
                num = evenWord(arr[i]);
                intArr[i] = num;
                intArr2[i] = num;

            }
        }
        int temp = intArr[0];
        int finalInd = 0;


        for (int i = 0; i < intArr.length - 1; i++) {
            if (temp < intArr[i + 1]) {
                intArr[i] = intArr[i + 1];
                temp = intArr[i];
            }
        }

        for (int i = 0; i < intArr2.length; i++) {
            if (intArr2[i] != temp) {
                finalInd++;
            }else if(intArr[i] == temp){
                return arr[finalInd];
            }

        }

        return ("Среди этих слов нету слова палиндрома");

    }


    public static int oddWord(String q) {
        char[] arr = q.toCharArray();
        String[] arr2 = new String[arr.length];
        int countUniqueChars = 0;

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = String.valueOf(arr[i]);
        }

        for (int i = 0; i < arr2.length / 2; i++) {
            if (arr2[i].equals(arr2[arr2.length - 1 - i])) {
                countUniqueChars += 2;

            }
        }
        if ((q.length() - countUniqueChars - 1) == 0) {
            return q.length();
        } else {
            return -1;
        }

    }


    public static int evenWord(String q) {
        char[] arr = q.toCharArray();
        String[] arr2 = new String[arr.length];
        int countUniqueChars = 0;

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = String.valueOf(arr[i]);
        }

        for (int i = 0; i < arr2.length / 2; i++) {
            if (arr2[i].equals(arr2[arr2.length - 1 - i])) {
                countUniqueChars += 2;

            }
        }
        if ((q.length() - countUniqueChars) == 0) {
            return q.length();
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        System.out.println(findLongestPalindrom("1221221221221 1331 my 2121212 s3qsa 313131313 sdadadada wqwqwqwqwqwqw"));

    }
}

