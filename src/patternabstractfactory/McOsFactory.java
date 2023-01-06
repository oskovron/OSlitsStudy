package patternabstractfactory;

public class McOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new McOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new McOsCheckbox();
    }
}
