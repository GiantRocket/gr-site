package com.giantrocket.team.exceptions;

import org.springframework.http.HttpStatus;

public enum ErrorType {
	
	// 400
	TEAM_EXISTS(HttpStatus.BAD_REQUEST, 1, "Un equipo con el nombre solicitado ya se encuentra creado, por favor contacta con un administrador para resolver el problema"),

	// 404
	TEAM_NOT_FOUND(HttpStatus.NOT_FOUND,1,"El equipo solicitado no existe"),
	MATCH_NOT_FOUND(HttpStatus.NOT_FOUND,2,"El match solicitado no existe"),
	
	// 500
	FILE_TEAM_READ_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,1,"El equipo solicitado no ha podido ser leido, por favor contacta un administrador o intenta de nuevo mas tarde"), 
	FILE_MATCH_READ_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,2,"El match solicitado no ha podido ser leido, por favor contacta un administrador o intenta de nuevo mas tarde"),	
	FILE_TEAM_WRITE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,3,"Hubo errores al intentar crear el equipo, por favor contacta un administrador o intenta de nuevo mas tarde"),
	FILE_MATCH_WRITE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,4,"Hubo errores al intentar crear el match, por favor contacta un administrador o intenta de nuevo mas tarde");
	
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
