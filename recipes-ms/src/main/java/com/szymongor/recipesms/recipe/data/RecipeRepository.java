package com.szymongor.recipesms.recipe.data;

import com.szymongor.recipesms.recipe.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
