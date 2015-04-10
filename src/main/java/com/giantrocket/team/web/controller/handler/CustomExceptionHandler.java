package com.giantrocket.team.web.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.giantrocket.team.exceptions.CustomError;
import com.giantrocket.team.exceptions.ManagerException;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ManagerException.class)
    public ResponseEntity<CustomError> handleManagerException(ManagerException ex) {
    	CustomError body = new CustomError(ex.getCode(), ex.getMessage());        
        return new ResponseEntity<CustomError>(body, ex.getStatus());
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<CustomError> handleIllegalArgumentException(IllegalArgumentException ex) {
    	CustomError body =  new CustomError("400", ex.getMessage());        
    	return new ResponseEntity<CustomError>(body, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<CustomError> handleException(Exception ex, Object handler) {
    	CustomError body = new CustomError("500", "Bueno... tenemos un inconveniente con uno de nuestros servicios (o todos, quien sabe), pero lo más probable es que nuestros desarrolladores ya lo esten viendo, calma");        
        return new ResponseEntity<CustomError>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }	 
}
