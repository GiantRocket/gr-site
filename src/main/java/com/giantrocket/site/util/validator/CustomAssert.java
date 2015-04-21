package com.giantrocket.site.util.validator;

import org.springframework.util.Assert;

import com.giantrocket.site.exceptions.ErrorType;
import com.giantrocket.site.exceptions.ManagerException;

public final class CustomAssert {
	
	public static void notNull(Object object, ErrorType customException){
		try{
			Assert.notNull(object);
		}catch(IllegalArgumentException e){
			throw new ManagerException(customException);
		}
	}
	
	public static void notEmpty(Object[] array, ErrorType customException){
		try{
			Assert.notEmpty(array);
		}catch(IllegalArgumentException e){
			throw new ManagerException(customException);
		}
	}
	
	public static void doesNotContain(String textToSearch, String substring, ErrorType customException){
		try{
			Assert.doesNotContain(textToSearch, substring);
		}catch(IllegalArgumentException e){
			throw new ManagerException(customException);
		}
	}
	
	public static void isTrue(boolean expression, ErrorType customException){
		try{
			Assert.isTrue(expression);
		}catch(IllegalArgumentException e){
			throw new ManagerException(customException);
		}
	}
	
	public static void isNull(Object object, ErrorType customException){
		try{
			Assert.isNull(object);
		}catch(IllegalArgumentException e){
			throw new ManagerException(customException);
		}
	}
	
}
