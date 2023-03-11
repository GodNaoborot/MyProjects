package Project_1;

public class Containers implements GetMass{


    final int P_cont=7800;

    int a;

    int b;

    int c;

    int p;

    public Containers(int a, int b, int c, int p) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = p;
    }

    @Override
    public int getMass(){
        return((a*b*c)*(p)+getContMass());

    }

    public int getContMass(){
        return((a*b*c)*P_cont);
    }

    @Override
    public String toString() {
        return "Containers{" +
                "P_cont=" + P_cont +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", p=" + p +
                '}';
    }
}
