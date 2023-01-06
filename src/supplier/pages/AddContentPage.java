package supplier.pages;

import java.util.function.Supplier;

public class AddContentPage {
    public <T extends ContentBasePage> T createContent(Supplier<T> supplier) {
        return supplier.get();
    }
}
