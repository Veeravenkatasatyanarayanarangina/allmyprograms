package com.oauth.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String main(OAuth2AuthenticationToken token)
	{
		System.out.println(token.getPrincipal());
		System.out.println(token.getName());
		System.out.println(token.getDetails());
		System.out.println(token.getAuthorities());
		return "success";
	}
	

}
