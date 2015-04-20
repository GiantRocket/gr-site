package com.giantrocket.site.util.rest.factory;

import java.io.IOException;
import java.net.URI;

import org.springframework.http.HttpMethod;
import org.springframework.http.client.AbstractClientHttpRequestFactoryWrapper;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpRequestFactory;

import com.giantrocket.site.util.rest.wrapper.CacheClientHttpRequestWrapper;

public class CacheClientHttpRequestFactory extends AbstractClientHttpRequestFactoryWrapper {
	
	private final Integer timeToLive;
	
	public CacheClientHttpRequestFactory(ClientHttpRequestFactory requestFactory, Integer timeToLive) {
		super(requestFactory);		
		this.timeToLive = timeToLive;
	}
	
	@Override
	protected ClientHttpRequest createRequest(URI uri, HttpMethod httpMethod,
			ClientHttpRequestFactory requestFactory) throws IOException {
		ClientHttpRequest request = requestFactory.createRequest(uri, httpMethod);
		
		if (HttpMethod.GET.equals(httpMethod)) {					
			return new CacheClientHttpRequestWrapper(request, this.timeToLive);		
		} else {
			return request;
		}
	}
	

}
