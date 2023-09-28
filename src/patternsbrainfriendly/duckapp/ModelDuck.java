package patternsbrainfriendly.duckapp;

import patternsbrainfriendly.duckapp.behaviours.implemetations.FlyNoWay;
import patternsbrainfriendly.duckapp.behaviours.implemetations.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyingBehaviour = new FlyNoWay();
        quackingBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }


}
