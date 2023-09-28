package patternsbrainfriendly.duckapp.behaviours.implemetations;

import patternsbrainfriendly.duckapp.behaviours.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I DON'T quack");
    }
}
