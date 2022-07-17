package com.szymongor.recipesms.recipe;

import com.szymongor.recipesms.recipe.boundary.GetRecipeByIdUseCase;
import com.szymongor.recipesms.recipe.model.Recipe;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/recipe")
public class RecipesController {

    private final GetRecipeByIdUseCase getRecipeByIdUseCase;

    @GetMapping("/{id}")
    public Recipe getRecipe(@PathVariable("id") int id){
        log.info("about to retrieve book {}", id);
        return getRecipeByIdUseCase.execute(id);
    }
}
