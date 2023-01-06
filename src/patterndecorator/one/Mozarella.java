package patterndecorator.one;

public class Mozarella extends ToppingDecorator {

    public Mozarella(IPizza pizza) {
        super(pizza);

        System.out.println("Add dough");
        System.out.println("Add Mozz");
    }

    public String getDescription() {
        return pizza.getDescription() + " Mozarella.";
    }

    public double getCost() {
        return pizza.getCost() + 0.50;
    }
}
