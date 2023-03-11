package String_Revision;
import java.util.*;

public class Task1 {

    public static void task1(int q){
        Scanner qwerty = new Scanner(System.in);
        String[] arr = new String[q];
        String min = "";
        String max = "";

        for(int i = 0;i < q;i++){
            String str = qwerty.next();
            arr[i]=str;
        }

        for(int i = 0;i < arr.length-1;i++){
            if(arr[i].length()>arr[i+1].length()){
                arr[i] = arr[i+1];

            }
            min = arr[i];
            if(arr[i].length()<arr[i+1].length()){
                arr[i] = arr[i+1];
            }
            max = arr[i];
        }

        System.out.println(min+" "+max);
        System.out.println(min.length()+" "+max.length());
    }

    public static void task2(int q){
        Scanner qwerty = new Scanner(System.in);


        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i < q;i++){
            String str = qwerty.next();
            list.add(str);
        }
        list.stream().sorted(comp).forEach(x-> System.out.println(x));


    }

    public static void task3(int q){
        Scanner qwerty = new Scanner(System.in);
        String[] arr = new String[q];


        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        for(int i = 0;i < q;i++){
            String str = qwerty.next();
            arr[i] = str;
        }

        List<String> list = Arrays.stream(arr).sorted(comp).toList();

        for(int i = 0;i < q/2;i++){
            System.out.println(list.get(i)+", length: "+ list.get(i).length());

        }

    }


    public static String task4(int q){
        Scanner qwerty = new Scanner(System.in);
        String[] arr = new String[q];
        int[] arr2 = new int[q];
        HashMap<Integer,String> map = new HashMap<>();
        int max;
        int min;

        for(int i = 0;i < q;i++){
            String str = qwerty.next();
            arr[i] = str;
        }

        for(int i = 0;i < arr.length;i++){

            int elements = countUnique(arr[i]);
            arr2[i] = elements;

        }

        for(int i = 0;i < arr.length;i++){
            map.put(arr2[i],arr[i]);
        }

        for(int i = 0;i < arr2.length;i++){
            for(int j = 0;j < arr2.length-1;j++){
                if(arr2[j]>arr2[j+1]){

                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;

                }
            }
        }

        max = arr2[arr2.length-1];
        min = arr2[0];

        return ("The most mount of uniq chars in word: "+map.get(max)+" \n" +
                "The least mount of uniq chars in word: "+map.get(min));

    }

    public static  String task5(int q){
        Scanner qwerty = new Scanner(System.in);
        String[] arr = new String[q];
        int[] arr2 = new int[q];
        HashMap<Integer,String> map = new HashMap<>();
        int uniqueKey = 0;


        for(int i = 0;i < q;i++){
            String str = qwerty.next();
            arr[i] = str;
        }

        for(int i = 0;i < arr.length;i++){

            int elements = countUnique(arr[i])- arr[i].length();
            arr2[i] = elements;

        }

        for(int i = 0;i < arr.length;i++){
            map.put(arr2[i], arr[i]);

        }

        return map.get(0);

    }

    public static void task6(double q){

        Scanner qwerty = new Scanner(System.in);
        String[] arr = new String[(int)q];
        int[] arr2 = new int[(int)q];
        int mountOfPalindroms = 0;
        int ind = 0;


        for(int i = 0;i < arr.length;i++){
            arr[i] = qwerty.next();
        }

        for(int i = 0;i < arr.length;i++){

            if(arr[i].length()%2!=0){
                arr2[i] = oddWord(arr[i]);
            }else if(arr[i].length()%2==0){
                arr2[i] = evenWord(arr[i]);
            }

        }

        for(int i = 0;i < arr2.length;i++){
            if(arr2[i]==0){
                mountOfPalindroms++;
            }
        }

        List<Integer> listOfNumbers = new ArrayList<>();
        List<String> listOfWords = new ArrayList<>();


        if(mountOfPalindroms>1){
            for(int i = 0;i < arr.length;i++){

                if(arr2[i]!=0){
                    listOfNumbers.add(arr2[i]);
                    listOfWords.add(arr[i]);
                }else if(arr2[i]==0){
                    ind++;
                    if(ind>1){
                        listOfNumbers.add(arr2[i]);
                        listOfWords.add(arr[i]);
                    }
                }
            }
        }

        String[] finalArrOfWords = new String[listOfWords.size()];
        int[] finalArrOfNumbers = new int[listOfNumbers.size()];


        for(int i = 0;i < finalArrOfWords.length;i++){
            finalArrOfNumbers[i] = listOfNumbers.get(i);
            finalArrOfWords[i] = listOfWords.get(i);
        }


        if(mountOfPalindroms>1){
            for(int i = 0;i < finalArrOfNumbers.length;i++){
                if(finalArrOfNumbers[i]==0){
                    System.out.println(finalArrOfWords[i]);
                    return;
                }
            }
        }else if(mountOfPalindroms==1){
            for(int i = 0;i < arr2.length;i++){
                if(arr2[i]==0){
                    System.out.println(arr[i]);
                    return;
                }
            }
        }else{
            System.out.println("Здесь нету слов палиндромов");
            return;
        }
        System.out.println(mountOfPalindroms);

    }


    public static int oddWord(String q){
        char[] arr = q.toCharArray();
        String[] arr2 = new String[arr.length];
        int countUniqueChars = 0;

        for(int i = 0;i < arr.length;i++){
            arr2[i] = String.valueOf(arr[i]);
        }

        for(int i = 0;i < arr2.length/2;i++){
            if(arr2[i].equals(arr2[arr2.length-1-i])){
                countUniqueChars+=2;

            }
        }
        return q.length()-countUniqueChars-1;

    }

    public static int evenWord(String q){
        char[] arr = q.toCharArray();
        String[] arr2 = new String[arr.length];
        int countUniqueChars = 0;

        for(int i = 0;i < arr.length;i++){
            arr2[i] = String.valueOf(arr[i]);
        }

        for(int i = 0;i < arr2.length/2;i++){
            if(arr2[i].equals(arr2[arr2.length-1-i])){
                countUniqueChars+=2;

            }
        }
        return q.length()-countUniqueChars;
    }

    public static int countUnique(String q){
        char[] arr = q.toCharArray();
        int count = 0;
        int max = (int) q.chars().distinct().count();

        return max;
    }



    public static void main(String[] args) {
        //task1(3);
        //task2(3);
        //task(3);
        //System.out.println(task4(3));
        //System.out.println(task5(3));
        System.out.println(oddWord("131"));
        System.out.println(evenWord("1331"));
        task6(3);


    }


}
