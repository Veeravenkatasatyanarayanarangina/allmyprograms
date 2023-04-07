package assignment3;

import java.util.Scanner;

public class NearestPallindrom
{
    public static void main(String[] args)
    {
        NearestPallindrom pl = new NearestPallindrom();
       System.out.println(" 342 nearest pallindrome is :"+ pl.nearestPalindromic(342));


    }
    public long nearestPalindromic(long n) {
        long num = n;
        for (long i = 1;; i++) {
            if (isPalindrome(num - i))
                return (num - i);
            if (isPalindrome(num + i))
                return (num + i);
        }
    }
    boolean isPalindrome(long x) {
        long t = x, rev = 0;
        while (t > 0) {
            rev = 10 * rev + t % 10;
            t /= 10;
        }
        return rev == x;
    }

}
