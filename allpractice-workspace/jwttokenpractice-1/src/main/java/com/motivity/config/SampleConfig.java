package com.motivity.config;
//
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//
import com.motivity.service.UserData;
@Configuration
public class SampleConfig {
	 @Bean
		public PasswordEncoder getEncryptedPassword() {
			return new BCryptPasswordEncoder();
		}
	
	@Bean
	public UserData getUserDetailsService() {
		return new UserData();	
	}

}
