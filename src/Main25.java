import java.util.Objects;
import java.util.Scanner;

public class Main25 {
    Scanner qwerty = new Scanner(System.in);

    private int task_1(String q){
        int index = q.indexOf('.');
        return index;
    }

    private int task_2(double x){
        return (int)(x*0.17);
    }

    private String task_3(String q1,String q2,String q){
        return(q.replaceAll(q1,q2));
    }

    private int task_4(double time){
        double velocity = 1100;
        return (int)(velocity*time);
    }

    private char task_5(){
        char[] array = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int q = (int)(Math.random()*26);

        String c = qwerty.next();

        while(!Objects.equals(c,array[q])){
            int twq = (new String(array).indexOf(c));
            c = qwerty.next();
            if(twq > q){
                System.out.println("You are too high");
            }else if(twq < q){
                System.out.println("You are too low");
            }else{
                return array[q];
            }

        }
        System.out.println(q);
        return array[q];

    }

    private void task_6(String q){
        char[] s = new char[q.length()];
        for (int i = 0;i < s.length;i++){

            s[i] = q.charAt(q.length()-1-i);
            String w = String.valueOf(s[i]);
            System.out.print(w);
        }
        System.out.println();

       return;
    }


    private void task_6plus(){
        int q;
        int e = 0;
        int t = 0;
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = new int[]{244,341,273,278,349,445,402,388,275,243,334,412,393,299,343,317,265};
        q = times[0];
        for (int i = 0;i<times.length;i++){
            if(q>times[i]){
                q = times[i];
            }
        }
        for (int i = 0;i<times.length;i++){
            while(q!=times[e]){
                e++;
                if (q == times[e]){
                    t = e;
                }
            }
        }
        String secs = null;
        if (q/10>=10){
            if (q%10==11|q%10==12|q%10==13|q%10==14
                    |q%10==15|q%10==16|q%10==17|q%10==18|q%10==19|
                    q%10==0|q%10==5|q%10==6|q%10==7|q%10==8|q%10==9){
                secs = "секунд";

            }else if (q%10==2|q%10==3|q%10==4){
                secs = "секунды";

            }else if (q%10==1){
                secs = "секунда";

            }else if (q/10<10){
                if (q%10==1){
                    secs = "секунда";

                }else if (q%10==2|q%10==3|q%10==4){
                    secs = "секунды";

                }else if(q%10==5|q%10==6|q%10==7|q%10==8|q%10==9|q%10==0){
                    secs = "секунд";

                }
            }
        }
        System.out.println("Имя победителя:"+names[t]);
        System.out.println("Время забега:"+q+""+" "+secs);



    }




    public static void main(String[] args) {
        Main25 test = new Main25();
        Scanner qwerty = new Scanner(System.in);

        System.out.println(test.task_1("Hello."));

        double t1 = qwerty.nextDouble();
        System.out.println("Вы весите "+test.task_2(t1)+" кг");

        String t3 = qwerty.next();
        System.out.println(test.task_3("первый","последний",t3));

        double t4 = qwerty.nextDouble();
        System.out.println("Расстояние от вспышки молнии составляет "+test.task_4(t4)+" футов");

        /*String t5 = qwerty.next();
        System.out.println(test.task_5());*/

        String t6 = qwerty.next();
        test.task_6(t6);

        test.task_6plus();
    }

}
