package patternsbrainfriendly.factory.abstractfactory;

import patternsbrainfriendly.factory.abstractfactory.factories.ChicagoPizzaIngredientFactory;

public class ChicagoPizzaStoreAF extends PizzaStoreAF {
    @Override
    protected PizzaAF createPizza(String type) {
        PizzaAF pizza = null;
        PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(factory);
        } else {
            System.out.println("No such pizza");
        }
        return pizza;
    }
}
