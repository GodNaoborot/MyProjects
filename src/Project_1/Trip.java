package Project_1;

public class Trip {

    public int day_expences = 0;

    private String name;

    private int transport_cost;

    private int amountOfDays;

    public Trip(){};

    public Trip(int day_expences, String name, int transport_cost, int amountOfDays) {
        this.day_expences = day_expences;
        this.name = name;
        this.transport_cost = transport_cost;
        this.amountOfDays = amountOfDays;
    }

    @Override
    public String toString() {
        return name+"; "
                +day_expences+"; "
                +amountOfDays+"; "
                +transport_cost;
    }

    public int getTotal(){
        return day_expences*amountOfDays+transport_cost;
    }

    public int getDay_expences() {
        return day_expences;
    }

    public String getName() {
        return name;
    }

    public int getTransport_cost() {
        return transport_cost;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public void setDay_expences(int day_expences) {
        this.day_expences = day_expences;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransport_cost(int transport_cost) {
        this.transport_cost = transport_cost;
    }

    public void setAmountOfDays(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }


}
