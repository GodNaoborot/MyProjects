import java.util.Objects;

public class Intersection {

    public static void main(String[] args) {
        int[] array1 = new int[]{1,4,3,6,2,7};
        int[] array2 = new int[]{5,6,7,3,1,9};
        intersect(array1,array2);
        String[] q = {"Bob","Sally","Java","Chlen_byka"};
        Bob(q);
        int[] q2 = {412,5,2,123,412,21,52,45};
        System.out.println(MinMax(q2));
        Bomb("Girl is playing with bomb here");
        String q3 = "Hello";
        System.out.println(Reverse_word(q3));
        System.out.println(Recursive_reverse_word(q3));
    }

    public static void intersect(int[] a,int[] b){
        String sect = "";
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                }
            }
        }
        System.out.println();

    }

    public static void Bob(String[] array){
        for (int i = 0;i<array.length;i++){

            if(Objects.equals(array[i],"Bob")){
                System.out.println(i);
                return;
            }else{
                System.out.println(-1);
                return;
            }
        }


    }

    public static String MinMax(int[] a){
        int q = a[0];
        int w = a[0];
        for(int i = 0;i<a.length-1;i++){
            if(q>a[i]){
                q = a[i];


            }
            if(w<a[i]){
                w = a[i];
            }

        }


        return ("["+q+", "+w+"]");
    }

    public static void Bomb(String q){
        String w = "";

        String[] words = q.split("\\W+");

        for (int i = 0;i < words.length;i++){
            System.out.println(words[i]);
            if(Objects.equals(words[i],"bomb")){
                System.out.println("DUCK!");
                return;

            }
        }
    }

    public static String Reverse_word(String a){
        StringBuilder q = new StringBuilder(a).reverse();
        String reverse_word = "";
        char[] word = new char[q.length()];
        for (int i = 0;i < word.length;i++){
            word[i] = q.charAt(i);
        }
        for(char e: word){
            reverse_word+=e;
        }
        return reverse_word;

    }

    public static String Recursive_reverse_word(String a){
        if(a.isEmpty()){
            return a;
        }
        return Recursive_reverse_word(a.substring(1)) + a.charAt(0);

    }




}
