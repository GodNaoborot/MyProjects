package JavaTasks;
import java.util.*;

public class Task1 {

    public static void guessTheVehicle(){
        Scanner qwerty = new Scanner(System.in);
        System.out.println("��� ��� �����: �����, �������, � ����� � ��������� ����� �������?");
        String rightAnswer = "�������";
        int counter = 3;
        while(counter>0){
            String answer = qwerty.next();
            answer = answer.toLowerCase();
            if(answer.equals(rightAnswer.toLowerCase())){
                System.out.println("�� �������");
                return;
            }else{
                counter--;
                System.out.println("� ��� �������� "+counter+" �������(�)");
            }



        }
        System.out.println("�� ���������");
    }


    public static void main(String[] args) {
        guessTheVehicle();
    }
}
