package Work_With_Files;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class T7 {

    public static void writeStringFile(String q){
        try(FileOutputStream out = new FileOutputStream("C://Users//admin//Task7Java.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)){
            byte[] buffer = q.getBytes();
            bos.write(buffer,0,buffer.length);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        writeStringFile("QWERTY ds");
    }
}
