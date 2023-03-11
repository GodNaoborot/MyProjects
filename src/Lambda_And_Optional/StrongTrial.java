package Lambda_And_Optional;

public class StrongTrial extends Trial{

    private boolean pass = false;
    public StrongTrial(String name1, int mark1, int mark2) {
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
        if(getMark1()/2+getMark2()>=8){
            setPass(pass);
            return pass;
        }else{
            return false;
        }
    }
}
