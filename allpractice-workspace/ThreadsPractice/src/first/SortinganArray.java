package first;

//sorting an array
public class SortinganArray {
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,3,7,9,4,24,56,45,63};
		int[] distarr = new int[arr.length];
		int length = arr.length;
		int index =0;
		for(int i=0;i<arr.length;i++)
		{
			int flag =0;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j]) 
				{
					flag = 1;
				}
			}
			if(flag==0)
			{
				distarr[index]=arr[i];
				index++;
			}
			
		}
			for(int i:distarr)
			{
				System.out.println(i);
			}
		
	}

}
