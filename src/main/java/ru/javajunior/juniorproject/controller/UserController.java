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


    @RequestMapping("/")
    public String index(){

        return "index";
    }

//    @RequestMapping(value = "/user/create",
//            method = RequestMethod.GET)
//    public String showForm(@ModelAttribute User user,
//                           Model model)
//    {
//        model.addAttribute("user", new User());
//        return "add_user";
//    }

//    @RequestMapping(value = "/user/create",
//            method = RequestMethod.POST)
//
//    public String submitform(@ModelAttribute User user, Model model)
//    {
//        repository.save(user);
//
//        List<User> users = (List<User>) repository.findAll();
//        model.addAttribute("users", users);
//        return "user_list";
//    }
}