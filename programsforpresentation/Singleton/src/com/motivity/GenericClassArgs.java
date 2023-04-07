package com.motivity;
//generic class for more arguments

class Generic<T,U>
{
    T tobject;
    U uobject;
    public Generic(T tobject,U uobject)
    {
        this.tobject = tobject;
        this.uobject =uobject;
    }
    public void print()
    {
        System.out.println("first object "+this.tobject);
        System.out.println("second object "+this.uobject);
    }
    public void getObjectclassDetails()
    {
        System.out.println(this.tobject.getClass().getName()+" = "+this.tobject);
        System.out.println((this.uobject.getClass().getName()+" = "+this.uobject));
    }

}
public class GenericClassArgs
{
    public static void main(String[] args) {
        Generic<String,Integer> generic = new Generic<>("motivty",10);
        generic.print();
        generic.getObjectclassDetails();
    }
}
