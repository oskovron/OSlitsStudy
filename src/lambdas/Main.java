package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    private int instanceVariable;
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        SomeClass someClass = new SomeClass();
        List<String> stringList = someClass.listCombiner(list1, list2, (x, y) -> x + y);
        System.out.println(stringList);

//        SomeClass.listCombiner(list1, list2, this::isFirstGreaterThanSecond);

    }

    public static boolean isFirstGreaterThanSecond(Double a, Float b) {
        return a > b;
    }

    public void test() {
        instanceVariable = 5;
        int localVariable = 5;
        Supplier r = () -> {
            instanceVariable += 5;
            instanceVariable += localVariable;
            return instanceVariable;
        };
        instanceVariable = 8;

    }

}
