public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;

    }

    public Animal(){

    }

    public void woof(){
        System.out.println("Woof woof");
    }
}
