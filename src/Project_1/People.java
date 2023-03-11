package Project_1;

public class People implements GetMass{

    private int mass;

    People(int mass){
        this.mass = mass;
    }

    @Override
    public int getMass(){
        return mass;
    }


    @Override
    public String toString() {
        return "People{" +
                "mass=" + mass +
                '}';
    }
}
