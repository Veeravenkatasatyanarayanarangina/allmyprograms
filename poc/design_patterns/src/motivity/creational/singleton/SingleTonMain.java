package motivity.creational.singleton;

public class SingleTonMain
{
    public static void main(String[] args) {
        SingleConnection connection = SingleConnection.getConnection();
        connection.checkConnection();
        //here we call the SingleConnection object 2 times but it will return same object
        SingleConnection connection2 = SingleConnection.getConnection();
        connection2.checkConnection();


    }
}
