package Tasks_to_improve_skills;

public class Person {

    private String fullName;

    private int age;

    Person(String fullName,int age){
        this.fullName = fullName;
        this.age = age;
    }

    Person(){};

    public String move(){
        return("какой-то "+getAge()+" идёт");
    }

    public String talk(){
        return("какой-то "+getFullName()+" говорит");
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Person("Дядя Богдан",44);

        System.out.println(obj2.getFullName());
        obj1.age = 1;
        System.out.println(obj1.getAge());
    }
}
