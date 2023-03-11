public class Mw2 {
    int i;
    String s;
    public Mw2(int i){
        this.i = i;

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static Mw2 up(int i){
        //Code
        i = i + 3;


        return new Mw2(i);
    }

    @Override
    public String toString() {
        return "Mw2{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Mw2 q = new Mw2(1);
        System.out.println(2);
    }
}
