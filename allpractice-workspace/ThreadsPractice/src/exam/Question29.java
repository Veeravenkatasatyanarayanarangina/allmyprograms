package exam;

import java.util.Arrays;

public class Question29 {
	public static void main(String[] args) {
		String input="deloitte";
		char chartoReplace='t';;
		
		int cnt=1;
		for(int i=0;i<input.length();i++){
		char ch=input.charAt(i);
		if(ch==chartoReplace){
		input=input.replaceFirst(String.valueOf(chartoReplace),String.valueOf(cnt));
		cnt++;
		}
		}
		System.out.println(input);
		
			
			
	}
	

}
