package com.teams2teams.loginapi;

import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.teams2teams.openapi.api.LoginApi;
import com.teams2teams.openapi.model.LoginInput;
import com.teams2teams.openapi.model.LoginOutput;

@RestController
public class LoginController implements LoginApi {

    public ResponseEntity<LoginOutput> login(LoginInput loginInput) {

        if (!loginInput.getUsername().equals("valaki") ||
                !loginInput.getPassword().equals("valami")) {
            throw new InvalidLoginException(loginInput.getUsername());
        }
        LoginOutput loginOutput = new LoginOutput();
		loginOutput.setSessionId(UUID.randomUUID());
		return ResponseEntity.ok(loginOutput);
    }

}
