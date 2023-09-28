package patternsbrainfriendly.singleton;

public class ChocolateBoilerApp {
    public static void main(String[] args) {
        var chocolateBoilerSynchronizedMethod = ChocolateBoilerSynchronizedMethod.geInstance();
        var chocolateBoilerEagerCreation = ChocolateBoilerEagerCreation.getInstance();
        var chocolateBoilerDoubleCheckedLocking = ChocolateBoilerDoubleCheckedLocking.getInstance();
    }
}
