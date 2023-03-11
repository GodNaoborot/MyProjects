import java.util.Scanner;

public class Main24 {


    Scanner qwerty = new Scanner(System.in);
    public int task_1(int number_1, int number_2){
        int max = 0;
        if (number_1>number_2){
            max = number_1;
            return max;
        }else{
            max = number_2;
            return max;
        }
    }

    public boolean task_2(int number_2){
        boolean q = false;
        if (number_2%2==0){
            q = true;
            return q;
        }else{
            return q;
        }

    }

    public int[] task_3(int number_3){
        Scanner qwerty = new Scanner(System.in);
        int[] nums_3 = new int[2];
        for(int i = 0;i < nums_3.length;i++){
            int q = 0;
            nums_3[i] = number_3*number_3+q;
            q+=4;
            nums_3[1] = number_3*number_3+q;
        }

        return nums_3;

    }

    public boolean task_4(int number_4){
        if (number_4>69){
            return true;
        }else{
            return false;
        }

    }

    public int task_5(double number5_1,double number5_2){
        return (int)(Math.pow(number5_1,number5_2));
    }

    public int task_6(int x1,int y1,int x2,int y2){
        int x = x2-x1;
        int y = y2-y1;
        double x_pow = (Math.pow(x,2));
        System.out.println(x_pow);
        double y_pow = (Math.pow(y,2));
        System.out.println(y_pow);
        return (int)Math.sqrt(x_pow+y_pow);
    }

    public int getInt1(int number_71){
        return number_71;
    }
    public int getInt2(int number_72){
        return number_72;
    }


    public char getOperation(char operation){
        return operation;
    }

    public int calculate(int number7_1,int number7_2,char operation){
        char operation1 = getOperation(operation);
        int num1 = getInt1(number7_1);
        int num2 = getInt2(number7_2);
        if (operation1=='+'){
            return num1+num2;
        }else if(operation1=='-'){
            return num1-num2;
        }else if(operation1=='*'){
            return num1*num2;
        }else if(operation1=='/'){
            return num1/num2;
        }


        return num1;
    }


}
