package patternsbrainfriendly.strategybehaviorparameterization.implemetations;

import patternsbrainfriendly.strategybehaviorparameterization.FlyingBehavior;

public class FlyNoWay implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("I DON'T fly");
    }
}
