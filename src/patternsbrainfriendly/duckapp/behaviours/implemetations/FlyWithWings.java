package patternsbrainfriendly.duckapp.behaviours.implemetations;

import patternsbrainfriendly.duckapp.behaviours.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly");
    }
}
