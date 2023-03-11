package Exceptions;

public class MyException extends Exception{

    public String w;

    MyException(String w){
        this.w = w;
    }

    public static int exceptions(int q,int t)throws Exception{
        int res = q/t;
        if(t==0){
            throw new MyException("Exception!!!");
        }
        return res;

    }



    public static void main(String[] args) {
        try{
            System.out.println(exceptions(4,0));
        } catch (RuntimeException e) {
            System.out.println(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

