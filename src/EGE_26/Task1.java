package EGE_26;
import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;

public class Task1 {

    public static void readFiles(){
        try(FileInputStream fis = new FileInputStream("C://Users//admin//JavaEge26//26.txt")){
            int i;
            while((i = fis.read())!=-1) {
                System.out.print((char) i);
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }



    public static void main(String[] args) {
        readFiles();
    }
}
