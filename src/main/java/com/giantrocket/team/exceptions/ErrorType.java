package com.giantrocket.team.exceptions;

import org.springframework.http.HttpStatus;

public enum ErrorType {
	
	TEAM_EXISTS(HttpStatus.BAD_REQUEST, 1, "A team with the requested name already exists, please contact an administrator to solve this problem"),
	
	FILE_WRITE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, 1, "There has been errors trying to create your team, please contact an administrator to solve this problem or try again later"),
	
	FILE_READ_ERROR(HttpStatus.BAD_REQUEST,1,"The requested team couldnt be read, please contact an administrator to solve this problem or try again later"), 
	
	FILE_NOT_FOUND(HttpStatus.BAD_REQUEST,1,"The requested team does not exist");
	
	private String message;
	private HttpStatus httpStatus;
	private Integer number;
	
	private ErrorType(HttpStatus httpStatus, Integer number, String message) {
		this.message = message;
		this.number = number;
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public Integer getNumber() {
		return number;
	}

	
	
	
}
