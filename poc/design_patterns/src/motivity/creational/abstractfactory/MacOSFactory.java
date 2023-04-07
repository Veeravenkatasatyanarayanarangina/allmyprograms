package motivity.creational.abstractfactory;

public class MacOSFactory implements GUIfactory
{

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
}
