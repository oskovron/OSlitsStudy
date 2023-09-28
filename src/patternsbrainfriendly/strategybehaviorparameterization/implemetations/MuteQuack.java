package patternsbrainfriendly.strategybehaviorparameterization.implemetations;

import patternsbrainfriendly.strategybehaviorparameterization.QuackingBehavior;

public class MuteQuack implements QuackingBehavior {
    @Override
    public void quack() {
        System.out.println("I DON'T quack");
    }
}
