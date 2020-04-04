package com.github.mathan26.spring5receipeapp.repositories;

import com.github.mathan26.spring5receipeapp.domain.Category;
import com.github.mathan26.spring5receipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
