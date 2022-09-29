package com.teams2teams.backend.loginapi.controller;

import com.teams2teams.backend.loginapi.entity.User;
import com.teams2teams.backend.loginapi.service.UserService;
import com.teams2teams.backend.openapi.api.RegistrateApiDelegate;
import com.teams2teams.backend.openapi.model.RegistrationData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegistrateApiDelegateImpl implements RegistrateApiDelegate {

    @Autowired
    private UserService userService;

    public ResponseEntity<Void> registrate(RegistrationData registrationData) {
        User user = userService.registrateUser(registrationData.getEmail(),
                registrationData.getPassword());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
