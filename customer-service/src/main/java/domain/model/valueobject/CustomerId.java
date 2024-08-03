package domain.model.valueobject;

import valueobject.Id;

import java.util.UUID;

public class CustomerId extends Id<UUID> {
    protected CustomerId(UUID value) {
        super(value);
    }
}
