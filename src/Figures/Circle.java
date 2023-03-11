package Figures;

public class Circle extends Figures{
    int r;
    final double Pi = 3.14d;


    @Override
    public int Square(){

        return (int) (Math.pow(r,2)*Pi);



    }
    @Override
    public int Perimeter(){
        return(int)(2*Pi*r);

    }


}
