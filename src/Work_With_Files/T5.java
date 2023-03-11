package Work_With_Files;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class T5 {


    public static void convertString(String q){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = q.getBytes();
        try{
            baos.write(buffer);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(baos.toString());
        byte[] array = baos.toByteArray();
        for(byte b: array){
            System.out.println((char) b);
        }
    }

    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        String w = qwerty.next();
        convertString(w);
    }


}
