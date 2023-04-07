package satya;


import java.lang.reflect.Method;

class Sample{
    public void test()
    {

    }
}
public class Main
{
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("satya.Sample");
        System.out.println(c.getName());
        System.out.println(c.isInterface());
        System.out.println(c.descriptorString());
        System.out.println(c.toGenericString());
        Method method[] = c.getMethods();
        method[0].getName();
        method[0].isVarArgs();

    }
}
