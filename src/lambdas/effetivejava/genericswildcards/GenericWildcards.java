package lambdas.effetivejava.genericswildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

public class GenericWildcards {

    public static void main(String[] args) {
        List<ScheduledFuture<?>> scheduledFutureList = new ArrayList<>();
        max(scheduledFutureList);
    }

    /**
     * the wildcard in type parameter <T extends Comparable<? super T>>
     * is required to support types that do not implement Comparable (or Comparator)
     * directly but extend a type that does:
     * ScheduledFuture interface extends Delayed interface
     * Delayed extends Comparable<Delayed>
     * @param list
     * @return
     * @param <T>
     */
    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        return list.stream().max(Comparable::compareTo).orElseThrow();
    }

    // Returns max value in a collection - uses recursive type bound
    public static <E extends Comparable<E>> E maxx(Collection<E> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("Empty collection");
        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        return result;
    }
}
