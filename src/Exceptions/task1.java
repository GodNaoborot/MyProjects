package Exceptions;

public class task1 {
    public static void main(String[] args) {
        task1();
        task2();

    }

    public static void task1(){
        String q = null;
        try{
            q.toUpperCase();
        }catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println("Конец");

    }

    public static void task2(){
        int[] q = new int[2];
        try{
            for(int i =0;i<q.length;i++){
                q[i]=i;
                if(q[i]==q[i-1]){
                    System.out.println(true);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Попался "+e);
        }
        System.out.println("Конец");
    }
}
