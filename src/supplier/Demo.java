package supplier;

import supplier.pages.AddContentPage;
import supplier.pages.FAQContentPage;
import supplier.pages.PDFContentPage;

public class Demo {
    public static void main(String[] args) {
        AddContentPage addContentPage = new AddContentPage();
        FAQContentPage faqContentPage = addContentPage.createContent(FAQContentPage::new);
        PDFContentPage pdfContentPage = addContentPage.createContent(PDFContentPage::new);
//        addContentPage.createContent(Integer::new);

    }
}
