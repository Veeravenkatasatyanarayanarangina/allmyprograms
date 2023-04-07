package mytopic.collections;

public class SingleTon
{
    private static SingleTon single_instance = null;
    public String s;
    private  SingleTon()
    {
        s="hello";
    }
    public static SingleTon singleTon()
    {
        if(single_instance==null)
        {
            single_instance = new SingleTon();
        }
        return single_instance;

    }

}
