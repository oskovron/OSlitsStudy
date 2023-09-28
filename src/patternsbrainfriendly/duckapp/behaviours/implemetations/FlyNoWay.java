package patternsbrainfriendly.duckapp.behaviours.implemetations;

import patternsbrainfriendly.duckapp.behaviours.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I DON'T fly");
    }
}
