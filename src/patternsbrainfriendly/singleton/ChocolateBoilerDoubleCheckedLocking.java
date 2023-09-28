package patternsbrainfriendly.singleton;

public class ChocolateBoilerDoubleCheckedLocking {
    private volatile static ChocolateBoilerDoubleCheckedLocking uniqueInstance;
    private ChocolateBoilerDoubleCheckedLocking() {}

    public static ChocolateBoilerDoubleCheckedLocking getInstance() {
        if (uniqueInstance==null) {
            synchronized (ChocolateBoilerDoubleCheckedLocking.class) {
                if (uniqueInstance==null){
                    uniqueInstance = new ChocolateBoilerDoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }
}
