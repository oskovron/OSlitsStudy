package modernjavainaction.chapteronemethodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple a: apples) {
            if (p.test(a)) {
                result.add(a);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
