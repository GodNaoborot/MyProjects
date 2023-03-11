package PROJECT_multithreading_ThiefAndOwner;

public class Thing {

    private int weight;
    private int cost;

    public Thing(int weight,int cost){
        this.weight = weight;
        this.cost = cost;

    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
