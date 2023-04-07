package com.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aop.business.BusinessService1;
import com.aop.business.WebClient;

@SpringBootApplication
public class SpringaopApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private BusinessService1 businessService1;

	public static void main(String[] args) {
		SpringApplication.run(SpringaopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	     int i=businessService1.maxInArray();
		 logger.info("the max in an array is {}",i);
		
		// TODO Auto-generated method stub
	}
	
}
