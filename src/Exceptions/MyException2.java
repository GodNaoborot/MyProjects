package Exceptions;

public class MyException2 extends RuntimeException{

    public String exceptn;

    MyException2(String exceptn){
        this.exceptn = exceptn;
    }

    public static double runtimeexc(double q,double w)throws RuntimeException{
        double res = q/w;
        if (w==0) {
            throw new MyException2("EFASDQQEER");

        }
        return res;
    }

    public static int[] except(int q,int r)throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[q];
        if(arr.length+r>q){
            throw new MyException2("ARRAYERROR");
        }
        for (int i = 0;i < arr.length+r;i++){
            arr[i] = 1;

        }
        return arr;

    }

    public static int task3()throws MyException2{
        int q = (int)(Math.random()*3);
        int t = 0;
        if (q==1){
            int[] arr = new int[5];
            if(arr.length+1>q){
                throw new MyException2("ARRAYERROR");
            }
            for (int i = 0;i < arr.length+1;i++){
                arr[i] = 1;
                t+=arr[i];

            }

        }else if(q==2){
            if(t==0){
                throw new MyException2("Exception!!!");
            }

        }else{
            if(t+4==1){
                throw new MyException2("BOOM");
            }
        }
        return t;
    }


    public static int task4()throws MyException2{
        int random = (int)(Math.random()*2);
        if (random==0){
            throw new MyException2("BOOM");
        }
        return random;
    }


    public static void task5(){
        int r = (int)(Math.random()*2);

        int q2 = 0;


        try{
            if (r==1){
                r = r/q2;

            }
            else{
                r = r*q2;
            }
        }catch(ArithmeticException ex){
            System.out.println("MATH_ERROR");
            return;
        }finally{
            System.out.println(r);
        }

    }

    public static void main(String[] args) {
        /*try{
            System.out.println(runtimeexc(5,0));
        }catch(RuntimeException ex){
            System.out.println(ex);
        }

        try{
            System.out.println(except(5,1));
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("s");
        }

        try{
            System.out.println(task3());
        }catch(MyException2 ex){
            System.out.println(ex);
        }

        try{
            System.out.println(task4());
        }catch(MyException2 ex){
            System.out.println(ex);

        }finally{
            System.out.println(task4());
        }*/

        task5();
    }




}
