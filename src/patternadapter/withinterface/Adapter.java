package patternadapter.withinterface;

public class Adapter implements INewSystem, IOldSystem {
    private OldSystem oldSystem;
    private NewSystem newSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    public Adapter(NewSystem newSystem) {
        this.newSystem = newSystem;
    }

    @Override
    public String matchWideSocket() {
        return oldSystem.matchThinSocket();
    }

    @Override
    public String matchThinSocket() {
        return newSystem.matchWideSocket();
    }
}
