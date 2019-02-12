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
    private UserRepository userRepository;

    @PostMapping("/user/create")
    User addUser(@RequestBody User user) {
        System.out.println(user);
        if (user.getGender().equals("MALE")){
            user.setBmr(10*user.getWeight() + 6.25*user.getHeight() - 5*user.getAge() + 5);
        } else {
            user.setBmr(10*user.getWeight() + 6.25*user.getHeight() - 5*user.getAge() - 161);
        }
        user.setImt(user.getWeight()/(user.getWeight()*user.getHeight()));
        return userRepository.save(user);
    }

    @RequestMapping("/user/login")
    User Login (@RequestBody User user) {
        System.out.println(userRepository.findUser(user.getLogin(), user.getPassword()).toString());

        return userRepository.findUser(user.getLogin(), user.getPassword());
    }
}