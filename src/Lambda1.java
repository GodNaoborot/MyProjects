public class Lambda1 {

    public static void main(String[] args) {

        Oper operation = (x,y)->x+y;
        int res = operation.calculate(5,7);
        System.out.println(res);

    }
}

interface Oper {
    int calculate(int x,int y);
}
