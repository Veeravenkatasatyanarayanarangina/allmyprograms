package assignment3;

import java.util.Scanner;

public class Pttern1
{
    public static void main(String[] args)
    {
        int rows = 5;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }

            int tt = 1;
            for (int k = 1; k <= i; k++)
            {
                System.out.print(tt + " ");
                tt = tt * (i - k) / (k);
            }
            System.out.println();
        }
    }
}
