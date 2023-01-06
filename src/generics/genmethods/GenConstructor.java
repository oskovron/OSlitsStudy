package generics.genmethods;

public class GenConstructor {
    private double val;

    <T extends Number> GenConstructor(T val) {
        this.val = val.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val);
    }
}

class GenConstDemo {
    public static void main(String[] args) {
        GenConstructor genConstructor = new GenConstructor(5);
        GenConstructor genConstructor1 = new GenConstructor(5.5);
        genConstructor.showVal();
        genConstructor1.showVal();

    }
}
