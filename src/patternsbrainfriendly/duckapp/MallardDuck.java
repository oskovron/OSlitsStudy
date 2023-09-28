package patternsbrainfriendly.duckapp;

import patternsbrainfriendly.duckapp.behaviours.implemetations.FlyWithWings;
import patternsbrainfriendly.duckapp.behaviours.implemetations.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyingBehaviour = new FlyWithWings();
        quackingBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Red wings");
    }
}
