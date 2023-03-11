package JavaPatterns.Builder;

import JavaPatterns.Builder.OrderAndPizzaBuilders.Order;
import JavaPatterns.Builder.OrderAndPizzaBuilders.OrderBuilder;
import JavaPatterns.Builder.dishes.dessert.IceCream;
import JavaPatterns.Builder.dishes.drinks.CocaCola;
import JavaPatterns.Builder.dishes.fast_food.Burger;
import JavaPatterns.Builder.dishes.snacks.CheeseSticks;

public class Main {

    public static void main(String[] args) {

        Order order = new OrderBuilder()
                .addSnack(new CheeseSticks())
                .addDessert(new IceCream())
                .addFastFood(new Burger())
                .addDrinks(new CocaCola())
                .build();

        System.out.println(order);

    }
}
