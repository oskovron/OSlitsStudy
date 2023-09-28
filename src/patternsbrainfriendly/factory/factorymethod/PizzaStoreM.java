package patternsbrainfriendly.factory.factorymethod;

import patternsbrainfriendly.factory.simplefactory.Pizza;

public abstract class PizzaStoreM {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        return pizza;
    }

}
