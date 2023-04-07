package com.streamapi;

public class Example2 {
	String s=null;
	
	public static void main(String[] args) {
		
		Example2 ex = new Example2();
	
		String s1 = "a";
		try {
			System.out.println(ex.s+s1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
