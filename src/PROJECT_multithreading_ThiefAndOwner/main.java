package PROJECT_multithreading_ThiefAndOwner;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

    public static void main(String[] args) {

        Thing th1 = new Thing(2,4);
        Thing th2 = new Thing(1,7);
        Thing th3 = new Thing(48,10);
        Thing th4 = new Thing(5,6);

        List<Thing> things = new ArrayList<>();
        things.add(th1);
        things.add(th2);
        things.add(th3);
        things.add(th4);

        Owner owner = new Owner(things,true);

        Backpack backpack = new Backpack(40);

        Thief thief = new Thief(backpack);

        House house = new House(owner,thief,things);

        /*ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(house);
        service.shutdown();*/

        house.run();
    }
}
