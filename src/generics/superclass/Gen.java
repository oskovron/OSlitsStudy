package generics.superclass;

public class Gen<T> {
    T ob;

    Gen(){}

    Gen(T ob) {
        this.ob=ob;
    }

    T getOb() {
        System.out.println("Method getOb() from class Gen.");
        return ob;
    }
}
