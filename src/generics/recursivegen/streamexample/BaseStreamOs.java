package generics.recursivegen.streamexample;

import java.util.List;

public class BaseStreamOs<T, S extends BaseStreamOs<T, S>> {
    List<T> list;

//    BaseStreamOs<T> sequential() {
//        System.out.println("sequential");
//        return new BaseStreamOs<T>();
//    }

    S parallel(S s) {
        System.out.println("parallel");
        return s;
    }
}
