package inheritane.abstractclass;

public class Triangle extends Figure {
    public Triangle(int a, int b) {
        super(a,b);
    }
    int area() {
        System.out.println("Triangle area:");
        return a*b/2;
    }


}
