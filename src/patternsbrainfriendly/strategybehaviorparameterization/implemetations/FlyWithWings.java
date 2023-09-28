package patternsbrainfriendly.strategybehaviorparameterization.implemetations;

import patternsbrainfriendly.strategybehaviorparameterization.FlyingBehavior;

public class FlyWithWings implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("I fly");
    }
}
