import java.util.*;


public class UsualTask {

    public static int taskH(int q){
        Scanner qwerty = new Scanner(System.in);
        int[] arr = new int[q];
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i = 0;i < arr.length;i++){
            int num = qwerty.nextInt();
            list.add(num);
        }

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return 1;
                }else if(o1.equals(o2)){
                    return 0;
                }else{
                    return -1;
                }
            }
        };

        Collections.sort(list);

        for(int i = 0;i < list.size();i++){
            arr[i] = list.get(i);
        }

        for(int i = 0;i < arr.length-2;i++){
            if(arr[i]+arr[i+1]>arr[i+2]&&arr[i]+arr[i+2]>arr[i+1]&&arr[i+1]+arr[i+1]>arr[i]){
                count++;
            }
        }


        return count;
    }


    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        int num = qwerty.nextInt();

        System.out.println(taskH(num));



    }


}
