package motivity.creational.abstractfactory;

public class AbstractMain
{
    private static Application configureApplication()
    {
        Application app;
        GUIfactory guIfactory;
        String osname = System.getProperty("os.name").toLowerCase();
        if(osname.contains("mac"))
        {
            guIfactory = new MacOSFactory();
            app = new Application(guIfactory);
        }
        else {
            guIfactory = new WindowsFactory();
            app = new Application(guIfactory);
        }
        System.out.println(osname);
        return app;
    }
    public static void main(String[] args){
        Application app = configureApplication();
        app.create();
    }
}
