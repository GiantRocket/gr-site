package com.giantrocket.site.util.rest.response;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;

public class CacheHttpResponse implements ClientHttpResponse{

	// TODO: hay que ver si hay otra forma de guardar en memoria que no sea string, para que ocupe menos
	// esto fue lo mas rapido que me salio
	private String body;
	private HttpHeaders headers;	
	private Date expiredDate;
	
	public CacheHttpResponse(InputStream body, HttpHeaders headers, Integer timeToLive) throws IOException {
		this.body = this.convertStreamToString(body);
		body.close();
		this.headers = headers;		
		this.expiredDate = new Date();
		this.expiredDate.setTime(this.expiredDate.getTime() + (timeToLive * 1000));		
	}
	
	@Override
	public InputStream getBody() throws IOException {
		return new ByteArrayInputStream(this.body.getBytes(StandardCharsets.UTF_8));
	}

	@Override
	public HttpHeaders getHeaders() {		
		return this.headers;
	}

	@Override
	public HttpStatus getStatusCode() throws IOException {		
		return HttpStatus.OK;
	}

	@Override
	public int getRawStatusCode() throws IOException {
		return 200;
	}

	@Override
	public String getStatusText() throws IOException {		
		return "OK";
	}

	@Override
	public void close() {		
		//nothing to do;
	}
	
	@SuppressWarnings("resource")
	private String convertStreamToString(java.io.InputStream is) {	    
		java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
	}
	
	public Boolean isExpired() {
		return this.expiredDate.before(new Date());
	}

}
