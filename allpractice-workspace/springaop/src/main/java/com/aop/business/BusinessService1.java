package com.aop.business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aop.data.DataService;

@Service
public class BusinessService1 {
	
	@Autowired
	private DataService dataService;
	
	public int maxInArray() {
		
		int data[] = dataService.getdata();
		int max = Arrays.stream(data).max().orElse(0);
		return max;
		
	}
	
	
	
	

}
