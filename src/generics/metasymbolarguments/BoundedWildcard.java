package generics.metasymbolarguments;

public class BoundedWildcard {
    public static void showXY(Coords<?> c) {
        System.out.println("Coordinates X Y: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(
                    c.coords[i].x + " " +
                            c.coords[i].y);
        }
        System.out.println();
    }

    public static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Coordinates X Y Z: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(
                    c.coords[i].x + " " +
                            c.coords[i].y + " " +
                            c.coords[i].z);
        }
        System.out.println();
    }

    public static void showAll(Coords<? extends FourD> c) {
        System.out.println("Coordinates X Y Z T: ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(
                    c.coords[i].x + " " +
                            c.coords[i].y + " " + c.coords[i].z + " " +
                            c.coords[i].d);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0, 0),
                new TwoD(1, 5),
                new TwoD(6, 4),
                new TwoD(3, 1)
        };

        Coords<TwoD> twoDCoords = new Coords<>(td);

        System.out.println("two d:");

        showXY(twoDCoords);
//        showAll(twoDCoords);

        System.out.println("Try***");
        twoDCoords.showCoords(twoDCoords);

        FourD fourD[] = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };

        Coords<FourD> fourDCoords = new Coords<>(fourD);

        showXY(fourDCoords);
        showXYZ(fourDCoords);
        showAll(fourDCoords);

        ThreeD threeD[] = {
                new ThreeD(1,2,3)
        };

        fourDCoords.showCoords(twoDCoords);
    }
}
