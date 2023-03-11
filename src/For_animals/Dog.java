package For_animals;

import For_animals.Pet;

public class Dog extends Pet {

    public Dog(String name,int age){
        super(name,age);
    }
    @Override
    public String getChild(){
        return(super.getName()+" порождает собаку");
    }

}
