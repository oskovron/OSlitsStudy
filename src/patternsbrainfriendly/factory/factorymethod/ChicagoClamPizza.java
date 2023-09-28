package patternsbrainfriendly.factory.factorymethod;

import patternsbrainfriendly.factory.simplefactory.Pizza;

public class ChicagoClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare ChicagoClamPizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake ChicagoClamPizza");
    }
}
