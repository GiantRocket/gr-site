package com.giantrocket.site.data.connector.rest.wrapper;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.AbstractClientHttpRequest;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.Assert;

import com.giantrocket.site.data.connector.rest.response.CacheHttpResponse;

public class CacheClientHttpRequestWrapper extends AbstractClientHttpRequest{
	
	private static Map<String, CacheHttpResponse> RESPONSES = new HashMap<String, CacheHttpResponse>();
	
	private final ClientHttpRequest request;	
	private final Integer timeToLive;
	
	public CacheClientHttpRequestWrapper(ClientHttpRequest request, Integer timeToLive) {
		Assert.notNull(request, "'request' must not be null");
		this.request = request;	
		this.timeToLive = timeToLive;
	}	
	
	@Override
	public HttpMethod getMethod() {
		return this.request.getMethod();
	}

	@Override
	public URI getURI() {
		return this.request.getURI();
	}

	@Override
	protected OutputStream getBodyInternal(HttpHeaders headers) throws IOException {
		return null;
	}

	@Override
	protected ClientHttpResponse executeInternal(HttpHeaders headers)
			throws IOException {
		this.request.getHeaders().putAll(headers);	
		
		String key = this.generateKey(request);
		
		if (RESPONSES.containsKey(key)) {
			CacheHttpResponse cacheResponse = RESPONSES.get(key);
			if (!cacheResponse.isExpired()) {
				return cacheResponse;
			}
		}
		
		ClientHttpResponse response = this.request.execute();
		if (HttpStatus.OK.equals(response.getStatusCode())) {
			CacheHttpResponse cacheResponse = new CacheHttpResponse(response.getBody(), response.getHeaders(), timeToLive); 
			RESPONSES.put(key, cacheResponse);
			return cacheResponse;
		} else {
			return response;
		}
	}	
	
	private String generateKey(HttpRequest request) {
		//TODO: tener en cuenta los headers?
		return String.format("%s-%s", request.getMethod().name(), request.getURI().toString());
	}

}
