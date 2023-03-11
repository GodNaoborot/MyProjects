package For_animals;

import java.util.Objects;
import java.util.Scanner;

public class Patient {
    public Patient(String name, String surname, String adress, String phone_number, int med_card_number, String diagnose) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.phone_number = phone_number;
        this.med_card_number = med_card_number;
        this.diagnose = diagnose;

    }

    public String name;
    public String surname;
    public String adress;
    public String phone_number;
    public int med_card_number;
    public String diagnose;


    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        String diagnose = qwerty.next();
        Patient patient1 = new Patient("Peter","Chavinskii","Gogolya_Street","8(931)341-64-65",312453,"cancer");
        Patient patient2 = new Patient("Andrey","Petrov","Japanese_Street","8(942)544-64-76",535373,"dyslexia");
        Patient patient3 = new Patient("Henry","Jordan","Space_Street","8(900)635-75-43",52423,"cancer");
        Patient[] patients ={patient1,patient2,patient3};
        for(int i = 0;i<patients.length;i++) {
            if (Objects.equals(diagnose, patients[i].diagnose)) {
                System.out.println(patients[i].name);
            }
        }
        for(int i = 0;i<patients.length;i++){
            for(int j = 234132;j < 1000000;j++){
                if(j==patients[i].med_card_number){
                    System.out.println(patients[i].name);
                }
            }
        }







    }


    public static void array(int q){

        Scanner qwerty = new Scanner(System.in);
        int[] nums = new int[q];

        for(int i = 0;i<nums.length;i++){
            nums[i] = (int)(Math.random()*100);

        }

        System.out.println();
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("Min element is "+nums[0]);
        System.out.println("Middle element is "+nums[q/2]);
        System.out.println("Max element is "+nums[q-1]);

    }

    public static void task_2(){
        Scanner qwerty = new Scanner(System.in);




    }



}
