package PROJECT_shipment_threads;

import PROJECT_shipment_threads.loader.PierLoader;
import PROJECT_shipment_threads.loader.ShipGenerator;
import PROJECT_shipment_threads.ship.Tunnel;
import PROJECT_shipment_threads.ship.types.Type;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();

        ShipGenerator shipGenerator = new ShipGenerator(tunnel, 10);

        PierLoader pierLoader4Bread = new PierLoader(tunnel, Type.BREAD);
        PierLoader pierLoader4Banana = new PierLoader(tunnel, Type.BANANA);
        PierLoader pierLoader4Clothes = new PierLoader(tunnel, Type.CLOTHES);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(shipGenerator);
        service.execute(pierLoader4Bread);
        service.execute(pierLoader4Banana);
        service.execute(pierLoader4Clothes);

        service.shutdown();

    }
}
