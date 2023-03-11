package JavaPatterns.Builder.dishes.ingridients;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ingredient {

    private final IngridientType type;
    private final String supplier;
    private final LocalDateTime productDate;
    private final LocalDateTime bestBeforeDate;

    public Ingredient(IngridientType type, String supplier, LocalDateTime productDate, LocalDateTime bestBeforeDate) {
        this.type = type;
        this.supplier = supplier;
        this.productDate = productDate;
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "type=" + type +
                ", supplier='" + supplier + '\'' +
                ", productDate=" + productDate +
                ", bestBeforeDate=" + bestBeforeDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return type == that.type && Objects.equals(supplier, that.supplier) && Objects.equals(productDate, that.productDate) && Objects.equals(bestBeforeDate, that.bestBeforeDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, supplier, productDate, bestBeforeDate);
    }
}
