package override;

public class DemoOverride {
    public static void main(String[] args) {
        B sub = new B(1, 2 ,3);
        sub.show();
        sub.show("Message");
    }
}
