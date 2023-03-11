package Lambda_And_Optional;

public class ExtraTrial extends Trial{

    private int mark3;
    private boolean pass = false;

    public ExtraTrial(String name1, int mark1, int mark2,int mark3) {

        super(name1, mark1, mark2);
        this.mark3 = mark3;
    }

    public int getMark3() {
        return mark3;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
        pass = true;
    }

    @Override
    public boolean isExamPassed(){
        if(getMark1()+getMark2()>=8 & getMark3()>=4){
            setPass(pass);
            return isPass();
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        return "Trial{" +
                "name1='" + getName1() + '\'' +
                ", mark1=" + getMark1() +
                ", mark2=" + getMark2() +
                ", mark3=" + mark3 +
                '}';
    }
}
