package Work_With_Files;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class T8 {

    public static void readStringFile(File q){
        try{
            FileInputStream fis = new FileInputStream(q);

            BufferedInputStream bis = new BufferedInputStream(fis);

            while (bis.available() > 0){
                System.out.print((char) bis.read());
            }
        }catch(IOException ex){

            System.out.println(ex.getMessage());

        }

    }

    public static void main(String[] args) {
        File file = new File("C://Users//admin//Task7Java.txt");
        readStringFile(file);
    }
}
