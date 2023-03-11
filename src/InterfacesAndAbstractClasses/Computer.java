package InterfacesAndAbstractClasses;

public class Computer extends NotAPerson{
    Computer(long id,String name){
        super(id,name);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
