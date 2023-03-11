package For_animals;

public class Whale extends Cat {



    public Whale(String name, int age) {
        super(name,age);
    }
    @Override
    public String getName(){
        return("я не кот, "+super.getName());
    }

    public String getName(String q){
        return("");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Кот",2);
        System.out.println(cat.getName());
        Whale whale = new Whale("Кит",13);
        System.out.println(whale.getName());
        System.out.println(whale.getName(null));
    }
}
