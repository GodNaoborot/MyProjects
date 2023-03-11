package Recursion;

public class Tasks {
    public static int d;

    public static void counter(int q) {


        if (q == 0) {
            return ;
        }
        System.out.println(q);
        counter(q-1);

    }

    public static int factorial(int q){
        if(q==1){
            return 1;
        }
        return q*factorial(q-1);
    }


    public static void counter2(int q) {
        System.out.print(q+" ");


        if (q == 0) {
            return ;
        }

        counter2(q-1);

    }

    public static int squareOfTriangular(int n,int m){
        if (n==m &n==1){
            return 1;
        }else if(n>1){
            return m+squareOfTriangular(n-1,m);
        }else if(m>1){
            return n+squareOfTriangular(n,m-1);
        }
        return 0;
    }

    public static int combinations(int m,int n){
        if(n==0&m>0){
            return 1;
        }else if(m>=0&n>0){
            return 1;
        } else if (m > n & n >= 0) {
            return 0;
        }else{
            return (combinations(m-1,n-1)+combinations(m,n-1));
        }
    }

    public static int minElement(int n,int[] array){
        int temp = array[n];
        if (n==0){
            return 0;
        }
        if(temp>array[n-1]){

            return minElement(n-1,array);
        }else{
            return temp;
        }

    }

    public static long convertTo10R(long num,int m,int i){
        long t;

        if (num>0){
            t = (num%10)*(long)(Math.pow(m,i));
            return convertTo10R(num/10,m,i+1);
        }
        else{
            return 0;
        }
    }

    public static String convertAnyR(long num,int m,int n){
        long t;
        long num10;


        if ((m<2)||(m>10)||(n<2)||(n>10))
            return "Incorrect data";

        if(m==10){
            if(num>0){
                t = num%10;
                return (convertAnyR(num/n,10,n)+String.valueOf(t));
            }
            else{
                return "";
            }
        }
        else{
            num10 = convertTo10R(num,m,0);

            return convertAnyR(num10,m,n);
        }

    }

    public static long recEge(long q){
        if (q==1){
            return 1;
        }
        else if(q>1) {
            return q * recEge(q - 1);


        }
        return 1;
    }


    public static void main(String[] args) {
        //counter(5);
        //System.out.println(factorial(4));
        //counter2(5);
        //System.out.println(squareOfTriangular(5,3));
        //System.out.println(combinations(4,56));
        System.out.println(minElement(4, new int[]{5, 5, 4, 2, 5}));
        //System.out.println(convertAnyR(45,8,9));
        System.out.println(recEge(10));

    }


}
