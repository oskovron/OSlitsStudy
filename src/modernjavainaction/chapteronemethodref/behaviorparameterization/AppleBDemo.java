package modernjavainaction.chapteronemethodref.behaviorparameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppleBDemo {
    public static void main(String[] args) {
        AppleB appleB = new AppleB("Red", 160);
        AppleB appleB2 = new AppleB("Green", 150);
        AppleB appleB3 = new AppleB("Red", 140);
        List<AppleB> applesB = new ArrayList<>();
        applesB.addAll(Arrays.asList(appleB, appleB2, appleB3));

        List<AppleB> aplleGreenPredicate = appleB.filterApples(applesB, new AppleGreenColorPredicate());
        System.out.println("aplleGreenPredicate" + aplleGreenPredicate);

        List<AppleB> heavyApplesList = appleB.filterApples(applesB, x -> x.getWeight() > 150);
        System.out.println("Heavy: " + heavyApplesList);

        List<AppleB> greenApples = appleB.filterApples(applesB, x -> x.getColor().equals("Green"));
        System.out.println("Green: " + greenApples);

        //todo: doesn't work
        List<AppleB> greenAndHeavy = appleB.filterApples(applesB, x ->
                x.getColor().equals("Green") && x.getWeight() > 150
        );
        System.out.println(greenAndHeavy);
        /////////////////

        appleB.filterApplesGeneric(applesB, x -> x.getWeight() > 150);
        AppleB appleB1 = appleB.testConstructorMethodRef("purple", 1548, AppleB::new);
        System.out.println(appleB1);
        System.out.println("********");
        applesB.sort(Comparator.comparing(
                        AppleB::getWeight)
//                .reversed()
                .thenComparing(AppleB::getColor)
                .reversed());
        System.out.println(applesB);

        System.out.println("Predicate***");
        Predicate<AppleB> heavyApplePredicate = apple -> apple.getWeight() > 150;
        Predicate<AppleB> redAndHeavy = heavyApplePredicate.and(x -> x.getColor().equalsIgnoreCase("Red"));

        /**
         * So a.or(b).and(c) must be read as (a || b) && c. Similarly,
         * a.and(b).or(c) must be read as as (a && b) || c.
         */
        Predicate<AppleB> heavyAndRedOrGreen =
                heavyApplePredicate
                        .and(x -> x.getColor().equalsIgnoreCase("red"))
                        .or(x -> x.getColor().equalsIgnoreCase("green"));
        for (AppleB appl : applesB) {
            heavyAndRedOrGreen.test(appl);
        }

        System.out.println("Function***");
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        /**
         *  andThen() -> g(f(x))  :  (x+1)*2
         */
        Function<Integer, Integer> h = f.andThen(g);
        Integer apply = h.apply(3);
        System.out.println(apply);
        /**
         *  compose() -> f(g(x))  :  (x*2)+1
         */
        Function<Integer, Integer> hh = f.compose(g);
        Integer composeFunctions = hh.apply(1);
        System.out.println(composeFunctions);

    }
}
