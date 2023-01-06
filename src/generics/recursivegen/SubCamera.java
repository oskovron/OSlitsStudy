package generics.recursivegen;

public class SubCamera extends Camera {
    public SubCamera(int lenceSize) {
        super(lenceSize);
    }

    public void subCameraMethod() {
        System.out.println("subCameraMethod");
    }

    public SubCamera getSubCamera() {
        return new SubCamera(2);
    }
}
