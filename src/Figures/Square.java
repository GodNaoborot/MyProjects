package Figures;

public class Square extends Figures{
    int a;


    @Override
    public int Square(){
        return(int)(Math.pow(a,2));
    }

    @Override
    public int Perimeter(){
        return((a*2)*2);
    }
}
