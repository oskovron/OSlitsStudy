package modernjavainaction.chapteronemethodref.behaviorparameterization.quiz;

import modernjavainaction.chapteronemethodref.Apple;

public class GreenApplesFormatter implements IAppleFormatter {
    @Override
    public String accept(Apple apple) {
        String result ="";
        if (apple.getColor().equalsIgnoreCase("Green")) {
            result = apple.getColor();
//            System.out.println(result);
        }
        return result;
    }
}
