package com.giantrocket.site.data.connector.factory.wrapper;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.AbstractClientHttpRequest;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.Assert;

public class CacheClientHttpRequestWrapper extends AbstractClientHttpRequest{
	
	private final ClientHttpRequest request;
	private static Map<String, ClientHttpResponse> RESPONSES;

	public CacheClientHttpRequestWrapper(ClientHttpRequest request) {
		Assert.notNull(request, "'request' must not be null");
		this.request = request;
		
		// determino si el request ya se habia hecho y tengo guardado el response
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
		// decido si ejecuto o no en base al response que quizas ya tengo guardado
		ClientHttpResponse response = this.request.execute();
		return response;
	}	

}
