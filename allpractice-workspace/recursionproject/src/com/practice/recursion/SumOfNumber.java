package com.practice.recursion;

public class SumOfNumber {
	
	static long sum = 0;
	public static void main(String[] args) {
//		System.out.println(System.currentTimeMillis());
//		long starttime = System.currentTimeMillis();
//		long sumOfNumber = sumOfAllNumbers(1999);
//		System.out.println(sumOfNumber);
//		System.out.println("total time taken : "+(System.currentTimeMillis()-starttime));
		
		System.out.println(sumOfTheNumber(12));
		
		System.out.println(palindromeCheck("saytyas"));
//		
	}
	
	public static long sumOfAllNumbers(long number)
	{
		if(number!=0)
		{
			System.out.println(number);
			return number+sumOfAllNumbers(number-1);
			
		}
		else
			return number;
	}
	
	public static long sumOfTheNumber(long number)
	{
		if(number!=0)
		{
			sum = sum+number%10;
			return sumOfTheNumber(number/10);
		}
		return sum;
		
	}
	public static boolean palindromeCheck(String s){
	    if(s.length() == 0 || s.length() == 1) {
	      return true;
	    }
	    if(s.charAt(0) == s.charAt(s.length()-1)) {
	    	System.out.println(s);
	      return palindromeCheck(s.substring(1, s.length()-1));
	    }
	    return false;
	  }

}
