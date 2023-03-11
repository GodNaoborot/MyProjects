package Project_1;

public class Cisterns implements GetMass{

    final double Pi = 3.14;

    final int P_cistern = 7800;

    int h;

    int r;

    int p;

    public Cisterns(int h, int r, int p) {
        this.h = h;
        this.r = r;
        this.p = p;
    }

    @Override
    public int getMass(){
        return (int) ((Pi*(Math.pow(r,2))*h)*p+getCisternMass());
    }

    public int getCisternMass(){
        return(int)(Pi*(Math.pow(r,2))*h*P_cistern);

    }

    @Override
    public String toString() {
        return "Ñisterns{" +
                "Pi=" + Pi +
                ", P_cistern=" + P_cistern +
                ", h=" + h +
                ", r=" + r +
                ", p=" + p +
                '}';
    }
}
