package patternsbrainfriendly.factory.factorymethod;

import patternsbrainfriendly.factory.simplefactory.Pizza;

public class NYCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare NYCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake NYCheesePizza");
    }
}
