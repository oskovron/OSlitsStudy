package reflection;

import stream.supplier.Friends;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) {
        Friends friends = new Friends("oo", "pp", 7, true);
        System.out.println(friends);

        try {
            Field age = Friends.class.getDeclaredField("age");
            age.setAccessible(true);
            age.set(friends, 55);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        }

//        Field[] declaredFields = Friends.class.getDeclaredFields();
//        Field age = Stream.of(declaredFields)
//                .filter(x -> x.getName().equals("age"))
//                .findFirst()
//                .orElseThrow();
//        age.setAccessible(true);
//        try {
//            age.set(friends, 5);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
        System.out.println(friends);

        try {
            Method privateMethod = Friends.class.getDeclaredMethod("privateMethod", String.class);
            privateMethod.setAccessible(true);
            privateMethod.invoke(friends, "hello");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
