package PROJECT_multithreading_ThiefAndOwner;

import PROJECT_shipment_threads.loader.PierLoader;

import java.util.List;
import java.util.Random;

public class House implements Runnable{

    private Owner owner;
    private Thief thief;
    private List<Thing> things;

    public House(Owner owner, Thief thief, List<Thing> things) {
        this.owner = owner;
        this.thief = thief;
        this.things = things;
    }

    @Override
    public void run(){
        int count = 0;

        while (count<=60) {
            Thread.currentThread().setName(" Generator");
            count++;
            Thing thing = getRandomThing();
            System.out.println(owner.getThings());

            if((int)(Math.random()*2)==1){

                owner.putIntoHouse(thing);


            }else if((int)(Math.random()*2)!=1 & things.size()>0){
                owner.setInTheHouse(false);
                thief.putIntoBackpack(things.get((int)(Math.random()*things.size())),owner,thief.getBackpack());

            }

            System.out.println(thief.getBackpack().getCapacity()+" "+thing.getWeight());


            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private Thing getRandomThing(){
        Thing thing1 = new Thing((int)(Math.random()*24),(int)(Math.random()*10));
        return thing1;
    }

}
