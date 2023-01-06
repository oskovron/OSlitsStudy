package patterndecorator.one;

public class PlainPizza implements IPizza {

    public PlainPizza() {
        System.out.println("Plain pizza.");
    }
    @Override
    public String getDescription() {
        return "Thin dough.";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
