package patterndecorator.one;

public class TomatoSause extends ToppingDecorator {

    public TomatoSause(IPizza pizza) {
        super(pizza);

        System.out.println("Add Tomato sauce");
    }

    public String getDescription() {
        return pizza.getDescription() + " Tomato sauce.";
    }

    public double getCost() {
        return pizza.getCost() + 0.35;
    }
}
