package com.giantrocket.site.data.connector.factory;

import java.io.IOException;
import java.net.URI;

import org.springframework.http.HttpMethod;
import org.springframework.http.client.AbstractClientHttpRequestFactoryWrapper;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpRequestFactory;

import com.giantrocket.site.data.connector.factory.wrapper.CacheClientHttpRequestWrapper;

public class CacheClientHttpRequestFactory extends AbstractClientHttpRequestFactoryWrapper {

	public CacheClientHttpRequestFactory(ClientHttpRequestFactory requestFactory) {
		super(requestFactory);
	}
	
	@Override
	protected ClientHttpRequest createRequest(URI uri, HttpMethod httpMethod,
			ClientHttpRequestFactory requestFactory) throws IOException {
		ClientHttpRequest request = requestFactory.createRequest(uri, httpMethod);
		return new CacheClientHttpRequestWrapper(request);		
	}
	

}
