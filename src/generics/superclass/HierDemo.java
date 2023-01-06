package generics.superclass;

public class HierDemo {
    public static void main(String[] args) {
        Gen<Integer> gen = new Gen<>(55);
        Gen2<String, Integer> gen2 = new Gen2<>("Value is: ", 55);
        Gen22<Integer> gen22 = new Gen22<>(55);
//        (Gen<Integer>) gen2;
        Gen<Integer> nn = gen22;

        System.out.println(gen.getOb());
        System.out.println(gen22.getOb());
        System.out.println(gen2.getOb());
        System.out.println(gen2.getOb2());
    }
}
