package com.motivity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.motivity.filter.JWTFilter;
import com.motivity.service.UserData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.web.authentication.AuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

@Autowired
private UserData userData;
@Autowired
private JWTFilter jwtFilter;

public AuthenticationProvider getProvider() {
	DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
	provider.setUserDetailsService(userData);
	provider.setPasswordEncoder(new BCryptPasswordEncoder());
	return provider;
}

@Override
protected void configure(HttpSecurity http) throws Exception {
	http.csrf().disable();
	http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
	http.authorizeRequests().antMatchers("/home","/registration","/savedata","/checklogin").permitAll()
	.antMatchers("/user","/doctorregister").hasAnyAuthority("user","doctor").anyRequest()
	.authenticated().and().sessionManagement()
	.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	.and().formLogin().loginPage("/mycustomlogin")
	.permitAll().and().logout().permitAll();
} 
@Bean
public AuthenticationManager authentications(AuthenticationManagerBuilder auth) throws Exception {
	return super.authenticationManagerBean();
}	
}
