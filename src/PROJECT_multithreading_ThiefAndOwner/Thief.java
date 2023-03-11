package PROJECT_multithreading_ThiefAndOwner;

public class Thief {

    private Backpack backpack;

    public Thief(Backpack backpack){
        this.backpack = backpack;

    }

    public Backpack getBackpack() {
        return backpack;
    }

    @Override
    public String toString() {
        return "Thief{" +
                "backpack=" + backpack +
                '}';
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public synchronized boolean putIntoBackpack(Thing element, Owner owner, Backpack backpack){
        try{
            int capacity = backpack.getCapacity();
            if(owner.isInTheHouse()){
                System.out.println();
                wait();
                return false;

            }else{

                if(capacity > element.getWeight()){
                    owner.getThings().remove(element);
                    getBackpack().setCapacity(capacity-element.getWeight());
                    System.out.println("Вор взял "+element);
                    return true;
                }else if(capacity < element.getWeight()){
                    System.out.println("Закончилось место в рюкзаке");
                    wait();
                    return false;
                }

            }


        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return true;


    }


}
