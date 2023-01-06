package modernjavainaction.framework;

import java.util.function.Supplier;

public class AddContentPage {
    public <T extends BaseContentPage> T createNewContent(Supplier<T> supplier) {
        //some xpath action to click wanted page
        return supplier.get();
    }
}
