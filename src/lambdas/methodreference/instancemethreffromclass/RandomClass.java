package lambdas.methodreference.instancemethreffromclass;

public class RandomClass {
    private int y;

    public RandomClass (int y) {
        this.y = y;
    }

    public boolean trying (RandomClass a) {
        System.out.println("tralala");
        return this.y == a.y;
    }

    public boolean trying2 (Integer integer) {
        return integer>0;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
