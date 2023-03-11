import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner qwerty = new Scanner(System.in);
            //double a = qwerty.nextDouble();
            //double b = qwerty.nextDouble();

            /*if (a%2 == 0 ) {
                System.out.println("число " + a + " четное");
            }else {
                System.out.println("число " + a + " нечетное");
            }
            if (b%2 == 0 ) {
                System.out.println("число " + b + " четное");
            }else {
                System.out.println("число " + b + " нечетное");
            }


            int c = qwerty.nextInt();
            if (c%10 == 7){
                System.out.println(" остаток от деления - 7");
            } else {
                System.out.println(" Остаток от деления точно не 7");
            }

            double q = qwerty.nextDouble();

            if (q%10==6) {
                System.out.println("YES");
            } else if (q<364 || q>366) {
                System.out.println("Don't try to make me stupid");
            } else {
                System.out.println("NO");

            }

            double c = qwerty.nextDouble();
            if (a > b && a > c) {
                if (b > c) {
                    System.out.println(c + " - Минимальное число");
                } else if (c>b) {
                    System.out.println(c + " - Минимальное число");
                }
            } else if (c > a && c > b) {
                if (a > b)
                    System.out.println(b + " - Минимальное число");
            } else if (b > c && b > a) {
                if (c > a) {
                    System.out.println(a + " - Минимальное число");
                } else if (a > c)
                    System.out.println(c + " - Минимальное число");
            } else {
                System.out.println(a+" - Минимальное число");

            }

            short e = qwerty.nextShort();
            if (e%10==2 || e%10==3 || e%10==4){
                System.out.println(e+" Рубля");
            } else if (e%10==1) {
                System.out.println(e+" Рубль");
            } else {
                System.out.println(e+" Рублей");
            }

            byte e = qwerty.nextByte();
            if (e==1){
                System.out.println("понедельник");
            } else if (e==2){
                System.out.println("вторник");
            }else if (e==3){
                System.out.println("среда");
            }else if (e==4){
                System.out.println("четверг");
            } else if (e==5) {
                System.out.println("пятница");
            } else if (e==6) {
                System.out.println("суббота");
            } else if (e==7) {
                System.out.println("воскресенье");
            }else {
                System.out.println("такого дня не существует");
            }*/

            byte q = qwerty.nextByte();
            switch (q) {
                case 1:
                    System.out.println("Jan");
                    break;
                case 2:
                    System.out.println("Feb");
                    break;
                case 3:
                    System.out.println("Mar");
                    break;
                case 4:
                    System.out.println("Apr");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("Jun");
                    break;
                case 7:
                    System.out.println("Jul");
                    break;
                case 8:
                    System.out.println("Aug");
                    break;
                case 9:
                    System.out.println("Sep");
                    break;
                case 10:
                    System.out.println("Oct");
                    break;
                case 11:
                    System.out.println("Nov");
                    break;
                case 12:
                    System.out.println("Dec");
                    break;
                default:
                    System.out.println("?");
            }

            byte w = qwerty.nextByte();
            switch (w){
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("?");
            }

            byte r = qwerty.nextByte();
            switch (r) {
                case 1:
                    System.out.println("Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec");
                    break;
                case 2:
                    System.out.println("Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec");
                    break;
                case 3:
                    System.out.println("Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec");
                    break;
                case 4:
                    System.out.println("May, Jun, Jul, Aug, Sep, Oct, Nov, Dec");
                    break;
                case 5:
                    System.out.println("Jun, Jul, Aug, Sep, Oct, Nov, Dec");
                    break;
                case 6:
                    System.out.println("Jul, Aug, Sep, Oct, Nov, Dec");
                    break;
                case 7:
                    System.out.println("Aug, Sep, Oct, Nov, Dec");
                    break;
                case 8:
                    System.out.println("Sep, Oct, Nov, Dec");
                    break;
                case 9:
                    System.out.println("Oct, Nov, Dec");
                    break;
                case 10:
                    System.out.println("Nov, Dec");
                    break;
                case 11:
                    System.out.println("Dec");
                    break;
                case 12:
                    System.out.println("No months before New Year");
                    break;
                default:
                    System.out.println("?");
            }


        }
}