public class Main29 {
    public static void main(String[] args) {
        print((short) 2);
        print((Object) 2);
        print(1);
        print((Integer) 2);
        print((int) 1);
        System.out.println();
        matrix(2,3,"8");
        matrix(2,3,(Object) 8);
        matrix(2,3,8);
        matrix(2,3,(byte) 8);
        matrix(2,3,(long) 8);
        matrix(2,3,(short) 8);
        matrix(2,8,(Number)8);
        matrix(2,3,(int) 8);
        matrix(2,3,(Integer) 8);
        matrix(2,3,(char) 8);
    }
    public static void print(Integer q){
        System.out.println("Это Integer");
    }
    public static void print(double q){
        System.out.println("Это double");
    }
    public static void print(Object q){
        System.out.println("Это Object");
    }
    public static void print(int q){
        System.out.println("Это double");
    }
    public static void matrix(int q,int w,Integer value){
        for(int i = 0;i<q;i++){
            for (int j = 0;j<w;j++){
                System.out.println(value);
            }
            System.out.println();

        }

    }
    public static void matrix(int q,int w, Object value){
        for(int i = 0;i<q;i++){
            for (int j = 0;j<w;j++){
                System.out.println(value);
            }
            System.out.println();

        }

    }
    public static void matrix(int q,int w, int value){
        for(int i = 0;i<q;i++){
            for (int j = 0;j<w;j++){
                System.out.println(value);
            }
            System.out.println();

        }
    }
    public static void matrix(int q,int w,String value){
        for(int i = 0;i<q;i++){
            for (int j = 0;j<w;j++){
                System.out.println(value);
            }
            System.out.println();

        }
    }
    public static void matrix(int q,int w,double value){
        for(int i = 0;i<q;i++){
            for (int j = 0;j<w;j++){
                System.out.println(value);
            }
            System.out.println();

        }
    }


}
