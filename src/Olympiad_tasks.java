import java.util.Scanner;

public class Olympiad_tasks {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        short  n = qwerty.nextShort();
        short d = qwerty.nextShort();
        System.out.println(task_1(n,d));
        short q = qwerty.nextShort();
        short q2 = qwerty.nextShort();
        task_2(q,q2);
    }

    public static short task_1(short n,short d){
        short p = 0;

        if (d!=1){
            p = (short) (n-(8-d));

        }else if(d==1){
            p = n;
        }
        return (short) (p/7);
    }

    public static void task_2(short q, short q2){
        if (q==q2*2){
            System.out.println("Yes");
            q = 0;
            System.out.println(q+" "+q2);
        }else if(q!=q2*2){
            System.out.println("No");
        }


    }
}
