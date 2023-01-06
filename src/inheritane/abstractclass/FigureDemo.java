package inheritane.abstractclass;

public class FigureDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(8, 10);
        Rectangle rectangle = new Rectangle(8, 10);
        Figure figure;

        figure = rectangle;
        System.out.println(figure.area());

        figure = triangle;
        System.out.println(figure.area());
    }
}
