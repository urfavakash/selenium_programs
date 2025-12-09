
package playwright;
import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;


public class Googlesearch {
    void search(){
        try(Playwright playwright=Playwright.create()){
            Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page=browser.newPage();
            page.navigate("https://www.google.com");
            Locator searchfield=page.locator("textarea[name='q']");
            searchfield.fill("playwright java");
            page.keyboard().press("Enter");
            page.waitForSelector("h3");
            String firstResult=page.textContent("h3");
            System.out.println("firstResult:"+firstResult);
            browser.close();
        }
    }
    public static void main(String[]args){
        Googlesearch gs=new Googlesearch();
        gs.search();
        }
    }
    

