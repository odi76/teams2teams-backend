package com.teams2teams.backend.loginapi.exception;

import com.teams2teams.backend.Teams2TeamsErrorConstants;
import com.teams2teams.backend.openapi.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class LoginapiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    protected ResponseEntity<ErrorMessage> handleUserExists(
            UserAlreadyExistsException e) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setErrorCode(Teams2TeamsErrorConstants.USER_ALREADY_EXISTS);
        errorMessage.setErrorMessage(e.getMessage());
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserNotFoundException.class)
    protected ResponseEntity<ErrorMessage> handleUserNotFound(
            UserNotFoundException e) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setErrorCode(Teams2TeamsErrorConstants.USER_NOT_FOUND);
        errorMessage.setErrorMessage(e.getMessage());
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

}
