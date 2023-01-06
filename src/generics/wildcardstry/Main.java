package generics.wildcardstry;

import inheritane.abstractclass.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figureList = new ArrayList<>();

        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle(4, 5));
        rectangleList.add(new Rectangle(5, 8));

        List<Triangle> triangleList = new ArrayList<>();
        triangleList.addAll(Arrays.asList(
                new Triangle(5, 7),
                new Triangle(2, 8)));

        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();

        WildcardsTry<Integer> wildcardsTry = new WildcardsTry();
        //not good
        List<? super Rectangle> objects1 =
                wildcardsTry.tryWildcards(rectangleList, figureList);
        Object object = objects1.get(0);
        List<Figure> objects2 =
                (List<Figure>) wildcardsTry.tryWildcards(triangleList, figureList);
        List<? super Triangle> objects3 = wildcardsTry.tryWildcards(new ArrayList<>(), figureList);
        objects3.add(triangleList.get(0));

        List<Figure> objects =
                (List<Figure>) wildcardsTry.tryWildcards(rectangleList, figureList);
        objects.get(0).figureMethod();


        System.out.println("Triangle:");
        wildcardsTry.tryWildcardsVoid(triangleList, figureList);
        System.out.println(figureList);

//        wildcardsTry.tryWildcards(integerList, numberList)

        List<? super SubTriangle> listSuperTriangle = new ArrayList<>();
        listSuperTriangle.add(new SubTriangle(2, 5));
        listSuperTriangle.add(new SubSubTriangle(2, 5));
//        listSuperTriangle.add(new SubTriangle2(2,4)) // compile error

        List<? extends SubTriangle> listExtendsTriagle = new ArrayList<>();
        SubTriangle subTriangle = listExtendsTriagle.get(0);
//        listExtendsTriagle.add(new SubTriangle(4,4)) //compile error, cannot add anything to <? extends AnyClass>

        wildcardsTry.test(new WildcardsTry<Double>());


    }
}
