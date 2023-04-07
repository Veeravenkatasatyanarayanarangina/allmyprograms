package MyDates;

import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;


public class MySelf {
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(1947, Month.AUGUST, 16);
		System.out.println(d.getDayOfWeek());
	
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
	
		
//		ArrayList<Integer> arr = new ArrayList(Arrays.asList(1,2,3,3,4));
//		for(int number:arr)
//		{
//			arr.remove(0);
//			System.out.println("size"+arr.size());
//			
//			System.out.print(number);
//		}
//		
	}

}
