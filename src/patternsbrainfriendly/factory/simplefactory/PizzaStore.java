package patternsbrainfriendly.factory.simplefactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        return pizza;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheese");

//        PizzaStore pizzaStore1 = new PizzaStore(new SecondSimpleFactory());
//        pizzaStore1.orderPizza("cheese");
    }
}
