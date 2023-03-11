package PROJECT_multithreading_ThiefAndOwner;

import java.util.*;

public class Owner{

    private List<Thing> things;
    private boolean isInTheHouse;

    public Owner(List<Thing> things,boolean isInTheHouse){
        this.isInTheHouse = isInTheHouse;
        this.things = things;

    }

    public List<Thing> getThings() {
        return things;
    }

    public boolean isInTheHouse() {
        return isInTheHouse;
    }

    public void setThings(List<Thing> things) {
        this.things = things;
    }

    public void setInTheHouse(boolean inTheHouse) {
        isInTheHouse = inTheHouse;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "things=" + things +
                ", isInTheHouse=" + isInTheHouse +
                '}';
    }

    public synchronized boolean putIntoHouse(Thing element){

        if(isInTheHouse){
            things.add(element);
            System.out.println("Владелец прикупил себе в квартиру "+ element);

        }else{

            System.out.println("Владельца нет дома");

            return false;
        }


        return true;
    }

}
