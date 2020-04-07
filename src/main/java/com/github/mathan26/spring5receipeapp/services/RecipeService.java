package com.github.mathan26.spring5receipeapp.services;

import com.github.mathan26.spring5receipeapp.commands.RecipeCommand;
import com.github.mathan26.spring5receipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long l);

    void deleteById(Long id);
}
