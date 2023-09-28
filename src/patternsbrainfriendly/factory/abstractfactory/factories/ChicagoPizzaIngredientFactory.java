package patternsbrainfriendly.factory.abstractfactory.factories;

import patternsbrainfriendly.factory.abstractfactory.PizzaIngredientFactory;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Cheese;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Dough;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Sause;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Veggies;
import patternsbrainfriendly.factory.abstractfactory.products.EggplantSause;
import patternsbrainfriendly.factory.abstractfactory.products.ParmezanCheese;
import patternsbrainfriendly.factory.abstractfactory.products.ThickCrustDough;

import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sause createSauce() {
        return new EggplantSause();
    }

    @Override
    public Cheese createCheese() {
        return new ParmezanCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        return null;
    }
}
