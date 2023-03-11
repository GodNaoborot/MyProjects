package Optionals;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Car {

    private String model;
    private String type;
    private int weight;

    private String color;

    Car(String model,String type,int weight,String color){
        this.model = model;
        this.type = type;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor(){return color;}

    public Set<Car> addCarsToSet(Car...q){
        Set<Car> cars = new HashSet<>();

        for(int i = 0;i < q.length;i++){
            cars.add(q[i]);
        }

        return cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
