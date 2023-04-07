package com.aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {
	
	public int[] getdata()
	{
		return new int[] {1,3,4,6,0,4,5,35,10};
	}

}
