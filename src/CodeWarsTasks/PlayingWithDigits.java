package CodeWarsTasks;

public class PlayingWithDigits {

    public static long digPow(int n, int p) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        long num = 0;

        for(int i = 0;i < chars.length;i++){
            num += Math.pow(Integer.parseInt(String.valueOf(chars[i])),p);
            p++;
        }

        if(((float)(num))/n==num/n){
            return num/n;
        }else{
            return -1;
        }

    }


    public static void main(String[] args) {
        System.out.println(digPow(46288, 3));
    }

}