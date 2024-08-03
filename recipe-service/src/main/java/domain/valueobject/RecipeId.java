package domain.valueobject;

import valueobject.Id;

import java.util.UUID;

public class RecipeId extends Id<UUID> {
    protected RecipeId(UUID value) {
        super(value);
    }
}
