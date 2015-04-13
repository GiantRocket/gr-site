package com.giantrocket.site.web.controller.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.giantrocket.site.exceptions.InvalidSessionException;
import com.giantrocket.site.web.annotation.SessionRequired;

public class SessionRequiredInterceptor extends HandlerInterceptorAdapter {

	public static final String USER_ID_ATTR = "USER_ID_ATTR";
	public static final String USER_COOKIE_NAME = "UID";
	public static final String TOKEN_COOKIE_NAME = "TV";
	
	@Value("${com.giantrocket.login.required}")
	private Boolean loginRequired;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		
		if (this.loginRequired && handler instanceof HandlerMethod) {
		    HandlerMethod method = (HandlerMethod) handler;
		    if (this.haveAnnotation(method)) {
		    	String token = this.getTokenFromRequest(request);
		    	String userId = this.getUserFromRequest(request);
		    	
		    	this.validateSession(userId, token);
		    	
		    	//TODO a partir del userId deberia levantar la sesion en un argumentResolver
		    	// tengo que ver si la armo desde la base o la guardo algun lado
		    	request.setAttribute(USER_ID_ATTR, userId);
		    }	
		}
	    
		return Boolean.TRUE;
	}
	
	private  Boolean haveAnnotation(HandlerMethod method) {
		return method.getMethodAnnotation(SessionRequired.class) != null;
	}
	
	private String getTokenFromRequest(HttpServletRequest request) {
		return this.getCookieValue(TOKEN_COOKIE_NAME, request.getCookies());
	}
	
	private String getUserFromRequest(HttpServletRequest request) {
		return this.getCookieValue(USER_COOKIE_NAME, request.getCookies());
	}
	
	private String getCookieValue(String cookieName, Cookie[] cookies) {
		for (Cookie cookie :cookies) {
			if (cookie.getName().equals(cookieName)) {
				return cookie.getValue();
			}
		}
		return null;
	}
	
	private void validateSession(String userId, String token) {
		//TODO ver como validar la sesion
		throw new InvalidSessionException();
	}
	
}
