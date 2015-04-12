package com.giantrocket.team.web.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.giantrocket.team.exceptions.HttpsRequiredException;
import com.giantrocket.team.web.annotation.HttpsRequired;
import com.giantrocket.team.web.annotation.SessionRequired;

public class HttpsRequiredInterceptor extends HandlerInterceptorAdapter {

	public static final String HTTPS_SCHEMA = "Https";
	
	@Value("${com.giantrocket.https.required}")
	private Boolean httpsRequired;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
				
		if (this.httpsRequired && handler instanceof HandlerMethod) {
		    HandlerMethod method = (HandlerMethod) handler;
		    if (this.haveAnnotation(method) && this.isHttpRequest(request)) {
		    	throw new HttpsRequiredException(); 
		    }	
		}
	    
	    return Boolean.TRUE;
	}
	
	private Boolean isHttpRequest(HttpServletRequest request) {
		//TODO el dia que suba a prod hay que validar si esto es asi o de otra forma, por ejemplo, en Despegar esto asi no anda ya que siempre es http
		return !request.getScheme().equals(HTTPS_SCHEMA);		
	}
	
	private  Boolean haveAnnotation(HandlerMethod method) {
		return method.getMethodAnnotation(SessionRequired.class) != null || method.getMethodAnnotation(HttpsRequired.class) != null;
	}
	
}
