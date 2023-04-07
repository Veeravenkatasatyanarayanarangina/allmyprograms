package venudoubts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingByasci 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuilder output = new StringBuilder();
		char[] arr = input.toCharArray();
		Arrays.sort(arr);
		output.append(arr);
		System.out.println(input);
		output.reverse();
		System.out.println(output);
	}

}
