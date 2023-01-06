package modernjavainaction.chapteronemethodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoApples {
    public static void main(String[] args) {
        Apple apple = new Apple("green", 151);
        Apple apple2 = new Apple("red", 151);
        List<Apple> apples = new ArrayList<>();
        apples.addAll(Arrays.asList(apple, apple2));

        List<Apple> applesResult = Apple.filterApples(apples, Apple::isGreenApple);
        List<Apple> applesResult2 = Apple.filterApples(apples, apple1 -> "green".equals(apple1.getColor()));
        System.out.println(applesResult);
        System.out.println(applesResult2);

        List<Apple> collect = apples.stream()
                .filter(apple1 -> apple1.getWeight() > 150)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
