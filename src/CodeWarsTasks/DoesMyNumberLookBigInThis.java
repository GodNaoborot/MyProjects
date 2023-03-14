package CodeWarsTasks;

public class DoesMyNumberLookBigInThis {

    public static boolean isNarcissistic(Integer number) {
        char[] chars = number.toString().toCharArray();
        int num = 0;
        for(int i = 0;i < chars.length;i++){
            num+=Math.pow(Integer.parseInt(String.valueOf(chars[i])),chars.length);
        }
        if(num==number){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }
}
