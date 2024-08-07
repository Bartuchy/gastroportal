package domain.entity;

import domain.valueobject.IngredientId;
import domain.valueobject.Unit;
import entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class Ingredient extends BaseEntity<IngredientId> {
    private String name;
    private double quantity;
    private Unit unit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ingredient that = (Ingredient) o;
        return Double.compare(that.quantity, quantity) == 0 &&
                Objects.equals(name, that.name) &&
                unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, quantity, unit);
    }
}
