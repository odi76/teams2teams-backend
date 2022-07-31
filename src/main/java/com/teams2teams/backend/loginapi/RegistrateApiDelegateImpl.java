package com.teams2teams.backend.loginapi;

import com.teams2teams.backend.openapi.api.RegistrateApiDelegate;
import com.teams2teams.backend.openapi.model.RegistrationData;
import com.teams2teams.backend.openapi.model.ErrorMessage;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegistrateApiDelegateImpl implements RegistrateApiDelegate {

    public ResponseEntity<Void> registrate(RegistrationData registrationData) {
        try {
            new UserService().registrateUser(registrationData.getEmail(),
                    registrationData.getPassword());
        }
        catch (RuntimeException re) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
