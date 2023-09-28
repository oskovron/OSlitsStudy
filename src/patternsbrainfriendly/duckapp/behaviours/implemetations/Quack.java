package patternsbrainfriendly.duckapp.behaviours.implemetations;

import patternsbrainfriendly.duckapp.behaviours.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I quack");
    }
}
