package com.motivity;

class Test<T>
{
    T object;
    Test(T object)
    {
        this.object = object;
    }
    public T getObject()
    {
        return this.object;
    }
}
public class GenericClassExample
{
    public static void main(String[] args) {
        Test<Integer> integerTest = new Test<>(10);
        System.out.println(integerTest.getObject());

        Test<String> stringTest = new Test<>("motivity labs");
        System.out.println(stringTest.getObject());
    }
}
