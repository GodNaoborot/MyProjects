package JavaPatterns.Builder.dishes.fast_food;

import JavaPatterns.Builder.dishes.ingridients.Ingredient;
import JavaPatterns.Builder.dishes.types.Fast_Food;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Fast_Food {

    private final String name;
    private final List<Ingredient> ingredients;
    private final boolean cheeseBumpers;
    private final String doughBase;

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    public boolean isCheeseBumpers() {
        return cheeseBumpers;
    }

    public String getDoughBase() {
        return doughBase;
    }

    public Pizza(String name, List<Ingredient> ingredients, boolean cheeseBumpers, String doughBase) {
        this.name = name;
        this.ingredients = ingredients;
        this.cheeseBumpers = cheeseBumpers;
        this.doughBase = doughBase;

    }


    @Override
    public String toString() {
        return "Pizza";
    }


}
