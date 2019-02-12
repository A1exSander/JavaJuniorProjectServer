package ru.javajunior.juniorproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javajunior.juniorproject.entity.Ingredient;
import ru.javajunior.juniorproject.repository.IngredientRepository;

@RestController
public class IngredientController {
    @Autowired
    private IngredientRepository ingredientRepository;

    @PostMapping("/ingredient/create")
    public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
        System.out.println(ingredient);

        return ingredientRepository.save(ingredient);
    }
    @RequestMapping("/ingredient/getAll")
    public Iterable<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();

    }
}
