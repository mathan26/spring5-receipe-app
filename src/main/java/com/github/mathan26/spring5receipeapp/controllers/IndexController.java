package com.github.mathan26.spring5receipeapp.controllers;

import com.github.mathan26.spring5receipeapp.domain.Category;
import com.github.mathan26.spring5receipeapp.domain.UnitOfMeasure;
import com.github.mathan26.spring5receipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@Slf4j
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        log.debug("getIndexPage method called");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
