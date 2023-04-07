package com.satya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satya.dto.LoginDto;
import com.satya.util.JwtUtil;

@RestController
public class HomeController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@GetMapping("/helloworld")
	public ResponseEntity<?> myHelloWorld()
	{
		return new ResponseEntity<String>("Hello World",HttpStatus.OK);
	}
	@PostMapping("/login")
	public ResponseEntity<?> userLogin(@RequestBody LoginDto loginDto)
	{
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword());
		authenticationManager.authenticate(token);
		String jwttoken = jwtUtil.generate(loginDto.getUsername());
		return new  ResponseEntity<String>(jwttoken,HttpStatus.OK);
		
	}

}
