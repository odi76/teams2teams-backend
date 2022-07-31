package com.teams2teams.backend.loginapi;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.teams2teams.backend.openapi.api.LoginApiDelegate;
import com.teams2teams.backend.openapi.model.LoginInput;
import com.teams2teams.backend.openapi.model.LoginOutput;

@Service
public class LoginApiDelegateImpl implements LoginApiDelegate {

    @Override
    public ResponseEntity<LoginOutput> login(LoginInput loginInput) {

        if (!loginInput.getEmail().equals("valaki") ||
                !loginInput.getPassword().equals("valami")) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        LoginOutput loginOutput = new LoginOutput();
        loginOutput.setSessionId(UUID.randomUUID());
        return ResponseEntity.ok(loginOutput);
    }

}
