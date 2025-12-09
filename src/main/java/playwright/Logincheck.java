
package playwright;


import com.microsoft.playwright.*;

public class Logincheck {
    void check2(){
        try(Playwright playwright=Playwright.create()){
            Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
          Page page=browser.newPage();
          page.navigate("https://the-internet.herokuapp.com/login");
          page.locator("input[id='username']").fill("tomsmith");
          page.locator("input[id='password']").fill("SuperSecretPassword!");
          String oldURL = page.url();
           page.click("button[type='submit']");
           page.waitForTimeout(3000);
       
        if (!page.url().equals(oldURL)) {
                System.out.println("Login successful");
            } else {
                System.out.println("Login unsuccessful");
            }
       
    }
    }
    public static void main(String[] args){
        Logincheck hj=new Logincheck();
        hj.check2();
    }
   
   
}

    

