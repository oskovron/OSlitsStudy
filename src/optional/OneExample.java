package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OneExample {
    public static Optional<Integer> findElement (Integer[] array, int searchElement) {
        return Arrays.stream(array).filter(x -> x.equals(searchElement)).findFirst();
//        for (Integer integer : array) {
//            if (integer.equals(searchElement)) {
//                return Optional.of(searchElement);
//            }
//        }
//        return Optional.empty();
    }

    public static void main(String[] args) {
//        System.out.println(findElement(new Integer[]{1, 2, 3, 4, 5}, 5));
//        System.out.println(findElement(new Integer[]{1, 2, 3, 4, 5}, 8));
        findElement(new Integer[] {1,2,3,4,5}, 5).ifPresent(System.out::println);
        findElement(new Integer[] {1,2,3,4,5}, 8).ifPresent(System.out::println);
        findElement(new Integer[] {}, 8).ifPresent(System.out::println);

        List<Integer> integerList = new ArrayList<>();
        integerList.stream().min(Integer::compare)
                .get();
//        if (min.isPresent()) {
//            System.out.println(min.get());
//        }
    }
}
