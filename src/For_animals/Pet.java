package For_animals;

public class Pet {

    private String name;
    private int age;

    public Pet(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getChild(){
        return(this.name+" порождает animal");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Bobik",4);
        Cat1 cat1 = new Cat1("Barsik",4);
        Pet animal = new Pet("Animal1",3);
        System.out.println(dog.getChild());
        System.out.println(cat1.getChild());
        System.out.println(animal.getChild());

    }
}
