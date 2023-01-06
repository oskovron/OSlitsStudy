package inheritane.abstractclass;

public abstract class Figure {
    protected int a, b;

    Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int area();
    public void figureMethod() {
        System.out.println("I'm a figure.");
    }

    @Override
    public String toString() {
        return "Figure{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
