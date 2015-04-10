package com.giantrocket.team.exceptions;

import org.springframework.http.HttpStatus;

public class ManagerException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private ErrorType errorType;
	
	public ManagerException(ErrorType errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;		
	}
	
	public ManagerException(ErrorType errorType, Throwable t) {
		super(errorType.getMessage(), t);
		this.errorType = errorType;		
	}
	
	public HttpStatus getStatus() {
		return this.errorType.getHttpStatus();
	}
	
	public String getCode() {
		// (404 * 100) + 1 = 40401 
		return Integer.toString(this.errorType.getHttpStatus().value() * 100 + this.errorType.getNumber());
	}
	
}
