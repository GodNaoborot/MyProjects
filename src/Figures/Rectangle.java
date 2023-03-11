package Figures;

public class Rectangle extends Figures{
    int a;
    int b;

    @Override
    public int Square(){
        return(a*b);
    }

    @Override
    public int Perimeter(){
        return((a+b)*2);
    }

}
