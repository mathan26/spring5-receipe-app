package com.github.mathan26.spring5receipeapp.services;

import com.github.mathan26.spring5receipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
