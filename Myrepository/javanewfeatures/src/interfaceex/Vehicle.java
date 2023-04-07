package interfaceex;

public interface Vehicle
{
   default void use()
    {
        System.out.println("travel purpose..............");
    }
    public void speed();

}
