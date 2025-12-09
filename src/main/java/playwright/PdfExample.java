package playwright;

import com.microsoft.playwright.*;
import java.nio.file.Paths;

public class PdfExample {

    void makePdf() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://www.saucedemo.com/");
            page.pdf(new Page.PdfOptions().setPath(Paths.get("example.pdf")).setFormat("A4"));
            browser.close();
        }
    }

    public static void main(String[] args) {
        PdfExample obj = new PdfExample();
        obj.makePdf();
    }
}
