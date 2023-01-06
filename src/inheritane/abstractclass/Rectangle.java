package inheritane.abstractclass;

public class Rectangle extends Figure {

    public Rectangle(int a, int b) {
        super(a, b);
    }
    int area() {
        System.out.println("Rectangle area:");
        return a*b;
    }
}
