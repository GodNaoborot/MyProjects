package PROJECT_shipment_threads.loader;

import PROJECT_shipment_threads.ship.Ship;
import PROJECT_shipment_threads.ship.Tunnel;
import PROJECT_shipment_threads.ship.types.Size;
import PROJECT_shipment_threads.ship.types.Type;

import java.util.Random;

public class ShipGenerator implements Runnable{

    private Tunnel tunnel;
    private int shipCount;

    public ShipGenerator(Tunnel tunnel,int shipCount){
        this.tunnel = tunnel;
        this.shipCount = shipCount;
    }

    @Override
    public void run(){
        int count = 0;
        while (count < shipCount){
            Thread.currentThread().setName(" Ship generator");
            count++;
            tunnel.add(new Ship(getRandomSize(),getRandomType()));
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private Type getRandomType(){
        Random random = new Random();
        return Type.values()[random.nextInt(Type.values().length)];
    }

    private Size getRandomSize(){
        Random random = new Random();
        return Size.values()[random.nextInt(Size.values().length)];
    }
}
