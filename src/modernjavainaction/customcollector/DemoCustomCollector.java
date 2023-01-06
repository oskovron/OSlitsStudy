package modernjavainaction.customcollector;

import modernjavainaction.streams.Dish;

import java.util.List;

import static java.util.Arrays.asList;

public class DemoCustomCollector {
    public static void main(String[] args) {
        List<Dish> specialMenu = asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("pork", false, 500, Dish.Type.MEAT),
                new Dish("french fries low calories", true, 30, Dish.Type.OTHER),
                new Dish("french fries", true, 530, Dish.Type.OTHER));

        List<Dish> collect = specialMenu.stream()
                .filter(x -> x.isVegetarian())
                .collect(new ToListCollector<>());
        System.out.println(collect);
    }
}
