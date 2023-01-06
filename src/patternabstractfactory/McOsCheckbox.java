package patternabstractfactory;

public class McOsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
