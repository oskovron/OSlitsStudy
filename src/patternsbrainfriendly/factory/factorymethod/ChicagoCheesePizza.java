package patternsbrainfriendly.factory.factorymethod;

import patternsbrainfriendly.factory.simplefactory.Pizza;

public class ChicagoCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare ChicagoCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake ChicagoCheesePizza");
    }
}
