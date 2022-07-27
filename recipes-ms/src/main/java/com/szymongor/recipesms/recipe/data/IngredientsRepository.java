package com.szymongor.recipesms.recipe.data;

import com.szymongor.recipesms.recipe.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredient, String> {
}
