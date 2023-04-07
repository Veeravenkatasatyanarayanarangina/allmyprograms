package exam;

public class Selfone {
	public static void main(String[] args) {
		String str = "deloitte";
		char replace = 't';
	
		int count = 1;
		for(int i = 0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==replace)
			{
				str=str.replaceFirst("t",String.valueOf(count));
				count++;
			}
		}
		System.out.println(str);
		
	}

}
