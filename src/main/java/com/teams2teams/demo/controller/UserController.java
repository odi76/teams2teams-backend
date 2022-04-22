package com.teams2teams.demo.controller;

import com.teams2teams.demo.model.User;
import com.teams2teams.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("V1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/user")
    public User createUser(@RequestBody User user){
        System.out.println("Hello jött egy post");
        return userRepository.save(user);
    }

    @GetMapping(path = "/user")
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }



}
