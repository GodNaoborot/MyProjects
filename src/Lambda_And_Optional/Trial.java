package Lambda_And_Optional;

import java.util.ArrayList;

import StreamAndLambda.LambdaFunctions;

public class Trial {

    private boolean pass = false;



    private String name1;

    private int mark1;


    private int mark2;


    Trial(String name1,int mark1,int mark2){
        this.name1 = name1;
        this.mark1 = mark1;
        this.mark2 = mark2;

    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
        pass = true;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public boolean isExamPassed(){
        if(mark1+mark2>=8){
            setPass(pass);
            return pass;
        }else{
            return false;
        }
    }

    public ArrayList<Trial> addToList(Trial...q){
        ArrayList<Trial> arr= new ArrayList<>();
        for(int i = 0;i < q.length;i++){
            arr.add(q[i]);
        }

        return arr;
    }

    @Override
    public String toString() {
        return "Trial{" +
                "name1='" + name1 + '\'' +
                ", mark1=" + mark1 +
                ", mark2=" + mark2 +
                '}';
    }
}
