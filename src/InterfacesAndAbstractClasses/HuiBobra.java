package InterfacesAndAbstractClasses;

import java.util.Scanner;

public class HuiBobra {

    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        int a = qwerty.nextInt();
        int b = qwerty.nextInt();
        System.out.println(huiBobra(a,b));
    }

    public static int huiBobra(int a,int b){
        return(a*b);
    }
}
