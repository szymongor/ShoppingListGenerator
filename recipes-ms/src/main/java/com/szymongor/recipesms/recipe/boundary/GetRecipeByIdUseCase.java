package com.szymongor.recipesms.recipe.boundary;

import com.szymongor.recipesms.recipe.data.RecipeRepository;
import com.szymongor.recipesms.recipe.model.Recipe;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class GetRecipeByIdUseCase {

    private final RecipeRepository recipeRepository;

    public Recipe execute(Integer id) {
        return recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cant find Recipe with id: " + id));
    }
}
