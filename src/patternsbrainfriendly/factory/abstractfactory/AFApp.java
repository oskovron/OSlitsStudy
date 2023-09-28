package patternsbrainfriendly.factory.abstractfactory;

public class AFApp {
    public static void main(String[] args) {
        NYPizzaStoreAF nyPizzaStoreAF = new NYPizzaStoreAF();
        nyPizzaStoreAF.orderPizza("cheese");
    }
}
