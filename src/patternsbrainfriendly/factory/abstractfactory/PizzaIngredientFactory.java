package patternsbrainfriendly.factory.abstractfactory;

import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Cheese;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Dough;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Sause;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Veggies;

import java.util.List;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sause createSauce();
    Cheese createCheese();
    List<Veggies> createVeggies();
}
