package SchoolTasks;

public class Task2 {

    public static String task2(int q){
        int p1 = 15;
        int p10 = 125;
        int p60 = 440;

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;



        while (q!=0){
            if(q<8){
                c1 = q;
                c2 = 0;
                c3 = 0;
                return (c1+" "+c2+" "+c3);
            }else if(q>=8&q<35){
                c1 = q%10;
                c2 = q/10;
                c3 = 0;
                return (c1+" "+c2+" "+c3);
            }else{
                if (q%10<8){
                    c1 = q%10;
                    c2 = (q/10)/10;
                    c3 = (q/10)%10;
                }
                c1 = 0;
                c2 = (q/10)/10;
                c3 = (q/10)%10;
                return (c1+" "+c2+" "+c3);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(task2(129));
        int c = 129;
        int c1 = c/10;
        System.out.println(c1);
    }
}
