package modernjavainaction.chapteronemethodref.behaviorparameterization.quiz;

import modernjavainaction.chapteronemethodref.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrettyPrintDemo {
    public static void main(String[] args) {
        Apple apple = new Apple("green", 151);
        Apple apple2 = new Apple("red", 151);
        Apple apple3 = new Apple("red", 151);
        List<Apple> apples = new ArrayList<>();
        apples.addAll(Arrays.asList(apple, apple2, apple3));

        PrettyPrint prettyPrint = new PrettyPrint();
        prettyPrint.prettyPrint(apples, new GreenApplesFormatter());

    }
}
