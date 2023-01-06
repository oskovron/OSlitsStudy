package patternadapter.withinterface;

public class AdapterDemo {
    public static void main(String[] args) {
        NewSystem newSystem = new NewSystem();
        OldSystem oldSystem = new OldSystem();

//        ElectricityConsumer.chargeLaptop(newSystem);
////        ElectricityConsumer.chargeLaptop(oldSystem); //not compatible
//        Adapter adapterOld = new Adapter(oldSystem);
//        ElectricityConsumer.chargeLaptop(adapterOld);

        Adapter adapterNew = new Adapter(newSystem);
        ElectricityConsumer.chargeLaptopOld(adapterNew);
    }
}
