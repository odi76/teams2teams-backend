package com.teams2teams.backend.loginapi;

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
        try {
            //TODO: OAS-t átírni, hogy user legyen a visszatérés
            User user = userService.registrateUser(registrationData.getEmail(),
                    registrationData.getPassword());
        }
        catch (RuntimeException re) {
            throw new UserAlreadyExistsException("User already exists!", re);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
