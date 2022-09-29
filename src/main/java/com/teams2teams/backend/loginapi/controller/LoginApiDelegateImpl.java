package com.teams2teams.backend.loginapi.controller;

import java.util.UUID;

import com.teams2teams.backend.loginapi.entity.Session;
import com.teams2teams.backend.loginapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.teams2teams.backend.openapi.api.LoginApiDelegate;
import com.teams2teams.backend.openapi.model.LoginInput;
import com.teams2teams.backend.openapi.model.LoginOutput;

@Service
public class LoginApiDelegateImpl implements LoginApiDelegate {

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<LoginOutput> login(LoginInput loginInput) {
        Session session = userService.loginUser(loginInput.getEmail(),
                loginInput.getPassword());
        LoginOutput loginOutput = new LoginOutput();
        loginOutput.setSessionId(UUID.fromString(session.getId()));
        return ResponseEntity.ok(loginOutput);
    }

}
