package modernjavainaction.chapteronemethodref.behaviorparameterization;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppleB {
    private String color;
    private int weight;

    public AppleB() {
        System.out.println("No param apple");
    }
    public AppleB(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public List<AppleB> filterApples(List<AppleB> apples, ApplePredicate applePredicate) {
        List<AppleB> result = new ArrayList<>();
        for (AppleB appleB: apples) {
            if (applePredicate.test(appleB)) {
                result.add(appleB);
            }
        }
        return result;
    }

    /**
     * Behavior parameterization - Predicate<T> applePredicate in parameters
     * @param apples
     * @param applePredicate
     * @return
     * @param <T>
     */
    public <T> List<T> filterApplesGeneric(List<T> apples, Predicate<T> applePredicate) {
        List<T> result = new ArrayList<>();
        for (T appleB: apples) {
            if (applePredicate.test(appleB)) {
                result.add(appleB);
            }
        }
        return result;
    }

    public AppleB testConstructorMethodRef(String color, int weight,
                                           BiFunction<String, Integer, AppleB> bBiFunction) {
        return bBiFunction.apply(color, weight);

    }

    public List<AppleB> mapWeightToApples(List<Integer> weights, Function<Integer, AppleB> function) {
        List<AppleB> result = new ArrayList<>();
        for (Integer i: weights) {
            result.add(function.apply(i));
        }
        return result;
    }

//    public AppleB testConstructorMethodRef(String color, int weight,
//                                           Supplier<AppleB> supplier) {
//        return supplier.get();
//
//    }

    @Override
    public String toString() {
        return "AppleB{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
