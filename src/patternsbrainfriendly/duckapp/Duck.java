package patternsbrainfriendly.duckapp;


import patternsbrainfriendly.duckapp.behaviours.FlyBehavior;
import patternsbrainfriendly.duckapp.behaviours.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyingBehaviour;
    protected QuackBehavior quackingBehaviour;

    public abstract void display();

    public void setFlyingBehaviour(FlyBehavior fb) {
        flyingBehaviour = fb;
    }

    public void setQuackingBehaviour(QuackBehavior qb) {
        this.quackingBehaviour = qb;
    }

    public void performFlying() {
        flyingBehaviour.fly();
    }

    public void performQuacking() {
        quackingBehaviour.quack();
    }
    public void swim() {
        System.out.println("I sweem");
    }
}
