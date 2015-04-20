package com.giantrocket.site.util.cache;

import java.util.HashMap;
import java.util.Map;

public abstract class CacheWrapper<T> {

	private static Map<String, CacheEntity<?>> CACHE_MAP = new HashMap<String, CacheEntity<?>>();
	
	protected abstract String generateKey();
	protected abstract T run();
	
	private Integer timeToLive;
	
	public CacheWrapper(Integer timeToLive) {
		this.timeToLive = timeToLive;
	}
	
	@SuppressWarnings("unchecked")
	public T execute() {
		String key = this.generateKey();
		if (CACHE_MAP.containsKey(key)) {
			CacheEntity<?> entity =  CACHE_MAP.get(key);
			if (!entity.isExpired()) {
				return (T) entity.getObject();
			} else {
				CACHE_MAP.remove(key);
			}
		}
		
		T object = this.run();
		if (object == null) {
			return null;
		}
		
		CacheEntity<T> entity = new CacheEntity<T>(object, this.timeToLive);
		CACHE_MAP.put(key, entity);
		return object;
	}						
}
