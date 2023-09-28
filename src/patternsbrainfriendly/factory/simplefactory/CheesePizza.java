package patternsbrainfriendly.factory.simplefactory;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare cheese pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Bake cheese pizza.");
    }
}
