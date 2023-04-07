package com.aop.business;

import org.springframework.stereotype.Controller;

public class WebClient 
{
	public void getrequestmap()
	{
		
		WebClient webClient = WebClient
		          .builder()
		          .baseUrl("http://localhost:8080")
		          
		          .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE) 
		          .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
		          .build();
	}

}
