package lambdas.methodreference.instancemethreffromclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnyObjectDemo {

    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) {
                count++;
            }
        }
        return count;
    }

    static boolean os (List<RandomClass> rcList, MyFunc<RandomClass> myFunc, RandomClass rcInstance) {
        return myFunc.func(rcList.get(1), rcInstance);
    }

    /**
     * First parameter of method from functional interface equals the type of calling object - T
     * os2(RandomClass::trying2, new RandomClass(8), 5);
     * Second parameter of method from functional interface equals parameter of instance method - R
     * @param myFunTwoParams
     * @param t
     * @param r
     * @param <T>
     * @param <R>
     * @return
     */
    static <T, R> boolean os2 (MyFunTwoParams<T, R> myFunTwoParams, T t, R r) {
        return myFunTwoParams.func(t, r);
    }

    public static void main(String[] args) {
        boolean b = os2(RandomClass::trying2, new RandomClass(8), 5);
        System.out.println("os2 - b: " + b);

        int count;

        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)
        };

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count);

        System.out.println("-----------------");
        List<RandomClass> randomClassList = new ArrayList<>();
        randomClassList.add(new RandomClass(8));
        randomClassList.add(new RandomClass(5));
        boolean os = os(randomClassList, RandomClass::trying, new RandomClass(5));
        System.out.println(os);

        System.out.println("compare: ");
        RandomClass max = Collections.max(randomClassList, (x, y) -> x.getY() - y.getY());
        System.out.println(max);

    }
}
