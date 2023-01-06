package generics.recursivegen;

public abstract class Product<T extends Product<T>> implements Comparable<T> {
    private int price;

    @Override
    public int compareTo(Product product) {
        return this.price - product.price;
    }

    abstract boolean subCompare(T product);

    public void productMethod() {
        System.out.println("product method");
    }

}
