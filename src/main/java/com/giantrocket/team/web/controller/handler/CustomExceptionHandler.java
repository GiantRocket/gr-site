package com.giantrocket.team.web.controller.handler;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.giantrocket.team.exceptions.CustomError;
import com.giantrocket.team.exceptions.HttpsRequiredException;
import com.giantrocket.team.exceptions.InvalidSessionException;
import com.giantrocket.team.exceptions.ManagerException;
import com.giantrocket.team.web.controller.interceptor.AjaxRequestInterceptor;

@ControllerAdvice
public class CustomExceptionHandler {
	
	public static final String LOGIN_REDIRECT = "/login";
	public static final String HTTPS_REDIRECT = "https://%s%s?%s";
	
	public static final String ILLEGAL_ARGUMENT_STATUS = "400";
	public static final String INTERNAL_SERVER_ERROR_STATUS = "500";
	public static final String INTERNAL_SERVER_ERROR_MSG = "Bueno... tenemos un inconveniente con uno de nuestros servicios (o todos, quien sabe), pero lo más probable es que nuestros desarrolladores ya lo esten viendo, calma";
	
    @ExceptionHandler(ManagerException.class)
    public Object handleManagerException(HttpServletRequest request, ManagerException ex) {
    	return this.generateErrorResponse(request, ex.getCode(), ex.getMessage(), ex.getStatus());
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    public Object handleIllegalArgumentException(HttpServletRequest request, IllegalArgumentException ex) {
    	return this.generateErrorResponse(request, ILLEGAL_ARGUMENT_STATUS, ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(Exception.class)
    public Object handleException(HttpServletRequest request, Exception ex) {
        return this.generateErrorResponse(request, INTERNAL_SERVER_ERROR_STATUS, INTERNAL_SERVER_ERROR_MSG, HttpStatus.INTERNAL_SERVER_ERROR);
    }	
    
    @ExceptionHandler(InvalidSessionException.class)
    public Object handleSessionException() {    	
    	return new ModelAndView(new RedirectView(LOGIN_REDIRECT));
    }
    
    @ExceptionHandler(HttpsRequiredException.class)
    public Object handleHttpsException(HttpServletRequest request) {    	
    	String domain = request.getServerName();
    	String path = request.getRequestURI();
    	String query = StringUtils.isBlank(request.getQueryString()) ? "" : request.getQueryString();
    	
    	return new ModelAndView(new RedirectView(String.format(HTTPS_REDIRECT, domain, path, query)));
    }
    
    private Boolean isAjaxRequest(HttpServletRequest request) {
    	return (Boolean) request.getAttribute(AjaxRequestInterceptor.AJAX_REQUEST_ATTR);
    }
    
    private Object generateErrorResponse(HttpServletRequest request, String errorCode, String errorMessage, HttpStatus status) {
    	if (this.isAjaxRequest(request)) {
    		
    		CustomError body = new CustomError(errorCode, errorMessage);        
    		return new ResponseEntity<CustomError>(body, status);
    	}
    	    	
    	ModelAndView errorView = new ModelAndView("error");    	
    	errorView.addObject("errorCode", errorCode);
    	return errorView;
    }
}
