package generics.recursivegen;

public class Phone extends Product<Phone> {
    private int pxls;

    @Override
    boolean subCompare(Phone product) {
        return this.pxls-product.pxls>0;
    }
}
