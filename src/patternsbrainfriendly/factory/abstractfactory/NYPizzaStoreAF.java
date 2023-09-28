package patternsbrainfriendly.factory.abstractfactory;

import patternsbrainfriendly.factory.abstractfactory.factories.NYPizzaIngredientFactory;

public class NYPizzaStoreAF extends PizzaStoreAF {
    @Override
    protected PizzaAF createPizza(String type) {
        PizzaAF pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("NY cheese pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(factory);
        } else {
            System.out.println("no such pizza type");
        }

        return pizza;
    }
}
