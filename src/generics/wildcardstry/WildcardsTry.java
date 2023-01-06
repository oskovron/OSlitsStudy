package generics.wildcardstry;

import inheritane.abstractclass.Figure;

import java.util.List;

public class WildcardsTry<T extends Number> {
    private T tParam;

    //not good to return ? super T. return e.g. List<T>
    public <T extends Figure> List<? super T> tryWildcards(List<? extends T> inList,
                                                           List<? super T> outList) {
        for (int i = 0; i < inList.size(); i++) {
            outList.add(inList.get(i));
        }
        outList.forEach(System.out::println);
        return outList; //TODO: is it ok?
    }

    //not good to return ? super T
    public <T extends Figure, R> List<T> tryWildcards2(List<? extends T> inList,
                                                           List<? super T> outList) {
        for (int i = 0; i < inList.size(); i++) {
            outList.add(inList.get(i));
        }
        outList.forEach(System.out::println);
        return (List<T>) outList; //TODO: is it ok?
    }

    public <T extends Figure> void tryWildcardsVoid(List<? extends T> inList,
                                                    List<? super T> outList) {
        for (int i = 0; i < inList.size(); i++) {
            /**
             The reason is pretty simple, if we think about it; the <? extends Fruit> wildcard tells
             the compiler that we’re dealing with a subtype of the type Fruit, but we cannot
             know which fruit as there may be multiple subtypes. Since there’s no way to tell,
             and we need to guarantee type safety (invariance), you won’t be allowed to put
             anything inside such a structure.
             */
//            inList.add(outList.get(i))// error
            outList.add(inList.get(i));
        }
        outList.forEach(System.out::println);
    }

    public boolean test(WildcardsTry<? extends Number> tWildcardsTry) {
        System.out.println("ttt");
        return this.tParam.equals(tWildcardsTry.tParam);
    }
}
