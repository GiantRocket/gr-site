package com.giantrocket.site.exceptions;

public class CustomError {
	
	 	private String code;
	    private String message;

	    public CustomError(String code, String message) {
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
