package com.teams2teams.backend.loginapi;

import com.teams2teams.backend.openapi.api.LogoutApiDelegate;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class LogoutApiDelegateImpl implements LogoutApiDelegate {

    public ResponseEntity<Void> logout(UUID sessionId) {

        return ResponseEntity.ok(null);

    }



}
