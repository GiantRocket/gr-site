package com.giantrocket.team.exceptions;

import org.springframework.http.HttpStatus;

public enum ErrorType {
	
	TEAM_EXISTS(HttpStatus.BAD_REQUEST, 1, "Un equipo con el nombre solicitado ya se encuentra creado, por favor contacta con un administrador para resolver el problema"),
	
	FILE_WRITE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, 1, "Hubo errores al intentar crear el equipo, por favor contacta un administrador o intenta de nuevo mas tarde"),
	
	FILE_READ_ERROR(HttpStatus.BAD_REQUEST,1,"El equipo solicitado no ha podido ser leido, por favor contacta un administrador o intenta de nuevo mas tarde"), 
	
	FILE_NOT_FOUND(HttpStatus.BAD_REQUEST,1,"El equipo solicitado no existe");
	
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
