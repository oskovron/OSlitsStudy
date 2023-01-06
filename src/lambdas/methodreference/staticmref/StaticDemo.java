package lambdas.methodreference.staticmref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StaticDemo {

    static String stringOp(MyFunc mf, String str) {
        return mf.func(str);
    }

    static void stringOp2(MyFun2 mf, String str) {
        mf.func(str);
    }

    public static void main(String[] args) {
        String inStr = "In string text";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println(inStr);
        System.out.println(outStr);

        /**
         * strReverse(String s) method has <i>String</> return type,
         * stringOp2(MyFun2 mf, String str) has <i>void</> return type
         * and func(String s) method in interface has <i>void</> return type
         * AND still we CAN pass <i>MyStringOps::strReverse</> method reference into
         * stringOp2(MyFun2 mf,String str) method
         */
        System.out.println("void return type:");
        stringOp2(MyStringOps::strReverse, inStr);
        stringOp2(MyStringOps::integerMethod, inStr);

        System.out.println("instance: ");
        outStr = stringOp(new MyStringOps()::strReverseInstance, inStr);
        System.out.println(outStr);
        System.out.println("**********");

        List<String> listStrings = Arrays.asList("hi", "go", "Bye");
        System.out.println("*******2");
        listStrings.stream()
//                .map(String::isEmpty)
                .map(MyStringOps::strReverse)
//                .map(MyStringOps::integerMethod)
                .forEach(System.out::println);

    }
}
