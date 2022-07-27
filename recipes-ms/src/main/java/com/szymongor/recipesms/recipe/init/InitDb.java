package com.szymongor.recipesms.recipe.init;

import com.szymongor.recipesms.recipe.data.IngredientsRepository;
import com.szymongor.recipesms.recipe.data.RecipeRepository;
import com.szymongor.recipesms.recipe.model.Ingredient;
import com.szymongor.recipesms.recipe.model.Recipe;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Slf4j
public class InitDb {

    private final RecipeRepository recipeRepository;
    private final IngredientsRepository ingredientsRepository;

    @PostConstruct
    public void init() {
        var fusilliNoodles = new Ingredient();
        fusilliNoodles.setName("Fusilli Noodles");

        var coconutMilk = new Ingredient();
        coconutMilk.setName("Coconut milk");

        fusilliNoodles = ingredientsRepository.save(fusilliNoodles);
        coconutMilk = ingredientsRepository.save(coconutMilk);


        var coconutCarbonaraRecipe = new Recipe();
        coconutCarbonaraRecipe.setName("Coconut Carbonara");
        coconutCarbonaraRecipe.setIngredients(Set.of(fusilliNoodles, coconutMilk));

        recipeRepository.save(coconutCarbonaraRecipe);

        log.info("Initialized DB with recip");
    }
}
