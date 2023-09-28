package patternsbrainfriendly.strategybehaviorparameterization;

import patternsbrainfriendly.strategybehaviorparameterization.implemetations.FlyWithWings;

import java.util.function.Consumer;

public class Duck {

    public void performFlying(FlyingBehavior flyingBehavior) {
        flyingBehavior.fly();

    }

    //Замість FlyingBehavior можна використати Consumer. Modern java in action p. 33
    public void performFlying(String str, Consumer<String> consumer) {
        consumer.accept("str");

    }


    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.performFlying(new FlyWithWings());
        duck.performFlying("I consume fly", x -> System.out.println(x));

    }
}
