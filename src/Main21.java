import java.util.Scanner;


public class Main21 {
    public static void main(String[] args) {
        /*Scanner qwerty = new Scanner(System.in);
        Byte T1 = 14;
        Byte I1 = 25;
        int Thor = (int)(Math.random()*45);
        int Iron_man = (int)(Math.random()*45);

        if (T1==Thor){
            System.out.println("Тор выйграл");
        }else if (I1 ==Iron_man){
            System.out.println("Железный человек выйграл");
        }else {
            System.out.println("Никто не выйграл");
        }
        System.out.printf("мой возраст %d,а зовут меня %s", 15, "1");


        int a = 1;
        while (a!=17){
            System.out.println(a);
            a=a+2;
        }

        int q = 333;
        Scanner qwerty = new Scanner(System.in);
        int b = (int)(Math.random()*333);
        int c = 0;
        while (b%10!=9 & b%10!=0) {
            b = (int) (Math.random() * 333);
            System.out.println(b);
            c++;


        }
        System.out.println("На первый выйгрышный билет пришлись "+ c+ " рандомных билетов(билета)");

        int e =3;

        boolean flag = false;
        while (e>0 && !flag){
            String w = qwerty.nextLine();
            System.out.println("Рыбий хвост, но он – не рыба. Пасть – с клыками, но не зверь");
            switch (w) {
                case "крокодил":
                    flag = true;
                    System.out.println("Всё правильно");
                    break;
                case "сдаюсь":
                    flag = true;
                    System.out.println("Правильный ответ - крокодил");
                    break;
                default:

                    e--;
                   System.out.println("Неправильно.У вас " + e + " попытки");



            }*/

            Scanner qwerty = new Scanner(System.in);
            int n = qwerty.nextInt();
            /*int k = qwerty.nextInt();
            for(int i=k;i<=n;i++ ){
                if (i%3==0) {
                    System.out.println(i);
                }else{
                    i++;
                }
            int summ = 0;
            for(int i=1;i<=10;i++){
                summ+=i;

            }
            System.out.println(summ);

            int summ2 = 1;
            for(int i = 1;i<=n;i++){
                summ2*=i;
            }
            System.out.println(summ2);

            int summ3 = 1;
            for(int i = 1;i<=n;i++){
                int k = qwerty.nextInt();
                summ3 += k;

            }
            System.out.println(summ3);

            int number = 101;
            int sqrt = (int)(Math.sqrt(number));
            boolean check = true;
            for(int i=2;i<=sqrt;i++){
                if (number%i==0){
                    check=false;
                    break;
                }
            }
            if (check==true){
                System.out.println("Число "+number+" простое");
            }else{
                System.out.println("Число "+number+" не простое");
            }*/


            int q = (int)(Math.random()*10);
            int[] nums = new int[]{0,1,2,3,4,5,6,7,8,9,10};
            for(int i = 1;i < nums.length;i++){
                q = (int)(Math.random()*10);
                System.out.println(nums[i]=q);
            }



            int[] nums2 = new int[]{1,35,32,24,68,100,29,74,99};
            for(int i = 1;1 < nums.length;i++){
                if (n == nums2[i]){
                    System.out.println("Число "+n+" совпадает с числом из списка");
                }else {
                    break;
                }
            }


            char[] nums3 = new char[]{'i','t','g','e','n','i','o'};
            char t = qwerty.next().charAt(0);
            nums3[6] = t;
            System.out.println(nums3);
            System.out.println(t);


            int[] nums4 = new int[10];
            for (int i=0; i <nums4.length;i++){
                nums4[i] = (int)(Math.random()*100);
                System.out.print(nums4[i]+" ");
            }
        System.out.println();
            for (int i=0; i < nums4.length;i+=2){
                int r = nums4[i];
                nums4[i] = nums4[i+1];
                nums4[i+1] = r;
                System.out.printf("%d %d ",nums4[i],nums4[i+1]);
            }
        System.out.println();
            double[] list1 = new double[]{1050,2000,900,1500,895,2700,1000};
            double[] list2 = new double[]{0.9,0.8,0.95,0.85,0.98,0.75,0.98};
            double[] list3 = new double[7];
            for(int i = 0;i < list3.length;i++){
                list3[i] = list1[i]*list2[i];
                double h = list3[i];
                System.out.print(list3[i]+" ");


            }
            for (int i = 0;i < list3.length;i++){
                 if (list3[i]<list3[i+1]){
                    System.out.println(list3[i]);

                 }else{
                     break;
                 }


            }







    }









}
