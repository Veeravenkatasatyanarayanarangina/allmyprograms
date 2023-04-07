package org.example;

public class Main
{
    public static void main(String[] args) {
        int a = 19;
        int b = 5;
//method calling
        int c = add(a, b);   //a and b are actual parameters
        System.out.println("The sum of a and b is= " + c);
        show();
    }
    //user defined method
    public static int add(int n1, int n2)   //n1 and n2 are formal parameters
    {
        int s;
        s=n1+n2;
        return s; //returning the sum
    }
    static void show()
    {
        System.out.println("It is an example of static method.");
    }
}