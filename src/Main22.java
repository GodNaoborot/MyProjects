import java.util.Scanner;




public class Main22 {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        /*int[] sqera = new int[4];
        for(int i = 0;i < sqera.length;i++) {
            sqera[i] = qwerty.nextInt();
            System.out.println(sqera[i]);

        }

        for(int i = 0;i < sqera.length;i++) {
            System.out.print(sqera[i]+" ");
        }
        System.out.println();

        int[][] array1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};


        for(int i = 0;i<array1.length;i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]);
            }

            System.out.println();
        }

        char[][] array2 = new char[5][5];
        for(int i = 0;i<array2.length;i++){
            for(int j = 0;j<array2.length;j++){
                if(i==j||i+j==4){
                    array2[i][j] = 'x';

                }
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }

        int[][] array3 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};


        for(int i = 0;i<array3.length;i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[j][i]);
            }

            System.out.println();
        }

        int[][] array4 = new int[2][4];
        for(int i = 0;i<array4.length;i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = qwerty.nextInt();



            }
            System.out.println();
        }
        int min = array4[0][0];
        int posx = 0;
        int posy = 0;
        int max = array4[0][0];
        int posx2 = 0;
        int posy2 = 0;
        for(int i = 0;i<array4.length;i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if(min>array4[i][j]){
                    min = array4[i][j];
                    posx = i;
                    posy = j;
                }else if(max<array4[i][j]){
                    max = array4[i][j];
                    posx2 = i;
                    posy2 = j;
                }

                System.out.print(array4[i][j]);
            }
            System.out.println();
        }
        System.out.println(min);
        System.out.println(posx);
        System.out.println(posy);
        System.out.println(max);
        System.out.println(posx2);
        System.out.println(posy2);*/



        int[][] array5 = new int[2][2];


        for(int i = 0;i < array5.length;i++){
            for(int j = 0;j < array5[i].length;j++){
                array5[i][j] = qwerty.nextInt();

            }
            System.out.println();
        }


        for(int i = 0;i < array5.length;i++){
            for(int j = 0;j < array5[i].length;j++){
                System.out.print(array5[i][j]);
            }
            System.out.println();

        }


        int posx = 0;
        int posy = 0;
        for(int i = 0;i < array5.length;i++){
            for(int j = 0;j < array5[i].length;j++){
                int house1 = array5[i][j];
                int q1 = house1%10;
                int w1 = house1/100;
                int e1 = house1%100;
                int r1 = e1/10;
                int sum1 = q1+w1+r1;
                System.out.println();
                if(sum1>7&sum1<13){
                    System.out.println(house1);
                    posx = i;
                    posy = j;
                    System.out.println("position: "+"("+posx+" , "+posy+")");

                }
            }
        }



    }
}
