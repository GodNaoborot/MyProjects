package Flowers;

import java.util.Arrays;

public class Bouquet implements IBouquet{

    private Flower[] flowers;

    public Bouquet(int count){
        flowers = new Flower[count];
    }

    public Flower[] getFlowers(){
        return this.flowers;
    }

    @Override
    public void addFlower(Flower flower){
        if(Checker.checkLength(this.flowers)){
            int position = Checker.getPosition(this.flowers);
            this.flowers[position] = flower;
        }
        else{
            System.out.println("Error!");
        }
    }

    @Override
    public int getBouquetCost() {
        int result = 0;
        for(Flower flower:
        this.flowers){
            if(flower!=null){
                result+= flower.getPrice();
            }else {
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + Arrays.toString(flowers) +
                '}';
    }
}
