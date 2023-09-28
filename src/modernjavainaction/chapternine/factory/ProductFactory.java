package modernjavainaction.chapternine.factory;

import java.util.HashMap;

public class ProductFactory {
    public static Product createProduct(ProductsEnum productType) {
        switch (productType) {
            case LOAN: return new Loan();
            case BOND: return new Bond();
            default: throw new RuntimeException("No such product");
        }
    }

    public static void main(String[] args) {
        ProductFactory.createProduct(ProductsEnum.LOAN);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
//        objectObjectHashMap.get()

    }
}
