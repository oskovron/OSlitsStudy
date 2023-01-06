package generics.metasymbolarguments;

public class Coords<T extends TwoD> {
    T[] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }

    public void showCoords(Coords<?> c) {
        System.out.println("Coordinates X Y: ");
        for (int i= 0; i<c.coords.length; i++) {
            System.out.println(c.coords[i].x +" " + c.coords[i].y);
        }
    }

    public <V extends Coords<?>> void test(V t) {

    }
}
