package For_animals;

import For_animals.Pet;

public class Cat1 extends Pet {
    public Cat1(String name,int age){
        super(name,age);
    }

    @Override
    public String getChild(){
        return(super.getName()+" порождает кота");
    }
}
