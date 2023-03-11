package Project_1;

public class Ferryboat {

    private int lifting�apacity;

    private int[] arr;


    public Ferryboat(int lifting�apacity, int[] arr) {
        this.lifting�apacity = lifting�apacity;
        this.arr = arr;
    }

    public boolean isLiftIt(int liftingCapacity,int[] arr){
        int cargosAmmount = 0;
        for (int i = 0;i < arr.length;i++){
            cargosAmmount+=arr[i];
        }
        if(liftingCapacity>cargosAmmount){
            return true;
        }else{
            return false;
        }
    }

    public int getLifting�apacity() {
        return lifting�apacity;
    }

    public int[] getArr() {
        return arr;
    }
}
