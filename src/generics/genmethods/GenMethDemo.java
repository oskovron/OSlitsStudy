package generics.genmethods;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i< y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5};
        System.out.println(isIn(2, nums));

        String[] strs = {"one", "two", "three"};
        System.out.println(isIn("two", strs));
        System.out.println(isIn("to", strs));

//        System.out.println(isIn("two", nums));
    }
}
