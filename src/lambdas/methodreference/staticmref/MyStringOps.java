package lambdas.methodreference.staticmref;

import java.util.ArrayList;
import java.util.List;

public class MyStringOps {
    static List<String> strList;

    static {
        strList = new ArrayList<>();
    }

    public static String strReverse (String str) {
        String result = " ";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }

    public String strReverseInstance (String str) {
        String result = " ";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }

    public static Integer integerMethod(String s) {
        strList.add(s);
        System.out.println("strList: " + strList);
        return 1;
    }

}
