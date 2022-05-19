package com.teams2teams.loginapi;

import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.teams2teams.loginapi.api.LogoutApi;

@RestController
public class LogoutController implements LogoutApi {

    public ResponseEntity<Void> logout(UUID uuid) {

		return ResponseEntity.ok(null);
    }

}