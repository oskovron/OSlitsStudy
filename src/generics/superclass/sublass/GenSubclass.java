package generics.superclass.sublass;

public class GenSubclass<T> extends NonGen {
    private T ob;

    public GenSubclass(T ob, int i) {
        super(i);
        this.ob=ob;
    }

    public T getOb() {
        return ob;
    }
}
