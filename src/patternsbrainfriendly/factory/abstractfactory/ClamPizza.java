package patternsbrainfriendly.factory.abstractfactory;

public class ClamPizza extends PizzaAF{

    private PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        dough = factory.createDough();
        cheese = factory.createCheese();
    }
}
