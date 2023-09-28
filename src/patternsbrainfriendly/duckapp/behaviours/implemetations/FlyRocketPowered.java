package patternsbrainfriendly.duckapp.behaviours.implemetations;

import patternsbrainfriendly.duckapp.behaviours.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly with rocket");
    }
}
