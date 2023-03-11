package Figures;

public class Test1 {

    public static void main(String[] args) {
        Circle q = new Circle();
        q.r = 12;
        System.out.println(q.Square());
        System.out.println(q.Perimeter());

        System.out.println();

        Square a = new Square();
        a.a = 4;
        System.out.println(a.Square());
        System.out.println(a.Perimeter());

        System.out.println();

        Rectangle b = new Rectangle();
        b.a = 6;
        b.b = 8;
        System.out.println(b.Square());
        System.out.println(b.Perimeter());
    }

}
