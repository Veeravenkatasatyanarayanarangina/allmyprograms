package com.google;

public class Main {
	
	int getParentObj()
	{
		Parent p = new Parent();
		
				
	return p.j;	
	}
	
	Parent getChildObj()
	{
		return new Child();
	}
	
	void getvoiddiff() {
		
		Parent g=new Parent();
		g.method1();
		Child s=new Child();
		s.method1();
		
	
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println(	main.getParentObj());
		main.getChildObj().method1();
		System.out.println("=====================");
		main.getvoiddiff();
		
	}
	

}
