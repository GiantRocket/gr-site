package com.giantrocket.team.exceptions;

import org.springframework.http.HttpStatus;

public class ManagerException extends RuntimeException {

	private static final long serialVersionUID = 940870165573989747L;
	private ErrorType errorType;
	
	public ManagerException(ErrorType errorType) {
		this.errorType = errorType;
	}
	
	public ManagerException(ErrorType errorType, Throwable t) {
		super(t);
		this.errorType = errorType;		
	}

	@Override
	public String getMessage() {
		return this.errorType.getMessage();
	}
	
	public HttpStatus getStatus() {
		return this.errorType.getHttpStatus();
	}
	
	public String getCode() {
		return this.errorType.getHttpStatus().value() + this.errorType.getNumber().toString();
	}
	
}
