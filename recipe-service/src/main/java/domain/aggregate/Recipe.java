package domain.aggregate;

import aggreagate.AggregateRoot;
import domain.entity.Ingredient;
import domain.valueobject.Author;
import domain.valueobject.RecipeId;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

@Getter
@AllArgsConstructor
public class Recipe extends AggregateRoot<RecipeId> {
    private String title;
    private String description;
    private Author author;
    private Instant createdDate;
    private Instant lastModifiedDate;
    private List<Ingredient> ingredients;
    private String difficultyLevel;
    private int servings;
    private int numberOfRatings;
    private double rating;
    private List<String> tags;
    private Duration preparationTime;
    private Duration cookingTime;
    private String instructions;
    private List<String> photosUrls;
}
