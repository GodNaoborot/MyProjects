package InterfacesAndAbstractClasses;

public class SecurityGuard extends Person implements Identifiable,ComputerSupportable,OfficeSupportEntity{
    Computer computer;
    Office office;

    SecurityGuard(long id, String name,Computer computer) {
        super(id, name);
        this.computer = computer;
    }

    SecurityGuard(long id, String name,Office office) {
        super(id, name);
        this.office = office;
    }

    public String getName(){
        return name;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

    @Override
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public Office getOffice(){
        return office;
    }

    @Override
    public void setOffice(Office office){
        this.office = office;
    }

    @Override
    public String toString() {
        return "SecurityGuard{" +
                "computer=" + computer +
                ", office=" + office +
                '}';
    }
}
