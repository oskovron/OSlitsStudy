package patternsbrainfriendly.factory.factorymethod;

public class OrderMain {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        nyPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("clam");
    }
}
