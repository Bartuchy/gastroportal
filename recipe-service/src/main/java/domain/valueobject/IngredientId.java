package domain.valueobject;

import valueobject.Id;

import java.util.UUID;

public class IngredientId extends Id<UUID> {
    protected IngredientId(UUID value) {
        super(value);
    }
}
