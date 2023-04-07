package assignment3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Assaignment3_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many numbers you add :");
        int range = sc.nextInt();
        ArrayList<String> al = new ArrayList<String>();
        for (int i=0;i<range;i++)
        {
            System.out.println("enter element : ");
            al.add(Integer.toString(sc.nextInt()));
        }
        Collections.sort(al,Collections.reverseOrder());
        String highestnumber = "";
        System.out.println(highestnumber);
        for (int j = 0;j<al.size();j++)
        {
            highestnumber = highestnumber+al.get(j);
        }
        System.out.println(highestnumber);

    }
}
