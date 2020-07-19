package com.github.mathan26.spring5receipeapp.controllers;


import com.github.mathan26.spring5receipeapp.services.IngredientService;
import com.github.mathan26.spring5receipeapp.services.RecipeService;
import com.github.mathan26.spring5receipeapp.services.UnitOfMeasureService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

class IngredientControllerTest {

    @Mock
    IngredientService ingredientService;

    @Mock
    RecipeService recipeService;

    @Mock
    UnitOfMeasureService unitOfMeasureService;

    IngredientController ingredientController;

    MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        ingredientController = new IngredientController(recipeService,ingredientService,unitOfMeasureService);
        mockMvc= MockMvcBuilders.standaloneSetup(ingredientController).build();
    }

    @Test
    public void  testDeleteIngredient() throws  Exception{
        mockMvc.perform(get("/recipe/2/ingredient/3/delete"))
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:/recipe/2/ingredients"));
        verify(ingredientService,times(1)).deleteById(anyLong(),anyLong());
    }

}