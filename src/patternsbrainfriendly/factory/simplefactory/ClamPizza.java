package patternsbrainfriendly.factory.simplefactory;

public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare clam pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Bake clam pizza");
    }
}
