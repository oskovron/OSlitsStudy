package generics.superclass.sublass;

public class HierDemo2 {
    public static void main(String[] args) {
        GenSubclass<String> stringGenSubclass = new GenSubclass<>("Value is: ", 44);

        System.out.println(stringGenSubclass.getOb());
        System.out.println(stringGenSubclass.getI());
    }
}
