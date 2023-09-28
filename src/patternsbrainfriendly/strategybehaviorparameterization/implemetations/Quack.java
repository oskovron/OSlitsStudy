package patternsbrainfriendly.strategybehaviorparameterization.implemetations;

import patternsbrainfriendly.strategybehaviorparameterization.QuackingBehavior;

public class Quack implements QuackingBehavior {
    @Override
    public void quack() {
        System.out.println("I quack");
    }
}
