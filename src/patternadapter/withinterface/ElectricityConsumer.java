package patternadapter.withinterface;

public class ElectricityConsumer {

    public static void chargeLaptop (INewSystem iNewSystem) {
        System.out.println(iNewSystem.matchWideSocket());
    }

    public static void chargeLaptopOld (IOldSystem iOldSystem) {
        System.out.println(iOldSystem.matchThinSocket());
    }

    public static void reverseElements(int[][] twoDimArray) {
        for (int i = twoDimArray.length; i>0; i--) {
            System.out.println();
        }

    }
}
