package com.satya.filter;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import com.satya.util.JwtUtil;

import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class JwtTokenFilter extends OncePerRequestFilter {
	
	@Autowired
	JwtUtil jwtUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		//try to find the authorization header in request
		final String autherizationHeader = request.getHeader("Authorization");
		log.info("message1");

		
		
		if(autherizationHeader==null ||
				autherizationHeader.isEmpty()|| 
				!autherizationHeader.startsWith("Bearer"))
		{
			log.info("message2");
			filterChain.doFilter(request, response);
			// if Authorization header does not exist, then skip this filter
			// and continue to execute next filter class
			log.info("message3");

			return;
			
		}
		final String token = autherizationHeader.substring(7);
	
		
		if(!jwtUtil.validate(token))
		{
			// if token is not valid, then skip this filter
			// and continue to execute next filter class.
			// This means authentication is not successful since token is invalid.
			
			filterChain.doFilter(request, response);
			log.info("message4");
			return;

		}
		String username = jwtUtil.getUsername(token);
		// initializing UsernamePasswordAuthenticationToken with its 3 parameter constructor
		// because it sets super.setAuthenticated(true); in that constructor.

		UsernamePasswordAuthenticationToken upasstoken = new UsernamePasswordAuthenticationToken(username,null,new ArrayList<>());
		upasstoken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
		// finally, give the authentication token to Spring Security Context
		
		SecurityContextHolder.getContext().setAuthentication(upasstoken);
		// end of the method, so go for next filter class
		filterChain.doFilter(request, response);
		
		
		// TODO Auto-generated method stub
		
		
	}

}
