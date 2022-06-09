package com.teams2teams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.teams2teams.service.UserService;
import com.teams2teams.model.User;
import com.teams2teams.repositories.UserRepository;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    private List getAllUsers() {
        return userService.getAllUsers();
    }    



    @GetMapping("/user/{email}")
    private List<User> getListOfUserByEmail (@PathVariable String email) {
        return userService.userRepository.findByEmail(email);
    }


    

}
