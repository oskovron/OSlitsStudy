package patternsbrainfriendly.duckapp;

import patternsbrainfriendly.duckapp.behaviours.implemetations.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFlying();
        mallardDuck.performQuacking();

        Duck robberDuck = new RubberDuck();
        robberDuck.performFlying();
        robberDuck.performQuacking();

        System.out.println("Model duck:");
        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyingBehaviour(new FlyRocketPowered());
        modelDuck.performFlying();
        modelDuck.performQuacking();
    }
}
