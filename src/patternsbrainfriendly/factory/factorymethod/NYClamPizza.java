package patternsbrainfriendly.factory.factorymethod;

import patternsbrainfriendly.factory.simplefactory.Pizza;

public class NYClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare NYClamPizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake NYClamPizza");
    }
}
