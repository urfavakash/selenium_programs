package com.mycompany.akashselenium;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.OutputType;

public class AkashSelenium {

    void getScreen() {
        try {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.mysql.com/");
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screenshot.toPath(), new File("screensht.png").toPath());
            System.out.println("Screenshot saved as screensht.png");
            driver.quit();
        } catch (IOException ex) {
            Logger.getLogger(TakesScreenshot.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


public static void main(String[] args)throws Exception {
        AkashSelenium as=new AkashSelenium();
        as.getScreen();
    }
}
