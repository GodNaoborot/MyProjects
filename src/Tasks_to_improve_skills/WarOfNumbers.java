package Tasks_to_improve_skills;

public class WarOfNumbers {
    public static void main(String[] args) {
        int[] q = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        int[] q2 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println(WarOfNumbers(q));
        System.out.println(warOfNumbers2(q2));


    }

    public static int WarOfNumbers(int[] q) {
        int w = 0;
        int w2 = 0;


        int[] num1 = new int[q.length / 2];
        int[] num2 = new int[q.length / 2 + 1];
        int r = 0;
        for (int i = 0; i < q.length; i++) {

            if (q[i] % 2 == 0) {
                w += q[i];
            } else {
                w2 += q[i];
            }


        }
        if (w2>w){
            return (w2 - w);
        }else{
            return (w - w2);
        }
    }




    public static int warOfNumbers2(int[]numbers){
        int even = 0;
        int odd = 0;
        for(int num : numbers) {
            if(num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        return Math.max(even,odd) - Math.min(even,odd);
    }
}
