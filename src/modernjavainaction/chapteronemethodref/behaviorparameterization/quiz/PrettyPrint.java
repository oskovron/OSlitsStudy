package modernjavainaction.chapteronemethodref.behaviorparameterization.quiz;

import modernjavainaction.chapteronemethodref.Apple;

import java.util.List;

public class PrettyPrint {

    public void  prettyPrint(List<Apple> inList, IAppleFormatter function) {
        for (Apple apple: inList) {
            String output = function.accept(apple);
            System.out.println(output);
        }
    }

}
