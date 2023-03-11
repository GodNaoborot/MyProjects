package Lambda_And_Optional;

public class LightTrial extends Trial{

    private boolean pass = false;
    public LightTrial(String name1, int mark1, int mark2) {
        super(name1, mark1, mark2);
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
        if(getMark1()>=4 |getMark2()>=5){
            setPass(pass);
            return isPass();
        }else{
            return false;
        }
    }


}
