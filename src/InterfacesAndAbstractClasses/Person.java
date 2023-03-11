package InterfacesAndAbstractClasses;

public abstract class Person {

    long id;

    String name;

    Person(long id, String name){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
