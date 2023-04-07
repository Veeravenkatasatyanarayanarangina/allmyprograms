package com.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecOAuthGitConfig {
	
	@Bean
	SecurityFilterChain defaultSecurityFilter(HttpSecurity http) throws Exception
	{
		http.authorizeRequests().anyRequest().authenticated().and().oauth2Login();
		return http.build();
	}

	@Bean
	public ClientRegistrationRepository clientRepo()
	{
		ClientRegistration clientRegistration = clientRegistration();
		return new InMemoryClientRegistrationRepository(clientRegistration);
		
	}
	private ClientRegistration clientRegistration()
	{
//		return CommonOAuth2Provider.GITHUB
//				.getBuilder("github")
//				.clientId("9a20c7605fa029475224")
//				.clientSecret("647403698f0d5bc2cec430ebc845d93593b9848c")
//				.build();
		return CommonOAuth2Provider.GOOGLE
				.getBuilder("google")
				.clientId("974675636078-lffa803bclkvsbfd410l5f2hoh9au1vn.apps.googleusercontent.com")
				.clientSecret("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")
				.build();
		
		
		
	}
}
