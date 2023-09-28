package patternsbrainfriendly.singleton;

public class ChocolateBoilerEagerCreation {
    private static ChocolateBoilerEagerCreation uniqueInstance = new ChocolateBoilerEagerCreation();
    private ChocolateBoilerEagerCreation() {}

    public static ChocolateBoilerEagerCreation getInstance() {
        return uniqueInstance;
    }
}
