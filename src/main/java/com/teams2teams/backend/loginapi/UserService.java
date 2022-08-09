package com.teams2teams.backend.loginapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class UserService {

    @Autowired
    private UserRepository repository;

    public User registrateUser(String email, String password) {
        List<User> users = repository.findByEmail(email);
        if (users.size() == 0) {
            return repository.save(new User(email, password));
        }
        throw new RuntimeException("User exits with this email!");
    }

}
