package Optionals;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;

public class AutoCatalog {

    public Optional<Car> findByModel(Car model,Set<Car> carSet){
        Optional<Car> opCar = carSet.stream().filter(x-> x.getModel().equals(model.getModel())).findAny();
        opCar.ifPresentOrElse(
                car1->
                        System.out.println(opCar.get().getModel()+"was found!"),
                ()-> System.out.println("There isn't car with this model...")
        );
        return opCar;
    }

    public Optional<Car> findByType(Car type,Set<Car> carSet){
        Optional<Car> opCar = carSet.stream().filter(x-> x.getType().equals(type.getType())).findAny();
        opCar.ifPresentOrElse(
                car1->
                        System.out.println(opCar.get().getType()+"was found!"),
                ()-> System.out.println("There isn't car with this type...")
        );
        return opCar;
    }

    public Optional<Car> findByWeight(Car weight,Set<Car> carSet){
        Optional<Car> opCar = carSet.stream().filter(x-> x.getWeight()==(weight.getWeight())).findAny();
        opCar.ifPresentOrElse(
                car1->
                        System.out.println(opCar.get().getWeight()+" was found!"),
                ()-> System.out.println("There isn't car with this weight...")
        );
        return opCar;
    }

    public static void main(String[] args) {
        Car c1 = new Car("f1", "se14", 500,"White");
        Car c2 = new Car("f2", "se15", 523,"Green");
        Car c3 = new Car("f3", "se16", 492,"Black");
        Car c4 = new Car("f4", "se17", 560,"Red");
        Car c5 = new Car("f5", "se18", 550,"Blue");
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


        System.out.println(cars);
        System.out.println(runner.findByModel(c1,cars));
    }
}
