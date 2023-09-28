package patternsbrainfriendly.decorator;

public enum SizeEnum {
    TALL("tall"),
    GRANDE("grande"),
    VENTI("venti");

    private String name;

    SizeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
