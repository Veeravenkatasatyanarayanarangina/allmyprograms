package com;

public class SingelTon
{
    public static void main(String[] args) {
        SingleExample obj = SingleExample.getInstance();
        System.out.println(obj.hashCode());
        SingleExample obj2 = SingleExample.getInstance();
        System.out.println(obj.hashCode() );

    }
}
class SingleExample
{
    static SingleExample obj = new SingleExample();

    private SingleExample()
    {

    }
    public static SingleExample getInstance()
    {
        if(obj==null)
        {
            obj = new SingleExample();
        }
        return obj;
    }




}

