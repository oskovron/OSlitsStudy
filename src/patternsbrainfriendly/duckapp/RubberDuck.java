package patternsbrainfriendly.duckapp;

import patternsbrainfriendly.duckapp.behaviours.implemetations.FlyNoWay;
import patternsbrainfriendly.duckapp.behaviours.implemetations.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyingBehaviour = new FlyNoWay();
        quackingBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Made of rubber");
    }
}
