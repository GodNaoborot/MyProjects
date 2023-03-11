package Comparators;

public class Person {


    private int age;
    private String name;
    private Boolean isDead;

    public Person(int age, String name, Boolean isDead) {
        this.age = age;
        this.name = name;
        this.isDead = isDead;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Boolean getDead() {
        return isDead;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isDead=" + isDead +
                '}';
    }
}
