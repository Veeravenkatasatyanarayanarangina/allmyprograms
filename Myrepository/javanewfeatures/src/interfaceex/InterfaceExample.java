package interfaceex;

public class InterfaceExample
{
    public static void main(String[] args)
    {
        Vehicle v = () ->{
        System.out.println("audi speed 90kmph");
        };
         v.speed();
         v.use();
    }
}
