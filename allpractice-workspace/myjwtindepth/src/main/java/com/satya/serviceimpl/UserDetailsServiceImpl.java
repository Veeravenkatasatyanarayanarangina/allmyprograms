package com.satya.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	PasswordEncoder encoder;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("satya", encoder.encode("Satyaa@123"));
		if(map.containsKey(username))
		{
			return new User(username, map.get(username), new ArrayList<>());
					
		}
		throw new UsernameNotFoundException(username);
	}

}
