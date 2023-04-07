package com.motivity;
class SingleTon{
    private static SingleTon singleton_instance= null;
    public String s;

    private SingleTon()
    {
            s= "hello i am singleton class public variable instantiate by counstructor";
    }
    public static SingleTon getInstance()
    {
        if (singleton_instance==null)
        {
            singleton_instance = new SingleTon();
        }
        return singleton_instance;
    }
}
public class SingletonExample
{
    public static void main(String[] args) {
        SingleTon st = SingleTon.getInstance();
        System.out.println("hash code of the first object : "+st.hashCode());
        SingleTon st1 = SingleTon.getInstance();
        System.out.println("hash code of the second object : "+st1.hashCode());
        SingleTon st3 = SingleTon.getInstance();
        System.out.println("hash code of the third object : "+st3.hashCode());
        if (st==st1&& st1==st3)
        {
            System.out.println("three object are saved in same memory location...");
        }
        else {
            System.out.println("three objects are stored in different heap memory");
        }
        st.s = (st.s).toUpperCase();
        System.out.println("first object variable "+st.s);
        System.out.println("second object variable "+st1.s);
    }
}
