public class testig {


    public static void main(String[] args) {
        int counter = 0;
        boolean check = true;
        Integer e = 12;
        for(int i = 2;i < Math.sqrt(e);i ++){
            if(e%i!=0){
                check = false;
            }

        }
        System.out.println(check);
        System.out.println(counter);

        Double q = Math.pow(e,0.5);
        Double w = Math.sqrt(e);
        System.out.println(q+" "+w);

        if(Math.sqrt(e)==(int)(Math.pow(e,0.5))){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }


}
