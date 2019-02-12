package ru.javajunior.juniorproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javajunior.juniorproject.repository.IngredientRepository;
import ru.javajunior.juniorproject.repository.RationRepository;
import ru.javajunior.juniorproject.repository.UserRepository;

@RestController
public class RationController {

    @Autowired
    RationRepository rationnRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    IngredientRepository ingredientRepository;






}
