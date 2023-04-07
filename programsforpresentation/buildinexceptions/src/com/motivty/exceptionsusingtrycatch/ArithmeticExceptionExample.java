package com.motivty.exceptionsusingtrycatch;

public class ArithmeticExceptionExample
{
    public static void main(String[] args)
    {
        int a = 10;
        int b =0;
        try
        {
            int c = a/b;//here exception accurs
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
    }
}
