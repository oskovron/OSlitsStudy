package patterndecorator.one;

public class ToppingDecorator implements IPizza {

    protected IPizza pizza;

    public ToppingDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
