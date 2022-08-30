package com.teams2teams.backend.loginapi;

import com.teams2teams.backend.openapi.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class LoginapiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    protected ResponseEntity<ErrorMessage> handleUserNotFound(
            UserAlreadyExistsException uaee) {
        //TODO: Error code-okat enum-ba kell rakni
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setErrorCode(100);
        errorMessage.setErrorMessage(uaee.getMessage());
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }


}
