package patternsbrainfriendly.decorator;

import static patternsbrainfriendly.decorator.SizeEnum.*;

public class Mocha extends CondimentsDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = 0;
        String size = beverage.getSize();
        if (size.equals(TALL.getName())) {
            cost = 0.1;
        } else if (size.equals(GRANDE.getName())) {
            cost = 0.15;
        } else if (size.equals(VENTI.getName())) {
            cost = 0.2;
        }
        return beverage.cost() + cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha ";
    }
}
