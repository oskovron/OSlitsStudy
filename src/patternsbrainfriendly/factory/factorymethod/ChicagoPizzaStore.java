package patternsbrainfriendly.factory.factorymethod;

import patternsbrainfriendly.factory.simplefactory.Pizza;

public class ChicagoPizzaStore extends PizzaStoreM{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else if (type.equals("clam")) {
            return new ChicagoClamPizza();
        }
        return pizza;
    }
}
