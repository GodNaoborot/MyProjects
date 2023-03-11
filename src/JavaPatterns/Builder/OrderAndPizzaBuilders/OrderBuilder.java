package JavaPatterns.Builder.OrderAndPizzaBuilders;

import JavaPatterns.Builder.dishes.types.Dessert;
import JavaPatterns.Builder.dishes.types.Drinks;
import JavaPatterns.Builder.dishes.types.Fast_Food;
import JavaPatterns.Builder.dishes.types.Snacks;

public class OrderBuilder {

    private Snacks snack;
    private Drinks drink;
    private Fast_Food food;
    private Dessert dessert;

    public OrderBuilder addSnack(Snacks snack){
        this.snack = snack;
        return this;

    }

    public OrderBuilder addDrinks(Drinks drink){
        this.drink = drink;
        return this;

    }

    public OrderBuilder addFastFood(Fast_Food food){
        this.food = food;
        return this;

    }

    public OrderBuilder addDessert(Dessert dessert){
        this.dessert = dessert;
        return this;

    }

    public Order build(){
        if(snack == null && drink == null&&food == null&&dessert == null){
            throw new RuntimeException("Попытка создания пустого заказа");
        }else {
            return new Order(snack, drink, food, dessert);
        }
    }
}
