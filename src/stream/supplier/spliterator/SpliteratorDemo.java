package stream.supplier.spliterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("Alpha", "Beta", "Gamma", "Omega"));

        Spliterator<String> spliterator = stringList.stream()
                .spliterator();
//        while (spliterator.tryAdvance(x -> {
//            System.out.println(x.toUpperCase());
//            System.out.println(x);
//        }));

        spliterator.forEachRemaining(x -> System.out.println(x.toLowerCase()));
    }
}
