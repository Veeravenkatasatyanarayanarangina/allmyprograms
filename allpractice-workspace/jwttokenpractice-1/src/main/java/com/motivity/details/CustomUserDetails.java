package com.motivity.details;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.motivity.model.RegisterUser;

public class CustomUserDetails implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	private RegisterUser registerUser; 

	public CustomUserDetails(RegisterUser registerUser) {
		super();
		this.registerUser = registerUser;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		ArrayList<GrantedAuthority> role=new ArrayList<>();
		SimpleGrantedAuthority roles=new SimpleGrantedAuthority(registerUser.getRole());
		role.add(roles);
		return role;
	}

	@Override
	public String getPassword() {
		return registerUser.getPassword();
	}

	@Override
	public String getUsername() {
	
		return registerUser.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
