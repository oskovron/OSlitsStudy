package patternsbrainfriendly.decorator;

import static patternsbrainfriendly.decorator.SizeEnum.GRANDE;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage espresso2 = new Espresso();
        espresso2.setSize(GRANDE);
        espresso2 = new Mocha(espresso2);
        espresso2 = new Whip(espresso2);
        System.out.println(espresso2.getDescription() + " $" + espresso2.cost());
    }
}
