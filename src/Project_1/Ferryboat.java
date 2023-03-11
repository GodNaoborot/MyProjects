package Project_1;

public class Ferryboat {

    private int liftingÑapacity;

    private int[] arr;


    public Ferryboat(int liftingÑapacity, int[] arr) {
        this.liftingÑapacity = liftingÑapacity;
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

    public int getLiftingÑapacity() {
        return liftingÑapacity;
    }

    public int[] getArr() {
        return arr;
    }
}
