package patternsbrainfriendly.factory.factorymethod;

import patternsbrainfriendly.factory.simplefactory.Pizza;

public class NYPizzaStore extends PizzaStoreM{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("clam")) {
            return new NYClamPizza();
        }
        return pizza;
    }
}
