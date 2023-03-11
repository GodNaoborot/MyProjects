package Tasks_to_improve_skills;

import java.util.Scanner;

public class ForGlinych {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        int n = qwerty.nextInt();
        int a = qwerty.nextInt();
        System.out.println(task2(n,a));


    }

    public static String task(int n){
        int count1 = 0;
        int count10 = 0;
        int count60 = 0;
        int cost1 = 15;
        int cost10 = 125;
        int cost60 = 440;
        int r = 1;

        while(n>0){
            if(n<9){
                n--;
                cost1+=15;
                count1++;
            }else if(n>=9 & n<35){
                n-=10;
                cost10+=125;
                count10++;
            }else{
                n-=60;
                cost60+=440;
                count60++;
            }
        }
        return(count1+" "+count10+" "+count60);

    }

    public  static int task2(int n,int a){
        int year = 365;


        int res = (int)(((year-a)*24)/n);

        return (res/24);
    }
}

