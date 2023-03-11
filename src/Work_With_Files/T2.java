package Work_With_Files;

import Tasks_to_improve_skills.Reader;

import java.io.FileInputStream;
import java.io.IOException;

public class T2 extends Reader {


    String file;


    public T2(String file) {
        super(file);
    }

    public static void changeFile(){
        try(FileInputStream fis = new FileInputStream("C://Users//admin//FileForWork2.txt")){
            int i;
            while((i = fis.read())!=-1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }

    public static void main(String[] args) {
        changeFile();
    }
}
