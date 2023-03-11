package Tasks_to_improve_skills;

import java.util.Locale;

public class Phone {

    private int number;
    private String model;
    private double weight;

    Phone(int number,String model,double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    Phone(int number,String model){
        this.number = number;
        this.model = model;
    }

    Phone(){};


    public String receiveCall(String name){
        return("Звонит "+name.toLowerCase(Locale.ROOT)+"с телефона "+getNumber());
    }

    public String receiveCall(String name, int number){
        return("Звонит "+name+"с телефона "+number);
    }

    public int getNumber(){
        return this.number;
    }

    public String sendMessage(int...numbers){
        String q = "";
        for(int i = 0;i< numbers.length;i++){
            q+=numbers[i]+" ";
        }
        return q;
    }

    public static void main(String[] args) {
        Phone iphone = new Phone(89213,"Моя правая почка",2.2);
        Phone iphone2 = new Phone(89214,"Моя левая почка",2.2);
        Phone iphone3 = new Phone(89215,"Моя девственность",2.2);
        System.out.println(iphone.model);
        System.out.println(iphone2.model);

        System.out.println(iphone.receiveCall("Отчим"));
        System.out.println(iphone.getNumber());
        System.out.println(iphone.receiveCall("Отчим",123));
        System.out.println(iphone.sendMessage(123,122,124,125));
    }

}
