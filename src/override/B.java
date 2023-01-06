package override;

public class B extends A {
    int k;

    B(int i, int j, int g) {
        super(i, j);
        k = g;
    }

//    public void show() {
////        super.show();
//        System.out.println("k: " + k);
//    }

    public void show(String msg) {
        System.out.println(msg + k);
    }
}
