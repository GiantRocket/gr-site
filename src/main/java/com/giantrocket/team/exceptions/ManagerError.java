package com.giantrocket.team.exceptions;

public class ManagerError {
	
	 	private String code;
	    private String message;

	    public ManagerError(String code, String message) {
	    	this.message = message;
	    	this.code = code;
	    }

	    public String getCode() {
	        return this.code;
	    }

	    public void setCode(String code) {
	        this.code = code;
	    }

	    public String getMessage() {
	        return this.message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

}
