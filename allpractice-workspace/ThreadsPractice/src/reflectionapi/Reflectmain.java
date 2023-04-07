package reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class Reflectmain {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> s = Employee1.class;
		System.out.println(s.getName());
		
		
		Method[] m = s.getDeclaredMethods();
		
		for(Method m2:m)
		{
			System.out.println(m2.getName());
			 int modifier = m2.getModifiers();
		        System.out.println("Modifier: " + Modifier.toString(modifier)+modifier);
		}	
		Constructor<?>[] constructors = s.getConstructors();
		
		for(Constructor<?> c:constructors)
		{
			c.setAccessible(true);
			Employee1 e = (Employee1) c.newInstance();
			System.out.println("hai"+e.toString());
		}
		
		
		int a = 10;
		int b = 20;
		System.out.println("before swap a :"+a+" and b :"+b);
		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println("after swap a :"+a+" and b :"+b);
		
		
	}

}
