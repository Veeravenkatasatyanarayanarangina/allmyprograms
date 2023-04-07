package motivity.creational.abstractfactory;

public class Application
{
    private Button button;
    private CheckBox checkBox;

    public Application(GUIfactory guIfactory)
    {
        button = guIfactory.createButton();
        checkBox = guIfactory.createCheckBox();
    }
    public void create()
    {
        button.create();
        checkBox.create();
    }

}
