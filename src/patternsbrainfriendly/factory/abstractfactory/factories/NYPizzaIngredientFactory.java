package patternsbrainfriendly.factory.abstractfactory.factories;

import patternsbrainfriendly.factory.abstractfactory.*;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Cheese;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Dough;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Sause;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Veggies;
import patternsbrainfriendly.factory.abstractfactory.products.MarinaraSause;
import patternsbrainfriendly.factory.abstractfactory.products.MozarellaCheese;
import patternsbrainfriendly.factory.abstractfactory.products.ThinCrustDough;

import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sause createSauce() {
        return new MarinaraSause();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        return null;
    }
}
