package Work_With_Files;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class T6 {

    public static void readStringArr(String q){
        byte[] array = q.getBytes();
        ByteArrayInputStream byteStream = new ByteArrayInputStream(array,0,array.length);
        int b;
        while((b = byteStream.read())!=-1){
            System.out.println((char) b);
        }
    }

    public static void main(String[] args) {
        readStringArr("HELL");
    }
}
