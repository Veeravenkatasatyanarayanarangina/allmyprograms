package com.motivty.exceptionsusingtrycatch;

import java.util.Scanner;

public class ArrayIndexBoundExample
{
    public static void main(String[] args)
    {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        try
        {
            for (int i=0;i<=6;i++)//here we try to insert values more
            {
                arr[i]=sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }

    }
}
