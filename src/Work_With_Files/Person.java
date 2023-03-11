package Work_With_Files;

import java.io.*;

public class Person implements Serializable {

    String name;

    String surname;

    int age;

    String number;

    boolean isalive;

    public Person(String name, String surname, int age, String number, boolean isalive) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
        this.isalive = isalive;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }

    public boolean isIsalive() {
        return isalive;
    }

    public static void serializePerson(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C://Users//admin//Person.txt"))){
            Person person = new Person("Tom","Jenkins",31,"1(104)431-54-31",true);
            oos.writeObject(person);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void deserializePerson(){
        try(ObjectInputStream ois = new ObjectInputStream((new FileInputStream("C://Users//admin//Person.txt")))){
            Person p = (Person) ois.readObject();
            System.out.printf("Name: %s,SurName: %s,age:%d,Number:%s,IsAlive:%b",p.getName(),p.getSurname(),p.getAge(),p.getNumber(),p.isIsalive());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());

        }
    }


    public static void main(String[] args) {
        serializePerson();
        deserializePerson();
    }
}
