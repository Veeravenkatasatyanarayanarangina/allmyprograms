package mytopic.collections;

public class ThirdMax
{
    public static int findThirdMax(int[] arr)
    {
        int n1 = arr[0];
        int n2 = Integer.MIN_VALUE;
        int n3 = Integer.MIN_VALUE;
        int length = arr.length;
        int count =0;

        if(length<3)
        {
            if(length==1)
            {
                return arr[0];
            }
            else {
                return Math.max(arr[0],arr[1]);
            }
        }
        for (int i = 1;i<length;i++)
        {
            if(n1<arr[i])
            {
                n1 = arr[i];
            }
        }
        for(int i = 0;i<length;i++)
        {
            if(n1>arr[i]&&arr[i]>n2)
            {
                n2 = arr[i];
            }
        }
        for(int i =0;i<length;i++)
        {
            if(n2>arr[i]&&arr[i]>=n3)
            {
                n3 = arr[i];
                count++;
            }
        }
        if(n3==Integer.MIN_VALUE)
        {
            if(count!=0)
            {
                return n3;
            }
            n3 = n1;
        }
        return n3;
    }

    public static void main(String[] args) {
        int arr[] = {3,2};
        System.out.println(findThirdMax(arr));

    }

}
