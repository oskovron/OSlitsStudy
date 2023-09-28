package patternsbrainfriendly.factory.abstractfactory;

public class CheesePizza extends PizzaAF {
    private PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        dough = factory.createDough();
        sause = factory.createSauce();
        cheese = factory.createCheese();
    }
}
