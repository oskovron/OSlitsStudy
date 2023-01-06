package generics.recursivegen;

public class Camera extends Product<Camera> {
    private int lenceSize;

    public Camera(int lenceSize) {
        this.lenceSize = lenceSize;
    }

    boolean subCompare(Camera product) {
        return lenceSize-product.lenceSize>0;
    }

    public Camera getCamera() {
        return this;
    }
}
