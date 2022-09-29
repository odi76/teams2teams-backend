package com.teams2teams.backend.loginapi.service;

import com.teams2teams.backend.loginapi.entity.Session;
import com.teams2teams.backend.loginapi.entity.User;
import com.teams2teams.backend.loginapi.exception.UserAlreadyExistsException;
import com.teams2teams.backend.loginapi.exception.UserNotFoundException;
import com.teams2teams.backend.loginapi.repository.SessionRepository;
import com.teams2teams.backend.loginapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

@Service
public final class UserService {

    @Autowired
    private UserRepository userRpository;

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public User registrateUser(String email, String password) {
        List<User> users = userRpository.findByEmail(email);
        if (users.size() > 0) {
            throw new UserAlreadyExistsException("User already exists!");
        }
        return userRpository.save(new User(email, passwordEncoder.encode(password)));
    }

    public Session loginUser(String email, String password) {
        List<User> users = userRpository.findByEmail(email);
        if (users.size() == 0) {
            throw new UserNotFoundException("User or password not found!");
        }
        if (!passwordEncoder.matches(password, users.get(0).getPassword())) {
            throw new UserNotFoundException("User or password not found!");
        }
        return sessionRepository.save(new Session(users.get(0)));
    }

    public void logoutSession(String sessionId) {
        Optional<Session> optional = sessionRepository.findById(sessionId);
        if (optional.isPresent()) {
            sessionRepository.delete(optional.get());
        }
    }

}
