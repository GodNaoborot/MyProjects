package JavaTasks;
import java.util.*;

public class Task1 {

    public static void guessTheVehicle(){
        Scanner qwerty = new Scanner(System.in);
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        String rightAnswer = "Автобус";
        int counter = 3;
        while(counter>0){
            String answer = qwerty.next();
            answer = answer.toLowerCase();
            if(answer.equals(rightAnswer.toLowerCase())){
                System.out.println("Вы угадали");
                return;
            }else{
                counter--;
                System.out.println("У вас осталось "+counter+" попытки(а)");
            }



        }
        System.out.println("Вы проиграли");
    }


    public static void main(String[] args) {
        guessTheVehicle();
    }
}
