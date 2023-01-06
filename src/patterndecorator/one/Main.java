package patterndecorator.one;

public class Main {
    public static void main(String[] args) {
//        IPizza iPizza = new TomatoSause(new Mozarella(new PlainPizza()));
        PlainPizza plainPizza = new PlainPizza();
//        System.out.println(plainPizza.getDescription());



        Mozarella mozarella = new Mozarella(new TomatoSause(plainPizza));
        System.out.println(mozarella.getDescription());
        System.out.println(mozarella.getCost());
//        System.out.println(iPizza.getDescription());
//        System.out.println(iPizza.getCost());
    }
}
