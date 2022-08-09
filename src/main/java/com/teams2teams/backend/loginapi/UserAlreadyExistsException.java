package com.teams2teams.backend.loginapi;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String message, RuntimeException re) {
        super(message, re);
    }
}
