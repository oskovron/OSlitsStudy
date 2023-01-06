package modernjavainaction.framework;

public class FrameworkDemo {
    public static void main(String[] args) {
        FaqContentPage faqContentPage = new AddContentPage().createNewContent(FaqContentPage::new);
        FaqContentPage faqContentPage1 = new AddContentPage().createNewContent(() -> new FaqContentPage());
    }
}
