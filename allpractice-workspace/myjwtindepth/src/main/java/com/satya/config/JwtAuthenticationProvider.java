package com.satya.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.satya.serviceimpl.UserDetailsServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JwtAuthenticationProvider implements AuthenticationProvider {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	UserDetailsServiceImpl userDetailsService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		// In BasicController.login() method, we call authenticationManager.authenticate(token)
		// Then, Authentication Manager calls AuthenticationProvider's authenticate method.

		// Since JwtAuthenticationProvider is our custom authentication provider,
		// this method will be executed.
		log.info("message1");
		String username = authentication.getName();
		String password = String.valueOf(authentication.getCredentials());
		
		log.info("message1");
		UserDetails userDetails  = userDetailsService.loadUserByUsername(username);
		if(userDetails != null)
		{
			if(passwordEncoder.matches(password, userDetails.getPassword()))
			{
				UsernamePasswordAuthenticationToken authenticationToken = 
						new  UsernamePasswordAuthenticationToken(username,password,userDetails.getAuthorities());
				return authenticationToken;
			}
		}
		throw new BadCredentialsException("Error!!");
		
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.equals(authentication);
	}

}
