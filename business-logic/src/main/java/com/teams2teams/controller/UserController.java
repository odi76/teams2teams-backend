package com.teams2teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.teams2teams.service.Userservice;
import com.teams2teams.model.User;
import com.teams2teams.repositories.UserRepository;


@RestController
public class UserController {

    @Autowired
    Userservice userService;

    @GetMapping("/users")
    private List getAllUsers() {
        return userService.getAllUsers();
    }    



    @GetMapping("/user/{uname}")
    private List<User> getListOfUserByName (@PathVariable String uname) {
        return userService.userRepository.findByNameLike(uname);
    }


    

}
