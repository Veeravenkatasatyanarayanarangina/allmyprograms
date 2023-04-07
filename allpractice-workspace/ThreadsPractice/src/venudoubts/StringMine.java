package venudoubts;

public class StringMine {
	public static void main(String[] args) {
		String k =" ";
		k.replace(' ', 's');
		if(k==null)
		{
			System.out.println("null");
		
		}
		else
		{
			System.out.println("not null  "+k.length());
			System.out.println(k.trim().length());
			System.out.println(k==null);
		}
		
	}

}
