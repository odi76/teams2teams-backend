package com.teams2teams.loginapi;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.teams2teams.model.User;
import com.teams2teams.openapi.api.LoginApi;
import com.teams2teams.service.*;
import com.teams2teams.openapi.model.LoginInput;
import com.teams2teams.openapi.model.LoginOutput;

@RestController
public class LoginController implements LoginApi {

    //@Autowired
    //private Userservice uService;

    public ResponseEntity<LoginOutput> login(LoginInput loginInput) {
        //static final Userservice userService;
        //String uname = loginInput.getUsername();

        //List userNameList = uService.userRepository.findByNameLike(uname);



        if (!loginInput.getUsername().equals("valaki") ||
                !loginInput.getPassword().equals("valami")) {
            throw new InvalidLoginException(loginInput.getUsername());
        }
        LoginOutput loginOutput = new LoginOutput();
		loginOutput.setSessionId(UUID.randomUUID());
		return ResponseEntity.ok(loginOutput);
    }

}
