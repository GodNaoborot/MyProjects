import java.util.Scanner;

public class Main26 {
    Scanner qwerty = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        char t1 = qwerty.next().charAt(0);
        task_1(t1);

        char t2 = qwerty.next().charAt(0);
        task_2(t2);

        task_3();

        String t4 = qwerty.next();
        task_4(t4);

    }


    private static void task_1(char a) {
        boolean q1 = true;

        if (Character.isDigit(a) == q1)
            System.out.println("Это цифра");
        else if (Character.isLetter(a) == q1)
            System.out.println("Это буква");
        else
            System.out.println("Это пробел");


        return;
    }

    private static void task_2(char a) {
        char q = a;

        if (Character.toUpperCase(a) == q)
            System.out.println("Это заглавная буква");
        else if (Character.toLowerCase(a) == q)
            System.out.println("Это строчная буква");
        else if (Character.toUpperCase(a) != q & Character.toLowerCase(a) != q)
            System.out.println("Это не буква");

    }

    private static void task_3() {
        int q = 96;
        int e = 1;
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'v', 'u', 'w', 'x', 'y', 'z'};
        String w1 = String.valueOf(array);
        int[] num1 = new int[array.length];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = q + e;
            e++;


        }
        for (int i = 0; i < num1.length; i++) {
            String w2 = String.valueOf(num1[i]);
            w1 = String.valueOf(array[i]);
            System.out.println(w1 + "-" + w2);

            }

    }

    private static void task_4(String q){
        System.out.println("\tПривет, "+q+ "! \n " +
                "\tЯ вижу, как ты сильно продвинулся в изучении Java! Позади уже такие темы\n" +
                " как \"Переменные\",\"Условные операторы\",\"Циклы\",\"Обьекты и классы\" и ещё куча\n" +
                " сопутсвующих тем поменьше! (А помнишь арифметические операции? Какой символ\n" +
                " это деление? Этот / или этот \\?)\n" +
                "\tСкоро ты приступишь к новым темам, удачи!");
    }





}
