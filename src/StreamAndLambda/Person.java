package StreamAndLambda;

import java.util.ArrayList;


public class Person {

    private String name;
    private int age;

    Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    public static ArrayList<Person> PersonsToArr(Person...q){
        ArrayList<Person> arr = new ArrayList<>();
        for(int i = 0;i < q.length;i++){
            arr.add(q[i]);

        }
        return arr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
