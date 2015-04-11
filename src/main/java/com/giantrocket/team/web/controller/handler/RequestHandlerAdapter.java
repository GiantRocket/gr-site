package com.giantrocket.team.web.controller.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestHandlerAdapter extends HandlerInterceptorAdapter {

	public static final String AJAX_REQUEST_ATTR = "AJAX_REQUEST_ATTR";
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		
	    HandlerMethod method = (HandlerMethod) handler;
	    if (method.getReturnType().getParameterType() == ModelAndView.class) {
	    	request.setAttribute(AJAX_REQUEST_ATTR, Boolean.FALSE);
	    } else {
	    	request.setAttribute(AJAX_REQUEST_ATTR, Boolean.TRUE);
	    }
		
		return true;
	}
	
}
