package org.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test
{
    private String s;

    public Test(String s) {
        this.s = s;
    }
    public Test()
    {
        s = "satya";
    }

    public void method1()
    {
        System.out.println("this is method 1"+s);
    }
    public void method2(int k)
    {
        System.out.println("this is method2"+k);
    }
    public void method3()
    {
        System.out.println("this method was invoked");
    }

}

public class ReflectionTest
{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Test test = new Test();

        Class cls = test.getClass();
        System.out.println("class name is "+cls.getName());

        Constructor[] constructor = cls.getConstructors();
        for (Constructor c:constructor
             ) {
            System.out.println("constructor name is "+c.getName());
        }

        Method[] methods = cls.getMethods();

        for (Method m:methods
             ) {
            System.out.println("methods in Test class --- "+m.getName());
        }
        Method methodcall1 = cls.getDeclaredMethod("method2",int.class);
        methodcall1.invoke(test,20);

    }

}
