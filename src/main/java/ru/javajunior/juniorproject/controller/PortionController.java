package ru.javajunior.juniorproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.javajunior.juniorproject.entity.Portion;
import ru.javajunior.juniorproject.repository.PortionRepository;

@RestController
public class PortionController {

    @Autowired
    PortionRepository portionRepository;


    @PostMapping("/portion/add")
    Portion addPortion(@RequestBody Portion portion){
//        portion.setUser(userRepository.findUserById(portion.getUserId()));
        return portionRepository.save(portion);
    }

//    @RequestMapping("/portion/get/{userId}/{date}")
//    Iterable<Portion> findPortionsById(@PathVariable int userId, @PathVariable String date){
//        return portionRepository.findPortionByUserAndDate(userId, date);
//    }




}
