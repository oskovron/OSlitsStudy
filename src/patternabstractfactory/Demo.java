package patternabstractfactory;

public class Demo {

    private static Application configureAppliation() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new McOsFactory();
            app = new Application(factory);
        }else{
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application application = configureAppliation();
        application.paint();
    }
}
