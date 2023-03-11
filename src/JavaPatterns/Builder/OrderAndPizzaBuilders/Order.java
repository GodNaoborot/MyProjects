package JavaPatterns.Builder.OrderAndPizzaBuilders;

import JavaPatterns.Builder.dishes.fast_food.Pizza;
import JavaPatterns.Builder.dishes.ingridients.Ingredient;
import JavaPatterns.Builder.dishes.ingridients.IngridientType;
import JavaPatterns.Builder.dishes.types.Dessert;
import JavaPatterns.Builder.dishes.types.Drinks;
import JavaPatterns.Builder.dishes.types.Fast_Food;
import JavaPatterns.Builder.dishes.types.Snacks;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Order {

    private Snacks snack;
    private Drinks drink;
    private Fast_Food food;
    private Dessert dessert;

    public Order(Snacks snack, Drinks drink, Fast_Food food, Dessert dessert) {
        this.snack = snack;
        this.drink = drink;
        this.food = food;
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Order{" +
                "snack=" + snack +
                ", drink=" + drink +
                ", food=" + food +
                ", dessert=" + dessert +
                '}';
    }

    public static Pizza makePizza() {

        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        Scanner qwerty = new Scanner(System.in);

        System.out.println("Здравствуйте!\n" +
                "Выберите основу для пиццы: 1 - тонкая, 2 - средняя, 3 - толстая, 4 - закрытая");


        String doughBase;

        doughBase = qwerty.next();
        switch (doughBase) {
            case "1":
                doughBase = "thin";
                break;
            case "3":
                doughBase = "lush";
                break;
            case "4":
                doughBase = "closed";
                break;
            default:
                doughBase = "normal";
        }
        pizzaBuilder.setDoughBase(doughBase);

        try {
            System.out.println("Добавьте ингредиент: \n" +
                    Arrays.stream(IngridientType.values())
                            .map(ingridientType -> ingridientType.getId() + " - " + ingridientType.getRuName())
                            .collect(Collectors.joining(", ")));
            String answer;

            System.out.println("Введите \"хватит\" для завершения выбора ингредиентов");
            while (!(answer = qwerty.next()).equals("хватит")) {
                Ingredient ingredient = new Ingredient(
                        IngridientType.getById(Integer.parseInt(answer)),
                        "our supplier",
                        LocalDateTime.now(),
                        LocalDateTime.MAX);
                pizzaBuilder.addIngredient(ingredient);
            }
        }catch (NumberFormatException e) {
            System.out.println("При добавлении ингредиентов произошла ошибка!");;
        }

        return pizzaBuilder.build();
    }


}
