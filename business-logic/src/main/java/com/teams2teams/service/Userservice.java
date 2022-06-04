package com.teams2teams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teams2teams.repositories.UserRepository;
import com.teams2teams.model.User;
import java.util.ArrayList;
import java.util.List;

@Service
public class Userservice {

    @Autowired
    public  UserRepository userRepository;

    public List getAllUsers() {
        List users = new ArrayList();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }
    
    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }


    public void saveOrUpdate(User user) {
        userRepository.save(user);
    }


    public void delete(int id) {
        userRepository.deleteById(id);
    }    
}
