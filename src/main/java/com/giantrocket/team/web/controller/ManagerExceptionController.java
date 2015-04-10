package com.giantrocket.team.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.giantrocket.team.exceptions.ManagerError;
import com.giantrocket.team.exceptions.ManagerException;

@ControllerAdvice
public class ManagerExceptionController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ManagerException.class)
    public ResponseEntity<ManagerError> handleApiException(HttpServletRequest request, ManagerException ex) {
    	ManagerError body = new ManagerError(ex.getCode(), ex.getMessage());        
        return new ResponseEntity<ManagerError>(body, ex.getStatus());
    }
	
}
