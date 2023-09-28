package patternsbrainfriendly.strategybehaviorparameterization.implemetations;

import patternsbrainfriendly.strategybehaviorparameterization.QuackingBehavior;

public class Squeak implements QuackingBehavior {
    @Override
    public void quack() {
        System.out.println("I squeek");
    }
}
