package Work_With_Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class T1 extends Writer {


    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }

    public static void recordFiles(String q){

        try(FileOutputStream fos = new FileOutputStream("C://Users//admin//FileForWork.txt")){

            byte[] buffer = q.getBytes(StandardCharsets.UTF_8);
            fos.write(buffer,0,buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        String w = qwerty.next();
        recordFiles(w);
    }



}
