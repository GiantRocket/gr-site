package com.giantrocket.team.web.controller.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.giantrocket.team.exceptions.CustomError;
import com.giantrocket.team.exceptions.ManagerException;

@ControllerAdvice
public class CustomExceptionHandler {
	
    @ExceptionHandler(ManagerException.class)
    public Object handleManagerException(HttpServletRequest request, ManagerException ex) {
    	return this.generateErrorResponse(request, ex.getCode(), ex.getMessage(), ex.getStatus());
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    public Object handleIllegalArgumentException(HttpServletRequest request, IllegalArgumentException ex) {
    	return this.generateErrorResponse(request, "400", ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(Exception.class)
    public Object handleException(HttpServletRequest request, Exception ex) {
        return this.generateErrorResponse(request, "500", "Bueno... tenemos un inconveniente con uno de nuestros servicios (o todos, quien sabe), pero lo más probable es que nuestros desarrolladores ya lo esten viendo, calma", HttpStatus.INTERNAL_SERVER_ERROR);
    }	 
    
    private Boolean isAjaxRequest(HttpServletRequest request) {
    	return (Boolean) request.getAttribute(RequestHandlerAdapter.AJAX_REQUEST_ATTR);
    }
    
    private Object generateErrorResponse(HttpServletRequest request, String errorCode, String errorMessage, HttpStatus status) {
    	if (this.isAjaxRequest(request)) {
    		
    		CustomError body = new CustomError(errorCode, errorMessage);        
    		return new ResponseEntity<CustomError>(body, status);
    	}
    	
    	ModelAndView errorView = new ModelAndView("rules-screen");
    	return errorView;
    }
}
