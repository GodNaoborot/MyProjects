package pet;

public class Pet {

    int age;
    float weigth;
    float heigth;
    String color;


    public void eat(){
        System.out.println("��������� ��������!");

    }

    public void sleep(){
        System.out.println("��������� ����! �� ������.");
    }

    public String say(String aWord){
        String petResponse = "�� �����"+aWord;
        return petResponse;
    }
}


