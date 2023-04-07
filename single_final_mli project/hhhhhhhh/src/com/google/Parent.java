package com.google;

public class Parent {
	
	int j=20;
	
	public void method1()
	{
		System.out.println(10);
		
	}

}
class Child extends Parent{

	@Override
	public void method1() {
	
		System.out.println("this is child class object");
	}
	
}
