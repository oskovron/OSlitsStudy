package generics.recursivegen.streamexample;

import java.util.List;
import java.util.function.Function;

public class StreamOs<T> extends BaseStreamOs<T, StreamOs<T>> {
    private T t;
    private List<T> vals;

    public StreamOs() {}

    public StreamOs (List<T> vals) {
        this.vals = vals;
    }

    StreamOs<T> filter(){
        return this;
    }

    <R> StreamOs<R> map(Function<? super T, ? extends R> mapper){
//        mapper.apply(t);
        return new StreamOs<>();
    }
}
