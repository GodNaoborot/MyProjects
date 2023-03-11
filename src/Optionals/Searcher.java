package Optionals;

import java.util.*;

public class Searcher {

    public static void findACar(Car model, Set<Car> carSet) {
        Optional<Car> car = carSet.stream().filter(x -> x.getModel().equals(model.getModel())).findFirst();
        if (car.isPresent()) {
            System.out.println(Optional.of(car.get()));
        } else {
            car.orElseThrow(NoSuchFieldError::new);
        }

    }

    public static void findACar(Car model, Car type, Set<Car> carSet) {
        Optional<Car> car = carSet.stream().filter(x -> x.getModel().equals(model.getModel())).filter(x -> x.getType().equals(type.getType())).findFirst();
        car.ifPresentOrElse(
                x -> System.out.println("Congratulations! You've found a car."),
                () -> System.out.println("I may disappoint you, but there is no available cars you are searching now!")
        );
    }

    public static void findACar1(Car model, Car type, Set<Car> carSet) {
        Optional<Car> car = carSet.stream().filter(x -> x.getModel().equals(model.getModel())).filter(x -> x.getType().equals(type.getType())).findFirst();
        car.ifPresentOrElse(
                x -> System.out.println(x.getColor()),
                () -> System.out.println("I may disappoint you, but there is no available cars you are searching now!")
        );
    }

    public static void findACar2(Car model,Car color,Set<Car> carSet){
        Optional<Car> car = carSet.stream().filter(x->x.getModel().equals(model.getModel())).filter(x->x.getColor().equals(color.getColor())).findFirst();
        car.ifPresentOrElse(
                x -> System.out.println(x.toString()),
                () -> System.out.println(carSet.stream().toList().get((int)(Math.random()*carSet.size())))
        );

    }


    public static void main(String[] args) {
        Car c1 = new Car("f1", "se14", 500, "White");
        Car c2 = new Car("f2", "se15", 523, "Green");
        Car c3 = new Car("f3", "se16", 492, "Black");
        Car c4 = new Car("f4", "se17", 560, "Red");
        Car c5 = new Car("f5", "se18", 550, "Blue");
        AutoCatalog runner = new AutoCatalog();
        Set<Car> cars1 = new HashSet<>(c1.addCarsToSet(c1, c2, c3, c4, c5));


        Comparator<Car> comp = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return (o1.getModel().substring(o1.getModel().length() - 1, o2.getModel().length()).compareTo(o2.getModel().substring(o2.getModel().length() - 1, o2.getModel().length())));


            }
        };

        List<Car> list = cars1.stream().sorted(comp).toList();

        Set<Car> cars = new HashSet<>(list);

        findACar(c1, cars);
        findACar(c1, c2, cars);
        findACar1(c1, c1, cars);
        findACar2(c1,c2,cars);


    }
}
