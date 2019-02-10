package ru.javajunior.juniorproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.javajunior.juniorproject.entity.User;
import ru.javajunior.juniorproject.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping("/user/create")
    User addUser(@RequestBody User user) {
        System.out.println(user);

        return repository.save(user);
    }

    @RequestMapping("/user/login")
    User Login (@RequestBody User user) {
        System.out.println(repository.findUser(user.getLogin(), user.getPassword()).toString());
        return repository.findUser(user.getLogin(), user.getPassword());
    }
}