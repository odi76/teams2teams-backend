package com.teams2teams.backend.loginapi.controller;

import com.teams2teams.backend.loginapi.service.UserService;
import com.teams2teams.backend.openapi.api.LogoutApiDelegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class LogoutApiDelegateImpl implements LogoutApiDelegate {

    @Autowired
    private UserService userService;

    public ResponseEntity<Void> logout(UUID sessionId) {
        userService.logoutSession(sessionId.toString());
        return ResponseEntity.ok(null);
    }



}
