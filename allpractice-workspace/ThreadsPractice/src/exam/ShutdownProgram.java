package exam;

import java.io.IOException;
import java.util.Scanner;

public class ShutdownProgram {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Number of Seconds: ");
	      int seconds = scan.nextInt();
	      Runtime r = Runtime.getRuntime();
	      try
	      {
	         System.out.println("Shutting down the PC after " +seconds+" seconds.");
	         r.exec("shutdown -s -t " +seconds);
	      }
	      catch(IOException e)
	      {
	         System.out.println("Exception: " +e);
	      }
		
	}

}
