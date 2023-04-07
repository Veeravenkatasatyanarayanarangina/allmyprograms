package exam;

import java.util.ArrayList;

public class Question3 {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList<>();
		String myArray[];
		
		try {
			int count=0;
			while(true)
			{
				myList.add("myList");
//				System.out.println(count);
//				count++;	
			}
		}
		catch (RuntimeException e) {
			
			System.out.println("Runtime exception..");
			
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("last one");
	}
}
