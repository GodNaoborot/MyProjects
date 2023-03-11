public class Dendji extends Animal{

    public Dendji(String name,int age){
        super(name,age);
    }

    public static void main(String[] args) {
        Dendji dog = new Dendji("Dendji",16);
        dog.woof();

    }
}
