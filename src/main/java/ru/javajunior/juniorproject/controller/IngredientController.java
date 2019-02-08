package ru.javajunior.juniorproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.javajunior.juniorproject.entity.Ingredient;
import ru.javajunior.juniorproject.repository.IngredientRepository;

@RestController
public class IngredientController {
    @Autowired
    private IngredientRepository repository;

    @PostMapping("/ingredient/create")
    Ingredient addIngredient(@RequestBody Ingredient ingredient) {
        System.out.println(ingredient);

        return repository.save(ingredient);
    }
}
