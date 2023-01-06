package generics.superclass;

public class Gen22<T> extends Gen<T> {

    Gen22(T o) {
        super(o);
    }

    T getOb() {
        System.out.println("Method getOb() from class Gen22.");
        return ob;
    }
}
