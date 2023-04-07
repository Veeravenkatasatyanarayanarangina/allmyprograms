package motivity.creational.singleton;

public class SingleConnection
{
    private static SingleConnection connection = new SingleConnection();

    private SingleConnection()
    {}
    public static SingleConnection getConnection()
    {
        if(connection==null)
        {
            connection = new SingleConnection();
        }
        return connection;
    }
    public void checkConnection()
    {
        System.out.println("connection object is created and the hashcode is : "+connection.hashCode());
    }

}
