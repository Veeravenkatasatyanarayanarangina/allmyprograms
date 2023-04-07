package com.motivity.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.motivity.details.CustomUserDetails;
import com.motivity.model.RegisterUser;
import com.motivity.repository.UserRepository;


public class UserData implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		RegisterUser register=userRepository.findByEmail(username);
		
		if(register!=null) {
			return new CustomUserDetails(register);
		}
		else {
			throw new UsernameNotFoundException(username+" not in database");
		}
		
	}

	
}
