package patternsbrainfriendly.decorator;

public abstract class Beverage {
    protected String description;
    protected String size;

    public Beverage() {
        description = "unknown beverage";
    }

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setSize(SizeEnum size) {
        this.size = size.getName();
    }

    public String getSize() {
        return size;
    }
}
