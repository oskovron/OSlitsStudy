package patternsbrainfriendly.singleton;

public class ChocolateBoilerSynchronizedMethod {
    private static ChocolateBoilerSynchronizedMethod uniqueInstance;

    private ChocolateBoilerSynchronizedMethod() {
    }

    public static synchronized ChocolateBoilerSynchronizedMethod geInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoilerSynchronizedMethod();
        }
        return uniqueInstance;
    }

}
