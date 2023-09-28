package patternsbrainfriendly.factory.abstractfactory;

public abstract class PizzaStoreAF {
    protected abstract PizzaAF createPizza(String type);

    public PizzaAF orderPizza(String type) {
        PizzaAF pizzaAF = createPizza(type);
        pizzaAF.prepare();
        pizzaAF.bake();
        pizzaAF.cut();
        pizzaAF.box();
        pizzaAF.getName();
        return pizzaAF;
    }
}
