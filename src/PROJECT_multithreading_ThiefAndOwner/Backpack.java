package PROJECT_multithreading_ThiefAndOwner;

public class Backpack {

    private int capacity;

    public Backpack(int capacity){
        this.capacity = capacity;

    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "capacity=" + capacity +
                '}';
    }
}
