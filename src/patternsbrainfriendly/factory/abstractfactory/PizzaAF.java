package patternsbrainfriendly.factory.abstractfactory;

import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Cheese;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Dough;
import patternsbrainfriendly.factory.abstractfactory.abstractproducts.Sause;

public abstract class PizzaAF {
    protected String name;
    protected Dough dough;
    protected Sause sause;
    protected Cheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake at 200 C");
    }

    public void cut() {
        System.out.println("Cut triangles");
    }

    public void box() {
        System.out.println("Use official box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
