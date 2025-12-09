package playwright;
import com.microsoft.playwright.*;
import java.util.List;

public class Hover {
    public void hov() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(false) 
            );
            Page page = browser.newPage();
            page.navigate("https://the-internet.herokuapp.com/hovers");

           
            List<ElementHandle> profiles = page.querySelectorAll(".figure");

            for (int i = 0; i < profiles.size(); i++) {
                ElementHandle profile = profiles.get(i).querySelector("img");

               
                profile.hover();
                page.waitForTimeout(1000); 

                
                ElementHandle caption = profiles.get(i).querySelector(".figcaption");
                if (caption != null) {
                    System.out.println("Caption " + (i + 1) + ": " + caption.innerText());
                }
            }

            browser.close();
        }
    }

    public static void main(String[] args) {
        Hover obj = new Hover();
        obj.hov();
    }
}
