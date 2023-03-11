package pet;

public class Pet {

    int age;
    float weigth;
    float heigth;
    String color;


    public void eat(){
        System.out.println("Приятного аппетита!");

    }

    public void sleep(){
        System.out.println("Спокойной ночи! До завтра.");
    }

    public String say(String aWord){
        String petResponse = "Ну ладно"+aWord;
        return petResponse;
    }
}


