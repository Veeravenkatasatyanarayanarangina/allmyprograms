package com.motivity;

public class LargestNumber
{
    public static String change(String str,int i,int j)
    {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        String c = String.valueOf(ch);
        return c;

    }

    public static void main(String[] args) {
        int n = 9973;
        String num = Integer.toString(n);
        String large_number = num;
        for(int i = 0;i<num.length();i++)
        {
            for(int j =i+1;j<num.length();j++)
            {
                num = change(num,i,j);
                if(large_number.compareTo(num) <0)
                {
                    large_number = num;
                }
                num = change(num,i,j);
            }
        }
        System.out.println(large_number);

    }
}
