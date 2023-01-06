package inheritane.box;

public class DemoShipment {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(1,2,3,3.3);
        Box box = new Box();
        double vol;
        vol = boxWeight.volume();
        System.out.println("boxweight vol: " + vol);

        box = boxWeight;

        System.out.println(vol = box.volume());

        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);

//        double vol;
        vol = shipment1.volume();
        System.out.println(vol);
        double cost = shipment1.cost;
        System.out.println(cost);
        double width = shipment1.width;
        System.out.println(width);
    }
}
