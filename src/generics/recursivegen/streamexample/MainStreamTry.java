package generics.recursivegen.streamexample;

import generics.recursivegen.Camera;
import generics.recursivegen.Product;
import generics.recursivegen.SubCamera;
import inheritane.abstractclass.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class MainStreamTry {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1, 33, 44));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");

        Function<Number, Integer> function = n -> Integer.valueOf(n.intValue());

        StreamOs<Integer> stringStreamOs = new StreamOs<>();
        stringStreamOs
                .filter()
                .parallel(new StreamOs<>())
                .map(function)
        ;

        Function<SubCamera, Camera> function1 = camera -> camera.getSubCamera();
        StreamOs<SubCamera> cameraStreamOs = new StreamOs<>();
        cameraStreamOs
                .map(function1);


        System.out.println("*************");
        Function<Number, Integer> numberIntegerFunction = n -> Integer.valueOf(n.intValue());
        List<Number> numberList = new ArrayList<>(Arrays.asList(1, 2L));
        StreamOs<Number> numberStreamOs = new StreamOs<>(numberList);

        numberStreamOs
                .map(numberIntegerFunction)
        ;

        System.out.println("----------");
//        List<Egg> eggs = new ArrayList<>();
//        Function<Egg, Goose> hatching = x -> x.
//        eggs.stream()
//                .map()

//        numberList.stream().map()


//        integerList
//                .stream()
//                .map(x -> x.doubleValue());

    }
}
