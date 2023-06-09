package PROJECT_shipment_threads.ship;

import PROJECT_shipment_threads.ship.types.Size;
import PROJECT_shipment_threads.ship.types.Type;

public class Ship {

    private int count;
    private Size size;
    private Type type;


    public Ship(Size size,Type type){
        this.size = size;
        this.type = type;
    }

    public void add(int count){
        this.count += count;
    }

    public boolean countCheck(){
        if(count >= size.getValue()){
            return false;
        }else{
            return true;
        }
    }

    public int getCount() {
        return count;
    }

    public Size getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }
}
