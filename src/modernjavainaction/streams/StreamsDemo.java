package modernjavainaction.streams;

import modernjavainaction.streams.workwithfilesstreams.CaloricLevel;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.*;
//import static java.util.stream.Collectors.summarizingInt;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Dish> specialMenu = asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("pork", false, 500, Dish.Type.MEAT),
                new Dish("french fries low calories", true, 30, Dish.Type.OTHER),
                new Dish("french fries", true, 530, Dish.Type.OTHER));

//        Map<String, List<String>> dishTags = new HashMap<>();
//        dishTags.put("pork", asList("greasy", "salty"));
//        dishTags.put("beef", asList("salty", "roasted"));
//        dishTags.put("chicken", asList("fried", "crisp"));
//        dishTags.put("french fries", asList("greasy", "fried"));
//        dishTags.put("rice", asList("light", "natural"));
//        dishTags.put("season fruit", asList("fresh", "natural"));
//        dishTags.put("pizza", asList("tasty", "salty"));
//        dishTags.put("prawns", asList("tasty", "roasted"));
//        dishTags.put("salmon", asList("delicious", "fresh"));

        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> typeMapMap = specialMenu.stream().collect(
                groupingBy(Dish::getType,
                        groupingBy(dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })));
        System.out.println(typeMapMap);

        Map<Dish.Type, List<Dish>> dishesByType = specialMenu.stream().collect(groupingBy(Dish::getType));

        Map<CaloricLevel, List<Dish>> dishes = specialMenu.stream()
                .collect(groupingBy(dish -> {
                            if (dish.getCalories() <= 400) {
                                return CaloricLevel.DIET;
                            } else if (dish.getCalories() <= 700) {
                                return CaloricLevel.NORMAL;
                            } else {
                                return CaloricLevel.FAT;
                            }
                        })
                );

        specialMenu.stream().collect(groupingBy(dish ->
                dish.getCalories() <= 400 ? CaloricLevel.DIET : CaloricLevel.NORMAL));

        Map<Dish.Type, List<Dish>> collectFiltering = specialMenu.stream().collect(
                groupingBy(Dish::getType, filtering(dish -> dish.getCalories() > 500, toList())));

        Map<Dish.Type, List<String>> typeListMap = specialMenu.stream().collect(
                groupingBy(Dish::getType, mapping(Dish::getName, toList())));

        Map<Dish.Type, Optional<Dish>> typeDishMapOptional = specialMenu.stream().collect(
                groupingBy(Dish::getType,
                        maxBy(Comparator.comparingInt(Dish::getCalories))));

        Map<Dish.Type, Dish> typeDishMap = specialMenu.stream().collect(
                groupingBy(Dish::getType,
                        collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));

        Map<Boolean, List<Dish>> partitioning = specialMenu.stream().collect(partitioningBy(Dish::isVegetarian));
        List<Dish> vegetarianDishes = partitioning.get(true);

//        Map<Boolean, Map,

        Map<Boolean, Map<Dish.Type, List<Dish>>> booleanMapMap =
                specialMenu.stream().collect(partitioningBy(
                        Dish::isVegetarian,
                        groupingBy(Dish::getType)));

        System.out.println(booleanMapMap);


//        specialMenu.stream()
//                .map(dish -> 1)
//                .reduce(0, Integer::sum);
//        //or
//        long numOfEltsInStream = specialMenu.stream().count();
//
//        List<Dish> lowCalories = specialMenu.stream()
//                .takeWhile(dish -> dish.getCalories() < 350)
//                .collect(Collectors.toList());
//        System.out.println(lowCalories);
//
//        List<Dish> highCalories = specialMenu.stream()
//                .dropWhile(dish -> dish.getCalories() < 350)
//                .collect(Collectors.toList());
//        System.out.println(highCalories);
//
//        specialMenu.stream()
//                .filter(dish -> dish.getCalories() >= 350)
//                .skip(2)
//                .forEach(System.out::println);
//
//        specialMenu.stream()
//                .filter(Dish::isVegetarian)
//                .findAny()
//                .ifPresent(dish -> System.out.println(dish.getName()));
//
//        List<String> strs = new ArrayList<>();
//        strs.addAll(Arrays.asList("Hello", "World"));
//        System.out.println(strs);
//        List<String> collect = strs.stream()
//                .map(x -> x.split(""))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .collect(Collectors.toList());
//        collect.forEach(System.out::print);
//
//        System.out.println("********");
//        List<Integer> numbersList = new ArrayList<>();
//        numbersList.addAll(Arrays.asList(1, 2, 3, 4, 5));
//        List<Integer> collect1 = numbersList.stream()
//                .map(number -> number * number)
//                .collect(Collectors.toList());
//        System.out.println(collect1);
//
//        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
//        List<Integer> numbers2 = Arrays.asList(3, 4);
//
//        List<int[]> collect2 = numbers1.stream()
//                .flatMap(i -> numbers2.stream()
//                        .map(j -> new int[]{i, j}))
//                .collect(Collectors.toList());
//
//        for (int[] elt : collect2) {
//            for (int i = 0; i < elt.length; i++) {
//                System.out.print(elt[i]);
//            }
//            System.out.println();
//        }
//
//        System.out.println("****");
//        numbersList.stream()
//                .filter(x -> x % 3 == 0)
//                .findFirst()
//                .ifPresent(System.out::println);
//
//        int sum = 0;
//        for (int num : numbersList) {
//            sum += num;
//        }
//        System.out.println("sum = " + sum);
//
//        Integer reduce = numbersList.stream()
//                .reduce(1, (a, b) -> a + b);
//        Optional<Integer> optionalReduce = numbersList.stream().reduce(Integer::sum);
//        Optional<Integer> reduceMax = numbersList.stream().reduce(Integer::max);
//        Optional<Integer> reduceMax2 = numbersList.stream().reduce((x, y) -> x > y ? x : y);
//        System.out.println("reduce = " + reduce);
//        Optional<Dish> collect = specialMenu.stream()
//                .collect(Collectors.maxBy(
//                        Comparator.comparing(Dish::getCalories)));
//
//        Double collect1 = specialMenu.stream()
//                .collect(Collectors.averagingInt(Dish::getCalories));
//        System.out.println(collect1);
//        IntSummaryStatistics collect2 = specialMenu.stream()
//                .collect(summarizingInt(Dish::getCalories));
//        System.out.println(collect2);
//
//        String collect = specialMenu.stream()
//                .map(Dish::getName)
//                .collect(joining(","));
//        System.out.println(collect);
//
//        Integer sum  = specialMenu.stream().collect(reducing(0, Dish::getCalories, Integer::sum));

//        IntStream intStream = specialMenu.stream()
//                .mapToInt(Dish::getCalories);
//        Stream<Integer> boxed = intStream.boxed();
////        int sum = intStream.sum();
//
////        OptionalInt optionalIntMin = intStream.min();
////        optionalIntMin.orElse(1);
//
//        IntStream.rangeClosed(1, 50);
//
//        String homeValue = System.getProperty("home");
//        System.out.println(homeValue);
//
////        Stream<String> property = Stream.ofNullable(System.getProperty(homeValue));
//
//        Stream<String> stringStream = Stream.of("config", "home", "user")
//                .flatMap(key -> Stream.ofNullable(System.getProperty(key)));
//
//        int[] intsArray = {1, 2, 3};
//        Arrays.stream(intsArray).sum();
//
////        Stream.iterate(new int[]{0,1}, )
////                .limit(20)
////                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));
//
//        Stream.iterate(0, x -> x <=10, x -> x+2)
//                .forEach(System.out::print);

    }


}
