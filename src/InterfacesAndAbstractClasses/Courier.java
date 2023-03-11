package InterfacesAndAbstractClasses;

public class Courier extends Person implements Identifiable,ComputerSupportable{

    Computer computer;
    Office office;

    Courier(long id,String name,Computer computer){
        super(id,name);
        this.computer = computer;
    }
    Courier(long id,String name,Office office){
        super(id,name);
        this.office = office;
    }


    @Override
    public Long getId(){
        return this.id;
    }

    @Override
    public void setId(long id){
        this.id = id;
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

    @Override
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "computer=" + computer +
                ", office=" + office +
                '}';
    }


}
