package com.giantrocket.site.util.cache;

import java.util.Date;

public class CacheEntity<T> {
	
	private T object;
	private Date expiredDate;
	
	public CacheEntity(T object, Integer timeToLive) {
		this.object = object;
		this.expiredDate = new Date();
		this.expiredDate.setTime(this.expiredDate.getTime() + (timeToLive * 1000));		
	}
	
	public T getObject() {
		return this.object;
	}

	public Boolean isExpired() {
		return this.expiredDate.before(new Date());
	}
}
